package be.better.aggregation.service;

import be.better.aggregation.data.dto.CustomerDto;
import be.better.aggregation.domain.CustomerEntity;

public interface ICustomerService {
    CustomerEntity create(CustomerDto dto);


}
