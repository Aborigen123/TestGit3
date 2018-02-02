package Hope;

import java.sql.Connection;
import java.sql.DriverManager;

public class Hope {


	static Connection conn = null;
	public static Connection dbConnector1(){
	try{
		conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:1234/sklad","root","1234");
	
			if(conn!=null)
			{
				System.out.println("Бд підключена");
				System.out.println(conn);
			}
}catch(Exception e){
		System.out.println("Бд НЕпідключена");
	}
	return conn;
}

}
