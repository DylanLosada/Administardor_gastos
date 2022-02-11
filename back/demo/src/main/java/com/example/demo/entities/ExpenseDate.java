package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Creo la entidad Fecha para un gasto.
 * 
 * @author dylan losada
 *
 */
@Entity
@Table(name= "FECHA_GASTO")
@Getter
@Setter
public class ExpenseDate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "GASTO_ID")
	@OneToMany(mappedBy = "expenseDate")
	private List<Expense> expenses;
	
	@Column(name = "MONTH")
	@NotNull
	private String month;
	
	@Column(name = "DAY")
	@NotNull
	private String day;
	
	@Column(name = "YEAR")
	@NotNull
	private String year;
}
