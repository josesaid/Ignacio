package com.mx.development.beans;

public class Persona {
    //Atributos de instancia
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    //Atributo de clase
    private /*static*/ String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno.toUpperCase();
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre+ ", Apellido Paterno:" + getApellidoPaterno()
                +", Apellido Materno: " + apellidoMaterno+" y vive en: " + getDireccion();
    }
}
