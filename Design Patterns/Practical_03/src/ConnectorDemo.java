import java.sql.*;

public class ConnectorDemo {
    public static void main(String[] args) {
        try {
            Connector connection = Connector.getInstance();

            Connection conn = connection.getConnection();

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM basicdata JOIN marks ON basicdata.stu_id = marks.stu_id;");

            while (resultSet.next()) {
                String id = resultSet.getString("stu_id");
                String name = resultSet.getString("stu_name");
                String address = resultSet.getString("stu_address");
                float chemistry = resultSet.getFloat("chemistry");
                float physics = resultSet.getFloat("physics");
                float maths = resultSet.getFloat("maths");
                System.out.println(id + "\t" + name + "\t" + address + "\t" + chemistry + "\t" + physics + " \t" + maths);
            }

        resultSet.close();
        statement.close();
        conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
