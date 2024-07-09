package ru.aston.springtest.springdemo.service;

import ru.aston.springtest.springdemo.dto.UserDto;

import java.util.List;
import java.util.UUID;

/**
 * Сервис работы с User.
 *
 * @author Andrey
 */
public interface UserService {

    /**
     * Cоздать нового User
     *
     * @param userDto - данные User от пользователя
     * @return - User
     */
    UserDto createUser(UserDto userDto);

    /**
     * Поиск User по id
     *
     * @param userId - id User
     * @return - UserDto
     */
    UserDto getUserById(UUID userId);

    /**
     * Поиск всех User
     *
     * @return - UserDto
     */
    List<UserDto> getAllUser();

    /**
     * Изменение User по id
     *
     * @param userId        - id юзера
     * @param updateUserDto - User для изменения
     * @return - UserDto
     */
    UserDto updateUser(UUID userId, UserDto updateUserDto);

    /**
     * Удаление User по id
     *
     * @param userId - id User
     */
    void deleteUser(UUID userId);
}
