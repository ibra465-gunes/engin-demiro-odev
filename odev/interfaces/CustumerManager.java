package odev.interfaces;

public class CustumerManager {
    ICustomerDal customerDal;

    public CustumerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.Add();
    }
}
