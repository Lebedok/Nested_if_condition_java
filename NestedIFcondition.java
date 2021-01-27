package NestedIfCondition;


import java.util.Scanner;

public class NestedIFcondition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you know java?");
        String java = input.next();
        if (java.equals("yes")) {
            System.out.println("Do you know Selenium?");
            String selenium = input.next();
            if (selenium.equals("yes")) {
                System.out.println("Do you know api testing?");
                String api = input.next();
                if (api.equals("yes")) {
                    System.out.println("Do you know sql?");
                    String sql = input.next();
                    if (sql.equals("yes")) {
                        System.out.println("You hired");
                    } else {
                        System.out.println("We require sql");
                    }
                } else {
                    System.out.println("We require api testing.");
                }
            } else {
                System.out.println("We require selenium");


            }
        }
    }
}

