package loop;

public class Ex04 {

	public static void main(String[] args) {
		//500 ~1000까지의 수 중에서 홀수의 합구하기
		int i;
		int sum = 0;
		
		for(i=501; i <=1000; i+=2) {
				sum += i;
			
		}
		/*
		 * for(int  i =500; i <=1000 i++){
		 * 		
		 * 		if(i%2 ==1){
		 * 			sum +=i
		 * 		}
		 * }
		 * 
		 * 
		 * */
		System.out.println("500~1000사이 홀수의 합은: "+sum);
	}

}
