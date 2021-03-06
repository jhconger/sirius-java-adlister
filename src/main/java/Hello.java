import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Hello", urlPatterns = "/hello")
public class Hello extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        if (name == null) {
//        ((paramName = req.getParameterValues("name"))
//          /**/      != null) {
            out.println("<h1>Hello, World!</h1>");
        } else {
            out.println("<HTML>");
            out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<h1>Hello, " + name + "</h1>");
            out.println("</BODY></HTML>");
        }
    }

    public String getServletInfo() {
        return "A servlet that knows the name of the person to whom it's" +
                "saying hello";
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doGet(req, res);
    }
}
