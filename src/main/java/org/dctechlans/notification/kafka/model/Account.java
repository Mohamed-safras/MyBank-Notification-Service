package org.dctechlans.notification.kafka.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @JsonProperty("createdAt")
    private LocalDateTime createdAt;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("updatedAt")
    private LocalDateTime updatedAt;

    @JsonProperty("updatedBy")
    private String updatedBy;

    @JsonProperty("accountNumber")
    private long accountNumber;

    @JsonProperty("accountType")
    private String accountType;

    @JsonProperty("branchAddress")
    private String branchAddress;

    @JsonProperty("customerId")
    private int customerId;

    @JsonProperty("balance")
    private double balance;
}
