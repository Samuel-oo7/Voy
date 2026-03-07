package com.voy.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password; // Note: We will add encryption in the next stage
    private String bio;
    private List<String> interests; // Matches the "Bio, location, travel interests" requirement [cite: 11]
    private double trustRating = 5.0; // Start everyone at 5.0 [cite: 17]
}