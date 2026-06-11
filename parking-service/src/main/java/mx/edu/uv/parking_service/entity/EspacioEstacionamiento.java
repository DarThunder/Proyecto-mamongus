package mx.edu.uv.parking_service.entity;

public class EspacioEstacionamiento {
    private int idEspacio;
    private String claveEspacio;
    private String tipo;
    private boolean ocupado;
    private boolean estatus;
    
    public EspacioEstacionamiento() {
    }

    public EspacioEstacionamiento(int idEspacio, String claveEspacio, String tipo, boolean ocupado, boolean estatus) {
        this.idEspacio = idEspacio;
        this.claveEspacio = claveEspacio;
        this.tipo = tipo;
        this.ocupado = ocupado;
        this.estatus = estatus;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public String getClaveEspacio() {
        return claveEspacio;
    }

    public void setClaveEspacio(String claveEspacio) {
        this.claveEspacio = claveEspacio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    
}
