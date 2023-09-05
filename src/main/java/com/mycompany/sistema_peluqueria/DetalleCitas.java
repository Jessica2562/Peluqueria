/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_peluqueria;

/**
 *
 * @author Casa
 */
public class DetalleCitas {
    private int idCita;
    private int idCliente;
    private int idEmpleado;
    private String fechaCita;
    private String horaEntradaCita;
    private String horaSalidaCita;
    private String estadoCita;
    private String observacionCita;
    private String nombreEmpleadoCita;
    private String nombreClienteCita;

    public DetalleCitas(int idCita, int idCliente, int idEmpleado, String fechaCita, String horaEntradaCita, String horaSalidaCita, String estadoCita, String observacionCita, String nombreEmpleadoCita, String nombreClienteCita) {
        this.idCita = idCita;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaCita = fechaCita;
        this.horaEntradaCita = horaEntradaCita;
        this.horaSalidaCita = horaSalidaCita;
        this.estadoCita = estadoCita;
        this.observacionCita = observacionCita;
        this.nombreEmpleadoCita = nombreEmpleadoCita;
        this.nombreClienteCita = nombreClienteCita;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraEntradaCita() {
        return horaEntradaCita;
    }

    public void setHoraEntradaCita(String horaEntradaCita) {
        this.horaEntradaCita = horaEntradaCita;
    }

    public String getHoraSalidaCita() {
        return horaSalidaCita;
    }

    public void setHoraSalidaCita(String horaSalidaCita) {
        this.horaSalidaCita = horaSalidaCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public String getObservacionCita() {
        return observacionCita;
    }

    public void setObservacionCita(String observacionCita) {
        this.observacionCita = observacionCita;
    }

    public String getNombreEmpleadoCita() {
        return nombreEmpleadoCita;
    }

    public void setNombreEmpleadoCita(String nombreEmpleadoCita) {
        this.nombreEmpleadoCita = nombreEmpleadoCita;
    }

    public String getNombreClienteCita() {
        return nombreClienteCita;
    }

    public void setNombreClienteCita(String nombreClienteCita) {
        this.nombreClienteCita = nombreClienteCita;
    }
    
    
    
}
