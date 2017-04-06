package org.academiadecodigo.bootcamp;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by codecadet on 04/04/17.
 */
public class User {
    @NotNull(message = "username is mandatory")
    @NotBlank(message = "username is mandatory")
    @Pattern(regexp = "[a-z-A-Z]*", message = "username has invalid characters")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 64)
    private String password;


    private String function;

    public User() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
