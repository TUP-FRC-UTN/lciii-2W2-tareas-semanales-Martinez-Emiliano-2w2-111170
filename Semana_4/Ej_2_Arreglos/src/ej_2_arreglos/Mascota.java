
package ej_2_arreglos;
/**
 *
 * @author emiliano
 */
public class Mascota {
    int edad;
    String nombre;
    //prop
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    //Constructor
    public Mascota(){       
    }
    public Mascota(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //toString
    public String toStringMascota(){
        return "\n Nombre: "+nombre+"\n Edad: "+edad;
    }
}
