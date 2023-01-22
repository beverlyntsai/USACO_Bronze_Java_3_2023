import java.util.*;
import java.io.*;


public class puz{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int A=0, B=0, V=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	A=Integer.parseInt(st.nextToken());
	B=Integer.parseInt(st.nextToken());
	V=Integer.parseInt(st.nextToken());

	int dist=0;
	int day=0;
	while(true){

		dist+=A;
		day++;
		if(dist>=V){
			break;
		}

		dist-=B;

	}

	System.out.print(day);



        in.close();


    }



}
