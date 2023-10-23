//
//
//class Student{ 
//	int num;
//	String name;
//	float grade;
//	
//	public Student(int num, String name, float grade) { 
//		this.num = num;
//		this.name = name;
//		this.grade = grade;
//	}
//	
//	public int getNumber() { 
//		return this.num;
//	}
//	
//	public float getGrade() { 
//		return this.grade;
//	}
//	
//	public String getName() { 
//		return name;
//	}
//
//	
//}
//
//public class task2 {
//
//    public static void main(String[] args) {
//            
//         Student[] studentArr = new Student[5];
//        int[] numberArr = {2020123456, 2021110000, 2022987654, 2023456789, 2024273645};
//        String[] nameArr = {"학생1", "학생2", "학생3", "학생4", "학생5"};
//        float[] scoreArr = {4.5f, 4.2f, 3.8f, 3.2f, 2.7f};
//        
//        for(int i = 0;i<studentArr.length;i++)
//        { 
//     	   Student x = new Student(numberArr[i], nameArr[i], scoreArr[i]);
//     	   studentArr[i] = x;
//        }
//        
//        for(int i = 0;i<studentArr.length;i++)
//        { 
//        	System.out.printf("학번: " + studentArr[i].getNumber() + "이름: " + studentArr[i].getName() + "점수: " + studentArr[i].getGrade());
//        	System.out.println();
//        }
//        
//        
//        
////        for(int i = 0; i < 5; i++)
////        {
////          System.out.printf("학번 : " + studentArr[i].getNum() + ", 이름 : " + studentArr[i].getName() + ", 점수 : " + studentArr[i].getScore() + "\n");
//////           객체지향으로 바꿀 때 클래스 내에 만들어놓은 get 함수로 값을 받아주세요!
////            
////        }
//        
////        for(int i = 0;i<studentArr.length;i++)
////        { 
////        	Student x = new Student(numberArr[i], nameArr[i], scoreArr[i]);
////        	studentArr[i] = x;
////        }
////        
////        for(int i = 0;i<studentArr.length;i++)
////        { 
////        	Student s = studentArr[i];
////        	System.out.printf("학번: " + s.getNumber() + "이름: " + s.getName() + "점수: " + s.getGrade());
////        }
//        
//     
//       
//       
//        
//    }
//}
