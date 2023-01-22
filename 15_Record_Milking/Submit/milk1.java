import java.util.*;
import java.io.*;


public class milk1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, m=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());


	int winner[]=new int[100];
	int bessie[]=new int[100];	

	int base=0;
	//winner
	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		int time=Integer.parseInt(st.nextToken());
		int rate=Integer.parseInt(st.nextToken());

		
		for(int j=base; j<time+base;j++){
		
			winner[j]=rate;
		}
		base+=time;
		

	}

	base=0;
	//Bessie
	for(int i=0; i<m;i++){

		st = new StringTokenizer(in.readLine());

		int time=Integer.parseInt(st.nextToken());
		int rate=Integer.parseInt(st.nextToken());

		for(int j=base; j<time+base;j++){
		
			bessie[j]=rate;
		}	
		base+=time;
	}

	int maxDifference=0;
	for(int i=0; i<100;i++){

		if((bessie[i]-winner[i])>0){
			int difference=bessie[i]-winner[i];
			if(difference>maxDifference) maxDifference=difference;
		}	

	}

	System.out.println(maxDifference);

        in.close();


    }



}
