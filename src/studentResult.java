/*import java.sql.*;

public class studentResult extends jdbc{
    chat c = new chat();

    public void main() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from student";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    System.out.print(name);
                    System.out.print("\t");
                    String remarks = rs.getString("Remarks");
                    System.out.print(remarks);
                    System.out.println("\n");
                }
            }
            catch (SQLException e ) {
                throw new Error("Problem", e);
            }
            finally {
                if (stmt != null) { stmt.close(); }
            }

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
*/

//Temp
import java.sql.*;

public class studentResult extends jdbc{
    chat c = new chat();

    public String main() {
        String output = "Student Results:\n\tName\tRemarks\n\n";
        Connection conn = null;

        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from student";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    //System.out.print(name);
                    //System.out.print("\t");
                    String remarks = rs.getString("Remarks");
                    output = output + "\t" +  name + "\t" + remarks + "\n";
                }
            } catch (SQLException e) {
                throw new Error("Problem", e);
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return output;
    }
}
