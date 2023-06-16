package array;

public class Ex12 {

	public static void main(String[] args) {
		
		int[] scores = {77, 88, 93, 68, 100};
		
		
		//for(배열의 항목을 저장 할 변수 선언: 배열)
		
		
		for(int score : scores) {//향상된  for문 score는 scores에서 꺼낸 정수를 저장
			
			System.out.printf(score + " ");
			
		}
		System.out.println();
		
		//학생이 2명 더 늘어났다면...
		
		int [] newScores = new int[7];
		
		for(int i = 0; i <scores.length; i++) {
			newScores[i] = scores[i];
		}
		
		System.out.println("=====================");
	
		//향상된 for문을 사용해서newScores 배열의 각 요소 출력
		
		for(int i : newScores) {
			
			System.out.printf(i+ " ");
		}
		
		
	}	

}
