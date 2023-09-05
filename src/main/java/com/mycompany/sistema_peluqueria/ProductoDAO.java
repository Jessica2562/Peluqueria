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

public class ProductoDAO {

    private Connection connection;

    public ProductoDAO() {
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

    public boolean agregarProducto(Producto producto) {
        // Código para agregar un cliente a la base de datos
        String query = "INSERT INTO productos (codigoInternoProducto, nombreProducto, precioProducto, stockProducto) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, producto.getCodigo_producto());
            statement.setString(2, producto.getNombre_producto());
            statement.setDouble(3, producto.getPrecio_producto());
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

    public Producto buscarProductoPorCodigo(int idProducto) {
        // Código para buscar un cliente por su ID en la base de datos
        // y devolverlo como un objeto Cliente
        String query = "SELECT * FROM producto WHERE idProducto = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProducto);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Producto producto = new Producto(resultSet.getInt("idProducto"), resultSet.getString("codigoInternoProducto"), resultSet.getString("nombreProducto"), resultSet.getDouble("precioProducto"), resultSet.getInt("stockProducto"));
                return producto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Producto> obtenerTodosProductos() {
        // Código para obtener todos los clientes de la base de datos
        // y devolverlos como una lista de objetos Cliente
        List<Producto> productos = new ArrayList<>();
        String query = "SELECT * FROM productos";

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Producto producto = new Producto(resultSet.getInt("idProducto"), resultSet.getString("codigoInternoProducto"), resultSet.getString("nombreProducto"), resultSet.getDouble("precioProducto"), resultSet.getInt("stockProducto"));
                productos.add(producto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }

    public boolean actualizarProducto(Producto producto) {
        // Código para actualizar un cliente en la base de datos
        String query = "UPDATE productos SET codigoInternoProducto = ?, nombreProducto = ?, precioProducto = ?, stockProducto = ? WHERE idProducto = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, producto.getCodigo_producto());
            statement.setString(2, producto.getNombre_producto());
            statement.setDouble(3, producto.getPrecio_producto());
            statement.setInt(4, producto.getStock_producto());
            statement.setInt(5, producto.getId_producto());
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

    public boolean eliminarProducto(int id) {
        // Código para eliminar un cliente de la base de datos por su ID
        String query = "DELETE FROM productos WHERE idProducto = ?";

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
