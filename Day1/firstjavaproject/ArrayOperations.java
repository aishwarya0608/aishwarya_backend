package firstjavaproject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

	public static void createArray(){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size");
		int s = sc.nextInt();
		
		int[] arr=new int[s];
		
		System.out.println("Enter the Elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
		
		public static void printArray(int arr[]) {
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}	
		}
		
		public static void reverseArray() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size of an array");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			System.out.println("enter array elements");
			
			
			for(int i=0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0;i<size;i++) {
				System.out.println(arr[i]);
				
			}
			System.out.println("---------");
			// reverse
			for(int i=size-1;i>=0;i--) {
				System.out.println(arr[i]);	
		}
		}
		
		public static void sortArray() {
			
			int[] arr = new int[] {10,20,50,60,70};
			Arrays.sort(arr);
			System.out.println("Sorted Array is:");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		
		public static void mergeArray() {
			
			int[] arr = {1,2,3,4,5};
			int[] arr1 = {6,7,8,9,10};
			int farr=arr.length;
			int sarr=arr1.length;
			int [] result= new int[farr+sarr];
			System.arraycopy(arr,0,result,0,farr);
			System.arraycopy(arr1,0,result,farr,sarr);
			System.out.println(Arrays.toString(result));
		}
			
		public static void zigZagMergeArray(int arr1[], int arr2[]) {
			
			int[] arr3 = new int[arr1.length+arr2.length];
			int i=0;
			int j=0;
			int k=0;

				while(i<arr1.length && i<arr2.length) {
				arr3[i++] = arr1[k++];
				arr3[i++] = arr2[j++];
				
				}
				

			for(int x=0;x<arr3.length;x++) {
				System.out.println(arr3[x]);
			}
		}
		
		public static int maxElement() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size of an array");
			int size = sc.nextInt();
			
			int[] arr1 = new int[size];
			System.out.println("enter array elements");
			
			
			for(int i=0;i<size;i++) {
				arr1[i] = sc.nextInt();
			}
			for(int i=0;i<size;i++) {
				System.out.println(arr1[i]);	
			}
			System.out.println("-----");
			int max = arr1[0];
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]>max) {
					max = arr1[i];
				}
			}
		 
			return max;
		}
		
		public static int minElement() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size of an array");
			int size = sc.nextInt();
			
			int[] arr1 = new int[size];
			System.out.println("enter array elements");
			
			
			for(int i=0;i<size;i++) {
				arr1[i] = sc.nextInt();
			}
			for(int i=0;i<size;i++) {
				System.out.println(arr1[i]);	
			}
			System.out.println("-----");
			int min = arr1[0];
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]<min) {
					min = arr1[i];
				}
			}
			return min;
		}

		public static void unionArray(int arr1[], int arr2[]) {
			
			int count=0;
						
			int[] arr3 = mergeArray(arr1, arr2);
			for(int i=0; i<arr1.length;i++) {
				for(int j=i+1;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {
						arr2[j]=-1;
						count++;
					}
				}
			}
			System.out.println(count);
			
			
			
			
		}
		
		private static int[] mergeArray(int[] arr1, int[] arr2) {
			// TODO Auto-generated method stub
			return null;
		}

		public static void intersectionArray() {
			
			int arr[]= {23,36,96,78,55};
			int arr2[]= {78,45,19,73,55};
			System.out.println("Intersection of Two arrays:");
			
			for(int i=0;i<arr.length;i++) {
				
				for( int j=0;j<arr2.length;j++) {
					
					if(arr[i]==arr2[j]) {
						System.out.println(arr2[j]);
					}
				}
			}	
		}
		   
		public static void removeDuplicate() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of an array:");
			int s = sc.nextInt();
			
			int[] arr = new int[s];
			System.out.println("Enter the Elements:");
			
			  for(int i=0;i<s;i++) {
				  
				  arr[i]=sc.nextInt();
			  }
			  int temp[]= new int[s];
			  int j=0;
			  Arrays.sort(arr);
			  
			  for(int i=0;i<s-1;i++ )
			  {
				  if(arr[i]!=arr[i+1])
					  temp[j++]=arr[i];
			  }
			  
			  temp[j++]=arr[s-1];
			  for(int k=0;k<j;k++)
			  {
				  System.out.println(temp[k]);
		}
			  }
		
		public static void duplicateElements() {
			
			int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
			System.out.println("Duplicate Elements in given array:");
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						  System.out.println(arr[j]);
					}
				}
			}
		}
		
		
		
		
		
		
		
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				int arr1[]= {1,6,5,7};
				int arr2[]= {5,4,6,8};
				//createArray();
				//reverseArray();
				//sortArray();
				//mergeArray();
				//zigZagMergeArray(arr1,arr2);
				//System.out.println("max element is:"+maxElement());
				//System.out.println("In element is:" +minElement());
				//unionArray(arr1,arr2);
				//intersectionArray();
				//removeDuplicate();
				duplicateElements();
				
			}
		}

		
		
		
