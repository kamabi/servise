package ru.itpark.repository;

import ru.itpark.domain.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private List<Account> accounts = new ArrayList<Account>();
    private int nextId = 1;

    public Account add(Account account) {
        account.setId(nextId++);
        accounts.add(account);
        return account;
    }

    public Account update(Account account) {
        throw new UnsupportedOperationException();

    }

    public Account findByld(int id) {
        for(Account account : )
    }

}

