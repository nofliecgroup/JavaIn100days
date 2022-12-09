import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnector {
	
	
	void CreateConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vdata", "root", "");
			System.out.println("Connection Successful...");
			Statement smt = conn.createStatement();
			ResultSet  rst = smt.executeQuery("SELECT * FROM recherche ");
			//id_recherche, titre, description, prix, id_rgenre, anne
			while(rst.next()) {
				int rechereID = rst.getInt("id_recherche");
				String title = rst.getString("titre");
				String price = rst.getString("prix");
				String genreID = rst.getString("annee");
				String releasedYear = rst.getString("genre");
				String label = rst.getString("labelle");
				
				System.out.println( rechereID + " " + " Price: " + price + " " + genreID + " " + releasedYear + " " + label + "" );
			
			
			}
			
			
		
		} catch(ClassNotFoundException e) {
			Logger.getLogger(DbConnector.class.getName());
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		DbConnector connector = new DbConnector();
		connector.CreateConnection();
		
	}
	
	
	
	

}
