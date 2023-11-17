package br.com.carrent.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "admin")
    private Boolean admin;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
