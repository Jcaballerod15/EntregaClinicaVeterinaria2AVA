package gestion;

import java.io.Serializable;
/**
 * 
 * @author jcaballerod
 *
 */

public class Persona implements Serializable{
	//ATRIBUTOS
	private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    /**
     * 
     * @param nombre
     * @param apellidos
     * @param dni
     * @param edad
     */
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
    /**
     * 
     * @return devuelve el nombre de una persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Un metodo para cambiar el nombre de una personsa
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return devuelve el apellido de una persona
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Un metodo para cambiar el nombre de una personsa
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * devuelve el dni de una persona
     * @return
     */
    public String getDni() {
        return dni;
    }
    /**
     * Un metodo para cambiar el DNI de una personsa
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * devuelve la edad de una persona
     * @return
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Un metodo para cambiar la edad de una personsa
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo para sacar el año de nacimiento
     * @param anyoactual
     * @return devuelve un año
     */
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
   /**
    * @return devuelve la forma en la que se mostraran los datos de una persona
    */
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}