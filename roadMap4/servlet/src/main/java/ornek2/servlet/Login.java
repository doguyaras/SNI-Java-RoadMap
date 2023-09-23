package ornek2.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/login","/girisYap"})
public class Login extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");

        res.sendRedirect("login.html");
    }

    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException{
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter output = res.getWriter();

        //admin
        //admin123

        if (username.equals("admin")&&password.equals("admin123")){
            output.println("<h1>Giriş Başarılı..</h1>");
        } else if (username.equals("admin")) {
            output.println("<h1>Şifreyi yanlış girdiniz!</h1>");
        }else {
            output.println("<h1>Kullanıcı adını hatalı girdiniz!</h1>");
        }
    }
}
