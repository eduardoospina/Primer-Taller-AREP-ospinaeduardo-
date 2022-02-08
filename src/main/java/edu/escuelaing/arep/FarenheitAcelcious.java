package edu.escuelaing.arep;

public class FarenheitAcelcious {

    private double fahrenheit;
    private double celsius;

    public FarenheitAcelcious( double Fahrenheit){
        fahrenheit = Fahrenheit;
        celsius = ((fahrenheit -32)*5)/9;

    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
