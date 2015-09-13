import java.util.Scanner;
class Main{

	static String addZero(int N, int num){
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<N-Integer.toString(num).length(); i++){
			sb.append("0");
		}
		sb.append(Integer.toString(num));
		return sb.toString();
	}
	static boolean confirmQurik(int N, String num){
		String former=num.substring(0, N/2), latter=num.substring(N/2);
		return Math.pow(Integer.parseInt(former)+Integer.parseInt(latter), 2)==Integer.parseInt(num);
	}

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			N=sc.nextInt();
			System.out.println(findAns(N));
		}
	}

	static StringBuffer findAns(int N){
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<Math.pow(10, N); i++){
			String number=addZero(N, i);
			if(confirmQurik(N, number)){
				if(i>0){sb.append("\n");}
				sb.append(number);
			}
		}
		return sb;
	}
}