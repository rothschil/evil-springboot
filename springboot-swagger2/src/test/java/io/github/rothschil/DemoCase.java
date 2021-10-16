package io.github.rothschil;

import io.github.rothschil.base.BaseTest;
import io.github.rothschil.po.User;
import io.github.rothschil.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@DisplayName("Mybatis单元测试")
public class DemoCase extends BaseTest {

    @Autowired
    private UserService userService;

    @DisplayName("插入测试")
    @Test
    public void testInset(){
        User u1 = new User("赵六","1231");
        int rows = userService.insert(u1);
        log.warn("[影响行数] ={}",rows);
    }

    @DisplayName("查询测试")
    @Test
    public void testGet(){
        User user = userService.getByKey(230L);
        log.warn("[查询结果] ={}",user);
    }
}
