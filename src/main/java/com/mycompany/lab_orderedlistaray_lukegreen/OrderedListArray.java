package com.mycompany.lab_orderedlistaray_lukegreen;

public class OrderedListArray {
    
    private int[] array;
    private int length;

    public OrderedListArray() {
        array = new int[10];
        length = 0;
    }
    
    public OrderedListArray(int[] array) {
        this.array = array;
    }
    
    //put data in array, update count
    public void insertItem(int data) {
        if(length < array.length) {
        array[length] = data;
        length++;
        }
        else {
        System.out.println("ListArray is full.");
        }
    }
    
    //delete value by data value
    public void deleteItem(int target) {
        for(int i  = 0; i < length; i++) {
            if(array[i] == target) {
                array[i] = array[i + 1];
                length--;
            }
        }
    }
    
    public void show() {
        for(int i = 0; i < length; i++) {
        System.out.println(array[i]);
        }
    }
    
    public void copy(OrderedListArray source) {
        
    }
    
    public static void main(String[] args) {
        OrderedListArray q = new OrderedListArray();
        q.insertItem(2);
        q.insertItem(3);
        q.insertItem(4);
        q.show();
        System.out.println();
        q.deleteItem(3);
        q.show();
    }
    
}
