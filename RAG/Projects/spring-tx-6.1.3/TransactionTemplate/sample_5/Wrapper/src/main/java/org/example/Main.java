package org.example;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Main {

  @Autowired
  private TransactionTemplate transactionTemplate;

  @Transactional
  public void updateData(String data){
    // Your logic here
  }

  public void run(){
    transactionTemplate.execute(new TransactionCallbackWithoutResult() {
      @Override
      protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
        updateData("Your data");
      }
    });
  }

}