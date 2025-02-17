package me.dio.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.UUID;

@Entity
@Data
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String email;


}
