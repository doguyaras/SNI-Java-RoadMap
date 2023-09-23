package konu.giris;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//1. Servlet kaynak kodunu oluştur.
//2. web.xml içerisine mapliyoruz.
//3. Apache Tomcat sunucusunu başlatıyoruz.
//4. Web tarayıcısını açıp Servlet'imize istekte bulunuyoruz.
public class StartUp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        String message = "Hello, Welcome!";
        printWriter.write(message);
    }
}
