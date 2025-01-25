package com.mx.development.encapsulamiento;

public class EncapsulamientoEjemplo {
    //todos los atributos debe ser privados
    private int numero;
    int edad;
    private String email;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if(edad <0)
            throw new Exception("Error al proporcionar la edad (" + edad + ")");
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
