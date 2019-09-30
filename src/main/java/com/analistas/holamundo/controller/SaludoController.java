/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.analistas.holamundo.controller;

import com.analistas.holamundo.model.Saludo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ander
 */

@Controller
public class SaludoController {
    
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model m) {
    
        m.addAttribute("saludo", new Saludo());
        
        return "home";
    }
    
    @RequestMapping(value = {"/home"}, method = RequestMethod.POST)
    public String saludar(@ModelAttribute Saludo saludo) {
    
        String nombre = saludo.getNombre();
        
        saludo.setMensaje("Hola " + nombre + ". ¡¡¡Bienvenid@ a Java Web!!!");
        
        return "saludar";
    }
    
}
