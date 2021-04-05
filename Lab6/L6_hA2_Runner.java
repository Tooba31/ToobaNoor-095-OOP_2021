package com.company;

public class L6_hA2_Runner {
    public static void main(String[] args) {
        Count_NumberOfObjects object1 = new Count_NumberOfObjects();
        Count_NumberOfObjects object2 = new Count_NumberOfObjects();
        Count_NumberOfObjects object3 = new Count_NumberOfObjects();
        Count_NumberOfObjects object4 = new Count_NumberOfObjects();
        Count_NumberOfObjects object5 = new Count_NumberOfObjects();

        System.out.println("The total number of objects created is " + Count_NumberOfObjects.NumberOfObjects_Created());
        object1.NumberOfObjects_Destroyed();
        object4.NumberOfObjects_Destroyed();

        System.out.println("The total number of objects destroyed is " + Count_NumberOfObjects.NumberOfObjects_Destroyed());
    }
}
