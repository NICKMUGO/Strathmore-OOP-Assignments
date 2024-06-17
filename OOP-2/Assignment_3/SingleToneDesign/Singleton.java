package SingleToneDesign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Singleton{
    private static volatile Singleton instance;
    private Connection connection;


    private static final String URL="jdbc:mysql://localhost:3306/dbbooks";
    private static final String USERNAME="root";
    private static final String PASSWORD="";

    private Singleton(){
        try{
            // Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch( SQLException e){
            e.printStackTrace();
        }
    }

// Get Database Instance
    public static Singleton getInstance(){
        if( instance==null){
             synchronized (Singleton.class){
                if(instance==null){
                    instance= new Singleton();
                } 
            }
        }
        return instance;
    }

    // Get DatabaseConnection
    public Connection getConnection(){
        return connection;
    }


    //Close Database Connection
    public void closeConnection(){
        if (connection !=null){
            try{
                connection.close();
            } catch ( SQLException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        Singleton db = Singleton.getInstance();
        Connection connection = db.getConnection();
        System.out.println(connection);

        if (connection != null){
            System.out.println("Connection successful: " + connection);

        }else {
            System.out.println("Connection failed");
        }

        db.closeConnection();
    }
}