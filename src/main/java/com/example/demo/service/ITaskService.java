package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Task;

public interface ITaskService {
	
	public List<Task> findAllTasks();
	public void saveTask(Task task);
	public Task findTask(Long id);
	public void deleteTask(Long id);

}
