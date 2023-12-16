package com.Centum.BankApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="customer_id")
    public int customerId;
    public String customerName;
    public String customeraddress;
    public String customerphonenumber;
    public String customeremailid;
    public String aadharnumber;
    public String pancard;
    //@OneToOne(mappedBy ="Customer")
    //private BankAccount bankAccount;
}
