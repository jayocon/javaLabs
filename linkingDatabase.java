package cct.com.sem5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class linkingDatabase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  try {
	            // The newInstance() call is a work around for some
	            // broken Java implementations

	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	        } catch (Exception ex) {
	            // handle the error
	        }
		
		try{
			String host = "jdbc:mysql://127.0.0.1:3306/database1";
			String uName = "root";
			String uPass = "";
			Connection con = DriverManager.getConnection(host, uName, uPass);
			
			Statement stmt = con.createStatement( );
			String sql = "SELECT * FROM customerinfo;";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int id = rs.getInt("idCustomerInfo");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String address = rs.getString("address");
				String purchases = rs.getString("purchases");
				
				String p = id +" "+ name +" "+ surname +" "+ address +" "+ purchases;
				System.out.println(p);
			}
		}
		catch (SQLException err){
			System.out.println(err.getMessage());
	
		}
	}
}
