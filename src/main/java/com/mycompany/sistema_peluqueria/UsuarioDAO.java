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

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {
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

    public boolean agregarUsuario(Usuario usuario) {
        // Código para agregar un usuario a la base de datos
        String query = "INSERT INTO usuarios (nombresUsuario, correoUsuario, passwordUsuario, id_tipoUsuario, idEstablecimiento) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, usuario.getNombre_usuario());
            statement.setString(2, usuario.getCorreo_usuario());
            statement.setString(3, usuario.getContraseña_usuario());
            statement.setInt(4, usuario.getId_tipoUsuario());
            statement.setInt(5, 1);
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

    public Usuario buscarUsuarioPorId(int id) {
        // Código para buscar un usuario por su ID en la base de datos
        // y devolverlo como un objeto Cliente
        String query = "SELECT * FROM usuarios WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Usuario usuario = new Usuario(resultSet.getInt("idUsuario"), resultSet.getString("nombresUsuario"), resultSet.getString("correoUsuario"), resultSet.getString("passwordUsuario"), resultSet.getInt("id_tipoUsuario"));
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public String seleccionarPassword(int idUsuario) {
        // Código para buscar un usuario por su ID en la base de datos
        // y devolverlo como un objeto Cliente
        String query = "SELECT * FROM usuarios WHERE idUsuario = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idUsuario);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
              return resultSet.getString("passwordUsuario");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public List<Usuario> obtenerTodosUsusarios() {
        // Código para obtener todos los usuarios de la base de datos
        // y devolverlos como una lista de objetos Cliente
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Usuario usuario = new Usuario(resultSet.getInt("idUsuario"), resultSet.getString("nombresUsuario"), resultSet.getString("correoUsuario"), resultSet.getString("passwordUsuario"), resultSet.getInt("id_tipoUsuario"));
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
    
    

    public boolean actualizarUsuario(Usuario usuario) {
        // Código para actualizar un usuario en la base de datos
        String query = "UPDATE usuarios SET nombresUsuario = ?, correoUsuario = ?, passwordUsuario = ?, id_tipoUsuario = ? WHERE idUsuario = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, usuario.getNombre_usuario());
            statement.setString(2, usuario.getCorreo_usuario());
            statement.setString(3, usuario.getContraseña_usuario());
            statement.setInt(4, usuario.getId_tipoUsuario());
            statement.setInt(5, usuario.getId_usuario());
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

    public boolean eliminarUsuario(int id) {
        // Código para eliminar un usuario de la base de datos por su ID
        String query = "DELETE FROM usuarios WHERE idUsuario = ?";

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
