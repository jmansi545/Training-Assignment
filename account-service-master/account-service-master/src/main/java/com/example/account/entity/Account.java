package com.example.account.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.example.account.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "customerid")
	private Long customerId;

	@Column(name = "accounttype")
	private AccountType accountType;

	@Column(name = "accountnumber")
	private Long accountNumber;

	@Column(name = "accountbalance")
	private BigDecimal balance;

	@Column(name = "openingdate")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate openingDate;
}
