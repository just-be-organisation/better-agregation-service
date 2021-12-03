package be.better.aggregation.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerDto {
    @JsonProperty("chat_id")
    private Long chatId;
}
