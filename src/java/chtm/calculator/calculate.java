package chtm.calculator;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chayes10
 */
public class calculate extends HttpServlet {

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String url = "/index.jsp";

    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    request.setAttribute("currentYear", currentYear);

    // get current action
    String action = request.getParameter("action");
    if (action == null) {
      action = "restart";  // default action
    }

    // perform action and set URL to appropriate page
    if (action.equals("restart")) {
      url = "/index.jsp";    // the "join" page
    } else if (action.equals("calculate")) {
      int amount = Integer.parseInt(request.getParameter("amount"));
      int rate = Integer.parseInt(request.getParameter("rate"));
      int years = Integer.parseInt(request.getParameter("years"));
      
      url = "/calculate.jsp";
      
      request.setAttribute("amount", amount);
      request.setAttribute("rate", amount);
      request.setAttribute("years", amount);
    }
    getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    doPost(request, response);
  }

}
