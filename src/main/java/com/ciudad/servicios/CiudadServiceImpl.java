/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciudad.servicios;

/**
 *
 * @author enzov
 */
import com.ciudad.entidades.Ciudad;
import com.ciudad.entidades.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> obtenerTodasLasCiudades() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad obtenerCiudadPorId(Integer id) {
        return ciudadRepository.findById(id).orElse(null);
    }

    @Override
    public Ciudad crearCiudad(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public Ciudad modificarCiudad(Integer id, Ciudad ciudad) {
        if (ciudadRepository.existsById(id)) {
            ciudad.setId(id);
            return ciudadRepository.save(ciudad);
        }
        return null;
    }

    @Override
    public void eliminarCiudad(Integer id) {
        ciudadRepository.deleteById(id);
    }
}





