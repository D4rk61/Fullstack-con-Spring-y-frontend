package com.cursojava.curso.web.controller;

import com.cursojava.curso.dao.IUsuarioDao;
import com.cursojava.curso.persistance.entity.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    private IUsuarioDao iUsuarioDao;
    @ResponseBody
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {
        if(iUsuarioDao.verificarCredenciales(usuario)) {

            return "OK";
        }
        return "FAIL";


    }
}
