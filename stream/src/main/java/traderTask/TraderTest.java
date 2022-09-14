package traderTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class TraderTest {
    public static void main(String[] args) {
        Trader raoul=new Trader("Raoul","Cambridge");
        Trader mario= new Trader("Mario","Milan");
        Trader alan= new Trader("ALan","Cambridge");
        Trader brian= new Trader("Brian","Cambridge");
        List<Trader> traderlist= new ArrayList<>();
        traderlist.add(raoul);
        traderlist.add(mario);
        traderlist.add(alan);
        traderlist.add(brian);
        System.out.println(traderlist);
        List<Transaction> transactions= Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );
        transactions.stream().

                sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("================================");


        System.out.println("================================");

    }
}
