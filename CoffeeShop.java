public class CoffeeShop{
    public static void main( String[] args){
        Client client1=new Client("Alexia");
        Product product1=new Product("Cappuccino", 15);
        double finalPrice;
        for(int i=1;i<=12;i++){
            if(client1.getPayments()==10){
                finalPrice=0;
            }else if(client1.getPayments()==5){
                finalPrice=product1.getPrice()-(product1.getPrice()*0.3); //reducere de 30%
            }else{
                finalPrice=product1.getPrice();
            }
            client1.Add();
            System.out.println("La vizita "+i+" pretul final este de: "+ finalPrice+" lei");
        }
    }

}