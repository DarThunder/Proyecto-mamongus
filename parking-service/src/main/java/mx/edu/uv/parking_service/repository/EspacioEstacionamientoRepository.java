package mx.edu.uv.parking_service.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import mx.edu.uv.parking_service.entity.EspacioEstacionamiento;

@Mapper
public interface EspacioEstacionamientoRepository {

    @Select("SELECT * FROM espacioestacionamiento where Ocupado = 0 AND estatus = 1")
    List<EspacioEstacionamiento> encontrarEspaciosVacios();

    @Update("UPDATE espacioestacionamiento SET Ocupado = 1 WHERE idEspacio = #{idEspacio}")
    void ocuparEspacio(int idEspacio);
}
