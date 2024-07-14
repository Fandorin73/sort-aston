package ru.aston.sort.service;

import ru.aston.sort.dto.SortStatisticDto;
import java.util.List;
import java.util.UUID;

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
     * Поиск всех сортировок
     *
     * @param userId
     * @return - List<SortStatisticDto>
     */
    List<SortStatisticDto> getSortByUserId(UUID userId);

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
