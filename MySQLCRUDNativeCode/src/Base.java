import java.sql.*;
//import java.util.logging.Logger;
//import java.util.logging.Level;

public class Base {

	private static final String ConnectionString="jdbc:mysql://localhost/emp";
	private static final String DBUser="root";
	private static final String DBPass="mysql";
	protected static Connection conn=null;
	protected static Statement stmt=null;
	protected static ResultSet rs=null;

	//private static final Logger logger = Logger.getLogger(Base.class.getName());
		
	public static void main(String[] args) {
		
		try{
			Base b=new Base();
		//	logger.entering(Base.class.getName(), "doIt");
			b.insert();
			b.update();
			//b.delete();
			b.read();
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	
	public Base(){
		try{
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(ConnectionString,DBUser,DBPass);
			if(conn!=null){
				System.out.println("connection established..");
			}else{
				System.out.println("connections not established..");
			}
			System.out.println(conn);	
			}catch(Exception e){
				e.printStackTrace();
		}
	}
	
	public boolean insert(){
			try{
				stmt=conn.createStatement();
				String query=" insert into profile values(\"suresh\",102);";
				int res=stmt.executeUpdate(query);
				//System.out.println("result of executeUpdate"+res);

				if(res==0){
					//System.out.println("record not inserted");
					return false;
				}
				else{
					//System.out.println("record Inserted");
				    return true;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}
	
	public boolean update(){
		try{
			stmt=conn.createStatement();
			String Query="update profile set id=103 where name=\"ramesh\"";
			int res=stmt.executeUpdate(Query);
			if(res==0){
				return false;
			}else{
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean delete(){
		try{
			stmt=conn.createStatement();
			String Query="delete from profile where name=\"ramesh\"";
			int res=stmt.executeUpdate(Query);
			if(res==0){
				return false;
			}else{
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean read(){
		try{
			stmt=conn.createStatement();
			String Query="select * from profile";
			rs=stmt.executeQuery(Query);
			while(rs.next()){
				String name=rs.getString("name");
				int id=rs.getInt("id");
				System.out.println("name="+name+" --> "+"id="+id);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
}
