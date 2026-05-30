/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_L;

import BD_L.ConexionMySQL_L;
import Modelo_L.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lusaavedra
 */
public class Control_L {

    public Login validarLogin(String nombre, String password) {
        // AQUÍ: Cambié "table_vendedor" por "tabla_vendedor"
        String sql = "SELECT idVendedor, nombreVendedor FROM "
                + "table_vendedor WHERE nombreVendedor = ? "
                + "AND password = ?";
        try (Connection conn = ConexionMySQL_L.getConnection(); 
                PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Login v = new Login();
                v.setId(rs.getInt("idVendedor"));
                v.setNombre(rs.getString("nombreVendedor"));
                return v;
            }
        } catch (SQLException e) {
            System.out.println("Error en login: " + e.getMessage());
        }
        return null;
    }
}
