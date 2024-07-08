package ru.aston.springtest.springdemo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

/**
 * Entity для юзера.
 *
 * @author Andrey
 */
@Entity
@Table(name = "data_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements IEntity {
    @Id
    @Column(name = "id")
    private UUID userId;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "age")
    private Integer age;

}
