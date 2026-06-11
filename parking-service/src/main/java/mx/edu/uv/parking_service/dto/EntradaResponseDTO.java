    package mx.edu.uv.parking_service.dto;

    import java.math.BigDecimal;
    import java.time.LocalDateTime;

    public class EntradaResponseDTO {
        private int idMovimiento;
        private LocalDateTime tiempoEntrada;
        private int idEspacio;
        private BigDecimal tarifaHora;
        private String mensaje;

        public EntradaResponseDTO() {
        }

        public EntradaResponseDTO(int idMovimiento, LocalDateTime tiempoEntrada, int idEspacio, BigDecimal tarifaHora,
                String mensaje) {
            this.idMovimiento = idMovimiento;
            this.tiempoEntrada = tiempoEntrada;
            this.idEspacio = idEspacio;
            this.tarifaHora = tarifaHora;
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

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }

        
        
        
    }
