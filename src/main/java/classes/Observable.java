package classes;

import java.util.ArrayList;

public class Observable {

    private static Observable instance;
    private ArrayList<Observer> observersList;
    private boolean marketUp;

    private Observable(){
        observersList = new ArrayList<>();
    }

    public static Observable getInstance(){
        if(instance == null){
            instance = new Observable();
        }
        return instance;
    }

    public void addObserver(Observer name){
        observersList.add(name);
    }

    public void removeObserver(Observer name){
        observersList.remove(name);
    }

    public void setMarketUp(boolean marketUp){
        this.marketUp = marketUp;
    }

    public boolean getMarketUp() {
        return marketUp;
    }

    public void notification(){
        if (getMarketUp() == true){
            for (int i = 0; i < observersList.size(); i++) {
                System.out.println(observersList.get(i).getName() + " The market is up! Time to buy stocks!");
            }
        } else {
            for (int i = 0; i < observersList.size(); i++) {
                System.out.println(observersList.get(i).getName() + " The market is down! Time to sell stocks!");
            }
        }
    }
}