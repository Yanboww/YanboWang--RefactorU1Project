public class TipCalculator {
    private int tip;
    private double bill;
    private int numP;


    public TipCalculator(int tip, double bill,int numP)
    {
        this.tip = tip;
        this.bill = bill;
        this.numP = numP;
    }


    public double getTotalTip()
    {
        double totalTip = bill * ((double)tip/100);
        return totalTip;
    }

    public double getTotalBill(double totalTip)
    {
        double totalBill = bill + totalTip;
        return totalBill;
    }

    public double getTipPerPerson(double totalTip)
    {
        double tipPer = totalTip / numP;
        return tipPer;
    }

    public double totalPerPerson(double totalTip)
    {
        double billPer = (totalTip + bill) / numP;
        return billPer;
    }


}
