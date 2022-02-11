
package com.example.demo.entities;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JoinColumn(name = "ID_USER")
    @ManyToOne
    private Long idUser;
    
    @Column(name = "EXPENSED")
   private Double expensed;
}
