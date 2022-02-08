package edu.escuelaing.arep;

public class FarenheitAcelcious {

    private double farenheit;
    private double celcious;

    public FarenheitAcelcious( double Farenheit){
        farenheit = Farenheit;
        celcious = ((farenheit-32)*5)/9;

    }

    public double getCelcious() {
        return celcious;
    }

    public double getFarenheit() {
        return farenheit;
    }
}
