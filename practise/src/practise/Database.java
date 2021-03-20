package practise;
import java.sql.*;

public class Database {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//DriverManager.registerDriver(null);
			String url ="jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "Moku#0399";
			Connection conn = DriverManager.getConnection(url,user,password);
			Statement stmt = conn.createStatement();
			String query2= "Insert into employee (ID, Name, Company) values (105,'Sekhar', 'IBM')";
			String query1 = "Delete from employee where id=104";
			String query = "Select * from employee";
			int rs1 = stmt.executeUpdate(query1);
			int rs2 = stmt.executeUpdate(query2);
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
