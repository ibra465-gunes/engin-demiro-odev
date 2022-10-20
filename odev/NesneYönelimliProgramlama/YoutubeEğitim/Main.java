package odev.NesneYönelimliProgramlama.YoutubeEğitim;

public class Main {
    public static void main(String[] args) {
        /*
         * int sayi1=10;
         * int sayi2=20;
         * sayi1=sayi2;
         * sayi2=100;
         * System.out.println(sayi1);
         * int[] sayilar1 ={1,2,3};
         * int[] sayilar2= {10,20,30};
         * sayilar1=sayilar2;
         * sayilar2[0]=1000;
         * System.out.println(sayilar1[0]);
         */
        /*
         * CreditManager creditManager = new CreditManager();
         * creditManager.calculate();
         * Customer customer = new Customer();
         * customer.id=1;
         * customer.city="Samsun";
         * CustomerManager customerManager = new CustomerManager(customer);
         * customerManager.save();
         * customerManager.delete();
         * Company company = new Company();
         * company.taxNumber="10000";
         * company.companyName="Arçelik";
         * company.id=100;
         * CustomerManager customerManager2=new CustomerManager(new Person());
         * Person person = new Person();
         * person.firstName="Engin";
         * person.nationalIdentity="123456";
         */
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.giveCredit();

    }
}
