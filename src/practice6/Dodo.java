package practice6;

import java.util.Vector;

public class Dodo {
    private Dodo(){}

    static Vector<Eat> allClients = new Vector<Eat>();

    static void pizzaParty(){
        for (Eat client: allClients){
            if (client instanceof CanHavePizza pizzaClient){
                client.eat();
            } else{
                System.out.println(client.getClass().getName().substring(10) + " is cant have a pizza :(");
            }
        }
    }

    static void addClient(Eat client){
        allClients.add(client);
    }
}
