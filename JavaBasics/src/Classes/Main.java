package Classes;

/**
 * Created by @techieasif on February, 2020
 */
public class Main {
    public static void main(String[] args) {
        VipCustomer vip1 = new VipCustomer(); // default
        System.out.println("Default " + vip1.getVipCustomerName() +" "+ vip1.getVipCustomerEmailAddress());

        VipCustomer vip2 = new VipCustomer("AMit", 90000); //parameterized
        System.out.println("2 param " + vip2.getVipCustomerName() +" "+vip2.getVipCustomerEmailAddress());

        VipCustomer vip3 = new VipCustomer("Nazim", 67000, "naz@naz.com"); //parameterized
        System.out.println("3 param " + vip3.getVipCustomerName() +" "+vip3.getVipCustomerEmailAddress());

    }

}
