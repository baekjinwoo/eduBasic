package homework07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*[문제1] 다음 조건에 맞게 프로그램을 완성하시오

1. score.txt파일을 읽어서 화면에 출력한다
2. 이름, 국어,영어,수학 점수를 읽어서 총점과 평균을 구하시오
3. 파일명 : ScoreTest.java
  
4. 출력화면
이름 : 홍길동    총점 : 221   평균 : 73.66
이름 : 이순신    총점 : 216   평균 :  72.00 
*/

public class ScoreTest {

	public static void main(String[] args) {
		try{
			BufferedReader bis = new BufferedReader(new FileReader("src/homework07/score.txt"));
			String name;
			int k, e, m;
	
			while (true) {
				name = bis.readLine();
				if (name == null)
					break;
				k = Integer.parseInt(bis.readLine());
				e = Integer.parseInt(bis.readLine());
				m = Integer.parseInt(bis.readLine());
	
				System.out.print("이름 : " + name);
				System.out.print("    총점 : " + (k + e + m));
				System.out.printf("   평균 : %.2f\n" , (double)(k + e + m) / 3);	
			}
			bis.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
