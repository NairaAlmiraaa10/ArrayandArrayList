public class Customer {
    private String firstname, lastname;
    private BankAccount account;

    public Customer(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public BankAccount getAccount(){
        return account;
    } 
    public void setAccount ( BankAccount account){
        this.account = account;
    }
    public String getfirstname(){
        System.out.println("Nama Depan: " + firstname);
        return firstname;
    }
    public String getlastname(){
        System.out.println("Nama Belakang: " + lastname);
        return lastname;
    }  


}
