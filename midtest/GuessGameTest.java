//
//import java.util.ArrayList;
//
//class Player {
//    int number = 0;
//    int id;
//
//    public Player(int id) {
//        this.id = id;
//    }
//
//    public void guess() {
//        // todo: 0-9까지의 숫자를 추측하여 number에 대입하시오. (guess a number between 0 and 9, then assign it to the 'number' variable).
//        number = (int) (Math.random() * 9);
//        System.out.println("I am guessing " + number);
//    }
//}
//
//class GuessGame {
//    ArrayList<Player> players = new ArrayList<>();
//
//    public void startGame(int numPlayer) {
//
//        // todo: numPlayer를 이용하여 players를 초기화  (initialize 'players' using 'numPlayer').
//
//    	players = new ArrayList<>(numPlayer);
//    	
//    	Player x[] = new Player[3];
//    	for(int i = 0;i<3;i++)
//    	{ 
//    		x[i].id = i;
//    		players.add(x[i]);
//    	}
//    	
//        System.out.println("I'm thinking of a number between 0 and 9...");
//        // todo: 0-9까지의 숫자를 추측하여 targetNumber에 대입하시오. (guess a number between 0 and 9, then assign it to the 'targetNumber' variable).
//        int targetNumber = (int) (Math.random() * 9);
//        System.out.println("Number to guess is " + targetNumber);
//
//        
//        while (true) {
//            System.out.println("Players try...");
//
//            // passedPalyers: 정답을 맞춘 player id를 저장하기 위한 배열 ( array to save ids of players whose guesses were correct).
//            ArrayList<Integer> passedPlayers = new ArrayList<>();
//            
//            // todo: 각 player의 guess를 수행하고, 올바르게 추측한 플레이어 id를 passedPlayers에 저장함.(Perform the guess for each player, then store the ids of players who guessed correctly in passedPlayers.)
//            
//            for(int i = 0;i<3;i++)
//            {
//            	 players.get(i).id = i;
//            }
//            
//           
//
//            if (!passedPlayers.isEmpty()) {
//
//                System.out.println("We have a winner or winners!");
//                for (int id : passedPlayers) {
//                    System.out.println("Player " + id + " is right");
//                }
//                System.out.print("The Game is Over");
//                break;
//
//            }
//        }
//    }
//}
//
//public class GuessGameTest {
//    public static void main(String[] args) {
//        GuessGame game = new GuessGame();
//        game.startGame(3);
//    }
//}
