import java.sql.*;

public class teacherlocation {

    public String main() {
        String output = "Faculty Cabin Locations:\n\tName\tDepartment\tFloor\tCabin number\n\n";
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from teacherLocation;";
            System.out.println("\n");

            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String dept = rs.getString("Department");
                    String floor = rs.getString("Floor");
                    String cn = rs.getString("Cabin number");

                    output = output + "\t" + name + "\t" + dept + "\t" + floor + "\t" + cn  + "\n";
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

    public String CSE(){
        String output = "Faculty Cabin Locations:\n\tName\tDepartment\tFloor\tCabin number\n\n";
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from teacherLocation where Department = 'CSE';";
            System.out.println("\n");

            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String dept = rs.getString("Department");
                    String floor = rs.getString("Floor");
                    String cn = rs.getString("Cabin number");

                    output = output + "\t" + name + "\t" + dept + "\t" + floor + "\t" + cn  + "\n";
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

    public String ECE(){
        String output = "Faculty Cabin Locations:\n\tName\tDepartment\tFloor\tCabin number\n\n";
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from teacherLocation where Department = 'ECE';";
            System.out.println("\n");

            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String dept = rs.getString("Department");
                    String floor = rs.getString("Floor");
                    String cn = rs.getString("Cabin number");

                    output = output + "\t" + name + "\t" + dept + "\t" + floor + "\t" + cn  + "\n";
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

    public String ME(){
        String output = "Faculty Cabin Locations:\n\tName\tDepartment\tFloor\tCabin number\n\n";
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from teacherLocation where Department = 'ME';";
            System.out.println("\n");

            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String dept = rs.getString("Department");
                    String floor = rs.getString("Floor");
                    String cn = rs.getString("Cabin number");

                    output = output + "\t" + name + "\t" + dept + "\t" + floor + "\t" + cn  + "\n";
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

    public String Administration(){
        String output = "Faculty Cabin Locations:\n\tName\tDepartment\tFloor\tCabin number\n\n";
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from teacherLocation where Department = 'Administration';";
            System.out.println("\n");

            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String dept = rs.getString("Department");
                    String floor = rs.getString("Floor");
                    String cn = rs.getString("Cabin number");

                    output = output + "\t" + name + "\t" + dept + "\t" + floor + "\t" + cn  + "\n";
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

    public String Dean(){
        String output = "Dean's cabin:\n\tName\tDepartment\tFloor\tCabin number\n\n";
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Pavan_B/Downloads/General/SQLiteDatabaseBrowserPortable/chatbot.db";
            conn = DriverManager.getConnection(url);

            Statement stmt = null;
            String query = "select * from teacherLocation where Name = 'Srinivas';";
            System.out.println("\n");

            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String dept = rs.getString("Department");
                    String floor = rs.getString("Floor");
                    String cn = rs.getString("Cabin number");

                    output = output + "\t" + name + "\t" + dept + "\t" + floor + "\t" + cn  + "\n";
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
}
