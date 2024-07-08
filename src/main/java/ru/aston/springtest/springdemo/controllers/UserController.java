package ru.aston.springtest.springdemo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.aston.springtest.springdemo.entity.User;

/**
 * Entity для юзера.
 *
 * @author Andrey
 */
@RestController
@RequestMapping(path = "/test")
public class UserController {
    private List<User> users = createList();

    /**
     * Entity для юзера.
     *
     * @author Andrey
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public List<User> firstPage() {
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
    public User delete(@PathVariable("id") int id) {
        User deletedEmp = null;
        for (User emp : users) {
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
    public User create(@RequestBody User user) {
        users.add(user);
        System.out.println(users);
        return user;
    }

    private static List<User> createList() {
        final List<User> tempEmployees = new ArrayList<>();
        User emp1 = new User();
        emp1.setUserId(UUID.randomUUID());
        emp1.setFirstName("Иван");
        emp1.setLastName("Иванов");
        emp1.setAge(22);
        User emp2 = new User();
        emp2.setUserId(UUID.randomUUID());
        emp2.setFirstName("Петр");
        emp2.setLastName("Петров");
        emp2.setAge(36);
        tempEmployees.add(emp1);
        tempEmployees.add(emp2);
        return tempEmployees;
    }
}
