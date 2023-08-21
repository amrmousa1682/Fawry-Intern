package org.example.store;

import org.example.account.AccountManager;
import org.example.account.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StoreTest {
    AccountManager accountManager = mock(AccountManager.class);
    Store store = new MyStore(accountManager);
    Customer customer = new Customer();
    Product product = new Product();

    @Test
    void givenOutOfStockProduct_whenBuy_thenThrowException() {
        // Arrange

        // Act
        Throwable thrown = catchThrowable(() -> {
            store.buy(product, customer);
        });

        // Assert
        assertThat(thrown).isInstanceOf(Exception.class).hasMessage("Product out of stock");
    }

    @Test
    void givenCustomerInsufficientAccountBalanceWith_whenBuy_thenThrowException() {
        // Arrange
        product.setQuantity(10);
        when(accountManager.withdraw(anyObject(), anyInt())).thenReturn("insufficient account balance");

        // Act
        Throwable thrown = catchThrowable(() -> {
            store.buy(product, customer);
        });

        // Assert
        assertThat(thrown).isInstanceOf(Exception.class).hasMessage("Payment failure: insufficient account balance");
    }

    @Test
    void testBuyPaymentSuccess() {
        // Arrange
        product.setQuantity(10);
        when(accountManager.withdraw(anyObject(), anyInt())).thenReturn("success");

        // Act
        store.buy(product, customer);

        // Assert
        assertThat(product.getQuantity()).isEqualTo(9);
    }
}
