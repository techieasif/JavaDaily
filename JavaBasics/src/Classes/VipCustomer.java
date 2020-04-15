package Classes;

/**
 * Created by @techieasif on February, 2020
 */
public class VipCustomer {
    private String vipCustomerName;
    private double vipCustomerCreditLimit;
    private String vipCustomerEmailAddress;

    public VipCustomer(){
        this("Ajay",  56000,"Ajay@ajay.com");
    }

    public VipCustomer(String vipCustomerName, double vipCustomerCreditLimit) {
        this(vipCustomerName, vipCustomerCreditLimit, "vip@unknown");
    }

    public VipCustomer(String vipCustomerName, double vipCustomerCreditLimit, String vipCustomerEmailAddress){
        this.vipCustomerCreditLimit = vipCustomerCreditLimit;
        this.vipCustomerEmailAddress = vipCustomerEmailAddress;
        this.vipCustomerName = vipCustomerName;
    }



    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public double getVipCustomerCreditLimit() {
        return vipCustomerCreditLimit;
    }

    public String getVipCustomerEmailAddress() {
        return vipCustomerEmailAddress;
    }
}
