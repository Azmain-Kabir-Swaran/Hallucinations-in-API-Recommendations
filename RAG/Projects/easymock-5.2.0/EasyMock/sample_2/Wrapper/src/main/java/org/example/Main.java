package org.example;


import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;

public class Main extends EasyMockSupport {

    public static void main(String[] args) {
        // Create mock objects
        AccountService accountService = EasyMock.createMock(AccountService.class);
        CreditCardService creditCardService = EasyMock.createMock(CreditCardService.class);

        // Define behavior
        EasyMock.expect(accountService.getBalance()).andReturn(100.0);
        EasyMock.expect(creditCardService.getCreditLimit()).andReturn(10000.0);

        // Record behavior
        EasyMock.replay(accountService, creditCardService);

        // Using the mock objects
        double balance = accountService.getBalance();
        double creditLimit = creditCardService.getCreditLimit();

        // Check results
        System.out.println("Account Balance: " + balance);
        System.out.println("Credit Limit: " + creditLimit);

        // Verify the behavior
        EasyMock.verify(accountService, creditCardService);
    }
}