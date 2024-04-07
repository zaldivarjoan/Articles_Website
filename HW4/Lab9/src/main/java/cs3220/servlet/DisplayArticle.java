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

@WebServlet("/DisplayArticle")
public class DisplayArticle extends HttpServlet {
    private static final long serialVersionUID = 1L;
  
    public DisplayArticle() {
        super();
        // TODO Auto-generated constructor stub
    }
    private Data getEntry( int id )
    {
        List<Data> entries = (List<Data>) getServletContext()
            .getAttribute( "entries" );
        for( Data entry : entries )
            if( entry.getId() == id ) return entry;
        return null;
    }
    
//    private Article getDisplayArticle(int id) {
//        List<Article> entries = (List<Article>) getServletContext().getAttribute("entries");
//        
//        for(Article entry : entries)
//            if(entry.getId() == id) return entry;
//        return null;
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // response.setContentType("text/html");
        
//        Article entry = getDisplayArticle (Integer.parseInt(request.getParameter("id")));
//
//        
//        PrintWriter out = response.getWriter(); 
//        out.println("<html> <head> <title> DisplayArticle </title></head><body>");
//        out.println("<form method = 'post'>");
//        
//        out.println("<p>" + "<span> <a href='ListArticles'>Back to Articles</a> </span>" + "</p>");
//        
//        out.println("<strong>");
//        out.println(entry.getTitle());
//        out.println("</strong>");
//        
//        out.println("<br>");
//        out.println("<br>");
//        
//        out.println("<i>");
//        out.println(entry.getExcerpt());
//        
//        out.println("<br>");
//        out.println("<br>");
//        out.println("<p> Japan's newly appointed Minister of Digital Affairs, Taro Kono, has declared war on the floppy disk and other forms of obsolete media, which the government still requires as a submission medium for around 1,900 types of business applications and other forms</p>");
//    
//        
//            out.println("</table>");
//        
//        out.println("</form>");
//
//        out.println("</body></html>");
    	
    	
//        String id = request.getParameter( "id" );
//        Data entry = getEntry( Integer.parseInt(id) );
//        request.setAttribute("entry", entry);
    	
    	int id = Integer.parseInt(request.getParameter("id"));
    	
    	DbService db = new DbService();
    	request.setAttribute("entry", db.getEntry(id));
    	db.close();
        request.getRequestDispatcher("/WEB-INF/DisplayArticle.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      Data entry = getEntry(Integer.parseInt(request.getParameter("id")));
//
//     //  Integer.parseInt(request.getParameter("id"));
//        entry.setTitle(request.getParameter("title"));
//        
//        entry.setExcerpt(request.getParameter("excerpt"));
//        
//        response.sendRedirect("ListArticles");
//    }
    
//    GuestBookEntry entry = getEntry(
//            Integer.parseInt( request.getParameter( "id" ) ) );
//        entry.setName( request.getParameter( "name" ) );
//        entry.setMessage( request.getParameter( "message" ) );
//        response.sendRedirect( "GuestBook" );

}
}