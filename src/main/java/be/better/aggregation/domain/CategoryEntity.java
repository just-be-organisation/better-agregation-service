package be.better.aggregation.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "category")
@EqualsAndHashCode(callSuper = true)
@ToString(includeFieldNames = false)
public class CategoryEntity extends IdEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_parent")
    @JsonIgnore
    @ToString.Exclude
    private CategoryEntity parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<CategoryEntity> subcategories = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "item_category",
        joinColumns = {@JoinColumn(name = "id_category")},
        inverseJoinColumns = {@JoinColumn(name = "id_item")}
    )
    @Fetch(value = FetchMode.SUBSELECT)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<ItemEntity> items;
}
