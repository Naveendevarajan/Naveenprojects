package taskUsingnumbers;
import java.util.Scanner;
public class Mainvisa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter bank name you wanted withdraw: ");
        String bankname=scanner.nextLine();
        if(bankname.equalsIgnoreCase("UNIONBANK")) {
            unionBank unionBank = new unionBank();
            System.out.println("Enter union bank card number :");
            String unionbankcardnumber = scanner.nextLine();
            System.out.println("Enter union bank pin number :");
            int unionbankcardpin = scanner.nextInt();
            System.out.println("Enter withdraw amount :");
            double withdrawamount = scanner.nextInt();
            unionBank.withdrawprocess(unionbankcardnumber, unionbankcardpin, withdrawamount);
        } else if (bankname.equalsIgnoreCase("HDFC")) {
            HDFC hdfcbank = new HDFC();
            System.out.println("Enter HDFC bank card number :");
            String hdfcbankcardnumber = scanner.nextLine();
            System.out.println("Enter HDFC bank pin number :");
            int hdfcbankcardpin = scanner.nextInt();
            System.out.println("Enter withdraw amount :");
            double withdrawamount = scanner.nextInt();
            hdfcbank.withdrawprocess(hdfcbankcardnumber,hdfcbankcardpin,withdrawamount);
        }
        else if (bankname.equalsIgnoreCase("HDFC")){
            stateBankOfIndia stateBankOfIndia=new stateBankOfIndia();
            System.out.println("Enter HDFC bank card number :");
            String statebankofindiacardnumber = scanner.nextLine();
            System.out.println("Enter HDFC bank pin number :");
            int statebankofindiacardpin = scanner.nextInt();
            System.out.println("Enter withdraw amount :");
            double withdrawamount = scanner.nextInt();
            stateBankOfIndia.withdrawprocess(statebankofindiacardnumber, statebankofindiacardpin,withdrawamount);
        }
        else
            System.out.println("Enter the correct Bank Number");


    }


}
