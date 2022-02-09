package edu.escuelaing.arep;


/**
 * clase responsable de la conversion de fahrenheit a celsius. cuenta con todos lo smetodos necesarios para realizar la operacion.
 * @param  void
 * @return void
 */
public class FarenheitAcelcious {

    private double fahrenheit;
    private double celsius;

    /**
     * metodo contructor de la clase, en donde se ingresa el valor en fahrenheit que se quiere transforman, y realiza la operacion necesaria.
     * @param valor en formato doube de la temperatura en fahrenheit
     * @return void
     */
    public FarenheitAcelcious( double Fahrenheit){
        fahrenheit = Fahrenheit;
        celsius = ((fahrenheit -32)*5)/9;

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
