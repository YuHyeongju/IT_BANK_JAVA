package random;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		//Math.random()을 사용하여 1 ~ 45 까지 수 중에 6를 뽑아 
		//lotto배열에 각 요소에 저장 후 출력
		
		for(int i = 0; i < 6; i++) {
			
			 lotto[i] = (int)(Math.random() * 45) +1;  //->중복 수 가 존재 할 수있음
			 
			 //-> 현재 수와 이전에 받은 수를 비교하여 
			 //같은 수가 있다면 현재 수를 다시 받게 함
			 
			 for(int j = 0; j < i; j++) {//j는 i의 아랫수까지만 반복
				 
				 if(lotto[i]== lotto[j]) {//i와 j가 같으면 i를 하나내려서 다시받음
					 
					 i--;
					 break;
				 }
				 
			 }
			 
			 
			 
			 
			
		}
		for(int i = 0; i <6; i++) {
			System.out.println(lotto[i]+ " ");
		
		}
	}

}
