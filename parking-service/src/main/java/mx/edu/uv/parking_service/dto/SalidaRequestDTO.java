package mx.edu.uv.parking_service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SalidaRequestDTO {
    private String claveUsuario;
    private String placa;
    private LocalDateTime tiempoSalida;
    private LocalDateTime tiempoActualizacion;
    private BigDecimal costoTotal;
    private int horasCobradas;
    private int minutosEstacionado;

    public SalidaRequestDTO() {
    }

    public SalidaRequestDTO(String claveUsuario, String placa, LocalDateTime tiempoSalida,
            LocalDateTime tiempoActualizacion, BigDecimal costoTotal, int horasCobradas, int minutosEstacionado) {
        this.claveUsuario = claveUsuario;
        this.placa = placa;
        this.tiempoSalida = tiempoSalida;
        this.tiempoActualizacion = tiempoActualizacion;
        this.costoTotal = costoTotal;
        this.horasCobradas = horasCobradas;
        this.minutosEstacionado = minutosEstacionado;
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

    public LocalDateTime getTiempoSalida() {
        return tiempoSalida;
    }

    public void setTiempoSalida(LocalDateTime tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    public LocalDateTime getTiempoActualizacion() {
        return tiempoActualizacion;
    }

    public void setTiempoActualizacion(LocalDateTime tiempoActualizacion) {
        this.tiempoActualizacion = tiempoActualizacion;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getHorasCobradas() {
        return horasCobradas;
    }

    public void setHorasCobradas(int horasCobradas) {
        this.horasCobradas = horasCobradas;
    }

    public int getMinutosEstacionado() {
        return minutosEstacionado;
    }

    public void setMinutosEstacionado(int minutosEstacionado) {
        this.minutosEstacionado = minutosEstacionado;
    }

    
    
}