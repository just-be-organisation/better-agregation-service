package be.better.aggregation.service;

import be.better.aggregation.data.dto.ItemDto;
import be.better.aggregation.domain.ItemEntity;

public interface IItemService {
    ItemEntity create(ItemDto dto);

    void enable(Long id);

    void disable(Long id);
}
