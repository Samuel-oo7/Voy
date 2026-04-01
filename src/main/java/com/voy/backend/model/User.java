package com.voy.backend.model;
import org.springframework.data.mongodb.core.index.Indexed;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Email is required")
    @Indexed(unique = true) // Tells MongoDB this must be unique
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    private String bio;
    private List<String> interests;
    private double trustRating = 5.0;
}