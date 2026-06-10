/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uv.vehiculo.entity;

/**
 *
 * @author west
 */
public class Marca {
    private Integer idMarca;
    private String marca;
    private Boolean estatus;
    
    public Marca(){}

    public Marca(Integer idMarca, String marca, Boolean estatus) {
        this.idMarca = idMarca;
        this.marca = marca;
        this.estatus = estatus;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }
    
   
}
