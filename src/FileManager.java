import java.util.List;

interface FileManager<T> {
	public List<T> read();
	public void insert(T user);
	public void clean();
}
