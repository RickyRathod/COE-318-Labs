/* Ricky Rathod */
package coe318.lab4;

public class Bank {
    private String name;
    
    private Account [] accounts;
    private int numAccounts;
    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }
   
    public String getName() {
        return this.name;
    }

    public int getNumAccounts() {
        return this.numAccounts;
    }

    public Account[] getAccounts() {
        return this.accounts;
    }

    public boolean hasAccountNumber(int accountNumber) {
        for(int i = 0; i < this.accounts.length; i++) {
            Account account = accounts[i];
           if(account != null){
               if (account.getNumber() == accountNumber) {
                   return true;
               }
           }
        }
        return false;
    }

    public boolean add(Account account) {
        if(this.hasAccountNumber(account.getNumber())){    
           return false;
        }else {
            this.accounts[numAccounts] = account;             // takes the array and fills in the null since it has reached its maximun number of "spaces"
            this.numAccounts++;
            return true;
        }
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }

}
