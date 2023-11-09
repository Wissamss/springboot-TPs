import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/voitures")
                .allowedOrigins("http://localhost:3001")
                .allowedMethods("GET", "POST", "DELETE")
                .allowedHeaders("Content-Type")
                .allowCredentials(true);
    }
}
