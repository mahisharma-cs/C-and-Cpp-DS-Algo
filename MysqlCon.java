import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
class MysqlCon
{   public static void main(String args[])
	{   
		try
		{   
			Class.forName("com.mysql.jdbc.Driver");   
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student_info");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			con.close();   
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}   
}   
