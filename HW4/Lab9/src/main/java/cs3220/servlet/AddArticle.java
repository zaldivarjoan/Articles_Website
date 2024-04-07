package cs3220.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Data;
import cs3220.service.DbService;

@WebServlet(urlPatterns = "/AddArticle", loadOnStartup = 1)

/**
 * Servlet implementation class AddArticle
 */

public class AddArticle extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        out.println("<html> <head> <title> New Articles</title></head><body>");
//        out.println("<h2> New Articles </h2>");
//
//        out.println("<table border='1' cellpadding='2' style = 'width:50%'>");
//        out.println("<form action= 'AddArticle' method = 'post'>");
//
//        out.println("<th>Category </th> <td> <select name= 'category' >" + "<option value = Biz&It> BIZ&IT</option>"
//                + "<option value = Tech> Tech </option>" + "<option value = Science> Science</option>"
//                + "<option value = Policy> Policy </option>" + "<option value = Cars> Cars</option>"
//                + "<option value = Gaming&Culture> Gaming&Culture</option>");
//
//        out.println("</td>");
//
//        /*
//         * a random input type to fix how it looks on the servlet.
//         */
//        out.println("<tr>");
//
//        out.println("<tr>");
//        out.println("<th> Title </th> <td><input type = 'text' name = 'Title' style = 'width: 100%'>");
//
//        out.println("</tr>");
//
//        out.println("</tr>");
//
//        out.println("<tr>");
//        out.println("<th> Excerpt</th> <td> <input type = 'text' name = 'excerpt' style= 'width: 100%'>");
//        out.println("</tr>");
//        out.println("</td>");
//
//        out.println("<tr>");
//        out.println("<th> Content </th> <td><textarea name = 'content'" + " rows ='6' cols = '30' style = 'width: 100%'></textarea>"); // Content section
//        out.println("</td>");
//        out.println("</tr>");
//
//        out.println("<tr>");
//        out.println("<td colspan = '2'>");
//        out.println("<button> Add </button>");
//        out.println("</table>");
//
//        out.println("</form>");
//
//        out.println("</body></html>");
        
		request.getRequestDispatcher("/WEB-INF/AddArticle.jsp").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Title = request.getParameter("Title");

        String excerpt = request.getParameter("excerpt");

        String Category = request.getParameter("category");

        //String date = request.getParameter("date");

      //  String operations = request.getParameter("operation");
      //  
        String content = request.getParameter("content");
        // insert data into database
        //...
        
        DbService db = new DbService();
        db.addEntry(Title, excerpt, Category, content);
        db.close();
        
        
        
        
//        Data entry = new Data(Title, excerpt, Category, date, operations, content);
//
//        List<Data> entries = (List<Data>) getServletContext().getAttribute("entries");
//        entries.add(entry);

        response.sendRedirect("ListArticles");
    }
}