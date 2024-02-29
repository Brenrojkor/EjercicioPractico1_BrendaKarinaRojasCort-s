/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.LibreriaDao;
import com.EjercicioPractico1.domain.Libros;
import com.EjercicioPractico1.service.LibreriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibreriaServiceImpl implements LibreriaService {

    @Autowired
    private LibreriaDao libreriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Libros> getLibreria(boolean activos) {
        var lista = libreriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
