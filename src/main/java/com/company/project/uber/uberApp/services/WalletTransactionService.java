package com.company.project.uber.uberApp.services;

import com.company.project.uber.uberApp.dto.WalletTransactionDto;
import com.company.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}
