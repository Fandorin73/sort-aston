package ru.aston.sort.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Duration;
import java.util.UUID;

/**
 * Entity для статистики.
 *
 * @author Team Aston
 */
@Entity
@Table(name = "data_sort_statistics")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SortStatistic implements IEntity{
    @Id
    @Column(name = "id")
    private UUID sortStatisticId;
    @Column(name = "permutations")
    private Integer permutations;
    @Column(name = "sorting_time")
    private Duration sortingTime;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = true)
    private UserEntity userEntity;
}
