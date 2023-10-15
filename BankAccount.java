  class BankAccount {
        
     private String name;
     private int age;
     private long accountNumber;
     private double balance;
     
     public String getName() {
     return name;
     }
      public void setName(String name) {
     this.name=name;

     }
       public int getAge() {
     return age;
     }
      public void setAge(int age){
          this.age=age;
      
     }
       public long getAccountNumber() {
     return accountNumber;
     }
      public void setAccountNumber(long accountNumber) {
     this.accountNumber=accountNumber;
 
     }
       public double getBalance() {
     return balance;
     }
      public void setbalance(double Balance) {
     this.balance=0.00;
     }
      public void deposit(double amount) {
          if(amount>0){
     balance+=amount;
     
     System.out.println("Deposited ₱ " + amount);
     }
        
      }  
    public void displaySummary(){
        
   
  
        System.out.println("\nAccount Summary");
          System.out.println("-------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₱ " + balance);
         System.out.println("-------------------------------------------");
      }
  }
  class Main {
    public static void main(String[] args) {


        BankAccount a=new BankAccount();
   a.setName("Angel Justine Ballaso");
   a.setAge(19);
   a.setAccountNumber(20221742);
   a.deposit(20000.0);
   a.deposit(50000.0);
   a.displaySummary();
        
   
    }
} 
  
          