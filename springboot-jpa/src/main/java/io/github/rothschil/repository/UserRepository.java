package io.github.rothschil.repository;

import io.github.rothschil.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href="https://github.com/rothschil">Sam</a>
 * @date 2021/10/15 - 16:41
 * @since 1.0.0
 */

public interface UserRepository extends JpaRepository<User,Long> {

    User getUserById(Long id);

}
