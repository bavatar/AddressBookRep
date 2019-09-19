package company.com;

public class Main {
    public static void main(String[] args) {
        // Address(String name, String address, String city, String state, String zip, String phone, String email
        Address address = new Address("Bob", "36 Wayout Rd", "Tinbuktu", "NV",
                "20877", "434-365-8992", "testy@hotmail.com");
        System.out.println(address.displayAddress());
        address.setEmail("testyhotmail.com");
        System.out.println(address.displayAddress());
    }
}
