package com.cursojava.curso.web.controller;

import com.cursojava.curso.dao.IUsuarioDao;
import com.cursojava.curso.persistance.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioDao iUsuarioDao;

    @RequestMapping(value = "api/usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Jose");
        usuario.setApellido("Reynoso");
        usuario.setEmail("jade@cursojava");
        usuario.setTelefono("1234567890");
        usuario.setPassword("password");
        return usuario;
    }

    @ResponseBody
    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return iUsuarioDao.getUsuarios();
    }

    @ResponseBody
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        iUsuarioDao.registrar(usuario);
    }


    @RequestMapping(value = "/usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Jose");
        usuario.setApellido("Reynoso");
        usuario.setEmail("jade@cursojava");
        usuario.setTelefono("1234567890");
        usuario.setPassword("password");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        iUsuarioDao.eliminar(id);
    }

    @RequestMapping(value = "/usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Jose");
        usuario.setApellido("Reynoso");
        usuario.setEmail("jade@cursojava");
        usuario.setTelefono("1234567890");
        usuario.setPassword("password");
        return usuario;
    }
}
