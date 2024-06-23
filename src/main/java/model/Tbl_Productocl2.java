package model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tbl_Productocl2{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproductocl2;
    private String nombrecl2;
    private double preciocompcl2;
    private double precioventacl2;
    private String estadocl2;
    private String descripcl2;

   
    public Tbl_Productocl2() {
    }

    // Getters y setters
    public int getIdproductocl2() {
        return idproductocl2;
    }

    public void setIdproductocl2(int idproductocl2) {
        this.idproductocl2 = idproductocl2;
    }

    public String getNombrecl2() {
        return nombrecl2;
    }

    public void setNombrecl2(String nombrecl2) {
        this.nombrecl2 = nombrecl2;
    }

    public double getPreciocompcl2() {
        return preciocompcl2;
    }

    public void setPreciocompcl2(double preciocompcl2) {
        this.preciocompcl2 = preciocompcl2;
    }

    public double getPrecioventacl2() {
        return precioventacl2;
    }

    public void setPrecioventacl2(double precioventacl2) {
        this.precioventacl2 = precioventacl2;
    }

    public String getEstadocl2() {
        return estadocl2;
    }

    public void setEstadocl2(String estadocl2) {
        this.estadocl2 = estadocl2;
    }

    public String getDescripcl2() {
        return descripcl2;
    }

    public void setDescripcl2(String descripcl2) {
        this.descripcl2 = descripcl2;
    }
}
