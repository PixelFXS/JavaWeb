package pixel.lab.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "taskregister")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_task")
    private Long idTask;

    @Column(name="name")
    private String Name;

    @Column(name = "Description")
    private String Description;

    @Column(name = "date")
    private LocalDate Date;

}
