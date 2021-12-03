package be.better.aggregation.service;

import be.better.aggregation.domain.CustomerChoiceEntity;
import be.better.aggregation.domain.CustomerEntity;

public interface ICustomerChoiceService {
    void createAll(CustomerEntity customerEntity);

    void choose(Long id, Long itemId);

    CustomerChoiceEntity next(Long customerId);
}
