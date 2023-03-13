package com.platzi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    public static void  crearMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
            try (Connection conexion = db_connect.get_connection()){
                PreparedStatement ps = null;
                try {
                    String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                    ps =  conexion.prepareStatement(query);
                    ps.setString(1, mensaje.getMensaje());
                    ps.setString(2, mensaje.getAutor());
                    ps.executeUpdate();
                    System.out.println("el mensaje se creo correctamente");
                }catch (SQLException ex){
                    System.out.println(ex);

                }

            }catch (SQLException e){
                System.out.println(e);
            }

    }

    public static void  leerMensajeDB(){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conexion = db_connect.get_connection()){
        String query = "SELECT * FROM mensajes";
        ps = conexion.prepareStatement(query);
        rs = ps.executeQuery();

        while (rs.next()){
            System.out.println("id"+ rs.getInt("id_mensaje"));
            System.out.println("mensaje:" + rs.getString("mensaje"));
            System.out.println("autor:"+ rs.getString("autor_mensaje"));
            System.out.println("fecha:"+ rs.getString("fecha_mensaje"));
            System.out.println("");
        }
        } catch (SQLException e){
            System.out.println("no se pudieron recuperar los mensajes");
        System.out.println(e);
    }
    }

    public static void borrarMensajeDB(int id_mensaje) {

        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
                try {
                        String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                        ps = conexion.prepareStatement(query);
                        ps.setInt(1, id_mensaje);
                        ps.executeUpdate();
                    System.out.println("el mensaje fue eliminado");

            }catch (SQLException e){
                System.out.println(e);
                System.out.println("no se pudo borrar el mensaje");
            }

        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;



        }catch (SQLException e){
            System.out.println(e);
            System.out.println("no se pudo borrar el mensaje");
        }
    }
}
