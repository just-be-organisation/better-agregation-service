package be.better.aggregation.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@MappedSuperclass
@Data
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class IdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
