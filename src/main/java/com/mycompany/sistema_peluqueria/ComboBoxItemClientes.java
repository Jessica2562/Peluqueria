/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_peluqueria;

/**
 *
 * @author Casa
 */
class ComboBoxItemClientes {

    private String clave;
    private String valor;

    public ComboBoxItemClientes(String clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }

    public String getClave() {
        return clave;
    }

    public String getValor() {
        return valor;
    }
}
