
package com.nim.java.dao;

import com.nim.java.connection.Conexion;
import com.nim.java.model.Mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajeDAO {
    
    private Connection connection;
    private PreparedStatement statement;
    private boolean estadoOperacion;
    
    public Mensaje obtenerMensaje(int idMensaje) throws SQLException {
        ResultSet resultSet = null;
        Mensaje m = new Mensaje();
        String sql = null;
        estadoOperacion = false;
        connection = obtenerConexion();
        
        try {
            connection.setAutoCommit(false);
            sql = "SELECT*FROM mensaje WHERE id_mensaje=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,idMensaje);
            
            resultSet = statement.executeQuery();
            
            if(resultSet.next()) {
                m.setIdMensaje(resultSet.getInt(1));
                m.setArbMensaje(resultSet.getString(2));
                m.setCphMensaje(resultSet.getString(3));
                m.setCpsMensaje(resultSet.getString(4));
                m.setDesMensaje(resultSet.getString(5));
                m.setCrbMensaje(resultSet.getString(6));
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return m;
    }
    
    //get connection
    private Connection obtenerConexion() throws SQLException {
        return Conexion.getConnection();
    }
    
}
