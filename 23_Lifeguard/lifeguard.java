import java.util.*;
import java.io.*;


public class lifeguard{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int start[]=new int[n];
	int end[]=new int[n];
	boolean time[]=new boolean[1001];

	for(int i=0; i<1001;i++){

		time[i]=false;	

	}

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		start[i]=Integer.parseInt(st.nextToken());
		end[i]=Integer.parseInt(st.nextToken());		

	}

	int maxTime=-1;
	int coverTime=0;
	for(int i=0; i<n;i++){

		for(int j=0; j<1001;j++){

			time[j]=false;	

		}

		for(int j=0; j<n;j++){

			if(j!=i){

				for(int t=start[j];t<end[j];t++){
					time[t]=true;	
				}
			}


		}
		coverTime=0;
		for(int j=0; j<1001;j++){

			if(time[j]==true){
				coverTime++;
			}
		}

		maxTime=Math.max(coverTime,maxTime);
	}


	System.out.println(maxTime);




        in.close();


    }



}
