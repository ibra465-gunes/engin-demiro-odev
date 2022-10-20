package odev.interfaces;

public class Main {
    public static void main(String[] args) {
        CustumerManager custumerManager = new CustumerManager(new SqlServerCustomerDal());
        custumerManager.add();
    }
}
