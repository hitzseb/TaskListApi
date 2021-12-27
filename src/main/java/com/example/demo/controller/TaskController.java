package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Task;
import com.example.demo.service.ITaskService;

@CrossOrigin
@RestController
public class TaskController {
	
	@Autowired
	public ITaskService taskService;
	
	@GetMapping("/all")
	@ResponseBody
	public List<Task> showTasks() {
		return taskService.findAllTasks();
	}
	
	@PostMapping("/new")
	public void saveTask(@RequestBody Task task) {
		taskService.saveTask(task);
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
	}

}
