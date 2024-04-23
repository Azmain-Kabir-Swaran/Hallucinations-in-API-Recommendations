package org.example;


import java.math.BigDecimal;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(new BigDecimal("500"));
        PlatformTransactionManager transactionManager = new TransactionTemplate();
        TransactionTemplate template = new TransactionTemplate(transactionManager);

        template.execute(new TransactionStatus() {
            @Override
            public Object createSynchronization() {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public boolean isNewTransaction() {
                return false;
            }

            @Override
            public void setRollbackOnly() {

            }

            @Override
            public boolean isRollbackOnly() {
                return false;
            }

            @Override
            public void setComplete() {

            }

            @Override
            public boolean isCompleted() {
                return false;
            }

            @Override
            public Object getTransaction() {
                return null;
            }
        });

        account.deposit(new BigDecimal("100"));
        System.out.println("Account balance: " + account.getBalance());
    }

    public static class BankAccount {
        private BigDecimal balance;

        public BankAccount(BigDecimal balance) {
            this.balance = balance;
        }

        public void deposit(BigDecimal amount) {
            this.balance = this.balance.add(amount);
        }

        public BigDecimal getBalance() {
            return this.balance;
        }
    }
}