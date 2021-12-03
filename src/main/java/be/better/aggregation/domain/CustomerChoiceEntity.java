package be.better.aggregation.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer_choice")
@EqualsAndHashCode(callSuper = true)
@ToString(includeFieldNames = false)
public class CustomerChoiceEntity extends DatedEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_customer", nullable = false)
    private CustomerEntity customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_item_pair", nullable = false)
    private ItemPairEntity pair;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_item_choice")
    private ItemEntity choice;
}
