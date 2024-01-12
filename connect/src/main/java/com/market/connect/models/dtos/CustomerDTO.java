package com.market.connect.models.dtos;

import com.market.connect.models.entities.Order;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;
@Data
public class CustomerDTO {

    private Long id;
    @NotBlank(message = "Invalid first name")
    private String firstName;
    @NotBlank(message = "Invalid last name")
    private String lastName;
    @NotBlank (message = "Invalid email")
    @Email (message = "Invalid email")
    private String email;
}
