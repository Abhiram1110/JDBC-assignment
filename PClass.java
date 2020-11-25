import java.sql.*;
public class PClass {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/projects";
		String uname = "root";
		String pass = "";
		
		String query1 = "select employee name from employees where idemployee id = 3 ";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs1 = st.executeQuery(query1);
		rs1.next();
		String name1 =rs1.getString("employee name");
		System.out.println(name1);
		
		String query2 = "insert into employees values (4,'Elena',30)";
		int count = st.executeUpdate(query2);
		System.out.println(count + "row/s affected");
		
		String query3 = "select employee name from employees where idemployee id = 4 ";
		ResultSet rs2 = st.executeQuery(query3);
		rs2.next();
		String name2 =rs2.getString("employee name");
		System.out.println(name2);
		st.close();
		con.close();
		

	}

}
