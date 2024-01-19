package entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGenero;
    @Column (name = "genero")
    private String nombre;
    
    
}
