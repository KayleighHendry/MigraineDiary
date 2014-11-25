import java.util.Date;
import com.datastax.driver.core.BoundStatement;

public class User
{
	Cluster cluster;
	public User()
	{
		
	}
	
	public boolean RegisterUser(String username, String password, String first_name, String last_name, Date dob, Boolean gender, String employment, String everyday_meds, String known_triggers);
	{
		String EncodedPassword = null;
		try
		{
			EncodedPassword = AeSimpleSHA1.SHA1(password);
		}
		catch (UnsupportedEncodingException | NoSuchAlgorithmException et)
		{
			System.out.printlin("Can't check your password");
			return false;
		}
		Session session = cluster.connect("migrainediary");
		PreparedStatement ps = session.prepare("insert into users (username, password, first_name, last_name, dob, gender, employment, everyday_meds, known_triggers) values(?,?,?,?,?,?,?,?,?);
		BoundStatement boundStatement = new BoundStatement(ps);
		session.execute(boundStatement.bind(username, EncodedPassword, first_name, last_name, dob, gender, employment, everyday_meds, known_triggers));
		return true;
	}
}