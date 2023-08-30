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

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
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

    public boolean agregarCliente(Cliente cliente) {
        // Código para agregar un cliente a la base de datos
        String query = "INSERT INTO clientes (rucCliente, nombresCliente, telefonoCliente,idEstablecimiento) VALUES (?, ?, ?,?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cliente.getRUC_cliente());
            statement.setString(2, cliente.getNombre_cliente());
            statement.setString(3, cliente.getTelefono_cliente());            
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

    public Cliente buscarClientePorId(int id) {
        // Código para buscar un cliente por su ID en la base de datos
        // y devolverlo como un objeto Cliente
        String query = "SELECT * FROM clientes WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Cliente cliente = new Cliente(resultSet.getInt("id"), resultSet.getString("RUC"), resultSet.getString("nombre"), resultSet.getString("telefono"));
                return cliente;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Cliente> obtenerTodosClientes() {
        // Código para obtener todos los clientes de la base de datos
        // y devolverlos como una lista de objetos Cliente
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Cliente cliente = new Cliente(resultSet.getInt("idCliente"), resultSet.getString("rucCliente"), resultSet.getString("nombresCliente"), resultSet.getString("telefonoCliente"));
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public boolean actualizarCliente(Cliente cliente) {
        // Código para actualizar un cliente en la base de datos
        String query = "UPDATE clientes SET rucCliente = ?, nombresCliente = ?, telefonoCliente = ? WHERE idCliente = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cliente.getRUC_cliente());
            statement.setString(2, cliente.getNombre_cliente());
            statement.setString(3, cliente.getTelefono_cliente());
            statement.setInt(4, cliente.getId_cliente());
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

    public boolean eliminarCliente(int id) {
        // Código para eliminar un cliente de la base de datos por su ID
        String query = "DELETE FROM clientes WHERE idCliente = ?";

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
