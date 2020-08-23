/* package codechef; // don't place package name! */
/* Problem Link: https://www.codechef.com/AUG20B/problems/LINCHESS */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LINCHESS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    for(int z=0; z<t; z++){
		        int n = sc.nextInt();
		        long k = sc.nextLong();
		        long count = Integer.MAX_VALUE;
		        int number = -1;
		        for(int i=0; i<n; i++){
		            int no = sc.nextInt();
		            if(k%no==0){
		                if(count>(k/no)){
		                    count = k/no;
		                    number = no;
		                }
		            }
		        }
		        System.out.println(number);
		    }
		}catch(Exception e){
		    return;
		}
	}
}
