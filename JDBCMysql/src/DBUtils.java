import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class DBUtils {
	
void CreateConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scrawldata", "root", "");
			System.out.println("Connection Successful...");
			Statement smt = conn.createStatement();
			ResultSet  rst = smt.executeQuery("select * from recherche r inner join genre g where r.id_rgenre = g.id_genre ;");
			//id_recherche, titre, description, prix, id_rgenre, anne
			while(rst.next()) {
				int rechereID = rst.getInt("id_recherche");
				String title = rst.getString("titre");
				String price = rst.getString("prix");
				String genreID = rst.getString("anne");
				String releasedYear = rst.getString("id_genre");
				String label = rst.getString("genre_label");
				
				System.out.println( rechereID + " " + " Price: " + price + " " + genreID + " " + "" + " " + label + "" );
			
			
			}
			
			
		
		} catch(ClassNotFoundException e) {
			Logger.getLogger(DBUtils.class.getName());
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void InsertToDb() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scrawldata", "root", "");
			System.out.println("Connection Successful...");
			//Statement smt = conn.createStatement();
			String query = "insert into recherche (titre, description, prix, id_rgenre, anne)  values (?,?,?,?,?)";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			//pst.setInt(0, Integer.parseInt("id_recherche"));
			//pst.setInt(1, "id_recherche");
			pst.setString(1, "titre");
			pst.setString(2, "description");
			pst.setString(3, "prix");
			pst.setString(4, "id_rgenre");
			pst.setString(5, "anne");
		
			//pst.setString(7, "genre_label");
			
			
			
			
			int count = pst.executeUpdate();
			System.out.println("rows updated: " + count);
			
			

	
			//id_recherche, titre, description, prix, id_rgenre, anne
		//System.out.println("row:s " + count);
			
		
		} catch(ClassNotFoundException e) {
			Logger.getLogger(DBUtils.class.getName());
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		DBUtils connector = new DBUtils();
		//connector.CreateConnection();
		connector.InsertToDb();
		System.out.println("Data Inserted");
	}
	
	

}
