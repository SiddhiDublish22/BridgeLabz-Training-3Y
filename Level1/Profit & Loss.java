public class ProfitLoss {
    public static void main(String[] args) {
        double cp = 129, sp = 191;
        double profit = sp - cp;
        double profitPercent = (profit / cp) * 100;
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
