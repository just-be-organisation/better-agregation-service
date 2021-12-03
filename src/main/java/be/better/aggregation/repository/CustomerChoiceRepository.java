package be.better.aggregation.repository;

import be.better.aggregation.domain.CustomerChoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerChoiceRepository extends JpaRepository<CustomerChoiceEntity, Long> {
}
