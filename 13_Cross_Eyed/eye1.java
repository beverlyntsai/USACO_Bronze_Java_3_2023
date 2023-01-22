import java.util.*;
import java.io.*;


public class eye1{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	String A="",B="";
	StringTokenizer st = new StringTokenizer(in.readLine());

	A=st.nextToken();
	B=st.nextToken();

	String minA="",minB="";
	String maxA="",maxB="";

	//min
	minA=A.replace('6','5');
	minB=B.replace('6','5');

	//max
	maxA=A.replace('5','6');
	maxB=B.replace('5','6');

	int minSum=Integer.parseInt(minA)+Integer.parseInt(minB);
	int maxSum=Integer.parseInt(maxA)+Integer.parseInt(maxB);

	System.out.println(minSum+" "+maxSum);

        in.close();


    }



}
