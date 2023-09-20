package Payroll;
import java.util.Scanner;

public class PayrollComputation {

    public static void main(String[] args) {
        String EmpNo, empName, Date, Designation;
        int days, pay, bpay;
        
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER EMPLOYEE NAME: ");
        empName = input.next();

        System.out.print("ENTER EMPLOYEE DESIGNATION: ");
        Designation = input.next();

        System.out.print("ENTER DAYS WORKED: ");
        days = input.nextInt();

        System.out.print("ENTER PAY RATE: ");
        pay = input.nextInt();

        System.out.print("ENTER PAYROLL GENERATION DATE: ");
        Date = input.next();
        System.out.print("ENTER THE EMPLOYEE NUMBER: ");
        EmpNo = input.next();

        System.out.println("                                                 ");
        System.out.println("                           SHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("                                   SALARY MONTH 9 2013        ");
        System.out.println("EmpNo.: " + EmpNo + "                    " + "EMP.NAME: " + empName + "          " + "DESIGNATION: " + Designation);
        System.out.println("DAYS WORKED: " + days + "                 " + "PAY RATE: " + pay + "          " + "GEN.DATE: " + Date);

        String line = new String(new char[70]).replace('\0', '_');
        System.out.println(line);
        System.out.println("EARNINGS           AMOUNT(Rs.)            DEDUCTIONS      AMOUNT(Rs.)   ");

        bpay = days * pay;
        int pf = bpay / 10;
        int profTax = (int) (0.2 * pf);

        System.out.println(line);
        System.out.println("BASIC PAY          " + bpay + "                  P.F             "+pf);
        System.out.println("                                          PROF.TAX        "+profTax);
        System.out.println(line);

        int totalDeductions = pf + profTax;
        int grossEarn = bpay;
        int netPay = grossEarn - totalDeductions;

        System.out.println("GROSS EARN         " + grossEarn + "                  TOTAL DEDUCT.   "+totalDeductions);
        System.out.println("                                          NET PAY         "+netPay);
        System.out.println(line);

        input.close();
    }
}
