package com.password.password.constant.helper;

import com.password.password.dto.PasswordPolicyDto;

public class MinLength {
    public static Integer calculateMinLength(PasswordPolicyDto passwordPolicyDto){
        return passwordPolicyDto.getMinLowerCase()+passwordPolicyDto.getMinUpperCase()
                +passwordPolicyDto.getMinSpecialChar()+passwordPolicyDto.getMinNumericChar();
    }
}
