package ru.aston.sort.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import ru.aston.sort.dto.UserDto;
import ru.aston.sort.service.UserService;

import java.util.List;
import java.util.UUID;

/**
 * Entity для юзера.
 *
 * @author Andrey
 */
@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    /**
     * Добавление User.
     *
     * @author Andrey
     */
    @PostMapping(path = "/save")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto savedUser = userService.createUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    /**
     * Поиск по id User.
     *
     * @author Andrey
     */
    @GetMapping(path = "/get/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") UUID userId) {
        UserDto userDto = userService.getUserById(userId);
        return ResponseEntity.ok(userDto);
    }

    /**
     * Изменение User.
     *
     * @author Andrey
     */
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") UUID userId,
                                              @RequestBody UserDto updatedUser) {
        UserDto userDto = userService.updateUser(userId, updatedUser);
        return ResponseEntity.ok(userDto);
    }

    /**
     * Поиск всех User.
     *
     * @author Andrey
     */
    @GetMapping(path = "/get")
    public ResponseEntity<List<UserDto>> getAllUser() {
        List<UserDto> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }

    /**
     * Удаление User.
     *
     * @author Andrey
     */
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") UUID userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("Удаление произожло успешно!");
    }

    /**
     * Удаление всех User.
     *
     * @author Andrey
     */
    @DeleteMapping(path = "/delete")
    public ResponseEntity<String> deleteAllUser() {
        userService.deleteAllUser();
        return ResponseEntity.ok("Удаление произожло успешно!");
    }
}
