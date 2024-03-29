/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.service.LibreriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/libros")
public class LibreriaController {

    @Autowired
    private LibreriaService libreriaService;

    @GetMapping("/Libros")
    public String inicio(Model model) {
        var libros = libreriaService.getLibreria(false);
        model.addAttribute("libros", libros);
        model.addAttribute("totallibros", libros.size());
        return "/libros/listado";
    }
}

