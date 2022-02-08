package edu.escuelaing.arep;

import static spark.Spark.*;
import com.google.gson.*;

public class SparkWebApp {



    public static void main(String[] args) {

        port(getPort());
        staticFiles.location("/paginainicio");

        get("/", (req, res) -> {
            res.redirect("/index.html");
            return null;
    });

        path("/Calculator", ()->{
            get("/celsius/:value",(req,res)->{
                return getCelsius(Double.valueOf(req.params(":value")));
            });

            get("/fahrenheit/:value",(req,res)->{
               return getFahrenheit(Double.valueOf(req.params(":value")));
            });
        });

    }

    private static Object getCelsius(double value){
        return new Gson().toJson(new CelsiousAfarenheit(value));
    }
    private static Object getFahrenheit(double value){
        return new Gson().toJson(new FarenheitAcelcious(value));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}