package com.password.password.service;

import com.password.password.dto.PasswordPolicyDto;

public interface PasswordPolicyService {
    String createPasswordPolicy(PasswordPolicyDto passwordPolicyDto) throws Exception;
    String updatePasswordPolicy(PasswordPolicyDto passwordPolicyDto) throws Exception;
    String deletePasswordPolicy(Integer policyId);
    PasswordPolicyDto readPasswordPolicy(Integer policy);

}
