package mx.edu.uv.parking_service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EntradaRequestDTO {
    private String claveUsuario;
    private String placa;
    private LocalDateTime tiempoEntrada;
    private LocalDateTime tiempoCreacion;
    private BigDecimal tarifaHora;
    private int idEspacio;
    
    public EntradaRequestDTO() {
    }

    public EntradaRequestDTO(String claveUsuario, String placa, LocalDateTime tiempoEntrada,
            LocalDateTime tiempoCreacion, BigDecimal tarifaHora, int idEspacio) {
        this.claveUsuario = claveUsuario;
        this.placa = placa;
        this.tiempoEntrada = tiempoEntrada;
        this.tiempoCreacion = tiempoCreacion;
        this.tarifaHora = tarifaHora;
        this.idEspacio = idEspacio;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getTiempoEntrada() {
        return tiempoEntrada;
    }

    public void setTiempoEntrada(LocalDateTime tiempoEntrada) {
        this.tiempoEntrada = tiempoEntrada;
    }

    public LocalDateTime getTiempoCreacion() {
        return tiempoCreacion;
    }

    public void setTiempoCreacion(LocalDateTime tiempoCreacion) {
        this.tiempoCreacion = tiempoCreacion;
    }

    public BigDecimal getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(BigDecimal tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    

}