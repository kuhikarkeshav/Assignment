
class Dog {
	int leg;
}
public class Main {
	public static void main(String[] args) {
    	Dog d1 = new Dog();
    	d1.leg = 4;
    	Dog d2 = new Dog();
    	d2.leg = 3;
    	swap(d1, d2);
    	System.out.println("d1.leg = "+d1.leg);
    	System.out.println("d2.leg = "+d2.leg);
    	modify(d1);
    	System.out.println("d1.leg = "+d1.leg);
	}
	static void swap(Dog d1, Dog d2) {
    	Dog temp = d2;
    	d2 = d1;
    	d1 = temp;
	}
	static void modify(Dog d1) {
    		d1.leg = 0;
	}
}
