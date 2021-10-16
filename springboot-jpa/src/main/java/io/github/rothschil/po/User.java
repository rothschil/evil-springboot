package io.github.rothschil.po;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author <a href="https://github.com/rothschil">Sam</a>
 * @date 2021/10/15 - 17:02
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "pass_word")
    private String passWord;

    public User() {
    }

    public User(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }
}
