// program to calculate discount
// NAME: Dorcas Kyeni
//REG NO: S08-8435-2024
import java.util.scanner;
public class Discount{
public static void main(String []args){
Scanner Scanner= new scanner(System.in);
double discount;
System.out.println("Amount purchased:");
double amount=Scanner.nextDouble();
if(amount>5000){
discount=amount*0.1;
}
else if(amount>=1000&& amount<=5000){
discount=0.05*amount;
}
else{
discount=0;
}
double amountTopay=amount-discount;
System.out.println("initial amount"+amount);
System.out.println("discount"+discount);
System.out.println("amount to pay"+amountTopay);
Scanner.close();
}
}
