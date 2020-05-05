
package ej_2_arreglos;

/**
 *
 * @author emiliano
 */
public class Cliente {
    int nro_cli, antiguedad;
    String nombre_cli;
    Mascota m;
    //prop
    public String getNombre_cli(){
        return nombre_cli;
    }
    public void setNombre_Cli(String nombre){
        nombre_cli=nombre;
    }
    public Mascota getM(){
        return m;
    }
    public void setM(Mascota m){
        this.m=m;
    }
    public int getNro_cli(){
        return nro_cli;
    }
    public void setNro_cli(int nro_cli){
        this.nro_cli=nro_cli;
    }
    public int getAntiguedad(){
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }
    //Constructor
    public Cliente(){        
    }
    public Cliente(int nro, int ant, Mascota m, String n){
        this.nro_cli=nro;
        this.antiguedad=ant;
        this.m=m;
        this.nombre_cli=n;
    }
    //toStringCliente
    public String toStringCliente(){
        return "Nro Cliente: "+nro_cli+"\n Nombre: "+nombre_cli+
                "\n Antiguedad: "+antiguedad+"\n Mascota: "+m.toStringMascota();
    }
}
