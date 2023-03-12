package com.platzi;

public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor;
    String fecha_mensaje;

    public Mensajes(){

    }
    public Mensajes( String mensaje, String autor, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha_mensaje = fecha_mensaje;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
}