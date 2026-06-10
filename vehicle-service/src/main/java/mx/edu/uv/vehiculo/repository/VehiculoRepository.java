package mx.edu.uv.vehiculo.repository;

import java.util.List;
import mx.edu.uv.vehiculo.entity.Marca;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ACA SE HACEN TODAS LAS CONSULTAS A LA BD DE MYSQL
 * 
 * @author Gustavo López
 */
@Mapper
public interface VehiculoRepository {
    
    // PRUEBA CON LAS MARCAS
    @Select("SELECT * FROM marca")
    List<Marca> obtenerMarcas();
    
}
