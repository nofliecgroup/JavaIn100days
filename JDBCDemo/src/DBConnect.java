import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {


		Connection connection = null;
	     PreparedStatement psInsert = null;
	     PreparedStatement psCheckScrawlData = null;
	     ResultSet resultSet = null;

	     try {
	         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vdata", "root", "");
	         psCheckScrawlData = connection.prepareStatement("SELECT * FROM recherche ");
	         psCheckScrawlData.setString(1, "id_recherche");
	         resultSet = psCheckScrawlData.executeQuery();

	         if(resultSet.isBeforeFirst()){
	             System.out.println("this ID position already filled in the DB");
	             //Alert alert = new Alert(Alert.AlertType.ERROR);
	             //alert.setContentText("This data cannot be writtent to the database");
	             //alert.show();

	         } else {
	             psInsert = connection.prepareStatement("insert into recherche (id_recherche, titre, description, prix, annee, genre, labelle) VALUES ('?', '?', '?', '?', '?', '?', '?') ");
	             psInsert.setString(1, "id_recherche");
	             psInsert.setString(2, "titre");
	             psInsert.setString(3, "description");
	             psInsert.setString(4, "prix");
	             psInsert.setString(5, "anne");
	             psInsert.setString(5, "genre");
	             psInsert.setString(5, "labelle");

	             psInsert.executeUpdate();

	            // changeScene(event, "EnregistreDonnee.fxml", "username", "password" );
	         }
	     } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("Insert failed");
	         throw new RuntimeException(e);

	     }finally {
	         if (resultSet != null){
	             try{
	                 resultSet.close();
	             } catch (SQLException e){
	                 e.printStackTrace();
	             }
	         }
	         if (psCheckScrawlData != null){
	             try{
	                 psCheckScrawlData.close();
	             }catch (SQLException e){
	                 e.printStackTrace();
	             }
	         }
	         if (psInsert !=null){
	             try{
	                 psInsert.close();
	             }catch (SQLException e){
	                 e.printStackTrace();
	             }
	         }
	         if (connection !=null){
	             try{
	                 connection.close();
	             } catch (SQLException e){
	                 e.printStackTrace();
	             }
	         }
	     }


	}

}
