package mx.edu.uv.parking_service.dto;

public class EspacioResponseDTO {
    private int idEspacio;
    private String claveEspacio;
    private String tipo;

    public EspacioResponseDTO() {
    }

    public EspacioResponseDTO(int idEspacio, String claveEspacio, String tipo) {
        this.idEspacio = idEspacio;
        this.claveEspacio = claveEspacio;
        this.tipo = tipo;
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

    
}
