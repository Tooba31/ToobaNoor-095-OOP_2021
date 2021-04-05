package com.company;

public class Count_NumberOfObjects {
//count the number of objects created and destroyed for a class
// using static data members and static member functions.

    private static int NumberOfObjects;

    public static int NumberOfObjects_Created(){
        return NumberOfObjects;
    }
    public static int NumberOfObjects_Destroyed(){
        return NumberOfObjects--;
    }
    public Count_NumberOfObjects(){
        NumberOfObjects++;
    }
}

