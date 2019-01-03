package services;

import model.Transaction;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Transaction, Transaction> {

    public Transaction process(Transaction item) throws Exception {
        System.out.println("Processing..." + item);
        return item;
    }
}
