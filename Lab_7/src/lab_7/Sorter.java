/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7;

/**
 *
 * @author dhruv
 */
public class Sorter<T extends Comparable<T>> {
    T[] data;

    public Sorter(T[] d) {
        data = d;
    }

    public T[] mergeSort() {
        mergeSort(0, data.length - 1);

        return data;
    }
    
    public void mergeSort(int[] data, int start, int end) {
        // this.data or just data is our "arr"
        // actually perform mergeSort
        if (end - start > 1){
            int mid = (end + start) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
        }
        else if (end - start >= 0){
            return;
        }
        else{
            System.err.println("Start is > end. Should this be the case?");
        }
    }
    
    public void merge(int[] data, int start, int mid, int end) {    
        // this.data or just data is our "arr"
        
        // if you want to create an array of T
        // that is T[]
        // do this -
        // T[] newArray = (T[]) new Comparable[sizeOfArray];
        int l = start;
        int r = mid + 1;
        int i = 0;
        
        int[] merged = new int[end - start + 1];
        
        while (l <= mid && r <= end){
            if(data[l] < data[r]){
                merged[i] = data[l];
                i = i + 1;
                l = l + 1;                
            }
            else{
                merged[i] = data[r];
                i = i + 1;
                r = r + 1;
            }
        }
        while(l <= mid){
            merged[i] = data[l];
            i = i + 1;
            l = l + 1;            
        }
        while (r <= end){
            merged[i] = data[r];
            i = i + 1;
            r = r + 1;
        }
        for (i = start; i <= end; i++){
            data[i] = merged[i - start];
            
        }
        
        
    }
    
    public T[] quickSort() {
        quickSort(0, data.length - 1);

        return data;
    }
    
    public void quickSort(int[] data, int start, int end) {
        // actually perform quickSort
        if (end - start > 1){
            int pivot = partition(data, start, end);
            quickSort(data, start, pivot - 1);
            quickSort(data, pivot + 1, end);
        }
        else{
            return;
        }
    }
    
    public int partition(int[] data, int start, int end) {
        // perform the partitioning algorithm and return the pivot
        int l = start;
        int r = end;
        
        int mid = (end + start) / 2;
        int pivot = data[mid];
        
        while (true){
            while (data[l] < pivot){
                l = l + 1;
                
            }
            while (data[r] > pivot){
                r = r + 1;
            }
            if (l >= r){
                return r;
            }
            
            int temp = data[l];
            data[l] = data[r];
            data[r] = temp;
        }
    }
}
