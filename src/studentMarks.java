import java.sql.*;

public class studentMarks extends jdbc{
   public String marks() {
       String output = "Student Marks:\n\tName\tFAFL\tDBMS\tOS\tOODJ\tElective\tRemarks\n\n";
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from student;";
            System.out.println("\n");

            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String mark1 = rs.getString("FAFL Marks");
                    String mark2 = rs.getString("DBMS Marks");
                    String mark3 = rs.getString("OS Marks");
                    String mark4 = rs.getString("OODJ Marks");
                    String mark5 = rs.getString("Elective 1 Marks");
                    String remarks = rs.getString("Remarks");
                    output = output + "\t" + name + "\t" + mark1 + "\t" + mark2 + "\t" + mark3 + "\t" + mark4 + "\t" + mark5 + "\t" + remarks + "\n";
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
   return output;
   }
    public String marks(String s) {                             //overloading - Polymorphism
        String output = s;
       //String output = "Student Results:\n\tName\tRemarks\n\n";
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

    public String marks(String s,int a) {
        String output = s;
        //String output = "Student Results:\n\tName\tRemarks\n\n";
        Connection conn = null;

        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from student where Remarks = 'Pass';";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
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

    public String marks(String s,int a, int b) {
        String output = s;
        //String output = "Student Results:\n\tName\tRemarks\n\n";
        Connection conn = null;

        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from student where Remarks = 'Fail';";
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


