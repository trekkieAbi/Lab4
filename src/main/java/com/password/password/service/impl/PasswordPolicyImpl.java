package com.password.password.service.impl;

import com.password.password.constant.AppConstant;
import com.password.password.constant.helper.MinLength;
import com.password.password.dto.PasswordPolicyDto;
import com.password.password.model.PasswordPolicy;
import com.password.password.model.PasswordType;
import com.password.password.repo.PasswordPolicyRepo;
import com.password.password.service.PasswordPolicyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordPolicyImpl implements PasswordPolicyService {
    @Autowired
    private PasswordPolicyRepo passwordPolicyRepo;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public String createPasswordPolicy(PasswordPolicyDto passwordPolicyDto) throws Exception {
        Integer minLength= MinLength.calculateMinLength(passwordPolicyDto);
        passwordPolicyDto.setMinLength(minLength);
        passwordPolicyDto.setMaxLength(AppConstant.maxLength);
        if(!validatePasswordType(passwordPolicyDto.getPasswordType())){
            throw new Exception("Wrong password type!!!");
        }
        PasswordPolicy passwordPolicy=modelMapper.map(passwordPolicyDto,PasswordPolicy.class);

        passwordPolicyRepo.save(passwordPolicy);

        return "policy created successfully";
    }

    @Override
    public String updatePasswordPolicy(PasswordPolicyDto passwordPolicyDto) throws Exception {
        PasswordPolicy passwordPolicy = passwordPolicyRepo.findById(passwordPolicyDto.getId()).orElseThrow(() -> new RuntimeException("Resource with the given id does not exists!!!"));
        passwordPolicy.setMinlowerCase(passwordPolicyDto.getMinLowerCase());
        passwordPolicy.setMinNumericChar(passwordPolicyDto.getMinNumericChar());
        passwordPolicy.setMinSpecialChar(passwordPolicyDto.getMinSpecialChar());
        passwordPolicy.setMinUpperCase(passwordPolicyDto.getMinUpperCase());
        passwordPolicy.setPasswordType(passwordPolicyDto.getPasswordType());
        if(validatePasswordType(passwordPolicyDto.getPasswordType())){
            passwordPolicy.setPasswordType(passwordPolicyDto.getPasswordType());
        }
        passwordPolicy.setBusinessId(passwordPolicyDto.getBusinessId());
        passwordPolicyRepo.save(passwordPolicy);
        return "password updated successfully";
    }

    @Override
    public String deletePasswordPolicy(Integer policyId) {
        PasswordPolicy passwordPolicy = passwordPolicyRepo.findById(policyId).orElseThrow(() -> new RuntimeException("Resource with the given id does not exists!!!"));
        passwordPolicyRepo.delete(passwordPolicy);

        return "password policy deleted successfully!!";
    }

    @Override
    public PasswordPolicyDto readPasswordPolicy(Integer policy) {
        PasswordPolicy passwordPolicy = passwordPolicyRepo.findById(policy).orElseThrow(() -> new RuntimeException("Resource with the given id does not exists!!!"));

        return this.modelMapper.map(passwordPolicy,PasswordPolicyDto.class);
    }

    private boolean validatePasswordType(String type) throws Exception {
        if(type.equals(PasswordType.strong)||type.equals(PasswordType.weak)){
           return true;
        }
        return false;
    }
}
