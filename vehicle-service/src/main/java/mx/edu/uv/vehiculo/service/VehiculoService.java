/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uv.vehiculo.service;

import java.util.List;
import mx.edu.uv.vehiculo.entity.Marca;
import mx.edu.uv.vehiculo.entity.VehiculoFullEntity;
import mx.edu.uv.vehiculo.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

/**
 * ACA SE HACEN TODAS LAS FUNCIONES Y OPERACIÓNES CMOPLEJAS PARA EL 
 * MICROSERVICIO DE VEHICULO.
 * 
 * LAS VALIDACIONES DEL TOKEN SE HACEN DENTRO DE LA CARPETA /vehiculo/sec
 * 
 * @author Gustavo López
 */
@Service
public class VehiculoService {
    
    private final VehiculoRepository vr;

    public VehiculoService(VehiculoRepository vr) {
        this.vr = vr;
    }
    
    /**
     * PRUEBA RETORNO DE TODAS LAS MARCAS
     * 
     * NO SE HACE NINGUNA VALICADIÓN
     * 
     * @return 
     */
    public List<Marca> obtenerMarcas() {
        return vr.obtenerMarcasRepository();
    }
    
    /**
     * ACA SE HACE LA VALIDACIÓN DEL ID DEL USUARIO Y EN BASE A ESO
     * SI ES VALIDO RETORNA LA LISTA DE VEHICULOS A SU NOMBRE
     * 
     * @param idUsuario
     * @return 
     */
    public List<VehiculoFullEntity> obtenerVehiculosPorIDService(Integer idUsuario){
        // VALIDACIÓN DEL ID DEL USUARIO
        if(idUsuario != null && idUsuario > 0){
            return vr.obtenerVehiculosPorIDRepository(idUsuario);
        }
         // SI EL ID ES NULL O MENOR QUE 0 MANDA UNA EXCEPCIÓN.
        throw new IllegalArgumentException("Ese ID no existe");
    }
    
    
    
}
