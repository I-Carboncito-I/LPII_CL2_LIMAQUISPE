package Dao;

import Interfaces.lProducto;

import model.Tbl_Productocl2;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ClassProductoLmp implements lProducto {
    
    private EntityManagerFactory emf;
    
    public ClassProductoLmp() {
        emf = Persistence.createEntityManagerFactory("LPII_CL2_LIMAQUISPE");
    }
    
    @Override
    public void registrarProducto(Tbl_Productocl2 producto) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        try {
            et.begin();
            em.persist(producto);
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            // Mejorar el mensaje de excepción
            System.err.println("Error al registrar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    
    @Override
    public List<Tbl_Productocl2> listarProductos() {
        EntityManager em = emf.createEntityManager();
        
        try {
            return em.createQuery("SELECT p FROM Tbl_Productocl2 p", Tbl_Productocl2.class).getResultList();
        } finally {
            em.close();
        }
    }
}
