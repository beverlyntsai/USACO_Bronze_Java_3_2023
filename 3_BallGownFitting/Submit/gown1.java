import java.util.*;
import java.io.*;


public class gown1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, s=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	s=Integer.parseInt(st.nextToken());

	int a[]=new int[n];

	for(int i=0; i<n;i++){
		
		a[i]=Integer.parseInt(in.readLine());
	}

	//This powerful way requires sort first
	Arrays.sort(a);

	int sum=0;
	int highIndex=n-1;
	int lowIndex=0;
	int count=0;
	while(lowIndex<highIndex){

		sum=a[lowIndex]+a[highIndex];
		
		if(sum<=s){
			count+=highIndex-lowIndex;
			lowIndex++;	
		}else{
			highIndex--;

		}

	}

	System.out.println(count);

        in.close();


    }



}
