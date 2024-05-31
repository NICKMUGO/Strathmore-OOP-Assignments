import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Books {
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/dbbooks";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String args []){
        Connection connection =null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            statement = connection.createStatement();

            resultSet=statement.executeQuery("SELECT * FROM tblBooks");

            while(resultSet.next()){
                String author = resultSet.getString(2);
                String title = resultSet.getString(3);
                System.out.printf("Author: %s, Title: %s\n", author, title);
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}