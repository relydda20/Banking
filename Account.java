public class Account {
    private double balance;

    public Account (double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean deposit (double amt) {
        if (amt > 0) {
            this.balance += amt;
            return true;
    
        } else {
            return false;

        }
    }

    public boolean withdraw (double amt) {
        if (amt <= balance) {
            balance -= amt;
        
        } else {
            return false;
        }
        return true;
    }
}


