package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;


public class AppTestC extends Thread{

        private static final String USER_AGENT = "Mozilla/5.0";
        private String GET_URL = "https://calc-api-be.herokuapp.com/Calculator/";

        public static void main(String[] args) throws IOException {
            int agregar1 = 0;
            int agregar2= 0;
            ArrayList<AppTestC> testC = new ArrayList<AppTestC>();
            for(int i = 0; i< 15; i++){
                agregar1 += 30;
                agregar2 += 45;
                testC.add(new AppTestC("fahrenheit/"+agregar1));
                testC.add(new AppTestC("celsius/"+agregar2));
            }
            for(int i = 0; i< testC.size(); i++) {
                testC.get(i).start();
            }
        }


        public AppTestC(String add){
            GET_URL += add;
        }

        @Override
        public void run(){

            try {
                URL obj = new URL(GET_URL);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("User-Agent", USER_AGENT);

                //The following invocation perform the connection implicitly before getting the code
                int responseCode = con.getResponseCode();
                System.out.println("GET Response Code :: " + responseCode);

                if (responseCode == HttpURLConnection.HTTP_OK) { // success
                    BufferedReader in = new BufferedReader(new InputStreamReader(
                            con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    // print result
                    System.out.println(response.toString());
                } else {
                    System.out.println("GET request not worked");
                }
                System.out.println("GET DONE");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
