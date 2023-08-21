package org.example.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class AccountManagerTest {
    Customer customer = new Customer();
    AccountManager accountManager = new AccountManagerImpl();

    @Test
    void givenCustomerWithEmptyBalance_whenDeposit_thenSucceed() {
        // Arrange

        //Act
        accountManager.deposit(customer, 1000);

        //Assert
        assertThat(customer.getBalance()).isEqualTo(1000);
    }

    @Test
    void givenCustomerWithInitialBalance_whenDeposit_thenSucceed() {
        // Arrange
        customer.setBalance(500);

        //Act
        accountManager.deposit(customer, 1000);

        //Assert
        assertThat(customer.getBalance()).isEqualTo(1500);
    }

    @Test
    void givenCustomerWithSufficientBalance_whenWithdraw_thenSucceed() {
        // Arrange
        customer.setBalance(500);

        //Act
        String result = accountManager.withdraw(customer, 400);

        //Assert
        assertThat(result).isEqualTo("success");
    }

    @Test
    void givenCustomerWithInsufficientBalance_whenWithdraw_thenFail() {
        // Arrange
        customer.setBalance(500);

        //Act
        String result = accountManager.withdraw(customer, 600);

        //Assert
        assertThat(result).isEqualTo("insufficient account balance");
    }

    @Test
    void givenCustomerWithInsufficientBalanceAndCreditAllowed_whenWithdraw_thenSucceed() {
        // Arrange
        customer.setBalance(500);
        customer.setCreditAllowed(true);

        //Act
        String result = accountManager.withdraw(customer, 600);

        //Assert
        assertThat(result).isEqualTo("success");
    }

    @Test
    void givenCustomerWithInsufficientBalanceAndCreditAllowedAndExpectedBalanceBiggerThanMaxCredit_whenWithdraw_thenFail() {
        // Arrange
        customer.setBalance(500);
        customer.setCreditAllowed(true);

        //Act
        String result = accountManager.withdraw(customer, 2000);

        //Assert
        assertThat(result).isEqualTo("maximum credit exceeded");
    }

    @Test
    void givenVipCustomerWithInsufficientBalanceAndCreditAllowedAndExpectedBalanceBiggerThanMaxCredit_whenWithdraw_thenSucceed() {
        // Arrange
        customer.setBalance(500);
        customer.setCreditAllowed(true);
        customer.setVip(true);

        //Act
        String result = accountManager.withdraw(customer, 2000);

        //Assert
        assertThat(result).isEqualTo("success");
    }


}
