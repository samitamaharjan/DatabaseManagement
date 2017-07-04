import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileManagerImpl<T> implements FileManager<T> {
	
	private String filename;
	
	public FileManagerImpl(String filename) {
		this.filename = filename;
	}
	
	@Override
	public List<T> read() {
		List<T> list = new ArrayList<>();

		try (ObjectInputStream ois
			= new ObjectInputStream(new FileInputStream(filename))) {
			list = (List<T>) ois.readObject();
		} catch (Exception ex) {
			// ex.printStackTrace();
		}
		return list;
	}

	@Override
	public void insert(T t) {
		List<T> list = read();
		list.add(t);
		
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(list);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void clean() {
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(new ArrayList<>());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
