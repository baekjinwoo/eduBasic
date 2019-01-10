package basic06;

public class TwoArray {
	public static void main(String[] args) {
		//다차원 배열(2차원 배열) ex]지하고층 아파트로 위에서부터(0층) 아래로 층을 센다. 
		/* ex) k[4][5]는 0층0호부터 3층4호까지가 최대이다.
		  
		  ###
		  ###  int [][]a=new int[3][3]; 
		  ###  최소값은 a[0][0];
		  		최대값은 a[2][2];  */
			
			int [][] k = new int[3][3]; //k[2][2]까지밖에 안됨.왜냐하면 행0~2층, 열0~2층니까. 

			k[0][0]=20;
			k[1][2]=30; //근대 왜 k[2][2]는 안되?
			k[2][2]=100; 

			
			int [][]h1= {{1,2,3},				//  <- 대표주소 h1[0]
						{6,4,5}}; //이는 [1][2]이다 <- 대표주소 h1[1]
			int [][]h2= {{1,2},{4,5}}; //이는 [1][1]이다
				
		// int[][] k3={30,200,70,100,120,45};가 안되는 이유는 원래 메모리는 1차원배열밖에 안되는대,
		// 모습이 2차원배열이다. 따라서 나눠서 써야한다
			
			for(int i=0;i<h1.length;i++){ //행 for(int i=0;i<2;i++)
				for(int j=0;j<h1[i].length;j++){ //열 for(int j=0;j<3;j++)
					System.out.print(h1[i][j]+"  ");
				}
				System.out.println();
			}
				
			// 1차원배열에서는 h1[i].length는 배열의 길이다
			// 2차원배열에서는 h1[i].length는 층의 수이다( 몇 층인지)
			// 다시한번, 배열의 명이 곧 배열의 초기주소이다.
				
////////////////////////////////////////////////////////////////////////////////////
			
			int [] bbb={30,90,100}; //1차원 배열
			for(int imsi:bbb) //개수를 정확히 모를때, bbb를 다 처리할때까지 처리하기위해 : 사용.
				System.out.println(imsi);
			
////////////////////////////////////////////////////////////////////////////////////
			
			for(int[] aa:h1){ //2차원 배열
				for(int i:aa)// 2차원 배열에서는 임시로 i방안에 다시 넣고 출력한다.
					System.out.print(i+"      ");
		}
	}
}
