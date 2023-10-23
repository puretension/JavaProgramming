//import java.util.ArrayList;
//
//public class task4 {
//
//    public static void main(String[] args) {
//
//        Character player = new Character("플레이어", 24, 6);
//        Character enemy; // 현재 전투 중인 적
//
//        enemy = new Character("적", 20, 4);
//
//        System.out.println(player.getName() + "은(는) " + enemy.getName() + "과 맞닥뜨렸다!\n");
//
//        Character attacker = player; // 공격자와 방어자를 정해주고 턴마다 바꾼다.
//        Character defender = enemy;
//        
//        int playerFlag = 0;
//        
//        int count = 0;
//
//        for (int i = 0; i < 50; ++i) // 둘 다 체력이 0 초과라면 계속한다.
//        {
//
//            player.printInfo();
//            enemy.printInfo();
//            System.out.println();
//
//            attacker.attack(defender); // 공격자가 공격했다는 메시지를 띄운다.
//            defender.attack(attacker); // 공격자가 공격했다는 메시지를 띄운다.
//            
//            if((player.hp <=0) && (enemy.hp <=0)) { 
//            	playerFlag = 3;
//            }
//
//            // todo: add break condition
//            else if((player.hp <= 0) && (enemy.hp > 0)) { 
//            	playerFlag = 2;
//            	break;
//            }
//            else if((enemy.hp <= 0) && (player.hp > 0))
//            { 
//               	playerFlag = 1;
//            	break;
//            }
//            count++;
//        }
//        
//        if(count >= 50)
//        { 
//        	System.out.println("draw!!");
//        }
//        
//        else { 
//        
//        
//        if(playerFlag == 1)
//        { 
//        	System.out.println();
//           	System.out.println("플레이어의 승리!!!");
//        }
//        
//        else if(playerFlag == 2)
//        { 
//          	System.out.println();
//        	System.out.println("적의 승리!!!");
//        }
//        
//        else if(playerFlag == 0 || playerFlag == 3) { 
//          	System.out.println();
//        	System.out.println("draw!!");
//        }
//        
//        }
//
//        player.printInfo();
//        enemy.printInfo();
//
//        
//    }
//}
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
//    public void damaged(int damage) // 피해를 받아 자신의 체력을 감소시킨다.
//    {
//        this.hp -= damage;
//        if (this.hp < 0) {
//            this.hp = 0;
//        }
//    }
//
//    public void attack(Character enemy) {
//        // todo: 공격 메시지를 띄운다.
//    	int newDamage = roll();
//    	System.out.println(name +" "+  newDamage+ "의 데미지로 " + enemy.name+ "을 공격합니다!");
//    	enemy.damaged(newDamage);
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
////    public void damaged(int damage) // 피해를 받아 자신의 체력을 감소시킨다.
////    {
////        this.hp -= damage;
////        if (this.hp < 0) {
////            this.hp = 0;
////        }
////    }
//}