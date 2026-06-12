package mx.edu.uv.user_service.dto;

import java.time.LocalDateTime;

public class UserResponse {
    private String rol;
    private String nombreCompleto;
    private String tipoUsuario;
    private String programaEducativo;
    private String username;
    private String correo;
    private String telefono;
    private boolean status;
    private String claveUsuario;
    private LocalDateTime tiempoCreacion;
    private LocalDateTime tiempoActualizacion;

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public void setTiempoCreacion(LocalDateTime tiempoCreacion) {
        this.tiempoCreacion = tiempoCreacion;
    }

    public void setTiempoActualizacion(LocalDateTime tiempoActualizacion) {
        this.tiempoActualizacion = tiempoActualizacion;
    }

    public String getRol() {
        return rol;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public String getUsername() {
        return username;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isStatus() {
        return status;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public LocalDateTime getTiempoCreacion() {
        return tiempoCreacion;
    }

    public LocalDateTime getTiempoActualizacion() {
        return tiempoActualizacion;
    }

    
}
