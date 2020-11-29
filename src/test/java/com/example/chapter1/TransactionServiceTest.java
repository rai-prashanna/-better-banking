package com.example.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
public class TransactionServiceTest {

    void setUp() {
//    TransactionService transactionService = new TransactionService();
    }

    @Test
    @DisplayName("return empty trasaction for non-existent account number")
    void test_get_EmptyTransaction_invalid_accountnumber() {
       // assertEquals("Hello", systemUnderTest.hello());

    }
}
