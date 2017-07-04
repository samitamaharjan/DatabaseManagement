package com.project.manager;
import java.util.List;

public interface FileManager<T> {
	public List<T> read();
	public void insert(T user);
	public void clean();
}
