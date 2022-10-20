package odev.polymorphismDemo;

public class CostumerManager {
    private BaseLogger logger;

    public CostumerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi.");
        this.logger.log("Log mesajı");
    }
}
