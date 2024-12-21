package tms.lesson9.cards;

public abstract class Card implements BalanceService {

    private String cardHolderName;

    public String getCardNumber() {
        return "1234-5678";
    }

}
