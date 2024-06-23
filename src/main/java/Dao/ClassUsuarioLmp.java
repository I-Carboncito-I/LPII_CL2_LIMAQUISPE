package Dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Interfaces.lUsuario;
import model.Tbl_Usuariocl2;

public class ClassUsuarioLmp implements lUsuario{
    
    private EntityManagerFactory emf;
    
    public ClassUsuarioLmp() {
        emf = Persistence.createEntityManagerFactory("LPII_CL2_LIMAQUISPE");
    }
    
    public boolean validarUsuario(String usuario, String password) {
        EntityManager em = emf.createEntityManager();
        
        try {
            Tbl_Usuariocl2 usuarioDB = em.find(Tbl_Usuariocl2.class, usuario);
            if (usuarioDB != null && usuarioDB.getPasswordcl2().equals(password)) {
                return true;
            }
            return false;
        } finally {
            em.close();
        }
    }
}
