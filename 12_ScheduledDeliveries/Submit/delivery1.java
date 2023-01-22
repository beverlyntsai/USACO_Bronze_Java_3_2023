import java.util.*;
import java.io.*;



public class delivery1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int interval[]=new int[n];
	int count=0;
	int tempInterval=Integer.parseInt(in.readLine());//read for fun, no use
	boolean isMultiple=false;
	for(int i=0; i<n-1;i++){

		isMultiple=false;//Important: Must initizlized to false every time
		tempInterval=Integer.parseInt(in.readLine())-1;//interval is this number-1(base)
		
		if(count==0){
			interval[0]=tempInterval;
			count++;
		}

		for(int j=0; j<count;j++){
		
			if(tempInterval % interval[j]==0){
				isMultiple=true;
				break;
			}

		}

		if(isMultiple==false){
			interval[count]=tempInterval;
			count++;
		}		
	}


	System.out.println(count);

        in.close();


    }



}
