package com.zzh.manager.domain.repository;

import com.zzh.manager.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}
