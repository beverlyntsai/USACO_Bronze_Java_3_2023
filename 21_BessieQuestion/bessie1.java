import java.util.*;
import java.io.*;

public class bessie1{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int grid[][]=new int[2001][2001];
	int row=1000;
	int col=1000;
	int curTime=0;
	int minRevisit=100000000;
	grid[1000][1000]=0;


	for(int i=0; i<2001;i++){

		for(int j=0; j<2001;j++){
			grid[i][j]=-1;
		}
	}


	int revisitTimeApart=0;
	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		String dir=st.nextToken();
		int steps=Integer.parseInt(st.nextToken());
		

		for(int j=0; j<steps;j++){
			if(dir.equals("S")){
				row++;
			}

			if(dir.equals("N")){
				row--;
			}

			if(dir.equals("E")){
				col++;
			}
			if(dir.equals("W")){
				col--;
			}

			curTime++;

			//Means revisit
			if(grid[row][col]!=-1){
				revisitTimeApart=curTime-grid[row][col];
				if(revisitTimeApart<minRevisit) minRevisit=revisitTimeApart;
			}

			grid[row][col]=curTime;
		}
		


	}

	if(minRevisit==100000000){
		System.out.println(-1);
	}else{
		System.out.println(minRevisit);
	}


	




        in.close();


    }



}
