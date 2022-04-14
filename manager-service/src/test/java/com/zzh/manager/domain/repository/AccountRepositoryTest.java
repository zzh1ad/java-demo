package com.zzh.manager.domain.repository;

import com.zzh.manager.core.JpaRepositoryTest;
import com.zzh.manager.domain.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@JpaRepositoryTest
class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void repository_should_successfully_save() {
        var account = new Account("test_username", "test_password");
        var saveAccount = accountRepository.save(account);
        assertThat(saveAccount.getId(),is(notNullValue()));
        assertThat(saveAccount.getUsername(),equalTo(account.getUsername()));
        assertThat(saveAccount.getPassword(),equalTo(account.getPassword()));

    }

}