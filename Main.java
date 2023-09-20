package com.company;

import java.util.regex.*;

public class Main {

    // Función corregida para validar si la contraseña cumple con los requisitos mínimos
    public static boolean cumpleRequisitosMinimos(String contrasena) {
        return contrasena.length() >= 8; // Corrección: Devuelve true si la longitud de la contraseña es mayor o igual a 8.
    }


    // Función para validar si la contraseña contiene al menos una letra mayúscula
    public static boolean contieneLetraMayuscula(String contrasena) {
        return contrasena.matches(".*[A-Z].*"); // Corrección: Devuelve true si la contraseña contiene al menos una letra mayúscula.
    }

    // Función para validar si la contraseña contiene al menos una letra minúscula
    public static boolean contieneLetraMinuscula(String contrasena) {
        return contrasena.matches(".*[a-z].*") && contrasena.length() >= 8; // Cambiar '.*[a-z].*' por '.*[a-z].*'
    }

    // Función para validar si la contraseña contiene al menos un número
    public static boolean contieneNumero(String contrasena) {
        return contrasena.matches(".*\\d.*") && contrasena.length() >= 8; // Cambiar '.*\\d.*' por '.*\\d.*'
    }

    // Función corregida para validar si la contraseña contiene al menos un carácter especial
    public static boolean contieneCaracterEspecial(String contrasena) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Corrección: Utiliza el patrón negativo '[^a-zA-Z0-9]'
        Matcher matcher = pattern.matcher(contrasena);
        return matcher.find() && contrasena.length() >= 8;
    }



    // Función para validar si la contraseña es segura (cumple todos los requisitos)
    public static boolean esContrasenaSegura(String contrasena) {
        return cumpleRequisitosMinimos(contrasena)
                && contieneLetraMayuscula(contrasena)
                && contieneLetraMinuscula(contrasena)
                && contieneNumero(contrasena)
                && contieneCaracterEspecial(contrasena); // Cambiar '&&' por '||'
    }

    public static void main(String[] args) {
        String contrasena = "password"; // Cambiar a una contraseña que falle todas las funciones

        if (esContrasenaSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos mínimos de seguridad.");
        }
    }
}
