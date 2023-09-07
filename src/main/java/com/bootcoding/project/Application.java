package com.bootcoding.project;

import com.bootcoding.project.model.Customer;
import com.bootcoding.project.model.Order;
import com.bootcoding.project.model.Vendor;

import java.util.Date;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Project!");

        Customer ramesh = new Customer();
        ramesh.setName("Ramesh Biscuitwala");

        Customer suresh = new Customer();
        suresh.setName("Suresh Batliwala");

        Vendor haldiram = new Vendor();
        haldiram.setVeg(true);
        haldiram.setName("Haldiram Food Cafe");
        haldiram.setAddress("Jagannade Square, Nandanwan, Nagpur");
        haldiram.setContact(8889798);
        haldiram.setId(1);


        Order order = new Order();
        order.setOrderDate(new Date());
        order.setAmount(500.50);
        order.setDeliveryAddress("KDKCE, CSE Department, " +
                "Lab-200 at evening 6 pm");
        order.setContact(93847983);

        // Random
        Random random = new Random();


    }
}
