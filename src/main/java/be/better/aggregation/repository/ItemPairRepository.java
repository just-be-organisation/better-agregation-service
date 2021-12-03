package be.better.aggregation.repository;

import be.better.aggregation.domain.ItemPairEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPairRepository extends JpaRepository<ItemPairEntity, Long> {
}
