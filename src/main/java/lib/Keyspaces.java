import com.datastax.driver.core.BoundStatement;

public final class Keyspaces
{
	public Keyspaces()
	{
		
	}
	
	public static void SetUpKeySpaces(Cluster c)
	{
		try
		{
			String createKeyspace = "create keyspace if not exists migrainediary  WITH replication = {'class':'SimpleStrategy', 'replication_factor':1}";
			String createUserTable = "CREATE TABLE if not exists migrainediary.users ("
				+ " patientid uuid, "
				+ " username varchar, "
				+ " password text, "
				+ " first_name text, "
				+ " last_name text, "
				+ " dob timestamp, "
				+ " gender bool, "
				+ " employment text, "
				+ " everyday_meds varchar, "
				+ " known_triggers text, "
				+ " PRIMARY KEY (patientID)"
				+ " )";
			String createDiaryTable = "CREATE TABLE if not exists diary ("
				+ "diaryid uuid, "
				+ "start timestamp, "
				+ "end timestamp, "
				+ "triggers text, "
				+ "medications text, "
				+ "description text, "
				+ " PRIMARY KEY (diaryid)"
				+ " )";
			String createMedicationTable = "CREATE TABLE if not exists medication ("
				+ " medicationid uuid, "
				+ " name varchar, "
				+ " type text, "
				+ " PRIMARY KEY (medicationid)"
				+ " )";
			String createCauseTable = "CREATE TABLE if not exists cause ("
				+ "triggerid uuid, "
				+ "name text, "
				+ "categories text, "
				+ " PRIMARY KEY (triggerid)"
				+ " )";
			Session session = c.connect();
			try
			{
				PreparedStatement statement = session.prepare(createKeyspace);
				BoundStatement boundStatement = new BoundStatement(statement);
				System.out.println ("Created Migraine Diary");
			} 
			catch (Exception et) 
			{
				System.out.println("Can't create Migraine Diary " + et);
			}
			
			System.out.println("" + createUserTable);
			try
			{
				SimpleStatement cqlQuery = new SimpleStatement(createUserTable);
				session.execute(cqlQuery);
			}
			catch (Exception et)
			{
				System.out.println("Can't create user table" + et);
			}
			
			System.out.println("" + createDiaryTable);
			try
			{
				SimpleStatement cqlQuery = new SimpleStatement(createDiaryTable);
				session.execute(cqlQuery);
			}
			catch (Exception et)
			{
				System.out.println("Can't create diary table" + et);
			}
			
			System.out.println("" + createMedicationTable);
			try
			{
				SimpleStatement cqlQuery = new SimpleStatement(createMedicationTable);
				session.execute(cqlQuery);
			}
			catch (Exception et)
			{
				System.out.println("Can't create medication table" + et);
			}
			
			System.out.println("" + createCauseTable);
			try
			{
				SimpleStatement cqlQuery = new SimpleStatement(createCauseTable);
				session.execute(cqlQuery);
			}
			catch (Exception et)
			{
				System.out.println("Can't create cause table" + et);
			}
		}
		catch (Exception et)
		{
			System.out.println("Other keyspace or column definition error " + et);
		}
	}
}