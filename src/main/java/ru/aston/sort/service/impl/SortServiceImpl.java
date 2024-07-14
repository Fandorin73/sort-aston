package ru.aston.sort.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aston.sort.dto.SortStatisticDto;
import ru.aston.sort.entity.SortStatistic;
import ru.aston.sort.mapper.SortStatisticsMapper;
import ru.aston.sort.repository.SortStatisticRepository;
import ru.aston.sort.service.SortService;
import java.util.*;

/**
 * Имплементация SortService.
 *
 * @author Team Aston
 */
@Service
@AllArgsConstructor
public class SortServiceImpl implements SortService {

    private final SortStatisticRepository sortStatisticRepository;
    private final SortStatisticsMapper mapper;

    @Override
    public List<SortStatisticDto> getAllSort() {
        List<SortStatistic> sortStatistics = sortStatisticRepository.findAll();
        return mapper.toListDto(sortStatistics);
    }

    @Override
    public List<Integer> getArraySortBubble(List<Integer> array) {
        List<Integer> result=array;
        return result;
    }

    @Override
    public List<Integer> getArraySortQuick(List<Integer> array) {

        List<Integer> result=array;

       // записать все в базу время, сетит

        return result;
    }
}
