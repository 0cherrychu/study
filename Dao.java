import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	public void printAllDatas() {
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try{
			String url = "jdbc:oracle:thin:@192.168.204.11:1521:XE";
			connection = DriverManager.getConnection(url,"SYSTEM","admin");
			
			String query = "SELECT * FROM BOARD";
			pstmt = connection.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			while ( rs.next() ){
				System.out.println(rs.getInt("BOARD_ID"));
				System.out.println(rs.getString("SUBJECT"));
				System.out.println(rs.getString("CONTENT"));
				System.out.println(rs.getString("WRITER"));
				System.out.println(rs.getString("LIKE_COUNT"));
				System.out.println(rs.getString("WRITE_DATE"));
				System.out.println("=============================");
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {}
			}
			if(pstmt != null){
				try {
					pstmt.close();
				} catch (SQLException e) {}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		
	}

}
