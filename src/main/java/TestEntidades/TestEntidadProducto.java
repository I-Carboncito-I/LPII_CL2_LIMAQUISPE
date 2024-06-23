package TestEntidades;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Tbl_Productocl2;

public class TestEntidadProducto {

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

            // Crear un objeto TblProductocl2 y establecer algunos valores
            Tbl_Productocl2 producto = new Tbl_Productocl2();
            producto.setNombrecl2("Naranja");
            producto.setPreciocompcl2(2);
            producto.setPrecioventacl2(4);
            producto.setEstadocl2("Activo");
            producto.setDescripcl2("oferta");

            // Guardar el producto en la base de datos
            em.persist(producto);

            // Commit de la transacción
            tx.commit();

            // Imprimir mensaje de éxito
            System.out.println("Producto guardado exitosamente con ID: " + producto.getIdproductocl2());

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
