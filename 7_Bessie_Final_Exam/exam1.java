import java.util.*;
import java.io.*;

public class exam1{

    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	String numBinStr= in.readLine();
	//numBinStr *17=numBin16+numBin
	String numBin16Str=numBinStr+"0000";
	numBinStr="0000"+numBinStr;

	int n=numBinStr.length();
	int carry=0;
	String ans="";
	for(int i=n-1; i>=0;i--){

		char ch1=numBin16Str.charAt(i);
		char ch2=numBinStr.charAt(i);
		int digit1=Integer.parseInt(String.valueOf(ch1));//Convert char to String, then convert String to int
		int digit2=Integer.parseInt(String.valueOf(ch2));//Convert char to String, then convert String to int
		int sum=digit1+digit2+carry;
		int remainder=sum%2;
		carry=sum/2;
		ans=String.valueOf(remainder)+ans;
	}

	if(carry>0){
		ans=String.valueOf(carry)+ans;
	}


	System.out.println(ans);




        in.close();


    }



}
