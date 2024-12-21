package tms.lesson9.cards;

public class MainApp {

    public static void main(String[] args) {

        Card myCard = new Card() {

            @Override
            public Integer getBalance() {
                return 999;
            }

        };

        System.out.println(myCard.getBalance());

        BalanceService myBalanceService = () -> 5;

    }

}
