/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uv.vehiculo.controller;

import java.util.List;
import mx.edu.uv.vehiculo.entity.Marca;
import mx.edu.uv.vehiculo.service.VehiculoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ACA SE HACEN TODAS LAS PETICIONES WEB
 * 
 * @author west
 */
@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    
    private final VehiculoService vs;

    public VehiculoController(VehiculoService vs) {
        this.vs = vs;
    }
    
    @GetMapping("/marcas")
    public List<Marca> listarMarcas() {
        return vs.obtenerMarcas();
    }
}
