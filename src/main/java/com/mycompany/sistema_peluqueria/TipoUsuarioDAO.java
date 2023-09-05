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
public class TipoUsuarioDAO {
    private Connection connection;

    public TipoUsuarioDAO() {
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
    
    public List<TipoUsuario> obtenerTipoUsusarios() {
        // Código para obtener todos los usuarios de la base de datos
        // y devolverlos como una lista de objetos Cliente
        List<TipoUsuario> tipoUsuarios = new ArrayList<>();
        String query = "SELECT * FROM tipo_usuario";

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                TipoUsuario tipoUsuario = new TipoUsuario(resultSet.getInt("idTipoUsuario"), resultSet.getString("tipoUsuario"));
                tipoUsuarios.add(tipoUsuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoUsuarios;
    }
     public String buscarUsuarioPorId(int id_tipoUsuario) {
        // Código para buscar un usuario por su ID en la base de datos
        // y devolverlo como un objeto Cliente
        String query = "SELECT * FROM tipo_usuario WHERE idTipoUsuario = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id_tipoUsuario);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {              
                return resultSet.getString("tipoUsuario");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }
    
}
