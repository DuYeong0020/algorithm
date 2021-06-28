import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
			int x=scan.nextInt();
			int y=scan.nextInt();
			selectQuadrant(x,y);
	}
	
	public static void selectQuadrant(int x, int y) {
		
		if(x>0&&y>0) {
			System.out.println(1);
		}else if(x>0&&y<0) {
			System.out.println(4);
		}else if(x<0&&y>0) {
			System.out.println(2);
		}else if(x<0&&y<0) {
			System.out.println(3);
		}
		
	}

}