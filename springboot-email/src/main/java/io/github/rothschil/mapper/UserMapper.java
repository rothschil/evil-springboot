package io.github.rothschil.mapper;

import io.github.rothschil.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="https://github.com/rothschil">Sam</a>
 * @date 2021/10/15 - 16:41
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {

    int insert(User user);

    User get(User user);

    User getByKey(Long id);

}
