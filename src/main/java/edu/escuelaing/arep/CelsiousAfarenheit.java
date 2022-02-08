package edu.escuelaing.arep;

public class CelsiousAfarenheit {

    private double farenheit;
    private double celcious;

    public CelsiousAfarenheit( double Celcious){
        celcious = Celcious;
        farenheit = ((celcious * 9)/5) +32;
    }

    public double getCelcious() {
        return celcious;
    }

    public double getFarenheit() {
        return farenheit;
    }
}
