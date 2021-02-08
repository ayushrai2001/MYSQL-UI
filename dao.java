import java.sql.*;
class dao
{
	public static Connection createconnection()
	{
		Connection con = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","lakshay");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}