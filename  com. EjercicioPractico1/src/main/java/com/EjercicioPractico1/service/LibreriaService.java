/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

/**
 *
 * @author brenk
 */
import com.EjercicioPractico1.domain.Libros;
import java.util.List;

public interface LibreriaService {

    public List<Libros> getLibreria(boolean activos);
}
