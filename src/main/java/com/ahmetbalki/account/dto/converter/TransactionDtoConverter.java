package com.ahmetbalki.account.dto.converter;

import com.ahmetbalki.account.dto.TransactionDto;
import com.ahmetbalki.account.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {
    public TransactionDto convert(Transaction from) {
        return new TransactionDto(from.getId(),
                from.getTransactionType(),
                from.getAmount(),
                from.getTransactionDate());
    }
}
