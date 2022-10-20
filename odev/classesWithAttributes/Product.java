package odev.classesWithAttributes;

public class Product {
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    // private String _kod;

    public Product(int id, String name, String description, double price, int stockAmount) {
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
        System.out.println("Yapıcı blok çalıştı.");

    }

    /**
     * @return int return the _id
     */
    public int get_id() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void set_id(int id) {
        _id = id;
    }

    /**
     * @return String return the _name
     */
    public String get_name() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void set_name(String name) {
        _name = name;
    }

    /**
     * @return String return the _description
     */
    public String get_description() {
        return _description;
    }

    /**
     * @param _description the _description to set
     */
    public void set_description(String description) {
        _description = description;
    }

    /**
     * @return double return the _price
     */
    public double get_price() {
        return _price;
    }

    /**
     * @param _price the _price to set
     */
    public void set_price(double price) {
        _price = price;
    }

    /**
     * @return int return the _stockAmount
     */
    public int get_stockAmount() {
        return _stockAmount;
    }

    /**
     * @param _stockAmount the _stockAmount to set
     */
    public void set_stockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String get_kod() {
        return _name.substring(0, 1) + _id;
    }

}
