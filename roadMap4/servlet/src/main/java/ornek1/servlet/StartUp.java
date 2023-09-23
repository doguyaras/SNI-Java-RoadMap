package ornek1.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/toplama","/addition"})
public class StartUp extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setCharacterEncoding("UTF-8");
        res.setHeader("content-type", "text/html;charset=UTF-8");

        res.sendRedirect("index.html");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setCharacterEncoding("UTF-8");
        res.setHeader("content-type", "text/html;charset=UTF-8");

        int sayi1 = Integer.parseInt(req.getParameter("sayi1"));
        int sayi2 = Integer.parseInt(req.getParameter("sayi2"));
        int toplam = sayi1 + sayi2;

        PrintWriter output = res.getWriter();
        output.println("<p>Sonuç: " + toplam + "</p>");


    }

}
