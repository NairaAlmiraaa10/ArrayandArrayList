 public class BankAccount {
    private int saldo;
    private int nomorrekening;
    private static int nextnorek = 1000 ;
   static final int jumlahpengguna = 100;
   static int index = 0;
    public BankAccount (){
        this.nomorrekening = nextnorek;
        nextnorek++;
        
    }
    public int getnomorrekening(){
       System.out.println("Nomor Rekening: " + nomorrekening);
       return nomorrekening;
    }
    public void deposit (int depo){
        saldo += depo;
    }
    public void tarik (int narik){
        if (saldo < narik){
             System.out.println ("JUMLAH TARIKAN: Rp "+narik);
            System.out.println ("Saldo Tidak Cukup!");
            System.out.println ("Saldo: Rp "+saldo);
        }
        else { 

            saldo -= narik;
            System.out.println ("JUMLAH TARIKAN: Rp "+narik);
            System.out.println ("Saldo: Rp "+saldo);
    
        } 
    }
        
    
 
 }