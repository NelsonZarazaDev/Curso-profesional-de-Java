package com.oregoom.mensajes;

import java.sql.*;

public class Java_Mysql {

    public static void main(String[] args) throws SQLException {
        listarRegistro();
        insertarRegistro("Insertando desde java", "Nelson");
        actualizarRegistro("Ya cambio", "Yo", 3);
        eliminarRegistro(3);
    }

    static void listarRegistro() throws SQLException {
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "1234");
        String sql = "SELECT * FROM mensajes_db.mensajes";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id_mensajes");
            String mensaje = rs.getString("mensaje");
            String autor = rs.getString("autor");
            String fecha = rs.getString("fecha");

            System.out.println(id + mensaje + autor + fecha);
        }
        rs.close();
        ps.close();
        conectar.close(); //Termina la conecttion

    }

    static void insertarRegistro(String mensaje, String autor) throws SQLException {
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "1234");
        String sql = "INSERT INTO mensajes(mensaje,autor,fecha) VALUES (?,?,CURRENT_TIME())";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate(); //Realiza la inserción

        ps.close();
        conectar.close(); //Termina la conecttion
    }
    
    static void actualizarRegistro(String mensaje, String autor, int id) throws SQLException {
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "1234");
        String sql = "UPDATE mensajes SET mensaje=?, autor=? WHERE id_mensajes=?";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.setInt(3, id);
        ps.executeUpdate(); //Realiza la inserción

        ps.close();
        conectar.close(); //Termina la conecttion
    }
    
    static void eliminarRegistro(int id) throws SQLException {
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root", "1234");
        String sql = "DELETE FROM mensajes_db.mensajes WHERE id_mensajes=?";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();

        ps.close();
        conectar.close(); //Termina la conecttion
    }
}
