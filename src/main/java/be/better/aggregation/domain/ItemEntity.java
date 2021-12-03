package be.better.aggregation.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "item")
@EqualsAndHashCode(callSuper = true)
@ToString(includeFieldNames = false)
public class ItemEntity extends DatedEntity {
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "item_category",
        joinColumns = {@JoinColumn(name = "id_item")},
        inverseJoinColumns = {@JoinColumn(name = "id_category")}
    )
    @Fetch(value = FetchMode.SUBSELECT)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<CategoryEntity> categories;
}
