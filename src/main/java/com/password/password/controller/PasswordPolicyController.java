package com.password.password.controller;

import com.password.password.dto.PasswordPolicyDto;
import com.password.password.service.PasswordPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pw-policy")
public class PasswordPolicyController {
    @Autowired
    private PasswordPolicyService passwordPolicyService;

    @PostMapping("/create")
    ResponseEntity<?> createPolicy(@RequestBody PasswordPolicyDto  passwordPolicyDto) throws Exception {
       String message=passwordPolicyService.createPasswordPolicy(passwordPolicyDto);
       return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{policyId}")
    ResponseEntity<?> deletePolicy(@PathVariable Integer policyId) throws Exception {
        String message=passwordPolicyService.deletePasswordPolicy(policyId);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @PutMapping("/update")
    ResponseEntity<?> updatePolicy(@RequestBody PasswordPolicyDto  passwordPolicyDto) throws Exception {
        String message=passwordPolicyService.updatePasswordPolicy(passwordPolicyDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @PostMapping("/read/{policyId}")
    ResponseEntity<?> readPolicy(@PathVariable Integer policyId) throws Exception {
        PasswordPolicyDto passwordPolicy=passwordPolicyService.readPasswordPolicy(policyId);
        return new ResponseEntity<>(passwordPolicy, HttpStatus.OK);
    }
}
