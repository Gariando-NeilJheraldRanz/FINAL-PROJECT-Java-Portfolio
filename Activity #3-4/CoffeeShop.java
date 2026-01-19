public class CoffeeShop {
    public static void main(String[] args) {
       
        Customer c1 = new Customer("Joseph", 200);
        Customer c2 = new Customer("Peter");
        Customer c3 = new Customer();
        
        c2.addPoints(200);  
        c2.addPoints(20);   

        System.out.println("\n--- Reward Redemption ---");
        c1.redeemReward();
        c2.redeemReward();
        c3.redeemReward();

        System.out.println("\n--- Customer Information ---");
        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
        c3.displayCustomerInfo();
        Customer.displayTotalCustomers();

        System.out.println("\n--- New Customer ---");
        Customer c4 = new Customer("Diane");
        c4.addPoints(50);
        Customer.displayTotalCustomers();

        System.out.println("\n--- Allowed Rewards Redemption ---");
        Customer.getAllowedRewardsRedemption(c1);
        Customer.getAllowedRewardsRedemption(c2);
        Customer.getAllowedRewardsRedemption(c3);
        Customer.getAllowedRewardsRedemption(c4);
    }
}