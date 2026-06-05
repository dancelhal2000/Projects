package Praktikum14;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(2);

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        System.out.println("--- Langkah 3 ---");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        customers.add(new Customer(4, "Cica"));

        System.out.println("\n--- Langkah 5 ---");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        customers.add(2, new Customer(100, "Rosa"));

        System.out.println("\n--- Langkah 6 & 7 ---");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println("\n--- Langkah 8 ---");
        System.out.println(customers.indexOf(customer2));
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println("\n--- Langkah 9 ---");
        System.out.println(customers.indexOf(customer2));
        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));

        customers.addAll(newCustomers);

        System.out.println("\n--- Langkah 11 ---");
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println("\n--- Langkah 12 ---");
        System.out.println(customers);
    }
}
