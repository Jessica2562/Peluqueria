/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_peluqueria;

/**
 *
 * @author Casa
 */
public class Empleado {

    private int id_empleado;
    private String RUC_empleado;
    private String nombre_empleado;
    private String telefono_empleado;

    public Empleado(int id_empleado, String RUC_empleado, String nombre_empleado, String telefono_empleado) {
        this.id_empleado = id_empleado;
        this.RUC_empleado = RUC_empleado;
        this.nombre_empleado = nombre_empleado;
        this.telefono_empleado = telefono_empleado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public String getRUC_empleado() {
        return RUC_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public String getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setRUC_empleado(String RUC_empleado) {
        this.RUC_empleado = RUC_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public void setTelefono_empleado(String telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

}
