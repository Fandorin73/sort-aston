package ru.aston.sort.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aston.sort.entity.SortStatistic;
import java.util.UUID;

/**
 * Хранилище SortStatistic.
 *
 * @author Team Aston
 */
public interface SortStatisticRepository extends JpaRepository<SortStatistic, UUID> {
}
