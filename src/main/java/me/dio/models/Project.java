package me.dio.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "tb_project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    private String name;
    @Column()
    private String description;
    @Column()
    private LocalDateTime start_date;
    @Column()
    private LocalDateTime end_date;
    @Column()
    private boolean status;
//    @Column
//    private Customer customer_id;
}
