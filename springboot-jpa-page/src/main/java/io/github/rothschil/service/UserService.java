package io.github.rothschil.service;

import io.github.rothschil.po.User;
import io.github.rothschil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author <a href="https://github.com/rothschil">Sam</a>
 * @date 2021/10/15 - 16:41
 * @since 1.0.0
 */
@Transactional
@Service
public class UserService {


    private UserRepository userRepository;

    @Autowired
    public void setUserMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User insert(User user){
        return userRepository.save(user);
    }

    public User getByKey(Long id){
        return userRepository.getUserById(id);
    }

}
