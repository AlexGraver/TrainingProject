package History;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnector {

//    // Строка подключения к базе данных MySQL
//    String url = "jdbc:mysql://localhost:3306/sample_db";
//    String user = "root";
//    String password = "password"; // Ваш пароль

    // Подключение к базе данных
    public Connection connectToDataBase(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            if (connection != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }


    public void runSQL(Connection connection, String sqlRequest){
        try {
            Statement statement = connection.createStatement();
            statement.execute(sqlRequest);
            System.out.println("Request has been executed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void closeDBConnection(Connection connection) {

        if (connection != null){
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }



}
