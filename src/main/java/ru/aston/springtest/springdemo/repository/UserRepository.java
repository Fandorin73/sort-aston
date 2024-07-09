package ru.aston.springtest.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aston.springtest.springdemo.entity.UserEntity;

import java.util.UUID;

/**
 * Хранилище юзер.
 *
 * @author Andrey
 */
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
