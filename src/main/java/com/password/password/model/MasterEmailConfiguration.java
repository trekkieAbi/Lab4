package com.password.password.model;

import javax.persistence.*;

@Entity
@Table(name = "master_email_configuration")
public class MasterEmailConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String host;
    @Column(nullable = false)
    private Integer port;
    @Column(nullable = false)
    private boolean secure;
    @Column(nullable = false)
    private boolean requireTls;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public boolean isRequireTls() {
        return requireTls;
    }

    public void setRequireTls(boolean requireTls) {
        this.requireTls = requireTls;
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
}
