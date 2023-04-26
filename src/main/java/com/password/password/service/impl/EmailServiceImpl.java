package com.password.password.service.impl;

import com.password.password.AES.AESExample;
import com.password.password.model.MasterEmailConfiguration;
import com.password.password.repo.EmailRepo;
import com.password.password.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailRepo emailRepo;
    @Override
    public String createEmail(MasterEmailConfiguration masterEmailConfiguration) {
        masterEmailConfiguration.setPassword(AESExample.encrypt(masterEmailConfiguration.getPassword()));
        emailRepo.save(masterEmailConfiguration);
        return "master configuration for email created successfully!!!";
    }

    @Override
    public String deleteEmail(Integer emailId) {
        MasterEmailConfiguration masterEmailConfiguration=emailRepo.findById(emailId).orElseThrow(()->new RuntimeException("Resource not found"));
        emailRepo.delete(masterEmailConfiguration);
        return "email deleted successfully";
    }

    @Override
    public String updateEmail(MasterEmailConfiguration masterEmailConfiguration) {
        MasterEmailConfiguration resultMasterEmailConfiguration=emailRepo.findById(masterEmailConfiguration.getId()).orElseThrow(()->new RuntimeException("Resource not found"));
        if(masterEmailConfiguration.getHost()!=null) {
            resultMasterEmailConfiguration.setHost(masterEmailConfiguration.getHost());
        }
        if(masterEmailConfiguration.getPassword()!=null) {
            resultMasterEmailConfiguration.setPassword(AESExample.encrypt(masterEmailConfiguration.getPassword()));
        }
        if(masterEmailConfiguration.getPort()!=null) {
            resultMasterEmailConfiguration.setPort(masterEmailConfiguration.getPort());
        }
        if(masterEmailConfiguration.isSecure()) {
            resultMasterEmailConfiguration.setSecure(masterEmailConfiguration.isSecure());
        }
        if(masterEmailConfiguration.getUsername()!=null) {
            resultMasterEmailConfiguration.setUsername(masterEmailConfiguration.getUsername());
        }
        if(masterEmailConfiguration.isRequireTls()) {
            resultMasterEmailConfiguration.setRequireTls(masterEmailConfiguration.isRequireTls());
        }
        emailRepo.save(resultMasterEmailConfiguration);
        return "master email configuration updated successfully";
    }

    @Override
    public MasterEmailConfiguration readEmail(Integer emailId) {
        MasterEmailConfiguration resultMasterEmailConfiguration=emailRepo.findById(emailId).orElseThrow(()->new RuntimeException("Resource not found"));

        return resultMasterEmailConfiguration;
    }
}
