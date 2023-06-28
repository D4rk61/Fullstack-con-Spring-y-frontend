package com.cursojava.curso.dao;

import com.cursojava.curso.persistance.entity.Usuario;

import java.util.List;

public interface IUsuarioDao {

    // funciones obligatorias

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
