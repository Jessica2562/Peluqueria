/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_peluqueria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class CitasDAO {

    private Connection connection;

    public CitasDAO() {
        // Establece la conexión a la base de datos

        String url = "jdbc:mysql://localhost:3306/peluqueria";  //direccion del drive de la base de datos
        String usuario = "root"; //ususario de la base de datos
        String contraseña = ""; //contraseña de la base de datos

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean agregarCita(Cita cita) {
        // Código para agregar un cita a la base de datos
        String query = "INSERT INTO citas ( idCliente, idEmpleado, fechaCita, horaEntradaCita, horaSalidaCita, estadoCita, observacionCita) VALUES ( ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {            
            statement.setInt(1, cita.getIdCliente());
            statement.setInt(2, cita.getIdEmpleado());
            statement.setString(3, cita.getFecha());
            statement.setString(4, cita.getHoraEntrada());
            statement.setString(5, cita.getHoraSalida());
            statement.setString(6, cita.getEstado());
            statement.setString(7, cita.getObservacion());
            
            if (statement.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Cita buscarCitaPorId(int id) {
        // Código para buscar un usuario por su ID en la base de datos
        // y devolverlo como un objeto Cliente
        String query = "SELECT * FROM citas WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Cita cita = new Cita(resultSet.getInt("idCita"), resultSet.getInt("idCliente"), resultSet.getInt("idEmpleado"), resultSet.getString("fechaCita"), resultSet.getString("horaEntradaCita"), resultSet.getString("horaSalidaCita"), resultSet.getString("estadoCita"), resultSet.getString("observacionCita"));
                return cita;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<DetalleCitas> obtenerTodasCitas() {
        // Código para obtener todos los usuarios de la base de datos
        // y devolverlos como una lista de objetos Cliente
        List<DetalleCitas> citas = new ArrayList<>();
        String query = "SELECT * FROM vista_citas";

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                DetalleCitas cita = new DetalleCitas(resultSet.getInt("idCita"), resultSet.getInt("idCliente"), resultSet.getInt("idEmpleado"), resultSet.getString("fechaCita"), resultSet.getString("horaEntradaCita"), resultSet.getString("horaSalidaCita"), resultSet.getString("estadoCita"), resultSet.getString("observacionCita"), resultSet.getString("nombresEmpleado"), resultSet.getString("nombresCliente"));
                citas.add(cita);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return citas;
    }

    public boolean actualizarCita(Cita cita) {
        // Código para actualizar un cita en la base de datos
        String query = "UPDATE citas SET idCliente = ?, idEmpleado = ?, fechaCita = ?, horaEntradaCita = ?, horaSalidaCita = ?, estadoCita = ?, observacionCita = ? WHERE idCita = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
           statement.setInt(1, cita.getIdCliente());
            statement.setInt(2, cita.getIdEmpleado());
            statement.setString(3, cita.getFecha());
            statement.setString(4, cita.getHoraEntrada());
            statement.setString(5, cita.getHoraSalida());
            statement.setString(6, cita.getEstado());
            statement.setString(7, cita.getObservacion());
            statement.setInt(8, cita.getIdCita());
            if (statement.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean eliminarCita(int id) {
        // Código para eliminar un usuario de la base de datos por su ID
        String query = "DELETE FROM citas WHERE idCita = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            if (statement.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void cerrarConexion() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
