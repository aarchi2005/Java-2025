import java.util.ArrayList;
import java.util.Scanner;
class Transaction {
String type;
double amount ;
public Transaction(String type , double amount){
this.type =type;
this.amount =amount;
}
}
class Account {
private String name;
private int accountno;
private double balance;
 public Account(String name ,int accountno, double balance){
 this.accountno=accountno;
 this.name=name;
 this.balance=balance;
}
ArrayList<Transaction> transactions =new ArrayList<>();
public void deposit(double amount ){
   if(amount >0){
  balance +=amount;
  transactions.add(new Transaction("deposit ", amount))
  System.out.println("deposited  successfully "+ amount );
}else {
    System.out.println("invaild deposit amount ");
}
}
 public void  withdraw (double amount ){
    if (amount >0 && amount <=balance) {
        balance =balance - amount ;
        transactions.add(new Transaction("withdaw", amount));
        System.out.println("current balance is :"+amount ); 
    }
    else {
        System.out.println("insufficient balance : ");
    }
    }
    public void viewTransaction(){
        if (transactions.isEmpty()) {
            System.out.println("no transction yet ");
        }
        else {
            for(Transaction t : transactions){
                System.out.println(t);
            }
        }
    }
public void checkbalance (){
    System.out.println("current balance :"+balance);
}
  public class atmcard {
    static Scanner sc = new Scanner(System.in);
    static Account account;

    public static void main(String[] args) {

        System.out.println("enter accont holder name :");
        String name =sc.nextLine();
        Account account =new Account(name, 0, 0);

    }
}
}