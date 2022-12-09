import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtils {

	public static void main(String[] args) {
		
		connectDB("root", "");
		System.out.println("End of data retrieval");

		
		
	}
	
	public static void connectDB(String username, String password) {
		
		
		try {
			// get connection to the database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vinyldata", "root", "");
			// create a statement
			Statement statement  = connection.createStatement();
			
			// execute sql query
			ResultSet result = statement.executeQuery("select * from  recherche r inner join genre g on r.id_genre = g.id_Genre "); 
			// Process the result 
			
			while(result.next()) {
				System.out.println("Genre ID " + (result.getString("id_genre")) + " Titre: " +   result.getString("Titre") + " Description: " + (result.getString("Description")) + "Prix:  " + (result.getString("Prix")) + ", Annee: " + (result.getString("Annee"))  );
			}
		} catch(Exception e) {
			e.printStackTrace();
			
		} 
		
		
	}

}
