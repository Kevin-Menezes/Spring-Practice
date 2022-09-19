package entities;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class Bill {

    private CreditCard card;
    private BigDecimal amount;
    private Currency currency;
    private Date date;

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "card=" + card +
                ", amount=" + amount +
                ", currency=" + currency +
                ", date=" + date +
                '}';
    }
}
