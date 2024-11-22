package pixel.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pixel.lab.entity.Task;
import pixel.lab.service.impl.TaskServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    TaskServiceImpl taskService;

    @PostMapping("/new")
    public ResponseEntity<String> createTask(@RequestBody Task task) {
        taskService.saveTask(task);
        return ResponseEntity.ok("Tarea registrada con éxito");
    }

    @GetMapping("/task")
    public List<Task> getAllTasks() {
        return taskService.getAll();
    }
}
