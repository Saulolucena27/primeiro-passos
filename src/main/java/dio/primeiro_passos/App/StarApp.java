package dio.primeiro_passos.App;

import dio.primeiro_passos.App.Model.User;
import dio.primeiro_passos.App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Saulo");
        user.setUsername("Lucena");;
        user.setPassword("123456");

        user.setPassword("123456");

        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }

    }
}
