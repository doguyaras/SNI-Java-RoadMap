package konu.notation;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(urlPatterns = {"/anasayfa"})
public class StartUp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter writer = resp.getWriter();
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("content-type", "text/html;charset=UTF-8");

        writer.write("<h1>Hoşgeldiniz..</h1>");

        List<String> takimlar = new ArrayList<String>();
        takimlar.add("Galatasaray");
        takimlar.add("Fenerbahçe");
        takimlar.add("Beşiktaş");
        takimlar.add("Trabzonspor");
        takimlar.add("Bursaspor");

        ArrayList<String> renkler = new ArrayList<String>() {
            {
                add("red");
                add("green");
                add("turqoise");
                add("blue");
                add("purple");
            }
        };

        writer.write("<table>");
        writer.write("<tr>");
        writer.write("Takımlar");
        writer.write("</tr>");

        String[] stilRenkleri = new String[renkler.size()];
        stilRenkleri = renkler.toArray(stilRenkleri);
        int index = 0;

        for (String takim : takimlar) {
            writer.write("<tr>");
            writer.write("<td style='color:" + stilRenkleri[index++] + "'>");
            writer.write(takim);
            writer.write("</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");


    }
}
