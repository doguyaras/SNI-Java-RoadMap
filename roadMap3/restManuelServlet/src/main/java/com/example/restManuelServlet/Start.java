package com.example.restManuelServlet;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.*;

public class Start extends HttpServlet {

   /* private final RestTemplate restTemplate;*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse res) throws IOException, ServletException {

        try {
            String apiUrl = request.getParameter("url");
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,String.class);
            int responseCode = responseEntity.getStatusCode().value();
            StringBuilder htmlResponse = new StringBuilder();

            if(responseCode == 200){
                htmlResponse.append(responseEntity.getBody());
            }else{
                htmlResponse.append("Request failed with response code: ").append(responseCode);
            }
            request.setAttribute("htmlResponse",htmlResponse.toString());
            request.getRequestDispatcher("/index.jsp").forward(request,res);


        }catch (Exception e){

            System.out.println(e.getMessage());

        }finally {

        }


        //UniRest kütüphanesini kullanarak rest isteği
        /*try {
            String apiUrl = request.getParameter("url");
            HttpResponse<String> response = Unirest.get(apiUrl).asString();
            int responseCode = response.getStatus();
            StringBuilder htmlResponse = new StringBuilder();

            if(responseCode == 200){
                htmlResponse.append(response.getBody()); //
            }
            else {
                htmlResponse.append("Request failed with response code: ").append(responseCode);
            }

            request.setAttribute("htmlResponse",htmlResponse.toString());
            request.getRequestDispatcher("/index.jsp").forward(request,res);

        } catch (UnirestException e) {
            System.out.println(e.getMessage());
        }finally {

        }*/


        // Manuel rest isteği
       /* String apiUrl = request.getParameter("url");

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        int responseCode = connection.getResponseCode();
        StringBuilder htmlResponse = new StringBuilder();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                htmlResponse.append(inputLine);
            }
            reader.close();
        } else {
                htmlResponse.append("Request failed with response1 code: ").append(responseCode);
        }

        request.setAttribute("htmlResponse",htmlResponse.toString());
        request.getRequestDispatcher("/index.jsp").forward(request,response1);*/






    }

}
