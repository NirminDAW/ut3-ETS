package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @org.junit.jupiter.api.Test
    void cumpleRequisitosMinimos() {
        String contrasena = "P@ssw0rd";
        assertTrue(Main.cumpleRequisitosMinimos(contrasena));

    }
    @org.junit.jupiter.api.Test
    void nocumpleRequisitosMinimos() {
        String contrasena = "P@ssw";
        assertFalse(Main.cumpleRequisitosMinimos(contrasena));

    }

    @org.junit.jupiter.api.Test
    void contieneLetraMayuscula() {
        String contrasena = "P@ssw0rd";
        assertTrue(Main.contieneLetraMayuscula(contrasena));
    }

    @org.junit.jupiter.api.Test
    void nocontieneLetraMayuscula() {
        String contrasena = "password123";
        assertFalse(Main.contieneLetraMayuscula(contrasena));
    }

    @org.junit.jupiter.api.Test
    void contieneLetraMinuscula() {
        String contrasena = "P@ssw0rd";
        assertTrue(Main.contieneLetraMinuscula(contrasena));
    }

    @org.junit.jupiter.api.Test
    void nocontieneLetraMinuscula() {
        String contrasena = "PASSWORD123";
        assertFalse(Main.contieneLetraMinuscula(contrasena));
    }


    @org.junit.jupiter.api.Test
    void contieneNumero() {
        String contrasena = "P@ssw0rd";
        assertTrue(Main.contieneNumero(contrasena));
    }

    @org.junit.jupiter.api.Test
    void nocontieneNumero() {
        String contrasena = "Password";
        assertFalse(Main.contieneNumero(contrasena));
    }

    @org.junit.jupiter.api.Test
    void contieneCaracterEspecial() {
        String contrasena = "P@ssw0rd";
        assertTrue(Main.contieneCaracterEspecial(contrasena));
    }

    @org.junit.jupiter.api.Test
    void nocontieneCaracterEspecial() {
        String contrasena = "Password123";
        assertFalse(Main.contieneCaracterEspecial(contrasena));
    }

    @org.junit.jupiter.api.Test
    void esContrasenaSegura() {
        String contrasena = "P@ssw0rd";
        assertTrue(Main.esContrasenaSegura(contrasena));
    }

    @org.junit.jupiter.api.Test
    void noesContrasenaSegura() {
        String contrasena = "password";
        assertFalse(Main.esContrasenaSegura(contrasena));
    }
    }
