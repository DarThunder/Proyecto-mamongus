package mx.edu.uv.vehiculo.repository;

import java.util.List;
import mx.edu.uv.vehiculo.entity.Marca;
import mx.edu.uv.vehiculo.entity.VehiculoFullEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ACA SE HACEN TODAS LAS CONSULTAS A LA BD DE MYSQL
 * 
 * @author Gustavo López
 */
@Mapper
public interface VehiculoRepository {
    
    /**
     * PRUEBA PARA VER QUE POSTMAN HICIERA LAS PETICIONES
     * REGRESA TODA LA LISTA DE MARCAS DE VEHICULOS
     * 
     * @return 
     */
    @Select("SELECT * FROM marca")
    List<Marca> obtenerMarcasRepository();
    
    /**
     * HACE LA CONSULTA A LA BASE UTILIZANDO EL ID DEL USUARIO Y RETORNA LOS 
     * VEHICULOS RESPECTIVOS A ESTE.
     * 
     * @param idUsuario
     * @return 
     */
    @Select("SELECT * FROM vehiculofullinfo WHERE idUsuario = #{idUsuario}")
    List<VehiculoFullEntity> obtenerVehiculosPorIDRepository(Integer idUsuario);
    
    //@Insert("INSERT INTO vehiculo (")
}
