//
//class Dog {
//    private String name;
//    private String breed;
//
//    public Dog(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//}
//
//public class DogTest {
//    public static void main(String[] args) {
//        Dog[] dogs = new Dog[5];
//        // todo: 테이블을 활용하여 dogs 를 초기화 하시오 (initialize the array dogs using the table on the exam paper)
//        
//        dogs[0] = new Dog("Buddy", "Golden Retriever");
//        dogs[1] = new Dog("Charlie", "Labrador Retriever");
//        dogs[2] = new Dog("Max", "German Shepherd");
//        dogs[3] = new Dog("Daisy", "Poodle");
//        dogs[4] = new Dog("Rocky", "Siberian Husky");
//
//        String format = "| %-10s | %-20s |%n";
//        // todo: 위의 format과 printf를 활용하여 출력하시오 (use the upper format and printf method)
//        
//        for(int i = 0;i<5;i++)
//        { 
//        	System.out.printf(format, dogs[i].getName(), dogs[i].getBreed());
//        }
//        
//    }
//}