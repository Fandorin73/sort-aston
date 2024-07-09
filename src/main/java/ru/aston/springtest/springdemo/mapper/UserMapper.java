package ru.aston.springtest.springdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.aston.springtest.springdemo.dto.UserDto;
import ru.aston.springtest.springdemo.entity.UserEntity;

/**
 * Маппер для user token.
 *
 * @author Andrey
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends MapperModel<UserEntity, UserDto> {

}
