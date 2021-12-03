package be.better.aggregation.service;

import be.better.aggregation.domain.ItemEntity;
import be.better.aggregation.domain.ItemPairEntity;

import java.util.List;
import java.util.Optional;

public interface IItemPairService {

    ItemPairEntity create(ItemEntity left, ItemEntity right);

    ItemPairEntity createAll(ItemEntity item);

    Optional<ItemPairEntity> find(ItemEntity left, ItemEntity right);

    List<ItemPairEntity> findByLeft(ItemEntity left);

    List<ItemPairEntity> findByRight(ItemEntity right);

    void enable(Long id);

    void enableByItem(ItemEntity item);

    void disable(Long id);

    void disableByItem(ItemEntity item);
}
