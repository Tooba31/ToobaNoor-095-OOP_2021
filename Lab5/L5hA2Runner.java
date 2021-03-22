package com.company;

public class L5hA2Runner {
    public static void main(String [] args) {
        Book book1 = new Book();
        book1.setAuthor("Nimra Ahmed");
        book1.setChapterNames(new String[] {"Haalim", "Namal"});
        Book book2 = new Book("Umera Ahmed", new  String[] {"Aks", "Aab-e-Hayat",});
        Book book3 = new Book();
        System.out.println("Does 2 books have same authors  " + book3.compareBooks(book1,book2));
        System.out.println("The book which has more number of chapters is " + book3.compareChapterNames(book1,book2));

    }
}
