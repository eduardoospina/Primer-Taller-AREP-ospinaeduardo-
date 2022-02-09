package edu.escuelaing.arep;

/**
 * clase responsable de la conversion de celsius a fahrenheit. cuenta con todos los metodos necesarios para realizar la operacion.
 * @param  void
 * @return void
 */
public class CelsiousAfarenheit {

    private double fahrenheit;
    private double celsius;

    /**
     * metodo contructor de la clase, en donde se ingresa el valor en celcius que se quiere transforman, y realiza la operacion necesaria.
     * @param valor en formato doube de la temperatura en celsius
     * @return void
     */
    public CelsiousAfarenheit( double Celsius){
        celsius = Celsius;
        fahrenheit = ((celsius * 9)/5) +32;
    }

    /**
     * metodo para retornar el valor en celsius despues de que el contrustor calculo los valores necesarios.
     * @param void
     * @return valor en formato double de celsius.
     */
    public double getCelsius() {
        return celsius;
    }

    /**
     * metodo para retornar el valor en farenheit despues de que el contrustor calculo los valores necesarios.
     * @param void
     * @return valor en formato double de fahrenheit.
     */
    public double getFahrenheit() {
        return fahrenheit;
    }
}
