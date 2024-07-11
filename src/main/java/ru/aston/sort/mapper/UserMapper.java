package ru.aston.sort.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.aston.sort.dto.UserDto;
import ru.aston.sort.entity.UserEntity;

/**
 * Маппер для user token.
 *
 * @author Andrey
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends MapperModel<UserEntity, UserDto> {

}
