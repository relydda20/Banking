import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customer;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
        this.numberOfCustomers = 0;
        this.customer = new ArrayList<Customer>();
    }

    public void addCustomer(String f, String l){
        this.numberOfCustomers += 1;
        Customer nCustomer = new Customer(f, l);
        customer.add(nCustomer);
    }

    public int getNumOfCustomers(){
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customer.get(index);
    }

    public String getBankName() {
        return bankName;
    }

}