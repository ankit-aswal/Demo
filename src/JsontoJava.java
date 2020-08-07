import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JsontoJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

Class.forName("com.mysql.cj.jdbc.Driver");

Connection conn = null;

conn = DriverManager.getConnection("","","");

Statement st = conn.createStatement();
ResultSet rs = st.executeQuery("Select * from Exception_view;");
rs.next();
rs.next();
rs.getString(1);

System.out.print("hi");

	}

	

}
