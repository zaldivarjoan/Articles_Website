package cs3220.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Data;
import cs3220.service.DbService;

@WebServlet(urlPatterns="/ListArticles",loadOnStartup =1)
public class ListArticles extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    public ListArticles() {
        super();
        // TODO Auto-generated constructor stub
    }

    
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        //timeSubmitted.format(formatter);
//        
//        
//        List<Data> entries = new ArrayList<Data>();
//        entries.add(
//                new Data("japan Declared War on floppy disk for government use " , "In Japan, 1,900 government procedures still require submission on floppy disk ", "Biz&IT", null, "Edit", null ));
//        
//        entries.add(new Data("Android 13 review: Plans for the future, but not much to offer today",
//                "Android 13 is a very small update but its also the second one this year", "Tech",  null, "Edit", "In Japan, 1,900 government procedures still require submission on floppy disk."));
//        getServletContext().setAttribute("entries", entries);
//    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
      //  List<Article> entries = (List<Article>) getServletContext().getAttribute("entries");
       // request.getRequestDispatcher("/WEB-INF/ListArticles.jsp").forward(request, response);

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html> <head> <title>Articles</title></head><body>");
//        out.println("<h2> Articles </h2>");
//        out.println("<p>" + "<span> <a href='AddArticle'>New Article</a> </span>" + "</p>");
//        out.println("<table border='1' cellpadding='2'>");
//        out.println(
//                // The table heading
//                "<tr>" + "<th> Article </th>" + "<th> Category </th>" + "<th> Submitted</th>" + "<th> Published </th>" + "<th> Operations </th> " +"</tr>");
//        for (Article entry : entries) {
//            out.println("<tr>");
//            out.println("<td> <a href = 'DisplayArticle?id=" + entry.getId() + "' >" +  entry.getTitle()  + "</a>"  + "<br>" + entry.getExcerpt() + " </td>  ");
//            out.println("<td>" + entry.getCategory() + "</td>");
//            out.println("<td>" + entry.getTime() + "</td>");
//    
//            
//            
//            if(entry.isDateIsTorD() == true) {
//                out.println(entry.getDatePublished());
//                
//            }
//            else {
//                out.println("<form action='ListArticles' method='post'>");
//                out.println("<input type = 'hidden' value='" + entry.getId() + " ' " + " name= 'ArticleID'>");
//                out.println("<td><button class='text-primary rounded-pill'> " + "Publish" + "</a>" + "</button></td>");
//                out.println("</form>");
//                
//                
//            }
//                
//            
//            
//            
//            out.println("<td> <a href = 'EditArticle?id=" + entry.getId() + " ' > "  + "Edit" + "</a>" + "</td>");
//            out.println();
//            out.println(" </a> </tr>");
//        }
//        out.println("</table>");
//    
//
//        out.println("</body></html>");
//
        
        //----Connect stuff----\\
        DbService dbService = new DbService();
        request.setAttribute("entries", dbService.getEntries());
        
        dbService.close();
        
        request.getRequestDispatcher("/WEB-INF/ListArticles.jsp").forward(request, response);

       
   }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        doGet(request, response);
//    }
}