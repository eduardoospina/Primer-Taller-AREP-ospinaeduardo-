package edu.escuelaing.arep;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{

    private CelsiousAfarenheit celsius_a_fahrenheit;
    private FarenheitAcelcious fahrenheit_a_celsius;

    public void eCelsius_a_Fahrenheit(double valor) {
        celsius_a_fahrenheit = new CelsiousAfarenheit(valor);
    }

    public void eFahrenheit_a_Celsius(double valor) {
        fahrenheit_a_celsius = new FarenheitAcelcious(valor);
    }

    /*
     * Validando conversion de grados celsius a Fahrenheit
     */
    public void test_celsius_A_Fahrenheit() {
        eCelsius_a_Fahrenheit(0);
        assertEquals(32.0,celsius_a_fahrenheit.getFahrenheit());
    }

    /*
     * Validando conversion de grados celsius a Fahrenheit
     */
    public void test_celsius_A_Fahrenheit2() {
        eCelsius_a_Fahrenheit(115);
        assertEquals(239.0,celsius_a_fahrenheit.getFahrenheit());
    }

    /*
     * Validando conversion de grados celsius a Fahrenheit
     */
    public void test_celsius_A_Fahrenheit3() {
        eCelsius_a_Fahrenheit(200);
        assertEquals(392.0,celsius_a_fahrenheit.getFahrenheit());
    }

    /*
     * Validando conversion de grados celsius a Fahrenheit
     */
    public void test_celsius_A_Fahrenheit4() {
        eCelsius_a_Fahrenheit(500);
        assertEquals(932.0,celsius_a_fahrenheit.getFahrenheit());
    }

    /*
     * Validando conversion de grados celsius a Fahrenheit
     */
    public void test_celsius_A_Fahrenheit5() {
        eCelsius_a_Fahrenheit(1000);
        assertEquals(1832.0,celsius_a_fahrenheit.getFahrenheit());
    }

    /*
     * Validando conversion de grados Fahrenheit a celsius
     */
    public void test_Fahrenheit_A_Celsius() {
        eFahrenheit_a_Celsius(1000);
        assertEquals(537.7777777777778, fahrenheit_a_celsius.getCelsius());
    }

    /*
     * Validando conversion de grados Fahrenheit a celsius
     */
    public void test_Fahrenheit_A_Celsius2() {
        eFahrenheit_a_Celsius(500);
        assertEquals(260.0, fahrenheit_a_celsius.getCelsius());
    }

    /*
     * Validando conversion de grados Fahrenheit a celsius
     */
    public void test_Fahrenheit_A_Celsius3() {
        eFahrenheit_a_Celsius(34);
        assertEquals(1.1111111111111112, fahrenheit_a_celsius.getCelsius());
    }

    /*
     * Validando conversion de grados Fahrenheit a celsius
     */
    public void test_Fahrenheit_A_Celsius4() {
        eFahrenheit_a_Celsius(2000);
        assertEquals(1093.3333333333333, fahrenheit_a_celsius.getCelsius());
    }

    /*
     * Validando conversion de grados Fahrenheit a celsius
     */
    public void test_Fahrenheit_A_Celsius5() {
        eFahrenheit_a_Celsius(2500);
        assertEquals(1371.111111111111, fahrenheit_a_celsius.getCelsius());
    }

}