import java.util.ArrayList;
import java.util.Scanner;
public class CoffeeShop{
    public static void main( String[] args){
         
            ArrayList<Client> clients=new ArrayList<>();
            Scanner scanner=new Scanner(System.in);
            while(true){
                System.out.println("Hi! Do you have a client card?");
                String answear=scanner.nextLine();
                if(answear.equals("Exit")){
                    break;
                }
                if(answear.equals("No")){
                    System.out.println("Do you want to make one?");
                    String yesNo=scanner.nextLine();
                    if(yesNo.equals("No")){
                        System.out.println("Ok. What can I get for you?");
                        String order=scanner.nextLine();
                        System.out.println("Here it is! Have a nice day!");
                    }else if(yesNo.equals("Yes")){
                        System.out.println("What is your name?");
                        String name=scanner.nextLine();
                        Client client=new Client(name);
                        clients.add(client);
                        System.out.println("What can I get for you?");
                        String order=scanner.nextLine();
                        Product product=new Product(order,15);
                        client.Add();
                        System.out.println("Here it is! Your total will be"+ product.getPrice());
                    }
                }else if(answear.equals("Yes")){
                    System.out.println("What is the name on the card?");
                    String name=scanner.nextLine();
                    Client foundClient=null;
                    for(Client c:clients){
                        if(c.getName().equals(name)){
                            foundClient=c;
                            break;
                        }
                    }
                    if (foundClient == null) {
                        System.out.println("Sorry, we couldn't find a card with that name.");
                    } else {
                        System.out.println("What can I get for you?");
                        String order=scanner.nextLine();
                        Product product=new Product(order,11);
                        double finalPrice;
            
                        if(foundClient.getPayments()==10){
                            finalPrice=0;
                        }else if(foundClient.getPayments()==5){
                            finalPrice=product.getPrice()-(product.getPrice()*0.3); //reducere de 30%
                        }else{
                            finalPrice=product.getPrice();
                        }
                        foundClient.Add();
                        System.out.println("Final price for your order is "+finalPrice);      
                    }
                }
            
          

        }
        scanner.close();
    }
}
