package com.myhotel.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    Long id;
    @Column
    String marca;
    @Column
    String modelo;
    @Column
    String patente;
    @Column
    int anio;
    @Column
    int kilometraje;
    @Column
    String cilindrada;
    @Column
    TodoStatus todoStatus;
    @Column
    String tipoAutomovil;
    @Column
    int nPuertas;
    @Column
    int capPasajeros;
    @Column
    int capMaletero;
    @Column
    String tipoCamion;
    @Column
    int capToneladas;
    @Column
    int ejes;
    @CreationTimestamp
    @Column(updatable = false)
    Timestamp dateCreated;
    @UpdateTimestamp
    Timestamp lastModified;
    
  

}