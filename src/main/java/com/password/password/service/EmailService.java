package com.password.password.service;

import com.password.password.model.MasterEmailConfiguration;

public interface EmailService {
   public String createEmail(MasterEmailConfiguration masterEmailConfiguration);
   public String deleteEmail(Integer emailId);
   public String updateEmail(MasterEmailConfiguration masterEmailConfiguration);
   public MasterEmailConfiguration readEmail(Integer emailId);

}
