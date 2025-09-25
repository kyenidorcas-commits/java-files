// program to compute library fine calculation
// NAME: DORCAS KYENI
// REG NO: S08-8435-2024
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeformatter;
import java.time.temporal.ChronoUnit;

public class LibraryFineCalculation{
public static void main(String[]args){
Scanner=new Scanner(Systemsystem.in);
DateTimeformatter=DateTimeformatter.ofPattern("yyyy-mm-dd");

//Input
System.out.print("Enter book ID");
String bookID= scanner.nextLine();

System.out.print("Enter Due Date(yyyy-mm-dd):");
String DueDateStr=scanner.nextLine();
LocalDate dueDate= LocalDate.parse(dueDateStr, formatter);

System.out.print("Enter Return Date(yyyy-mm-dd):");
String returnDateStr=  scanner.nextLine();
LocalDate returnDate=  LocalDate.parse(returnDateStr, formatter);


//Calculate days overdue
long daysOverdue= ChronoUnit.DAYS.between (dueDate, returnDate);

int fineRate= 0;
long fineAmount=0;

if (dayOverdue>0{// only charge if overdue
if(dayOverdue<=7){
fineRate=20;
}else if(daysOverdue<=14){
fineRate=50;
}else{
fineRate=100;
}
fineAmount= fineRate*daysOverdue;
}

//Output
System.out.println("/n-Library Fine Details-");
System.out.println("Book ID:"+bookID);
System.out.println("Due Date:"+dueDATE);
System.out.println("Return Date:"+ returnDate);
System.out.println("Days Overdue:"+ daysOverdue);
System.out.println("Fine Rate ( per day):Ksh."+fineRate):
System.out.println("Total Fine Amount:Ksh."+ fineAmount);

scanner.close();
}
}
