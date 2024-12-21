package tms.lesson9.cards;

public class MasterCard extends Card {

    @Override
    public Integer getBalance() {
        System.out.println("go to master card");
        return 10;
    }
}
