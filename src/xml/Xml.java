
package xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efalcon
 */
public class Xml {

    private static final String SERIALIZED_FILE_NAME = "diccio.xml";
    public static void main(String[] args) {
        
      
        Palabra p1 = new Palabra("martillo","Herramienta para golpear",2);
        Palabra p2 = new Palabra("casa","lugar donde se habita",1);
        Palabra p3 = new Palabra("estrella","Astro o cuerpo celeste que brilla con luz propia",3);
        
        List ListaPalabras = new ArrayList();
        ListaPalabras.add(p1);
        ListaPalabras.add(p2);
        ListaPalabras.add(p3);
        
        Diccionario dic = new Diccionario();
        dic.setPalabras(ListaPalabras);

        serializarPalabras(dic);
        
        Diccionario lectura = deserializarPalabras();

        System.out.println(lectura.toString());
        
        
        
    }
    
    public static void serializarPalabras(Diccionario dic) {
        XMLEncoder encoder = null;
        
     
        try {
               FileOutputStream fos = new FileOutputStream(SERIALIZED_FILE_NAME);
               BufferedOutputStream bos = new BufferedOutputStream(fos); 
            
            
               encoder = new XMLEncoder(bos);
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: guardando palabras");
        }
        encoder.writeObject(dic);
        encoder.close();
    }

    public static Diccionario deserializarPalabras() {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado");
        }
        
        Diccionario palabra = (Diccionario) decoder.readObject();

        return palabra;
    }
    
    public static void agregarPalabra(String nombre, String pista,int nivel) 
     {
        List ListaPalabras = new ArrayList();
         if (nombre.length() < 15)
        {
            ListaPalabras.add(new Palabra(nombre, pista,nivel));
        }

        else
        {
            System.out.println("Palabra muy Larga");
        }
    
}
}
