package pixel.lab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pixel.lab.entity.Task;
import pixel.lab.repository.ITaskRepository;
import pixel.lab.service.ITaskService;
import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService {
    @Autowired
    ITaskRepository iTaskRepository;

    @Override
    public void saveTask(Task task) {
        iTaskRepository.save(task);

    }

    @Override
    public List<Task> getAll() {
        return iTaskRepository.findAll();
    }
}
