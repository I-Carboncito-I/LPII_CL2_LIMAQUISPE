package TestEntidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Tbl_Usuariocl2;

public class TestEntidadUsuario{

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction tx = null;

        try {
            // Crear EntityManagerFactory basado en la unidad de persistencia (persistence unit) especificada
            emf = Persistence.createEntityManagerFactory("LPII_CL2_LIMAQUISPE");

            // Crear EntityManager
            em = emf.createEntityManager();

            // Iniciar una transacción
            tx = em.getTransaction();
            tx.begin();

            // Crear un objeto Tbl_Usuariocl2 y establecer algunos valores
            Tbl_Usuariocl2 usuario = new Tbl_Usuariocl2();
            usuario.setUsuariocl2("liz");
            usuario.setPasswordcl2("liz");

            // Guardar el usuario en la base de datos
            em.persist(usuario);

            // Commit de la transacción
            tx.commit();

            // Imprimir mensaje de éxito
            System.out.println("Usuario guardado exitosamente con ID: " + usuario.getIdusuariocl2());

        } catch (Exception e) {
            // Manejo de excepciones
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            // Cerrar EntityManager y EntityManagerFactory
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}
