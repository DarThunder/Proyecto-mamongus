package mx.edu.uv.vehiculo;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@SpringBootApplication
public class VehicleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleServiceApplication.class, args);
    }
    
    /**
     * Aca se inicializa el RestTemplate que nos permitirá consumir los endpoints de los otros servicios,
     * se necesita inicializar desde aqui por que si no no va a servir en lo demás (O algo asi entendí)
     * 
     * Utilizado en la validación de que un usuario existe en el archivo service de vehiculo
     * 
     * @return 
     */
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        
        ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if (attributes != null) {
                // Aca se encarga de pasarle el token JWT del login, si lo encuentra lo manda como un header para la petición que se haga
                HttpServletRequest servletRequest = attributes.getRequest();
                String token = servletRequest.getHeader("Authorization");
                if (token != null) {
                    request.getHeaders().add("Authorization", token);
                }
            }
            return execution.execute(request, body);
        };
        
        restTemplate.setInterceptors(Collections.singletonList(interceptor));
        return restTemplate;
    }
}
