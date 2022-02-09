package edu.escuelaing.arep;

/**
 * clase responsable de la conversion de celsius a fahrenheit. cuenta con todos los metodos necesarios para realizar la operacion.
 * @author Eduardo Ospina
 */
public class CelsiousAfarenheit {

    private double fahrenheit;
    private double celsius;

    /**
     * metodo contructor de la clase, en donde se ingresa el valor en celcius que se quiere transforman, y realiza la operacion necesaria.
     * @param Celsius en formato doube de la temperatura en celsius
     */
    public CelsiousAfarenheit( double Celsius){
        celsius = Celsius;
        fahrenheit = ((celsius * 9)/5) +32;
    }

    /**
     * metodo para retornar el valor en celsius despues de que el contrustor calculo los valores necesarios.
     * @return valor en formato double de celsius.
     */
    public double getCelsius() {
        return celsius;
    }

    /**
     * metodo para retornar el valor en farenheit despues de que el contrustor calculo los valores necesarios.
     * @return valor en formato double de fahrenheit.
     */
    public double getFahrenheit() {
        return fahrenheit;
    }
}
