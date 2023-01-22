import java.util.*;
import java.io.*;


public class acorn1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int x[]=new int[n];
	int y[]=new int[n];
	int r[]=new int[n];
	int tangentCount[]=new int[n];

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		x[i]=Integer.parseInt(st.nextToken());
		y[i]=Integer.parseInt(st.nextToken());
		r[i]=Integer.parseInt(st.nextToken());		

	}


	for(int i=0; i<n;i++){

		for(int j=0; j<n;j++){

			double d1=Math.pow(r[i]+r[j],2);
			double d2=Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2);
			if(d1==d2){
				tangentCount[i]++;
			}	
		}
	}

	for(int i=0; i<n;i++){
		if(tangentCount[i]==1 && (x[i]!=0 || y[i]!=0)){

			System.out.println(x[i]+" "+y[i]);	
			break;	
		}

	}


        in.close();


    }



}
