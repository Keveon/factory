package com.keveon.factory.model.bo;

import com.keveon.factory.model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.function.Supplier;

import static java.util.Objects.isNull;

/**
 * Created by Keveon on 2017/3/10.
 * Login business object
 */
@Data
@RequiredArgsConstructor
public class Login implements Serializable {

    private static final long serialVersionUID = 5501836827586685850L;
    /**
     * The User.
     */
    final User user;

    /**
     * Instantiates a new Login.
     */
    public Login() {
        this(null);
    }

    /**
     * Get login.
     *
     * @return the login
     */
    public Login get() {
        return this.orElseThrow(() -> new IllegalStateException("没登录"));
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return this.user.getId();
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return this.user.getUsername();
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return this.user.getPassword();
    }

    /**
     * Or else throw login.
     *
     * @param supplier the supplier
     * @return the login
     */
    public Login orElseThrow(Supplier<Exception> supplier) {
        if (isNull(this.user)) {
            supplier.get();
        }
        return this;
    }
}