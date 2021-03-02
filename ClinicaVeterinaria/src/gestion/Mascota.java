package gestion;

import java.io.Serializable;

/**
 * 
 * @author jcaballerod
 *
 */
public class Mascota extends Animales implements Serializable{
	//ATRIBUTOS
	private String nombre;
    private Persona duenyo;
    //CONSTRUCTOR
    /**
     * Crea la clase Mascota que hereda de Animal
     * @param ID
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     */
    public Mascota(long ID, String nombre, int edad, String raza, Persona duenyo) {
    	this.setID(ID);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }
    /**
     * 
     * @return devuelve el nombre de una mascota
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Un metodo para cambiar el nombre de una mascota
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return devuelve el dueño de una mascota
     */
    public Persona getDuenyo() {
        return duenyo;
    }
    /**
     * Un metodo para cambiar el dueño de una mascota
     * @param duenyo
     */
    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }
    /**
     * @return devuelve la forma en la que se mostraran los datos de una persona
     */
    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Due�o: " + duenyo.toString());
    }
}