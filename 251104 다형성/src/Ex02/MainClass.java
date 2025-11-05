package Ex02;


abstract class Player{
	abstract void play(int pos);
	abstract void stop();
	
	void func(){}
}

class AudioPlayer extends Player{
	
	void play(int pos) {
		System.out.println("------AutioPlayer-------");
	}
	void stop() {
		
	}
}

class CDPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println("------CDPlayer--------");
	}

	@Override
	void stop() {

	}
		
}

abstract class MYMYPlayer extends Player{
	
	@Override
	void play(int pos) {
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {

		//1. 추상 클래스는 객체 생성 불가
		// Player p1 = new Player();
		
		Player p = new AudioPlayer();
		p.play(1);
		
		p = new CDPlayer();
		p.play(1);
	}
}
