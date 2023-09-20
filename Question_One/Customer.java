import java.util.ArrayList;
import java.util.List;

class Shop {
    public String name;
    public String location;
    public List<Item> items;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void sellItemToCustomer(Item item, Customer customer) {
        this.items.remove(item);
        customer.buyItemFromShop(item, this);
    }

    public void display() {
        System.out.println("Shop Name: " + this.name);
        System.out.println("Shop Location: " + this.location);
        System.out.println("Items:");
        for (Item item : this.items) {
            item.display();
        }
    }
}

class Item {
    public String name;
    public int itemId;
    public double quantity;
    
    public Item(String name, int itemId, double quantity) {
        this.name = name;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Item Name: " + this.name);
        System.out.println("Item ID: " + this.itemId);
        System.out.println("Item Quantity: " + this.quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Item item = (Item) obj;
        return itemId == item.itemId;
    }
}

public class Customer {
    private String name;
    private String phn_no;
    private String gender;
    private int customerId;
    private List<Item> inventory;

    public Customer(String name, String phn_no, String gender, int customerId) {
        this.name = name;
        this.phn_no = phn_no;
        this.gender = gender;
        this.customerId = customerId;
        this.inventory = new ArrayList<>();
    }

    public void buyItemFromShop(Item item, Shop shop) {
        Item customerItem = new Item(item.name, item.itemId, 1);
        this.addItemToInventory(customerItem);
        shop.removeItem(item);
    }

    public void addItemToInventory(Item item) {
        this.inventory.add(item);
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer Phone Number: " + this.phn_no);
        System.out.println("Customer Gender: " + this.gender);
        System.out.println("Customer ID: " + this.customerId);
        System.out.println("Customer Inventory:");
        for (Item item : this.inventory) {
            item.display();
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop("SuperMart", "123 Main Street");

        Item item1 = new Item("Item1", 101, 50);
        Item item2 = new Item("Item2", 102, 30);
        // shop.display();
        shop.addItem(item1);
        shop.addItem(item2);

        Customer customer = new Customer("John Doe", "123-456-7890", "Male", 1);
        shop.display();
        System.out.println("-------------------------------------");
        shop.sellItemToCustomer(item1, customer);

        customer.display();
        System.out.println("-------------------------------------");
        shop.display();
    }
}
