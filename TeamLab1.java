import java.util.Scanner;
public class TeamLab1 {
	public static void main(String[] args) {
		int X= 1;
		int Y= 0;
		int Z= 5;
		for(int i = 4; i < 29; i++){
		  int A = X + Y + Z; 
		  X = Y;
			Y = Z;
			Z = A;
			System.out.println(i + "回"+ A + " ");
		}
	}
}