package sherriff.api.rmb.repository;

import sherriff.api.rmb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
