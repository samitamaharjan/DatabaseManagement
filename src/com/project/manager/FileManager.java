package com.project.manager;
import java.util.List;

public interface FileManager<T> {
	public List<T> findAll();
	public T findByPrimaryKey(String id);
	public void insert(T user);
	public void clean();
}
