import java.util.*;
import java.io.*;


public class tobaseN_1{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int num=0, base=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	num=Integer.parseInt(st.nextToken());
	base=Integer.parseInt(st.nextToken());
	int placeVal=1;
	int sum=0;

	while(num>0){

		sum+=placeVal*(num%base);
		num=num/base;	
		placeVal=placeVal*10;

	}

	System.out.println(sum);

        in.close();


    }



}
