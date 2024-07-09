package ru.aston.springtest.springdemo.mapper;

/**
 * Абстрактный интерфейс для всех мапперов.
 */
public interface MapperModel<E, D> {
    E toEntity(D dto);

    D toDto(E entity);
}
