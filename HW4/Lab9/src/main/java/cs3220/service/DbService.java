package cs3220.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import cs3220.model.Data;
import cs3220.model.Users;

public class DbService {

	private String url = "jdbc:mysql://cs3.calstatela.edu/cs3220stu35";
	private String username = "cs3220stu35";
	private String password = "Sd3TFMvxW5Ov";
	private Connection connection;

	public DbService() {
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Data> getEntries() {
		List<Data> entries = new ArrayList<Data>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from listArticles");
			while (rs.next()) {
				Data entry = new Data();
				entry.setId(rs.getInt("id"));
				entry.setTitle(rs.getString("title"));
				entry.setExcerpt(rs.getString("excerpt"));
				entry.setCategory(rs.getString("category"));
				entry.setContent(rs.getString("content"));
				entry.setDatePublished(rs.getTimestamp("datePublished"));
				

				LocalDateTime currTime = rs.getTimestamp(5).toLocalDateTime();
				///DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
				
				entry.setTimeSubmitted(currTime);

				entries.add(entry);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return entries;
	}

	
	public Data getEntry(int id) {
		Data entry = new Data();

		try {
			String sql = "select * from listArticles where id = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				entry.setId(rs.getInt("id"));
				entry.setTitle(rs.getString("title"));
				entry.setExcerpt(rs.getString("excerpt"));
				entry.setCategory(rs.getString("category"));
				entry.setContent(rs.getString("content"));

			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entry;

	}

	
	public int addEntry(String title, String excerpt, String category, String content) {
		int id = 0;
		try {
			String sql = "insert into listArticles (title,excerpt,category,content) values (?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			pstmt.setString(1, title);
			pstmt.setString(2, excerpt);
			pstmt.setString(3, category);
			pstmt.setString(4, content);
			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next())
				id = rs.getInt(1);
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}

	public void getEdit(int id, String title, String excerpt, String category, String content) {
		try {
			String sql = "update listArticles set title = ? , excerpt = ? , category = ? , content = ? where id = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, excerpt);
			pstmt.setString(3, category);
			pstmt.setString(4, content);
			pstmt.setInt(5, id);

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Data getDataInfo(int id) {
		Data entry = new Data();
		try {
			String sql = "select title,excerpt,category,content from listArticles where id = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				entry.setId(rs.getInt("id"));
				entry.setTitle(rs.getString("title"));
				entry.setExcerpt(rs.getString("excerpt"));
				entry.setCategory(rs.getString("category"));
				entry.setContent(rs.getString("content"));
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entry;
	}

	public void getpublishDate(int id) {
		try {
			String sql = "UPDATE listArticles set datePublished = CURRENT_TIMESTAMP where id = ? ";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 
	
	public int addUser(String name, String username,String password, String role) {
		int id = 0;
		try { 
			String sql = "insert into articleUsers (name,username,password,role) values (?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			pstmt.setString(4, role);
			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next())
				id = rs.getInt(1);
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}
	
//	public Users getLogin(int id) {
//		Users entry = new Users();
//
//		try {
//			String sql = "select * from articleUsers where id = ?";
//			PreparedStatement pstmt = connection.prepareStatement(sql);
//			pstmt.setInt(1, id);
//			ResultSet rs = pstmt.executeQuery();
//			if (rs.next()) {
//				entry.setUsername(rs.getString("username"));
//				entry.setPassword(rs.getString("password"));
//				
//
//			}
//			pstmt.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return entry;
//
//	}
	public void getLogin(String username, String password) {
		try {
			String sql = "update articleUsers set username = ? , password = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
