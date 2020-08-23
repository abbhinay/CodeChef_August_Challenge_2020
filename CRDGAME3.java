/* package codechef; // don't place package name! */
/* Problem Link:  https://www.codechef.com/AUG20B/problems/CRDGAME3 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CRDGAME3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
		    long t = sc.nextLong();
		    for(long z=0; z<t; z++){
		        long chefPower = sc.nextLong();
		        long rickPower = sc.nextLong();
		        long chef = 0;
		        long rick = 0;
		        
		        if(chefPower%9==0) chef = chefPower/9;
		        else chef = 1+(chefPower/9);
		        
		        if(rickPower%9==0) rick = rickPower/9;
		        else rick = 1+(rickPower/9);
		        
		        if(chef>=rick){
		            System.out.println(1+" "+rick);
		        }else{
		            System.out.println(0+" "+chef);
		        }
		    }
		}catch(Exception e){
		    return;
		}
	}
}
