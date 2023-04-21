import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc{
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from student";
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            }
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}


