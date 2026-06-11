package mx.edu.uv.parking_service.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import mx.edu.uv.parking_service.repository.MovimientoRepository;
import mx.edu.uv.parking_service.repository.EspacioEstacionamientoRepository;
import mx.edu.uv.parking_service.dto.EntradaRequestDTO;
import mx.edu.uv.parking_service.dto.EntradaResponseDTO;

@Service
public class ParkingService {
    
    private final MovimientoRepository movimientoRepository;
    private final EspacioEstacionamientoRepository espacioEstacionamientoRepository;
    private final RestTemplate restTemplate;

    public ParkingService(MovimientoRepository movimientoRepository, EspacioEstacionamientoRepository espacioEstacionamientoRepository, RestTemplate restTemplate) {
        this.movimientoRepository = movimientoRepository;
        this.espacioEstacionamientoRepository = espacioEstacionamientoRepository;
        this.restTemplate = restTemplate;
    }

    public EntradaResponseDTO registrarEntrada(EntradaRequestDTO entradaRequest) {
        // Lógica para registrar la entrada del vehículo
        // Validar el espacio de estacionamiento, calcular la tarifa, etc.
        // Guardar el movimiento en la base de datos y retornar la respuesta

        // Ejemplo de llamada a otro microservicio para validar el usuario
        String url = "http://usuario-service/api/usuarios/" + entradaRequest.getClaveUsuario();
        String usuarioInfo = restTemplate.getForObject(url, String.class);
        System.out.println("Información del usuario: " + usuarioInfo);

        // Aquí iría la lógica para guardar el movimiento y calcular la tarifa
        // Por ahora, retornamos una respuesta de ejemplo
        return new EntradaResponseDTO(1, entradaRequest.getTiempoEntrada(), entradaRequest.getIdEspacio(), entradaRequest.getTarifaHora(), "Entrada registrada exitosamente");
    }


}
