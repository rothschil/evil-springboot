package io.github.rothschil.po;

import lombok.Data;

/**
 * @author <a href="https://github.com/rothschil">Sam</a>
 * @date 2021/10/15 - 17:02
 * @since 1.0.0
 */
@Data
public class User {

    private Long id;

    private String name;

    private String passWord;

    public User() {
    }

    public User(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }
}
