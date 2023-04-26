package com.password.password.controller;

import com.password.password.model.MasterEmailConfiguration;
import com.password.password.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/create")
    ResponseEntity<?> createEmailMasterConfig(@RequestBody MasterEmailConfiguration masterEmailConfiguration){
        String message=emailService.createEmail(masterEmailConfiguration);
        return new ResponseEntity<>(message, HttpStatus.OK);

    }
    @PutMapping("/update")
    ResponseEntity<?> updateEmailMasterConfig(@RequestBody MasterEmailConfiguration masterEmailConfiguration){
        String message=emailService.updateEmail(masterEmailConfiguration);
        return new ResponseEntity<>(message, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{emailId}")
    ResponseEntity<?> deleteEmailMasterConfig(@PathVariable Integer emailId){
        String message=emailService.deleteEmail(emailId);
        return new ResponseEntity<>(message, HttpStatus.OK);

    }
    @GetMapping("/read/{emailId}")
    ResponseEntity<?> readEmailMasterConfig(@PathVariable Integer emailId){
        MasterEmailConfiguration masterEmailConfiguration=emailService.readEmail(emailId);
        return new ResponseEntity<>(masterEmailConfiguration, HttpStatus.OK);

    }
}
