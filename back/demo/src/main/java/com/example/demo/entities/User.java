package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;

/**
 *Defino entidad Usuario;
 * 
 * @author lucas
 */
@Entity
@Getter
@Setter
@Table(name= "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "NAME")
    private String name;
    
    @Column(name = "SURNAME")
    private String surname;
    
    @JoinColumn(name = "EXPENSE_ID")
    @OneToMany(mappedBy = "ID_USER")
    private List<Expense> expense;
    
    @Column(name = "PASSWORD")
    private String password;
}
