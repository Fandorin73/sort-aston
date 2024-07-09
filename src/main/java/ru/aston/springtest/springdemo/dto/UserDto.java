package ru.aston.springtest.springdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

/**
 * DTO для User.
 *
 * @author Andrey
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto implements DtoModel {

    private UUID userId;

    private String lastName;

    private String firstName;

    private Integer age;
}