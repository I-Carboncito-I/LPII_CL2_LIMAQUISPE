package model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Tbl_Usuariocl2 {

    @Id
    private String idusuariocl2;
    private String usuariocl2;
    private String passwordcl2;

    public Tbl_Usuariocl2() {
    }

    // Getters y setters
    public String getIdusuariocl2() {
        return idusuariocl2;
    }

    public void setIdusuariocl2(String idusuariocl2) {
        this.idusuariocl2 = idusuariocl2;
    }

    public String getUsuariocl2() {
        return usuariocl2;
    }

    public void setUsuariocl2(String usuariocl2) {
        this.usuariocl2 = usuariocl2;
    }

    public String getPasswordcl2() {
        return passwordcl2;
    }

    public void setPasswordcl2(String passwordcl2) {
        this.passwordcl2 = passwordcl2;
    }
}
