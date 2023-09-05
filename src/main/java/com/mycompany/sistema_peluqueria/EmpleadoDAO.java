/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_peluqueria;

/**
 *
 * @author Casa
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {

    private Connection connection;

    public EmpleadoDAO() {
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

    public boolean agregarElmpleado(Empleado empleado) {
        // Código para agregar un cliente a la base de datos
        String query = "INSERT INTO empleados (rucEmpleado, nombresEmpleado, telefonoEmpleado, idEstablecimiento) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, empleado.getRUC_empleado());
            statement.setString(2, empleado.getNombre_empleado());
            statement.setString(3, empleado.getTelefono_empleado());
            statement.setInt(4, 1);
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

    public Empleado buscarEmpleadoPorId(int id) {
        // Código para buscar un cliente por su ID en la base de datos
        // y devolverlo como un objeto Cliente
        String query = "SELECT * FROM empleado WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Empleado empleado = new Empleado(resultSet.getInt("id"), resultSet.getString("RUC"), resultSet.getString("nombre"), resultSet.getString("telefono"));
                return empleado;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Empleado> obtenerTodosEmpleados() {
        // Código para obtener todos los clientes de la base de datos
        // y devolverlos como una lista de objetos Cliente
        List<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM empleados";

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Empleado empleado = new Empleado(resultSet.getInt("idEmpleado"), resultSet.getString("rucEmpleado"), resultSet.getString("nombresEmpleado"), resultSet.getString("telefonoEmpleado"));
                empleados.add(empleado);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleados;
    }
    
    public boolean actualizarEmpleado(Empleado empleado) {
        // Código para actualizar un cliente en la base de datos
        String query = "UPDATE empleados SET rucEmpleado = ?, nombresEmpleado = ?, telefonoEmpleado = ? WHERE idEmpleado = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, empleado.getRUC_empleado());
            statement.setString(2, empleado.getNombre_empleado());
            statement.setString(3, empleado.getTelefono_empleado());
            statement.setInt(4, empleado.getId_empleado());
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
    public boolean eliminarEmpleado(int id) {
        // Código para eliminar un cliente de la base de datos por su ID
        String query = "DELETE FROM empleados WHERE idEmpleado = ?";

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
