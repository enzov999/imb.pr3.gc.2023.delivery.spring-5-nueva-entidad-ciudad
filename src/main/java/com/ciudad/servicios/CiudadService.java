/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ciudad.servicios;

import com.ciudad.entidades.Ciudad;
import java.util.List;

public interface CiudadService {
    List<Ciudad> obtenerTodasLasCiudades();
    Ciudad obtenerCiudadPorId(Integer id);
    Ciudad crearCiudad(Ciudad ciudad);
    Ciudad modificarCiudad(Integer id, Ciudad ciudad);
    void eliminarCiudad(Integer id);
}
