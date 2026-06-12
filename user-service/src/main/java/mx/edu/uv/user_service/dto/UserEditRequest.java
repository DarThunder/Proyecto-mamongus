package mx.edu.uv.user_service.dto;

public class UserEditRequest {
    private String nombre;
    private String apellidoPaterno;
    // null si el usuario no tiene apellido materno
    private String apellidoMaterno;
    private String correo;
    private String telefono;
    private int idRol;
    private int idTipoUsuario;
    private int idProgramaEducativo;

    public UserEditRequest() {}

    public String getNombre() { return nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public int getIdRol() { return idRol; }
    public int getIdTipoUsuario() { return idTipoUsuario; }
    public int getIdProgramaEducativo() { return idProgramaEducativo; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setIdRol(int idRol) { this.idRol = idRol; }
    public void setIdTipoUsuario(int idTipoUsuario) { this.idTipoUsuario = idTipoUsuario; }
    public void setIdProgramaEducativo(int idProgramaEducativo) { this.idProgramaEducativo = idProgramaEducativo; }
}