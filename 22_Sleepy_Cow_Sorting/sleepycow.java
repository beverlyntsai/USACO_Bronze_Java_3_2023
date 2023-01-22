import java.util.*;
import java.io.*;


public class sleepycow{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[]=new int[n];

	st = new StringTokenizer(in.readLine());
	for(int i=0; i<n;i++){

		a[i]=Integer.parseInt(st.nextToken());
	}

	int answer=0;

	for(int i=n-1;i>0;i--){

		if(a[i-1]>a[i]) {answer=i; break;}	
	}


	System.out.println(answer);




        in.close();


    }



}
