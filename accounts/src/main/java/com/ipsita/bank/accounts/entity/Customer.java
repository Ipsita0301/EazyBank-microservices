package com.ipsita.bank.accounts.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Customer")
@Getter @Setter @ToString @NoArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
     private Long customerId ;

    @Column(name="customer_name")
     private String Name ;

    @Column(name="customer_email")
    private String Email ;

    @Column(name="customer_mobile_number")
     private String mobileNumber ;

}
