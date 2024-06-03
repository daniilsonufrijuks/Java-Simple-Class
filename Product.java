public class Product {

    public String Name;
    public String Description;
    public double Price;
    public boolean InStock;

    // --------------------------------------------

    public Product(String NewName, String NewDescription, Double NewPrice, boolean NewInStock) {
        Name = NewName;
        Description = NewDescription;
        Price = NewPrice;
        InStock = NewInStock;
    }

    public Product() {}

    // --------------------------------------------

    public void SetName(String NewName) {
        Name = NewName;
    }

    public void SetDescription(String NewDescription) {
        Description = NewDescription;
    }

    public void SetPrice(Double NewPrice) {
        Price = NewPrice;
    }

    public void SetInStock(boolean NewInStock) {
        InStock = NewInStock;
    }

    // --------------------------------------------

    public String GetName() {
        return Name;
    }

    public String GetDescription() {
        return Description;
    }

    public Double GetPrice() {
        return Price;
    }

    public boolean GetInStock() {
        return InStock;
    }

    // --------------------------------------------

    public String ProductLevel(double Price) {
        if (Price >= 100) {
            return "expensive";
        } else if (Price >= 50) {
            return "moderate";
        } else {
            return "cheap";
        }
    }

    public boolean CheckDescription(String Description) {
        if (Description.length() > 50) {
            return true;
        } else {
            return false;
        }
    }

    public String Print() {
        return "Name: " + GetName() + "\nDescription: " + GetDescription() + "\nPrice: " + GetPrice() + "\nIn Stock: " + GetInStock();
    }
}