package secondproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAnArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

         int [] a= IntStream.rangeClosed(1, arr.length).map(i-> arr[arr.length-i]).toArray();
         
     for(int b : a )
     {
    	 System.out.print(b+" ");
     }
        
    }      
}
