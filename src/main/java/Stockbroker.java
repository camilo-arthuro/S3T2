import classes.Observable;
import classes.Observer;

public class Stockbroker {

    public static void runProgram(){
        Observable agent = Observable.getInstance();

        //Observers
        Observer client1 = new Observer("Camilo");
        Observer client2 = new Observer("Adrian");
        Observer client3 = new Observer("Carlos");
        Observer client4 = new Observer("Barbara");
        Observer client5 = new Observer("Ivan");

        //Adding observers to the ArrayList
        agent.addObserver(client1);
        agent.addObserver(client2);
        agent.addObserver(client3);
        agent.addObserver(client4);
        agent.addObserver(client5);

        //MarketUp
        agent.setMarketUp(true);

        //MarketUp notification
        agent.notification();

        //Remove observers
        agent.removeObserver(client1);

        System.out.println();

        //MarketDown
        agent.setMarketUp(false);

        //MarketDown notification
        agent.notification();
    }
}
