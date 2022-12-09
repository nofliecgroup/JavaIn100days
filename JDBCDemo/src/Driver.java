import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		
		try {
			// get connection to the database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vinyldata", "root", "");
			// create a statement
			Statement statement  = connection.createStatement();
			
			
			// execute sql query
			ResultSet result = statement.executeQuery("Select * from recherche "); 
			// Process the result 
			
			while(result.next()) {
				System.out.println(result.getString("Titre") + ", " + (result.getString("Description")) + ", " + (result.getString("Prix")) + ", " + (result.getString("Annee"))  );
			}
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}
	
	

}
