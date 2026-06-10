/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uv.vehiculo.service;

import java.util.List;
import mx.edu.uv.vehiculo.entity.Marca;
import mx.edu.uv.vehiculo.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

/**
 * ACA SE HACEN TODAS LAS FUNCIONES Y OPERACIÓNES CMOPLEJAS PARA EL 
 * MICROSERVICIO DE VEHICULO
 * 
 * @author Gustavo López
 */
@Service
public class VehiculoService {
    
    private final VehiculoRepository vr;

    public VehiculoService(VehiculoRepository vr) {
        this.vr = vr;
    }
    
    public List<Marca> obtenerMarcas() {
        return vr.obtenerMarcas();
    }
}
