package cs3220.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Data;
import cs3220.service.DbService;

/**
 * Servlet implementation class PublishArticle
 */
@WebServlet("/PublishArticle")
public class PublishArticle extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublishArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
//int id = Integer.parseInt(request.getParameter("id"));
//        
//        List<Data> entries = (List<Data>) getServletContext().getAttribute("entries");
//        
//        for(Data d : entries) {
//            if(d.getId() == id) {
//            	
//            	d.setDatePublished();
//            }
//            
//        }
//        response.sendRedirect("ListArticles");
//        return;
    	
    	int id = Integer.parseInt(request.getParameter("id"));
    	
    	DbService db = new DbService();
    	db.getpublishDate(id);
    	
    	response.sendRedirect("ListArticles");
    	
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        
       
//       response.sendRedirect("ListArticles");
//     return;
                
               // d.setDatePublished(dateFormatted.format(date));
                
                          
                
            }
        
        
        
    
    
        
        
        
    }

