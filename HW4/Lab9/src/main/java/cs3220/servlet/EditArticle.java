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

@WebServlet("/EditArticle")
public class EditArticle extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
  
    public EditArticle() {
        super();
      
    }

//    private Data getEditArticle(int id) {
//    List<Data> entries = (List<Data>) getServletContext().getAttribute("entries");
//
//        
//        for(Data entry : entries)
//            if(entry.getId() == id) return entry; 
//                
//                            
//        return null;
    //}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        //List<Article> entries = (List<Article>) getServletContext().getAttribute("entries");
//        Article entry = getEditArticle (Integer.parseInt(request.getParameter("id")));
//        
//        PrintWriter out = response.getWriter();
//
//        
//       
//        out.println("<html> <head> <title> Edit </title></head><body>");
//        out.println("<h2> New Articles </h2>");
//        out.println("<table border='1' cellpadding='2' style = 'width:50%'>");
//        out.println("<form method = 'post'>");
//        out.println("<th> Category </th> <td> <select name= 'category' value='" + entry.getCategory() + "' >" + "<option value = Biz&It> BIZ&IT</option>"
//                + "<option value = Tech> Tech </option>" + "<option value = Science> Science</option>"
//                + "<option value = Policy> Policy </option>" + "<option value = Cars> Cars</option>"
//                + "<option value = Gaming&Culture> Gaming&Culture</option>");
//            out.println("</td>");
//
//        
//            /*
//             * a random input type to fix how it looks on the servlet.
//             */
//            out.println("<tr>");
//            out.println("<tr>");
//            out.println("<th> Title</th> <td> <input type = 'text' name = 'title' style = 'width: 100%' value='" + entry.getTitle() + " '>");
//            
//            out.println("</td>");
//            out.println("</tr>");
//            out.println("</tr>");
//            
//            
//            out.println("<tr>");
//
//            
//            out.println("<th> Excerpt</th> <td> <input type = 'text' name = 'excerpt' style= 'width: 100%' value=' " + entry.getExcerpt() + " '>") ;
//            out.println("</tr>");
//            out.println("</td>");
//            
//            out.println("<tr>");
//            out.println("<th> Content </th> <td><textarea name = 'content'" + " rows ='6' cols = '30' style = 'width: 100%'></textarea>"); // Content section
//            out.println("</td>");
//            out.println("</tr>");
//
//            out.println("<tr>");
//            out.println("<td colspan = '2'>");
//            out.println("<button> Save </button>");
//            out.println("</table>");
//        
//        out.println("</form>");
//
//        out.println("</body></html>");
//    	 String id = request.getParameter( "id" );
//         Data entry = getEditArticle( Integer.parseInt(id) );
//         request.setAttribute("entry", entry);
    	int id = Integer.parseInt(request.getParameter("id"));
    	
    	DbService db = new DbService();
    	request.setAttribute("entry", db.getEntry(id));
    	db.close();
		request.getRequestDispatcher("/WEB-INF/EditArticle.jsp").forward(request, response);


    
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // Data entry = getEditArticle (Integer.parseInt(request.getParameter("id")));
        
//        entry.setCategory(request.getParameter("category"));
//        entry.setTitle(request.getParameter("title"));
//        entry.setExcerpt(request.getParameter("excerpt"));
//        entry.setContent(request.getParameter("content"));
    	
    	int id = Integer.parseInt(request.getParameter("id"));
    	String title = request.getParameter("title");
    	String excerpt = request.getParameter("excerpt");
    	String category = request.getParameter("category");
    	String content = request.getParameter("content");
    	
    	DbService db = new DbService();
    	db.getEdit(id,title,excerpt,category,content);
    	db.close();
        
        response.sendRedirect("ListArticles");
        
    }

}