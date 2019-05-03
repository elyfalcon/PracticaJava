
package xml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efalcon
 */
public class Diccionario {
    
    private List palabras=new ArrayList();	

    public Diccionario() {
    }

    public List getPalabras() {
        return palabras;
    }

    public void setPalabras(List palabras) {
        this.palabras = palabras;
    }

    public String toString(){
		String palabra="";
		for(Object p:getPalabras()){
                    Palabra m;
                    m=(Palabra) p;
			palabra += m.getNombre()+"\n";
		}
		return palabra; 
	}	

    
    
    
    
}
