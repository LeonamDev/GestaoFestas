/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.java.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pos.java.festa.repository.Convidados;

/**
 *
 * @author DesenvolvedorJava
 */
@Controller
public class ConvidadosController {

    @Autowired
    private Convidados convidados;

    @GetMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        return modelAndView;
    }

}
