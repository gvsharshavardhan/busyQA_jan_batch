package com.assignments.assignment2_strings;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String withWhitespaces = " hi     skdbcksdb  sjdvnjksdn   sdlkvnkjsdnvkjsndkvn  ";
        String without = withWhitespaces.replaceAll("\\s+","");
        System.out.println(without);


    }
}
