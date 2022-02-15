package mysql.b_book.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import mysql.b_book.BookVO;
import mysql.dao.BookDAO;

public class BookPSTMTDAOImpl implements BookDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public BookPSTMTDAOImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/smart",
					"smart", "12345");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {}
	}

	// book  정보를 삽입하고  삽입된 행의 개수를 반환
	@Override
	public int insert(BookVO book) {
		int result = 0;
		String sql = "INSERT INTO tbl_book(title,author) VALUES(?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {}
		}
		return result;
	}

	@Override
	public ArrayList<BookVO> select() {
		ArrayList<BookVO> books = new ArrayList<>();
		String sql = "SELECT * FROM tbl_book ORDER BY num DESC";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				books.add(new BookVO(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getTimestamp(4)
				));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {}
		}
		return books;
	}

	@Override
	public int update(BookVO book) {
		String sql = "UPDATE tbl_book "
					+" SET title = ? ,"
					+" author = ? "
					+" WHERE num = ?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setInt(3, book.getNum());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {}
		}
		return result;
	}

	@Override
	public BookVO selectBook(int num) {
		BookVO book = null;
		String sql = "SELECT * FROM tbl_book WHERE num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				Date regdate = rs.getTimestamp(4);
				book = new BookVO(num,title,author,regdate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {}
		}
		return book;
	}

	@Override
	public int delete(int num) {
		int result = 0;
		String sql = "DELETE FROM tbl_book WHERE num = "+num;
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {}
		}
		return result;
	}
}






