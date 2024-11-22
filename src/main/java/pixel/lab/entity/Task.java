package pixel.lab.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdTask")
    private Long idTask;

    @Column(name = "Description")
    private String Description;


}
