package io.github.rothschil.service;

import io.github.rothschil.mapper.UserMapper;
import io.github.rothschil.po.User;
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


    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int insert(User user){
        return userMapper.insert(user);
    }

    public User get(User user){
        return userMapper.get(user);
    }

    public User getByKey(Long id){
        return userMapper.getByKey(id);
    }

}
