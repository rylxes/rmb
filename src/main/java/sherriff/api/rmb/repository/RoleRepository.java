package sherriff.api.rmb.repository;

import sherriff.api.rmb.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
