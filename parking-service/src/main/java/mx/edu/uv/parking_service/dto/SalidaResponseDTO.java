package mx.edu.uv.parking_service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SalidaResponseDTO {
    private int idMovimiento;
    private LocalDateTime tiempoEntrada;
    private LocalDateTime tiempoSalida;
    private int idEspacio;
    private BigDecimal tarifaHora;
    private BigDecimal costoTotal;
    private int horasCobradas;
    private String mensaje;

    public SalidaResponseDTO() {
    }

    public SalidaResponseDTO(int idMovimiento, LocalDateTime tiempoEntrada, LocalDateTime tiempoSalida, int idEspacio,
            BigDecimal tarifaHora, BigDecimal costoTotal, int horasCobradas, String mensaje) {
        this.idMovimiento = idMovimiento;
        this.tiempoEntrada = tiempoEntrada;
        this.tiempoSalida = tiempoSalida;
        this.idEspacio = idEspacio;
        this.tarifaHora = tarifaHora;
        this.costoTotal = costoTotal;
        this.horasCobradas = horasCobradas;
        this.mensaje = mensaje;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public LocalDateTime getTiempoEntrada() {
        return tiempoEntrada;
    }

    public void setTiempoEntrada(LocalDateTime tiempoEntrada) {
        this.tiempoEntrada = tiempoEntrada;
    }

    public LocalDateTime getTiempoSalida() {
        return tiempoSalida;
    }

    public void setTiempoSalida(LocalDateTime tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public BigDecimal getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(BigDecimal tarifaHora) {
        this.tarifaHora = tarifaHora;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
}
