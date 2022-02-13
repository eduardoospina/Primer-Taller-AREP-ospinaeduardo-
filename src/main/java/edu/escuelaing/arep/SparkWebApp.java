package edu.escuelaing.arep;

import static spark.Spark.*;
import com.google.gson.*;



/**
 * Clase que maneja el SparkWeb, maneja todos las necesidades para el manejo correcto.
 * @author Eduardo Ospina
 */
public class SparkWebApp {


    /**
     * Clase de metodo de SparkWebApp que maneja el SparkWeb, es el responsable de el manejo de las peticiones.
     * @param args como un Array de strings
     */
    public static void main(String[] args) {

        port(getPort());
        staticFiles.location("/paginainicio");

        get("/", (req, res) -> {
            res.redirect("/index.html");
            return null;
    });

        path("/Calculator", ()->{
            get("/celsius/:value",(req,res)->{
                System.out.println(getCelsius(Double.parseDouble(req.params(":value"))));
                return getCelsius(Double.parseDouble(req.params(":value")));
            });

            get("/fahrenheit/:value",(req,res)->{
               System.out.println(getFahrenheit(Double.parseDouble(req.params(":value"))));
               return getFahrenheit(Double.parseDouble(req.params(":value")));
            });
        });

    }

    /**
     * metodo que maneja el get de los celsius para uso en el front end, manejandolo del formato JSON estandart.
     * @param value deseado a encontrar
     * @return respuesta en formato JSON
     */
    private static Object getCelsius(double value){
        return new Gson().toJson(new CelsiousAfarenheit(value));
    }

    /**
     * metodo que maneja el get de los fahrenheit para uso en el front end, manejandolo del formato JSON estandart.
     * @param value deseado a encontrar
     * @return respuesta en formato JSON
     */
    private static Object getFahrenheit(double value){
        return new Gson().toJson(new FarenheitAcelcious(value));
    }

    /**
     * metodo que obtiene el puerto y retorna el deseado para su utilizacion.
     * @return int del puerto.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}