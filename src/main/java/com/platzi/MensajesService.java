package com.platzi;

import java.util.Scanner;

public class MensajesService {
        public static void crearMensaje() {
            Scanner sc = new Scanner(System.in);
            System.out.println("escribe tu mensaje");
            String mensaje = sc.nextLine();
            System.out.println("ingresa tu nombre");
            String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor(nombre);
        MensajesDAO.crearMensajeDB(registro);
        }

        public static void listarMensajes(){
        MensajesDAO.leerMensajeDB();
        }
        public static void borrarMensaje(){
            Scanner sc = new Scanner(System.in);
            System.out.println("indica el id del mensaje a borrar");
            int id_mensaje = sc.nextInt();
            MensajesDAO.borrarMensajeDB(id_mensaje);
        }

        public static void editarMensaje(){
         }
    }
