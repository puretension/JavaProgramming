//import java.util.ArrayList;
//
//class Character {
//
//    String name;
//    int hp;
//    int maxHp;
//    int maxValue; // 공격력 능력치. 주사위를 굴릴 때 1부터 maxValue까지의 값이 나온다.
//
//    public Character(String name, int hp, int maxValue) {
//        this.name = name;
//        this.hp = hp;
//        this.maxHp = hp;
//        this.maxValue = maxValue;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getHp() {
//        return hp;
//    }
//
//    public int roll() // 주사위를 굴려 피해량을 정한다.
//    {
//        return (int) (Math.random() * maxValue) + 1;
//    }
//
//    public void attack(Character enemy) {
//        // todo: 공격 메시지를 띄운다.
//    	int dm = roll();
//    	System.out.println(this.name + "이(가) " + enemy.name + "을(를) " + dm + "만큼 공격했다!");
//    	enemy.damaged(dm);
//    }
//
//    public void printInfo() // 현재 체력 상태를 띄운다.
//    {
//        int gauge = (int) (10 * hp / (float) maxHp);
//
//        for (int i = 0; i < gauge; i++) {
//            System.out.print("●");
//        }
//        for (int i = 0; i < 10 - gauge; i++) {
//            System.out.print("○");
//        }
//
//        System.out.println(" " + name + " " + hp + "/" + maxHp);
//    }
//
//    public void damaged(int damage) // 피해를 받아 자신의 체력을 감소시킨다.
//    {
//        this.hp -= damage;
//        if (this.hp < 0) {
//            this.hp = 0;
//            System.out.println(this.name+"의 체력이 0입니다");
//        }
//    }
//
//    public boolean isDead() {
//        return this.hp == 0;
//    }
//}
//
//public class newTask5 {
//
//    public static void main(String[] args) {
//
//        Team blueTeam = new Team();
//        Team redTeam = new Team();
//
//        // 팀별 player 구성 예제
//        blueTeam.addCharacter(new Character("블루1", 20, 6)); // 밸런스형
//        blueTeam.addCharacter(new Character("블루2", 30, 4)); // 체력이 높지만 공격력이 낮음
//        blueTeam.addCharacter(new Character("블루3", 12, 12)); // 체력이 적지만 공격력이 높음
//
//        redTeam.addCharacter(new Character("레드1", 20, 6));
//        redTeam.addCharacter(new Character("레드2", 30, 4));
//        redTeam.addCharacter(new Character("레드3", 12, 12));
//
//        System.out.println("전투 시작!\n");
//
////        blueTeam.printInfo();
////
////        blueTeam.removeDeadPlayer();
////
////        blueTeam.printInfo();
//
//
//
//
//
//        int winner = 0;
//
//        for (int i = 0; i < 50; ++i) // 한 팀 빼고 전부 전멸할 때까지 계속한다. 단, 50턴이 지나면 무승부.
//        {
//        	System.out.printf("\n==============[%d 턴]=================\n",i+1);
//        	blueTeam.printInfo();
//        	redTeam.printInfo();
//            System.out.println();
//
//            System.out.println("<blueTeam 공격>");
//            blueTeam.attack(redTeam); // 공격자가 공격했다는 메시지를 띄운다. 
//            System.out.println("\n<redTeam 공격>");
//            redTeam.attack(blueTeam); // 공격자가 공격했다는 메시지를 띄운다.
//
//            blueTeam.removeDeadPlayer();
//            redTeam.removeDeadPlayer();
//            
//            // todo: add break condition
//            if(blueTeam.players.size() == 0)
//            { 
//            	System.out.println("레드팀이 승리했습니다.");
//            	break;
//            }
//            else if(redTeam.players.size() == 0)
//            { 
//            	System.out.println("블루팀이 승리했습니다.");
//            	break;
//            }
//            
//        }
//       blueTeam.printInfo();
//       redTeam.printInfo();
//        // todo: show results.
//    }
//}
//
//class Team {
//    ArrayList<Character> players = new ArrayList<Character>();
//
//    public void addCharacter(Character c) {
//        players.add(c);
//    }
//
//    public void attack(Team enemy) {
//        // 1. 아군 팀의 부대원은 적군 팀의 모둔 플레이어를 공격함 
//        // 만약 아군 팀이 2명, 적군 팀이 3명으로 구성되어 있으면, 아군 팀원은 모두 각 적군 플레이를 공격, 총 6번의 공격이 이루어짐. 
//    	for(int i = 0;i<this.players.size();i++)
//    	{ 
//    		for(int j = 0;j<enemy.players.size();j++)
//    		{ 
//    			players.get(i).attack(enemy.players.get(j));
//    		}
//    	}
//    }
//    
//    public void removeDeadPlayer() {
//        players.removeIf(Character::isDead);
//    }
//
//    public void printInfo() {
//        // 각 구성원의 HP출력하시오
//    	for(int i = 0;i<players.size();i++)
//    		players.get(i).printInfo();
//    }
//
//    public ArrayList<Character> getCharacterList() {
//        return players;
//    }
//}