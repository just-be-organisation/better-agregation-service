package be.better.aggregation.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "item_pair")
@EqualsAndHashCode(callSuper = true)
@ToString(includeFieldNames = false)
public class ItemPairEntity extends DatedEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_item_left")
    private ItemEntity left;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_item_right")
    private ItemEntity right;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
}
