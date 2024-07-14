package ru.aston.sort.service;

import ru.aston.sort.dto.SortStatisticDto;

import java.util.List;

/**
 * Сервис работы с сортировками.
 *
 * @author Team Aston
 */
public interface SortService {

    /**
     * Поиск всех сортировок
     *
     * @return - List<SortStatisticDto>
     */
    List<SortStatisticDto> getAllSort();

    /**
     * SortBubble массив
     *
     * @return - List<Integer>
     */
    List<Integer> getArraySortBubble(List<Integer> array);

    /**
     * SortQuick  массив
     *
     * @return - List<Integer>
     */
    List<Integer> getArraySortQuick(List<Integer> array);
}
