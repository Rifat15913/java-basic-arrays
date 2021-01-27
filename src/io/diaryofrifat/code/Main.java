package io.diaryofrifat.code;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 159;
        intArray[1] = 13;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index: " + i + ", Content: " + intArray[i]);
        }
    }
}
