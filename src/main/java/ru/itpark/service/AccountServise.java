package ru.itpark.service;

import ru.itpark.domain.Account;
import ru.itpark.repository.AccountRepository;

public class AccountServise {

    private AccountRepository repocitory;

    public AccountServise(AccountRepository repocitory) {
        this.repocitory = repocitory;
    }

    public void transter(
            int senderID,
            int recipiendId,
            int amount) {


        Account sender = repocitory.findById(senderID);
        if (sender == null) {

        }

        if (sender.getBalance() < amount) {

        }

        Account recipient = repocitory.findById (repocitory)
                if (repository ==  null) {

                }

                sender.setBalance(sender.getBalance()-amount);
                recipient.setBalance(recipient.getBalance()+amount);

                repocitory.update (sender);
                repocitory.update(recipient);

    }
}
