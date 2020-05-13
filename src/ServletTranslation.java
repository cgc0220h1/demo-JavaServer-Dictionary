import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/*
 * @project demo-JavaServer-Dictionary
 * @author Duc on 5/13/2020
 */
@WebServlet(name = "ServletTranslation", urlPatterns = "/translate")
public class ServletTranslation extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        String input = request.getParameter("input");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        HashMap<String, String> wordMap = new HashMap<>();
        wordMap.put("OS", "hệ điều hành");
        wordMap.put("OSI", "mô hình phân tầng OSI");
        wordMap.put("URL", "Định vị tài nguyên trên Internet");
        wordMap.put("HTTP", "Giao thức truyền tải siêu văn bản");
        wordMap.put("Dynamic Web", "Web động");
        wordMap.put("TCP/IP", "Giao thức truyền tải điều khiển, Giao thức Internet");
        String result = wordMap.get(input);
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        if (result != null) {
            printWriter.write("<p>English: " + input);
            printWriter.write("<p>Vietnamese: " + result + "</p>");
        } else {
            printWriter.println("Not Found!");
        }
    }
}
