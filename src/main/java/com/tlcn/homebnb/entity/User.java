package com.tlcn.homebnb.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String id;

    @NotNull
    private String fullName;

    @Indexed(unique = true)
    @NotNull
    private String email;

    @NotNull
    private String password;

    private String phoneNumber;

    @NotNull
    private AuthProvider authProvider;

    private String providerId;

    private String imageUrl;

    private boolean enabled;

    private boolean isActive;

    private boolean isUsing2FA;

    private String secret;
}
