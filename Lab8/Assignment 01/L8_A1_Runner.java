package com.company;
import java.util.Scanner;

public class L8_A1_Runner {
        public static void main(String[] args) {
            int selection;
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to The Publication");
            String[] s = {"If you are looking for books then Press 1,", "If you are looking for any audio tape then Press 2,",
                    "If you want to return to main menu then Press 0."};
            System.out.println("Choose an option\n" + s[0] + s[1] + s[2]);
            selection = input.nextInt();
            while (selection >= 1 && selection < s.length) {

                if (selection== 1) {
                    System.out.println("Please enter the book title, book price and book page count:");
                    Book b1 = new Book(input.next(), input.nextDouble(), input.nextInt());
                    b1.display();
                }
                else if (selection == 2) {
                    System.out.println("Please enter the audio tape title, tape price and tape's play time:");
                    Tape t1 = new Tape(input.next(), input.nextDouble(), input.next());
                    t1.display();
                }
                else if(selection == 0) {
                    System.out.println("Welcome to The Publication.");
                }
                System.out.println(s[0] + s[1] + s[2]);
                selection = input.nextInt();
            }
        }
}
