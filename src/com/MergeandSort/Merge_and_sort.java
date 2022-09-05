package com.MergeandSort;

import java.lang.reflect.Array;

public class Merge_and_sort {
    private int[] arr1;
    private int[] arr2;
    private int[] arr3;
    private int[] arr4;
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }




    public int[] getArr4() {
        return arr4;
    }

    public void setArr4(int[] arr4) {
        this.arr4 = arr4;
    }





    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public int[] getArr2() {
        return arr2;
    }

    public void setArr2(int[] arr2) {
        this.arr2 = arr2;
    }

    public int[] getArr3() {
        return arr3;
    }

    public void setArr3(int[] arr3) {
        this.arr3 = arr3;
    }




    public Merge_and_sort(int[] array1,int[] array2, int[] array3 ) {
        this.arr1=array1;
        this.arr2=array2;
        this.arr3=array3;
        this.arr4=new int[arr1.length+arr2.length+arr3.length];
        this.a=0;
    }
    public int[] mergearray(int [] arr5){

        for (int i = 0; i <arr1.length ; i++) {
            arr4[i]=arr1[i];
            //System.out.println(arr4[i]);
        }
        for (int i = arr1.length; i <arr1.length+arr2.length; i++) {
            arr4[i]=arr2[i-arr1.length];
            //System.out.println(arr4[i]);
        }
        for (int i = arr1.length+arr2.length; i < arr1.length+arr2.length+arr3.length; i++) {
            arr4[i]=arr3[i-(arr1.length+arr2.length)];
            //System.out.println(arr4[i]);
        }
        return arr4;

    }



    public void sortarry(){
        arr4=mergearray(arr4);
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]);
            System.out.print(" ");

        }

        System.out.println();


        for (int i = 0; i <arr4.length; i++) {
            for (int j = 1; j < arr4.length; j++) {
                if(arr4[j-1]<arr4[j]){
                    int a=arr4[j-1];
                    arr4[j-1]=arr4[j];
                    arr4[j]=a;
                }

            }


        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]);
            System.out.print(" ");

        }
    }


}
