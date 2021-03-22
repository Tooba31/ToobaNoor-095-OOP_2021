package com.company;

public class Book {
    private String author;
    private String chapterNames[] = new String[100];
    public Book(){
    }
    public Book(String a, String[] array){
        author = a;
        chapterNames = array;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public void setChapterNames(String[] array) {
        chapterNames = array;
    }
    public String getAuthor(){
        return author;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }
    public boolean compareBooks(Book Book_a, Book Book_b){
        if (Book_a.author != Book_b.author) {
            return false;
        }
        else {
            return true;
        }
    }
    public int compareChapterNames(Book Book_a, Book Book_b) {
        if (Book_a.chapterNames.length > Book_b.chapterNames.length){
            System.out.println("Book Author with greater number of chapters is " + Book_a.getAuthor());
            return Book_a.chapterNames.length;
        }
        else {
            System.out.println("Book Author with greater number of chapters is " + Book_b.getAuthor());
            return Book_b.chapterNames.length;
        }
    }
}
