package mx.edu.uv.parking_service.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Movimiento {
    private int idMovimiento;
    private int idVehiculo;
    private LocalDateTime tiempoEntrada;
    private LocalDateTime tiempoSalida;
    private int minutosEstacionado;
    private int horasCobradas;
    private BigDecimal costoTotal;
    private BigDecimal tarifaHora;
    private LocalDateTime tiempoCreacion;
    private LocalDateTime tiempoActualizacion;
    private int idEspacio;

    public Movimiento(){

    }

    public Movimiento(int idMovimiento, int idVehiculo, LocalDateTime tiempoEntrada, LocalDateTime tiempoSalida, int minutosEstacionado, int horasCobradas, BigDecimal costoTotal, 
            BigDecimal tarifaHora, LocalDateTime tiempoCreacion, LocalDateTime tiempoActualizacion, int idEspacio) {
        this.idMovimiento = idMovimiento;
        this.idVehiculo = idVehiculo;
        this.tiempoEntrada = tiempoEntrada;
        this.tiempoSalida = tiempoSalida;
        this.minutosEstacionado = minutosEstacionado;
        this.horasCobradas = horasCobradas;
        this.costoTotal = costoTotal;
        this.tarifaHora = tarifaHora;
        this.tiempoCreacion = tiempoCreacion;
        this.tiempoActualizacion = tiempoActualizacion;
        this.idEspacio = idEspacio;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
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

    public int getMinutosEstacionado() {
        return minutosEstacionado;
    }

    public void setMinutosEstacionado(int minutosEstacionado) {
        this.minutosEstacionado = minutosEstacionado;
    }

    public int getHorasCobradas() {
        return horasCobradas;
    }

    public void setHorasCobradas(int horasCobradas) {
        this.horasCobradas = horasCobradas;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public BigDecimal getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(BigDecimal tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public LocalDateTime getTiempoCreacion() {
        return tiempoCreacion;
    }

    public void setTiempoCreacion(LocalDateTime tiempoCreacion) {
        this.tiempoCreacion = tiempoCreacion;
    }

    public LocalDateTime getTiempoActualizacion() {
        return tiempoActualizacion;
    }

    public void setTiempoActualizacion(LocalDateTime tiempoActualizacion) {
        this.tiempoActualizacion = tiempoActualizacion;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    
    

}
