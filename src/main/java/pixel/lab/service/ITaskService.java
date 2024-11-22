package pixel.lab.service;

import pixel.lab.entity.Task;

import java.util.List;

public interface ITaskService {
    void saveTask(Task task);
    List<Task> getAll();
}
