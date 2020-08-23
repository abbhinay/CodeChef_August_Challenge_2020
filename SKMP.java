/* package codechef; // don't place package name! */
/* Problem Link:  https://www.codechef.com/AUG20B/problems/SKMP */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SKMP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int t = Integer.parseInt(br.readLine());
		    for(int z=0; z<t; z++){
		        String str = br.readLine();
		        String child = br.readLine();
		        if(str.length()==child.length()){
		            System.out.println(child);
		            continue;
		        }
		        TreeMap<Character, Integer> map = new TreeMap<>();
		        for(char alphabet : str.toCharArray()){
		            if(!map.containsKey(alphabet)){
		                map.put(alphabet, 1);
		            }
		            else{
		                map.put(alphabet, map.get(alphabet)+1);
		            }
		        }
		        for(char alphabet : child.toCharArray()){
	                int freq = map.get(alphabet);
	                if(freq==1){
	                    map.remove(alphabet);
	                }else{
	                    map.put(alphabet, freq-1);
	                }
		        }
		        StringBuffer sb = new StringBuffer();
		        boolean flag = true;
		        for(Map.Entry m : map.entrySet()){
		            char alphabet = (char)m.getKey();
		            String s = "";
	                for(int i=0; i<(int)m.getValue(); i++){
	                    s += alphabet;
	                }
	                if(flag){
	                    int result = s.compareTo(child);
	                    if(result<0){
	                        sb.append(s);
	                    }
	                    else{
	                        sb.append(child);
	                        sb.append(s);
	                        flag = false;
	                    }
	                }
	                else{
	                    sb.append(s);
	                }
		        }
		        if(flag){ sb.append(child);}
		        String re = sb.toString();
		        System.out.println(re);
		    }
		}catch(Exception e){
		    return;
		}
	}
}
