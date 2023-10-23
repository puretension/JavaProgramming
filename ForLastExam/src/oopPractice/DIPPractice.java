//package oopPractice;
//import java.util.*;
//
//interface Weaponable{
//	int attack();
//}
//
//class OneHandSword implements Weaponable{
//	final String name;
//	final int damage;
//	OneHandSword(String name, int damage){
//		this.name = name;
//		this.damage = damage;
//	}
//	public int attack() {
//		return damage;
//	}
//}
//
//class TwoHandSword extends OneHandSword{
//
//	TwoHandSword(String name, int damage) {
//		super(name, damage);
//	}
//	
//}
//
//class BatteAxe extends OneHandSword{
//
//	BatteAxe(String name, int damage) {
//		super(name, damage);
//	}
//	
//}
//
//class WarHammer extends OneHandSword{
//
//	WarHammer(String name, int damage) {
//		super(name, damage);
//	}
//	
//}
//
//class Character{
//	Weaponable weapon;
//	String name;
//	int health;
//	public Character(Weaponable weapon,String name, int health) {
//		this.weapon = weapon;
//		this.name = name;
//		this.health = health;
//	}
//	int attack() {
//		return weapon.attack();
//	}
//	void changeWeapon(Weaponable weapon) {
//		this.weapon = weapon;
//	}
//	
//}
//
//public class DIPPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//}
