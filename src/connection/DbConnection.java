package connection;

import java.sql.DriverManager;
import java.sql.Connection;

public class DbConnection {
    
    public static Connection CON;
    public static final String URL = "jdbc:mysql://";
    public static final String PATH = "localhost:3306/aplikasihotel";
    
    public static Connection makeConnection(){
        if (CON == null){
            try{
                CON = DriverManager.getConnection(URL + PATH, "root", "");
                System.out.println("Success!");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return CON;
    }
    
   public void closeConnection(){
        System.out.println("Closing database...");
        try{
            CON.close();
            System.out.println("Success!");
        }catch(Exception e){
            System.out.println("Error closing database..");
            System.out.println(e);
        }
    }
}
