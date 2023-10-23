import java.util.Random;
import java.util.Scanner;

public class arrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String [][] arr = new String[3][3];
//		
//		for(int row = 0;row<3;row++)
//		{ 
//			for(int col = 0;col<3;col++)
//			{ 
//				arr[row][col] = "(" + row + "," + col + ")"; 
//			}
//		}
//		for(int row = 0;row<3;row++)
//		{ 
//			for(int col = 0;col<3;col++)
//			{ 
//				System.out.print(arr[row][col]);		
//			}
//			System.out.println();
//		}
		
//		int [][] numArr = new int[4][4];
//		
//		for(int i = 0;i < numArr.length;i++)
//		{ 
//			for(int j = 0;j<numArr[i].length;j++)
//			{ 
//				if(i != numArr.length-1 && j != numArr[i].length -1)
//				{ 
//					numArr[i][j] = (int) (Math.random() * 10 + 1);
//					numArr[i][numArr[i].length-1] += numArr[i][j];
//					numArr[numArr.length-1][j] += numArr[i][j];
//					numArr[numArr.length-1][numArr[i].length-1] += numArr[i][j];
//				}
//				System.out.printf("%4d ", numArr[i][j]);
//			}
//			System.out.println();
//		}
		
//		Scanner in = new Scanner(System.in);
//		int row = in.nextInt();
//		int col = in.nextInt();
//		
//		char [][] arr = new char[row][col];
//		
//		
//		for(int i = 0;i<row;i++)
//		{ 
//			for(int j = 0;j<col;j++)
//			{ 
//				arr[i][j] = (char)(int)(Math.random() * 26 + 65);
//				System.out.print((char)arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0;i<row;i++)
//		{ 
//			for(int j = 0;j<col;j++)
//			{ 
//				System.out.printf("%-4c", arr[i][j]);
//			}
//			System.out.println();
//		}
		
//		Scanner in = new Scanner(System.in);
//		char [][] arr;
//		
//		System.out.print("행의 크기: ");
//		int row = in.nextInt();
//		arr = new char[row][];
//		char ch = 'a';
//		
//		for(int i = 0;i<row;i++)
//		{ 
//			System.out.print(i + "열의 크기: ");
//			int col = in.nextInt();
//			
//			arr[i] = new char[col];
//			
//			for(int j = 0;j<arr[row].length;j++)
//			{ 
//				arr[i][j] = ch++;
//			}
//		}
//		for(int i = 0;i<arr.length;i++)
//		{ 
//			for(int j = 0;j< arr[i].length;j++)
//			{ 
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		Scanner in = new Scanner(System.in);
		
//		
//		System.out.print("행의 크기: ");
//		int row = in.nextInt();
//		char [] [] arr = new char[row][];
//		char ch = 'a';
//		for(int i = 0;i<arr.length;i++)
//		{
//			 System.out.print(i + "열의 크기: ");
//			 int col = in.nextInt();
//			 arr[i] = new char[col];
//			 for(int j = 0;j<arr[i].length;j++)
//			 { 
//				 arr[i][j] = ch++;
//			 }
//		}
//		
//		for(int i = 0;i<arr.length;i++)
//		{ 
//			for(int j = 0;j< arr[i].length;j++)
//			{ 
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		int row = 2, col = 3;
//		int [][] firstMatrix = {{2,3,4}, {3,2,1}};
//		int [][] secondMatrix = {{1,2,3}, {-4,-2,1}};
//		
//		int [][] sum = new int[row][col];
//		
//		for(int i = 0;i<sum.length;i++)
//		{ 
//			for(int j = 0;j<sum[i].length;j++)
//			{ 
//				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
//			}
//		}
//		
//		for(int i = 0;i<sum.length;i++)
//		{ 
//			for(int j = 0;j< sum[i].length;j++)
//			{ 
//				System.out.print(sum[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.print("이름을 입력해주세요.");
//		String name = in.next();
//		System.out.print("성이 몇 글자인가요? ");
//		int first = in.nextInt();
//		String sung = name.substring(0, first);
//		String erum = name.substring(first);
//		if(sung.length() > erum.length())
//		{ 
//			System.out.print("성이 이름보다 길어요!");
//		}
//		else { 
//			System.out.println("성: " + sung);
//			System.out.print("이름: " + erum);
//		}
		
		//문자열을 입력받고, split하여 String배열에 담은후, parseInt로 각각의 문자열 형변환
//		int [][] arr = new int[3][3];
//		String nums = in.nextLine();
//		String [] strArray = nums.trim().split(",");
//		
//		int k = 0;
//		for(int i = 0;i<arr.length;i++)
//		{ 
//			for(int j = 0;j<arr[i].length;j++)
//			{
//				 arr[i][j] = Integer.parseInt(strArray[k++]);
//			}
//		}
//		
//		for(int i = 0;i<arr.length;i++)
//		{ 
//			for(int j = 0;j<arr[i].length;j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		int [][] arr = new int[3][3];
//		String nums = in.nextLine();
//		StringBuffer sb = new StringBuffer(nums);
//		String[] array = sb.toString().trim().split(",");
//		int k = 0;
//		for(int i = 0;i<arr.length;i++)
//		{ 
//			for(int j = 0;j<arr[i].length;j++)
//			{
//				 arr[i][j] = Integer.parseInt(array[k++]);
//			}
//		}
//		for(int i = 0;i<arr.length;i++)
//		{ 
//			for(int j = 0;j<arr[i].length;j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}

}
