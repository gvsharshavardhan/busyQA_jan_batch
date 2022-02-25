package com.assignments.assignment2_arrays;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        String[] names = {"java","csharp","python","csharp","go","csharp"};

        for(int i = 0;i<names.length;i++){
            for(int j = i+1;j<names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.println(names[i]);
                    break;
                }
            }
        }
    }
}