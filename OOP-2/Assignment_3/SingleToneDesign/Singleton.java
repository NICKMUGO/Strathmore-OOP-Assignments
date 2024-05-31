package SingleToneDesign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Singleton{
    private static Singleton instance;
    private Connection connection;


    private static final String URL="";
    private static final String USERNAME="username";
    private static final String PASSWORD="";

    private Singleton(){
        try{
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
    }
}