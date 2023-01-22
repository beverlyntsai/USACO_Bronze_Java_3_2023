import java.util.*;
import java.io.*;

public class bucket{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;
	int timeList[]=new int[1001];

	for(int i=0; i<1001;i++){

		timeList[i]=0;
	}

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		int startT=Integer.parseInt(st.nextToken());
		int endT=Integer.parseInt(st.nextToken());
		int numBucket=Integer.parseInt(st.nextToken());		

		for(int j=startT;j<endT;j++){
			timeList[j]+=numBucket;
		}	

	}

	int maxNumBucket=0;
	for(int i=0; i<1001;i++){

		maxNumBucket=Math.max(timeList[i],maxNumBucket);	

	}



	System.out.println(maxNumBucket);


        in.close();


    }



}
