public class Client{
    private String name;
    private int payments;

    public Client(String name){
        this.name=name;
        this.payments=0;
    }

    public String getName(){
        return this.name;
    }

    public int getPayments(){
        return this.payments;
    }

    public void Add(){
        if(this.payments<10){
            this.payments++;
        }else{
            this.payments=0;
        }
    }
}