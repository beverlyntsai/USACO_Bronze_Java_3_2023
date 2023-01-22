import java.util.*;
import java.io.*;


public class style1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[][]=new int[n][n];


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		for(int j=0; j<n;j++){
			a[i][j]=Integer.parseInt(st.nextToken());
		}
	}

	int maxValue=-1;
	for(int i=0; i<n;i++){

		for(int j=0; j<n;j++){			

			for(int ext=1; ext<n;ext++){

				if(i+ext==n || j+ext==n){

					break;
				}

				int sum1=a[i][j];//Important!!, not 0
				for(int k=1;k<=ext;k++){
					sum1+=a[i+k][j+k];
				}

				//System.out.println("sum1="+sum1);

				int sum2=a[i][j+ext]; //Important!!, not 0
				for(int k=1;k<=ext;k++){
					sum2+=a[i+k][j+ext-k];
				}
				//System.out.println("sum2="+sum2);

				int number=sum1-sum2;
				//System.out.println("number="+number);
				if(number>maxValue) maxValue=number;
			}
		}
	}




	System.out.println(maxValue);




        in.close();


    }



}
