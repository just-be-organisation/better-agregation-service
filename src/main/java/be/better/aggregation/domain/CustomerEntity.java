package be.better.aggregation.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer")
@EqualsAndHashCode(callSuper = true)
@ToString(includeFieldNames = false)
public class CustomerEntity extends DatedEntity {
    @JsonProperty("chat_id")
    @Column(nullable = false, unique = true)
    private Long chatId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Platform platform;
}
