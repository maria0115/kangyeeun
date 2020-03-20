package b_array;

public class Ex06_동적크기배열_연습 {

	public static void main(String[] args) {
		// 
		/*각 행의 값들의 합이 가장 큰 행을 출력하기	
		  int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		  결과 : 0행
		
		*/
		
//		int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
//
//		int sum1[]=new int[a.length];
//		
//		int max=0;
//		for(int i=0; i<a.length;i++)
//		{
//			
//			
//			for(int j=0; j<a[i].length;j++)
//			{				
//				sum1[i]+=a[i][j];				
//			}
//			
//			//System.out.print(sum1[i]+" ");
//			
//			
//			
//		}
//		int hang=0;
//		for(int h=0;h<sum1.length;h++)
//		{
//			if(sum1[h]>max)
//			{
//				max=sum1[h];
//				hang=h;
//			}
//		}
//		
//		System.out.print(hang+"행입니다");
		
		
		
		/*
		 * 문제 : 합이 가장 큰 행과 열
		 다음 배열 a에서 합이 가장 큰 행과 열의 번호를 각각 출력하기
		 int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
		 결과 : 1  1
	 * */
		
		int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
		
		int sum1[]=new int[a.length];
		
		int max=0;
		for(int i=0; i<a.length;i++)
		{
			
			
			for(int j=0; j<a[i].length;j++)
			{				
				sum1[i]+=a[i][j];				
			}
			
			System.out.print(sum1[i]+" ");
			
			
			
		}
		int hang=0;
		for(int h=0;h<sum1.length;h++)
		{
			if(sum1[h]>max)
			{
				max=sum1[h];
				hang=h;
			}
		}
		
		//System.out.print(max+"행입니다");
		
		
		
	}

}
