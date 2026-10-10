import java.util.ArrayList;

public class RunBank {
    public static void main (String[] args){
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Naira", "Almira"));
        customers.add(new Customer("Evalinda", "Gracia F."));
        customers.add(new Customer(null, null));
        BankAccount akun1 = new BankAccount();
        BankAccount akun2 = new BankAccount();
        BankAccount akun3 = new BankAccount();
       
        customers.get(0).setAccount(akun1);
        customers.get(1).setAccount(akun2);
        customers.get(2).setAccount(akun3);
        customers.add(2, new Customer("Suci","Mustika"));

        customers.get(0).getfirstname();
        customers.get(0).getlastname();
        customers.get(0).getAccount().getnomorrekening();
        customers.get(0).getAccount().tarik(50000);
        System.out.println("=====================================\n");

        
        customers.get(1).getfirstname();
        customers.get(1).getlastname();
        customers.get(1).getAccount().getnomorrekening();
        customers.get(1).getAccount().tarik(50000);
        System.out.println("=====================================\n");

        
        customers.get(2).setAccount(akun3);
        customers.get(2).getfirstname();
        customers.get(2).getlastname();
        customers.get(2).getAccount().getnomorrekening();
        customers.get(2).getAccount().tarik(50000);


    
        


    }
    
}
