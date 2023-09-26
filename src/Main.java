import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String decoration = "--------------------------------";
        //asks for user input and detects/stores through scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Bill($): ");
        String transBill = s.nextLine();
        double bill = Double.parseDouble(transBill);
        System.out.print("Tip Percent: ");
        String transTip = s.nextLine();
        int tip  = Integer.parseInt(transTip);
        System.out.print("Number of People: ");
        String transNumP = s.nextLine();
        int numP = Integer.parseInt(transNumP);
        //no longer need scanner
        s.close();
        TipCalculator t = new TipCalculator(tip, bill, numP);
        double totalTip = t.getTotalTip();
        double totalBill = t.getTotalBill(totalTip);
        double tipPer = t.getTipPerPerson(totalTip);
        double billPer = t.totalPerPerson(totalTip);
        System.out.println(decoration);
        System.out.printf("|Total Tip Amount: $" +"%.2f",totalTip);
        System.out.println("       |");
        System.out.println(decoration);
        System.out.printf("|Total bill cost: $" + "%.2f",totalBill);
        System.out.println("       |");
        System.out.println(decoration);
        System.out.printf("|Tip per person: $" + "%.2f", tipPer);
        System.out.println("         |");
        System.out.println(decoration);
        System.out.printf("|Total bill per person: $" + "%.2f", billPer );
        System.out.println("  |");
        System.out.println(decoration);


    }
}