/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.sistema_peluqueria;

/**
 *
 * @author Casa
 */
public class Cliente {

    private int id_cliente;
    private String RUC_cliente;
    private String nombre_cliente;
    private String telefono_cliente;
    

    public Cliente(int id_cliente, String RUC_cliente, String nombre_cliente, String telefono_cliente) {
        this.id_cliente = id_cliente;
        this.RUC_cliente = RUC_cliente;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public void setRUC_cliente(String RUC_cliente) {
        this.RUC_cliente = RUC_cliente;
    }
    

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public String getRUC_cliente() {
        return RUC_cliente;
    }

}