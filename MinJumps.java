import java.util.*;
import java.io.*;
public class MinJumps{

	public void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int jump(ArrayList<Integer> a) {		

		int n = a.size();
		
		if(n==1){
			return 0;
		}

		int jumparr[] = new int[n];
		jumparr[0] = 0;		
		int k = 0;
				

		for(int i=0; i<n; i++){

			for(int j=k+1; j<=i+a.get(i) && j<n; j++){
				jumparr[j] = jumparr[i] + 1;	
			}

			k = Math.max(k, i+a.get(i));

		}
	
		//printArr(jumparr);		
		if(jumparr[n-1] == 0){
			return -1;
		}
		return jumparr[n-1];
	}

	public static void main(String args[])throws Exception{
		MinJumps mj = new MinJumps();
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,3,1,1,4));
		//ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,0,0,1,0));

		//ArrayList<Integer> a = new ArrayList<>(Arrays.asList(33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28));

		System.out.println(mj.jump(a));
	}}
