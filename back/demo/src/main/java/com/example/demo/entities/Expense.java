
package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


/**
 *Defino entidad GASTO. 
 * 
 * @author lucas
 */ 
@Entity
@Setter
@Getter
public class Expense {
    @Id
    @Column(name = "GASTO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JoinColumn(name = "ID_USER")
    @ManyToOne
    private List<Long> idUser;
    
    @JoinColumn(name = "FECHA_GASTO_ID")
    @ManyToOne
    private ExpenseDate expenseDate;
    
    @Column(name = "EXPENSED")
   private Double expensed;
}
