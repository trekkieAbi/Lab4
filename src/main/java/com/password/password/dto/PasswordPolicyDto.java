package com.password.password.dto;

public class PasswordPolicyDto {
    private Integer id;
    private Integer maxLength;
    private Integer minLength;
    private Integer minUpperCase;
    private Integer minLowerCase;
    private Integer minSpecialChar;
    private Integer minNumericChar;

    public Integer getMinNumericChar() {
        return minNumericChar;
    }

    public void setMinNumericChar(Integer minNumericChar) {
        this.minNumericChar = minNumericChar;
    }

    private Integer passwordLife;
    private String passwordType;
    private Integer businessId;

    public Integer getMinUpperCase() {
        return minUpperCase;
    }

    public void setMinUpperCase(Integer minUpperCase) {
        this.minUpperCase = minUpperCase;
    }

    public Integer getMinLowerCase() {
        return minLowerCase;
    }

    public void setMinLowerCase(Integer minLowerCase) {
        this.minLowerCase = minLowerCase;
    }

    public Integer getMinSpecialChar() {
        return minSpecialChar;
    }

    public void setMinSpecialChar(Integer minSpecialChar) {
        this.minSpecialChar = minSpecialChar;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }
}
