import java.util.*;
import java.io.*;


public class foot1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[][]=new int[n][n];
	int rowS[]=new int[10];
	int colS[]=new int[10];
	int rowE[]=new int[10];
	int colE[]=new int[10];
	boolean isVisible[]= new boolean[10];
	boolean isFirstPainted[]= new boolean[10];

	for(int i=0; i<10;i++){
		rowS[i]=10;
		colS[i]=10;
		rowE[i]=-1;
		colE[i]=-1;
		isVisible[i]= false;
		isFirstPainted[i]= false;

	}


	for(int r=0; r<n;r++){

		String line=in.readLine();

		for(int c=0; c<n;c++){

			String ch=line.substring(c,c+1);
			int number=Integer.parseInt(ch);
			a[r][c]=number;
			isVisible[number]=true;
			isFirstPainted[number]= true;

			//update border of the number
			rowS[number]=Math.min(r, rowS[number]);
			colS[number]=Math.min(c, colS[number]);
			rowE[number]=Math.max(r, rowE[number]);
			colE[number]=Math.max(c, colE[number]);
		}
	}

	//loop 9 number to see if visible
	for(int i=1;i<=9;i++){

		if(isVisible[i]==false) continue;

		if(isVisible[i]==true){

			for(int r=rowS[i];r<=rowE[i];r++){

				for(int c=colS[i];c<=colE[i];c++){

					int numOnTop=a[r][c];
					if(numOnTop!=i){

						isFirstPainted[numOnTop]=false;
					}
				}
			}
		}
	}

	int count=0;
	for(int i=1;i<=9;i++){

		if(isFirstPainted[i]==true) count++;
	}


	System.out.println(count);




        in.close();


    }



}
