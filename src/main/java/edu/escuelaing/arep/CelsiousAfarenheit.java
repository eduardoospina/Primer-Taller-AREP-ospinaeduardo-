package edu.escuelaing.arep;

public class CelsiousAfarenheit {

    private double fahrenheit;
    private double celsius;

    public CelsiousAfarenheit( double Celsius){
        celsius = Celsius;
        fahrenheit = ((celsius * 9)/5) +32;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
