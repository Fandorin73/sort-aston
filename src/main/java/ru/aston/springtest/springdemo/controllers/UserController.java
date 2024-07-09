package ru.aston.springtest.springdemo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.aston.springtest.springdemo.entity.UserEntity;
import ru.aston.springtest.springdemo.mapper.UserMapper;

/**
 * Entity для юзера.
 *
 * @author Andrey
 */
@RestController
@RequestMapping(path = "/test")
@RequiredArgsConstructor
public class UserController {

    private List<UserEntity> users = createList();
    private final UserMapper userMapper;
    /**
     * Entity для юзера.
     *
     * @author Andrey
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public List<UserEntity> firstPage() {
        return users;
    }

    /**
     * Entity для юзера.
     *
     * @author Andrey
     */
    @GetMapping(path = "/hello/{name}")
    public String helloApp(@PathVariable String name) {
        return "Hello " + name;
    }

    /**
     * Entity для юзера.
     *
     * @author Andrey
     */
    @DeleteMapping(path = {"/{id}"})
    public UserEntity delete(@PathVariable("id") int id) {
        UserEntity deletedEmp = null;
        for (UserEntity emp : users) {
            if (emp.getUserId().equals(id)) {
                users.remove(emp);
                deletedEmp = emp;
                break;
            }
        }
        return deletedEmp;
    }

    /**
     * Entity для юзера.
     *
     * @author Andrey
     */
    @PostMapping
    public UserEntity create(@RequestBody UserEntity user) {
        users.add(user);
        System.out.println(users);
        return user;
    }

    private static List<UserEntity> createList() {
        final List<UserEntity> tempEmployees = new ArrayList<>();
        UserEntity emp1 = new UserEntity();
        emp1.setUserId(UUID.randomUUID());
        emp1.setFirstName("Иван");
        emp1.setLastName("Иванов");
        emp1.setAge(22);
        UserEntity emp2 = new UserEntity();
        emp2.setUserId(UUID.randomUUID());
        emp2.setFirstName("Петр");
        emp2.setLastName("Петров");
        emp2.setAge(36);
        tempEmployees.add(emp1);
        tempEmployees.add(emp2);
        return tempEmployees;
    }
}
