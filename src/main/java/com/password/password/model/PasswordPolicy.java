package com.password.password.model;

import javax.persistence.*;

@Entity
@Table(name = "password_policy")
public class PasswordPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pp_id")
    private Integer id;
    @Column(name = "max_length")
    private Integer maxLength;
    @Column(name = "min_length",nullable = false)
    private Integer minLength;
    @Column(name="min_uppercase_char",nullable = false)
    private Integer minUpperCase;
    @Column(name="min_lowercase_char",nullable = false)
    private Integer minlowerCase;
    @Column(name="min_special_char",nullable = false)
    private Integer minSpecialChar;
    @Column(name="min_numeric_char",nullable = false)
    private Integer minNumericChar;
    @Column(name="password_life",nullable = false)
    private Integer passwordLife;
    @Column(name="password_type",nullable = false)
    private String passwordType;
    @Column(name = "business_id",nullable = true)
    private Integer businessId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMinUpperCase() {
        return minUpperCase;
    }

    public void setMinUpperCase(Integer minUpperCase) {
        this.minUpperCase = minUpperCase;
    }

    public Integer getMinlowerCase() {
        return minlowerCase;
    }

    public void setMinlowerCase(Integer minlowerCase) {
        this.minlowerCase = minlowerCase;
    }

    public Integer getMinSpecialChar() {
        return minSpecialChar;
    }

    public void setMinSpecialChar(Integer minSpecialChar) {
        this.minSpecialChar = minSpecialChar;
    }

    public Integer getMinNumericChar() {
        return minNumericChar;
    }

    public void setMinNumericChar(Integer minNumericChar) {
        this.minNumericChar = minNumericChar;
    }

    public Integer getPasswordLife() {
        return passwordLife;
    }

    public void setPasswordLife(Integer passwordLife) {
        this.passwordLife = passwordLife;
    }

    public String getPasswordType() {
        return passwordType;
    }

    public void setPasswordType(String passwordType) {
        this.passwordType = passwordType;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }
}
