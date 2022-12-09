import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class DBInsert {
	

	public static void main(String[] args) throws SQLException {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vdata", "root", "");
			System.out.println("Connection Successful...");
			//Statement smt = conn.createStatement();
			String query = "INSERT INTO recherche (titre, description, prix, annee, genre, labelle) VALUES ( ?, ?, ?, ?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			
			//pst.setInt(0, Integer.parseInt("id_recherche"));
			//pst.setInt(1, "id_recherche");
			pst.setString(1, "titre");
			pst.setString(2, "description");
			pst.setString(3, "prix");
			pst.setString(4, "annee");
			pst.setString(5, "genre");
			pst.setString(6, "labelle");
			
			
			
			int count = pst.executeUpdate();
			System.out.println("rows updated: " + count);
			
			

	
			//id_recherche, titre, description, prix, id_rgenre, anne
		//System.out.println("row:s " + count);
			
		
		} catch(ClassNotFoundException e) {
			Logger.getLogger(DbConnector.class.getName());
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}
	
	public void InserToDb() {
		
		
	}

	
	
	
}
