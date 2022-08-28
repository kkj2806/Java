package sub3;

public class Car {
	
	//속성
	private String name;
	private String color;
	private int speed;
	public static int count;
	
	
	//생성자
	
	public Car(String name,String color,int speed ) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	//기능
	public void speedUp(int speed) {
		this.speed +=speed;
	}
	
	public void speedDown(int speed) {
		this.speed -=speed;
	}
	
	public void show() {
		System.out.println("차량명 : " +name);
		System.out.println("차량색상 : "+ color);
		System.out.println("현재속도 : "+ speed);
		System.out.println("차량변호 : "+ count);
	}
	
	
	
	
}	
