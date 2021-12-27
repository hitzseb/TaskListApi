package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Task;
import com.example.demo.repo.TaskRepo;

@Service
public class TaskServiceImpl implements ITaskService {
	
	@Autowired
	public TaskRepo taskRepo;

	@Override
	public List<Task> findAllTasks() {
		return taskRepo.findAll();
	}

	@Override
	public void saveTask(Task task) {
		taskRepo.save(task);
	}

	@Override
	public Task findTask(Long id) {
		return taskRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteTask(Long id) {
		taskRepo.deleteById(id);
	}

}
