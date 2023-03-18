package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestFile1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("설탕 배달 2839 리펙토링 여부 X");
			int result=0;
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int kg =Integer.parseInt(br.readLine());
	        br.close();
			switch (kg%5) {
			case 0:
				result=kg/5;
				break;
			case 1:
				if(kg/5>=1) {
					int data=kg/5;
					result=data+1;
					break;
				}
				else{
					result=check(kg);
					break;
				}
			case 2:
				if(kg/5>=2) {
					int data=kg/5;
					result=data+2;
					break;
				}
				else{
					result=check(kg);
					break;
				}
			case 3:
				if(kg/5>=1) {
					int data=kg/5;
					result=data+1;
					break;
				}
				else{
					result=check(kg);
					break;
				}
			case 4:
				if(kg/5>=2) {
					int data=kg/5;
					result=data+2;
					break;
				}
				else{
					result=check(kg);
					break;
				}
			default:
				result=-1;
			}
			bw.write(String.valueOf(result));
	        bw.flush();
			bw.close();
		}
	static int check(int kg) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result;
		if(kg%3==0) {
			result=kg/3;
		}
		else {
			result=-1;
		}
		return result;
	}

}
