package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "consola")
public class Consola {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idConsola;
    @Column (name = "nombreConsola")
    private String nombre;
    @OneToMany(mappedBy = "consola")
    private Set <Videojuego> videojuego;

    public Consola() {
    }

    public int getIdConsola() {
        return idConsola;
    }

    public void setIdConsola(int idConsola) {
        this.idConsola = idConsola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
