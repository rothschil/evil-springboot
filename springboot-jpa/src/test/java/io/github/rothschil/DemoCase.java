package io.github.rothschil;

import io.github.rothschil.base.BaseTest;
import io.github.rothschil.po.User;
import io.github.rothschil.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@DisplayName("JPA单元测试")
public class DemoCase extends BaseTest {

    @Autowired
    private UserService userService;

    @DisplayName("Insert测试")
    @Test
    public void testInset(){
        User u1 = new User("李克强","1231");
        User rows = userService.insert(u1);
        log.warn("[保存结果] ={}",rows);
    }

    @DisplayName("查询测试")
    @Test
    public void testGet(){
        User user = userService.getByKey(230L);
        log.warn("[查询结果] ={}",user);
    }
}
