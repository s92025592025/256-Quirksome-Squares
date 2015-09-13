import java.util.Scanner;
class Main{
	static String addZero(int N, String num){
		StringBuffer sb=new StringBuffer(num);
		for(int i=0; i<N-sb.length(); i++){
			sb.insert(0, '0');
		}
		return sb.toString();
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
		for(int i=0; i<Math.pow(10, N-1); i++){
			for(int s=0; s<Math.pow(10, N-1); s++){
				double number=i*Math.pow(10, N-1)+s;
				if(Math.pow(i+s, 2)==number){
					if(number>0){sb.append("\n");}
					sb.append(addZero(N, Double.toString(number).substring(0, Double.toString(number).length()-2)));
				}
			}
		}
		return sb;
	}
}