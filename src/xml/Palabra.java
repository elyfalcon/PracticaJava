
package xml;

/**
 *
 * @author efalcon
 */
public class Palabra {
    
    private String nombre;
    private String descripcion;
    private int nivel;

    public Palabra() {
    }

    public Palabra(String nombre, String descripcion, int nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public String toString() {
        return getNombre() + "\n" ; 
    }
        
    
    
    
    
    
    
    
    
}
