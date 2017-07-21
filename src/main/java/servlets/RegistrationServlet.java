package servlets;

import contents.Person;
import utils.mongodb.MongoDBInterface;
import utils.mysql.MySQLInterface;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Person person = new Person(request);

    MongoDBInterface.createNewUser(person);

    /*A new user has been created successfully*/
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter writer = response.getWriter();
    writer.println("<h1>A new user has been created successfully!!!</h1>");

    String nextJSP = "/registrationSuccess";
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
    dispatcher.forward(request,response);
  }
}
