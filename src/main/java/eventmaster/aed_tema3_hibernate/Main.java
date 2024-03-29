package eventmaster.aed_tema3_hibernate;

import entities.Animal;
import entities.Modelo;
import entities.Persona;
import entities.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        
        Configuration  configuracion = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuracion.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        List<Modelo> modelos = new ArrayList<>();
        modelos.add(new Modelo("Yaris"));
        
        Vehiculo coche = new Vehiculo();
        coche.setNombre("toyota");
        coche.setModelos(modelos);
        
        Transaction transaction = session.beginTransaction();
        session.persist(coche);
        transaction.commit();
        
        Vehiculo cocheRecuperado = session.get(Vehiculo.class, coche.getId());
        System.out.println("Coche recuperado: " + cocheRecuperado);
        
        transaction = session.beginTransaction();
        cocheRecuperado.setNombre("Ferrari");
        session.merge(cocheRecuperado);
        transaction.commit();
        
        Vehiculo cocheActualizado = session.get(Vehiculo.class, coche.getId());
        System.out.println("Coche recuperado: " + cocheActualizado);
        
        transaction = session.beginTransaction();
        session.remove(coche);
        transaction.commit();
        
        /*Animal animal = new Animal();
        animal.setNombre("Lobo");
        animal.setTipo("mamífero");
        animal.setPeso(40);

        // Crear
        Transaction transaction = session.beginTransaction();
        session.persist(animal);
        transaction.commit();

        // Leer
        Animal animalRecuperado = session.get(Animal.class, animal.getId());
        System.out.println("Animal recuperado: " + animalRecuperado);

        // Actualizar
        transaction = session.beginTransaction();
        animalRecuperado.setPeso(45);
        session.merge(animalRecuperado);
        transaction.commit();

        // Leer después de la actualización
        Animal animalActualizado = session.get(Animal.class, animal.getId());
        System.out.println("Animal actualizado: " + animalActualizado);

        // Eliminar
        transaction = session.beginTransaction();
        session.remove(animalActualizado);
        transaction.commit();
        
        // Operaciones CRUD para Persona
        Date nuevaFecha = new Date();
        Persona persona = new Persona();
        persona.setNombre("Francisco");
        persona.setEdad(30);
        persona.setFechaNacimiento(nuevaFecha);
        // Crear
        Transaction transaction2 = session.beginTransaction();
        session.persist(persona);
        transaction2.commit();

        // Leer
        Persona personaRecuperada = session.get(Persona.class, persona.getId());
        System.out.println("Person recuperada: " + personaRecuperada);

        // Actualizar
        transaction2 = session.beginTransaction();
        personaRecuperada.setEdad(31);
        session.merge(personaRecuperada);
        transaction2.commit();

        // Leer después de la actualización
        Persona personActualizada = session.get(Persona.class, persona.getId());
        System.out.println("Person actualizada: " + personActualizada);

        // Eliminar
        transaction2 = session.beginTransaction();
        session.remove(personActualizada);
        transaction2.commit();*/
        
        
        session.close();
        sessionFactory.close();
    }
}
