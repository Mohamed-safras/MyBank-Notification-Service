package org.dctechlans.notification.kafka.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.dctechlans.notification.kafka.model.Account;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class MessageListener {
    private final ObjectMapper objectMapper;

    public MessageListener() {
        this.objectMapper = new ObjectMapper(); // Initialize ObjectMapper
        this.objectMapper.registerModule(new JavaTimeModule());
    }

    @KafkaListener(topics = "accounts",groupId = "accounts-group" )
    public void listenAccounts(String data)  {
        try {
//            // Parse JSON data to Account object
            Account account = objectMapper.readValue(data, Account.class);

            System.out.println("Received Account: " + data);
            // You can add further processing logic here
        } catch (Exception e) {
            System.err.println("Error parsing data: " + e.getMessage());
        }
    }
}
