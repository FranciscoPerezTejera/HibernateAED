package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;


@Entity
@Table (name = "persona")
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (length = 20)
    private String nombre;
    @Column (length = 3)
    private int edad;
    @Column (name = "fecha_nacimiento")
    private Date fechaNacimiento;
    
    public Persona() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
