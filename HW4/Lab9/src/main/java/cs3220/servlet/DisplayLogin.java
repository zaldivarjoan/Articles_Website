package cs3220.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Users;
import cs3220.service.DbService;

/**
 * Servlet implementation class DisplayLogin
 */
@WebServlet("/DisplayLogin")
public class DisplayLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/DisplayLogin.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
//			List<Users> users = new ArrayList<Users>();
//			
//			String username = request.getParameter( "username" );
//	        String password = request.getParameter( "password" );
//	        String sql = "select * from articleUsers where username = '" + username
//	            + "' and password = '" + password + "'";
//
//	        Connection c = null;
//	        try
//	        {
//	        	String url = "jdbc:mysql://cs3.calstatela.edu/cs3220stu35";
//	            c = DriverManager.getConnection( url, "cs3220stu35", "Sd3TFMvxW5Ov" );
//	            Statement stmt = c.createStatement();
//	            ResultSet rs = stmt.executeQuery( sql );
//	            while( rs.next())
//	            {
//	        Users user = new Users();
//	        user.setName(rs.getString("name"));
//	        user.setUsername(rs.getString("username"));
//	        user.setPassword(rs.getString("password"));
//	       
//	        
//	        users.add(user);
//		}}catch(
//
//	SQLException e)
//	{
//		throw new ServletException(e);
//	}finally
//{
//    try
//    {
//        if( c != null ) c.close();
//    }
//    catch( SQLException e )
//    {
//        throw new ServletException( e );
//    }
//}
//	
//	 request.setAttribute( "users", users );
//     request.getRequestDispatcher( "/WEB-INF/ListArticles.jsp" )
//         .forward( request, response );
//	}
//	}

			//String name = "John doe";
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			//String password = "abcd";
			
			DbService db = new DbService();
			db.getLogin(username, password);
			
			
			
			
			
			
			

			if(request.getParameter("username").equals(username) && request.getParameter("password").equals(password)) {
				request.getSession().setAttribute("user", username);
				request.getSession().setAttribute("name", password);
				response.sendRedirect("ListArticles");
			}
			else {
				response.sendRedirect("DisplayLogin");
			
			}
			db.close();
	}
}


