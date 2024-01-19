package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "videojuego")
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVideojeugo;
    @Column (name = "nombreVideojuego")
    private String nombre;
    @ManyToOne()
    @JoinColumn(name = "fk_consola")
    private Consola consola;

    public Videojuego() {
    }

    public int getIdVideojeugo() {
        return idVideojeugo;
    }

    public void setIdVideojeugo(int idVideojeugo) {
        this.idVideojeugo = idVideojeugo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }
}
