import db.ConnectionDB;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectionDB connectionDB = new ConnectionDB();

        try{
            Connection connection = connectionDB.getConnection();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
