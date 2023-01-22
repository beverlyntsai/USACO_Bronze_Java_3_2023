import java.util.*;
import java.io.*;

public class perfect{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[][]=new int[n][n];
	int median[]=new int[n];

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		for(int j=0; j<n;j++){
			a[i][j]=Integer.parseInt(st.nextToken());
		
		}

	}

	int medianIndex=n/2;
	for(int i=0; i<n;i++){

		Arrays.sort(a[i]);
		median[i]=a[i][medianIndex];
	}

	Arrays.sort(median);

	System.out.println(median[medianIndex]);




        in.close();


    }



}
