package com.ipsita.bank.accounts.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
      name = "customer" ,
      description = "Schema to hold Account and Customer information "
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "Ipsita Sarkar"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min=5,max=30 , message = "The length of the CustomerName must be between 5-30")
    private String name ;

    @Schema(
            description = "Email address of the customer", example = "Ipsitasarkar@exmple.com"
    )
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "The email address must be a valid value")
    private String email ;

    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    @Pattern(regexp = "(^$|[0-9]{10})" , message = "Mobile Number must be 10 digits")
    private String mobileNumber ;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountDto accountDto ;

}
