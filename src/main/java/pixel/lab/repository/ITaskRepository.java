package pixel.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pixel.lab.entity.Task;

public interface ITaskRepository extends JpaRepository<Task, Long> {

}
