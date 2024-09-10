package com.api.ColegioSena.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")  // Indica que esta clase es una entidad que se mapea a la tabla 'users' en la base de datos.
public class UserModels {

    @Id  // Marca el campo 'id' como la clave primaria de la entidad.
    // La estrategia 'IDENTITY' indica que el valor de 'id' se generará automáticamente (auto-incrementado) por la base de datos.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Campo 'name', mapeado a una columna de la tabla 'users' que almacenará el nombre del usuario.
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Campo 'surname', mapeado a una columna de la tabla 'users' que almacenará el apellido del usuario.
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Campo 'email', mapeado a una columna de la tabla 'users' que almacenará el correo electrónico del usuario.
    private String email;
}
