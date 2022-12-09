import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

public static void main(String[] args) {
	
	
	 Connection connection = null;
     PreparedStatement psInsert = null;
     PreparedStatement psCheckScrawlData = null;
     ResultSet resultSet = null;

     try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scrawldata", "root", "");
         psCheckScrawlData = connection.prepareStatement("SELECT * FROM test where pos = ?");
         psCheckScrawlData.setString(1, "pos");
         resultSet = psCheckScrawlData.executeQuery();

         if(resultSet.isBeforeFirst()){
             System.out.println("this ID position already filled in the DB");
             //Alert alert = new Alert(Alert.AlertType.ERROR);
             //alert.setContentText("This data cannot be writtent to the database");
             //alert.show();

         } else {
             psInsert = connection.prepareStatement("Insert into test (pos, titre, genre, prix, description) values (?, ?, ?, ?, ?)");
             psInsert.setString(1, "pos");
             psInsert.setString(2, "titre");
             psInsert.setString(3, "genre");
             psInsert.setString(4, "prix");
             psInsert.setString(5, "description");
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
	
	
	

