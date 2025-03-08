package dio.primeiro_passos.App.repository;

import dio.primeiro_passos.App.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
