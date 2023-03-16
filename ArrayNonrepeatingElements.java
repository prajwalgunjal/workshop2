package com.bridgelabz;

import java.util.Scanner;

public class ArrayNonrepeatingElements {

    void getelements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("how much element do you want to store in the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int element;
        int k;
        int duplicateelement=0;
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter element ");
            element = sc.nextInt();
            arr[i]=element;
        }

        //distinct elements
        System.out.println("elements in the array :-");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println(" ");

        // printing non repeative elements
        int[] arr2 = new int[size];
        int visit=-1;
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            if(arr2[i]!=visit) {
                for (k = i + 1; k <= arr.length - 1; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                        arr2[k] =visit;
                    }
                }
                arr2[i]= count;
            }
        }
        System.out.println("non repeative element are");
        for(int i=0;i< arr2.length;i++)
        {
            if(arr2[i]==1)
            {
                System.out.println(arr[i]+"");
            }
        }
    }

    public static void main(String[] args) {
        ArrayNonrepeatingElements arrayNonrepeatingElements = new ArrayNonrepeatingElements();
        arrayNonrepeatingElements.getelements();
    }
}
