package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement{
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        System.out.println("=== Customer Management System ===");
        System.out.println("1) Add Customer");
        System.out.println("2) Update Customer");
        System.out.println("3) Display All");
        System.out.println("4) Exit");

        while (true) {
            System.out.println("Please pick an option 1-4");
            int input;
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();

            int costumerId;
            String name;
            String email;
            int phoneNumber;

            if (input == 1) {
                Customer c = new Customer();
                System.out.println("Enter customer Id: ");
                costumerId = sc.nextInt();
                c.setCostumerId(costumerId);

                System.out.println("Enter customer phone number: ");
                phoneNumber = sc.nextInt();
                c.setPhoneNumber(phoneNumber);
                System.out.println("Enter customer name: ");
                name = sc.next();
                c.setName(name);
                System.out.println("Enter customer Email: ");
                email = sc.next();
                c.setEmail(email);
                customers.add(c);
            } else if (input == 2) {
                System.out.println("Please enter customer Id you'd like to look for: ");
                costumerId = sc.nextInt();
                for (Customer c : customers) {
                    if (c.getCostumerId() == costumerId) {
                        System.out.println("Please enter new information:");
                        System.out.println("Enter customer Id: ");
                        costumerId = sc.nextInt();
                        c.setCostumerId(costumerId);

                        System.out.println("Enter customer phone number: ");
                        phoneNumber = sc.nextInt();
                        c.setPhoneNumber(phoneNumber);
                        System.out.println("Enter customer name: ");
                        name = sc.next();
                        c.setName(name);
                        System.out.println("Enter customer Email: ");
                        email = sc.next();
                        c.setEmail(email);
                    }
                    else{
                        System.out.println("Customer not found");
                    }
                }
            } else if (input == 3) {
                for (Customer c : customers) {
                    System.out.println("Id : " + c.getCostumerId() + " Name: " + c.getName() + " Email: " + c.getEmail() + " Phone Number: " + c.getPhoneNumber());
                }
            } else if (input == 4) {
                System.out.println("Exiting programme.");
                break;
            }

        }
    }
}