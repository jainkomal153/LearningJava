package Introduction;

import java.sql.*;

public class ExceptionHandling {
    
    /***
     * Exceptions are of 2 types:
     * 
     * 1. Checked: those exceptions that are handled while coding. Compiler checks the code before executing it, those errors are checked exceptions.
     * For eg.: sql exception
     * 
     * 2. Run time exceptions: those exceptions that are handled while run time. Compiler runs the code but stuck because of the bad written code.
     * for eg.: 2/0 will throw an error, trying to access the 3rd index in a 2 indexed array.
     * 
     * These exceptions can be handled using try, catch and finally or using exception handling.
     * 
     * Note: Catch can not be used alone and try can be used either with catch or finally. Finally code will always execute.
     * @throws SQLException
     * 
     */

    public Connection getConn() throws SQLException{
        String url = "";
        String user = "";
        String password = "";
        Connection conn = null;
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public void withdraw (int amount) throws SQLException{
        getConn();
    }

}
