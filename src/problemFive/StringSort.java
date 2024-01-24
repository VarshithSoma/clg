package problemFive;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        String[] names=new String[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the names");
        for (int i = 0; i < 5; i++) {
            names[i]= in.nextLine();
        }
        int size= names.length;
        System.out.println(size);
        System.out.println("Before Sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < size; i++) {
            for (int j=i+1;j<size;j++){
                if(names[i].compareTo(names[j])>0){
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.println("After Sorting");
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);

        }
    }
}
