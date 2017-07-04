import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileManagerImpl implements FileManager {
	
	private static final String FILENAME = "user.txt";
	
	@Override
	public User read() {
		User user = null;

		try (ObjectInputStream ois
			= new ObjectInputStream(new FileInputStream(FILENAME))) {
			user = (User) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return user;
	}

	@Override
	public void write(User user) {
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream(FILENAME))) {
			oos.writeObject(user);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
