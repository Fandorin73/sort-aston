package ru.aston.springtest.springdemo.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aston.springtest.springdemo.dto.UserDto;
import ru.aston.springtest.springdemo.entity.UserEntity;
import ru.aston.springtest.springdemo.exception.ResourceNotFoundException;
import ru.aston.springtest.springdemo.mapper.UserMapper;
import ru.aston.springtest.springdemo.repository.UserRepository;
import ru.aston.springtest.springdemo.service.UserService;

import java.util.List;
import java.util.UUID;


/**
 * Имплементация UserService.
 *
 * @author Andrey
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper mapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = mapper.toEntity(userDto);
        UserEntity saveUserEntity = userRepository.save(userEntity);
        return mapper.toDto(saveUserEntity);
    }

    @Override
    public UserDto getUserById(UUID userId) {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(
                        () -> new ResourceNotFoundException("User is not exist with given id: " + userId)
                );
        return mapper.toDto(userEntity);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<UserEntity> userEntitys = userRepository.findAll();
        return mapper.toListDto(userEntitys);
    }

    @Override
    public UserDto updateUser(UUID userId, UserDto updateUser) {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(
                        () -> new ResourceNotFoundException("User is not exist with given id: " + userId)
                );
        userEntity.setFirstName(updateUser.getFirstName());
        userEntity.setLastName(updateUser.getLastName());
        userEntity.setAge(updateUser.getAge());
        UserEntity updateUserObj = userRepository.save(userEntity);
        return mapper.toDto(updateUserObj);
    }

    @Override
    public void deleteUser(UUID userId) {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(
                        () -> new ResourceNotFoundException("User is not exist with given id: " + userId)
                );
        userRepository.deleteById(userId);
    }
}
