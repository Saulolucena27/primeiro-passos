package dio.primeiro_passos.App;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    public Gson gson() {
        return new Gson();
    }

    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criado um objeto Remetente");
        Remetente remetente = new Remetente();
        remetente.setNome("Remetente");
        remetente.setEmail("remetente@gmail.com");
        return remetente;
    }
}
