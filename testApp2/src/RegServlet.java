import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
        String pass = request.getParameter("password");
        MD5 classMD5=new MD5();
        pass=classMD5.encode(pass); 
        try {
            Class obj = Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cas?useUnicode=true&amp;characterEncoding=UTF-8", "root",
                    "admin");

            String sql2 = "Insert INTO cas_users (username,password) values ('"
                    + username + "','" + pass + "') ";
            PreparedStatement stmt = connection.prepareStatement(sql2);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        }
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>×¢²á³É¹¦!" + username + "</h1>");
        out.println("</body>");
        out.println("</html>");
	}
}
