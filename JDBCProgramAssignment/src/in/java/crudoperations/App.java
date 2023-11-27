package in.java.crudoperations;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU:\n1.INSERT\n2.SELECT\n3.UPDATE\n4.DELETE");
		System.out.println("****************************************");
		System.out.print("SELECT THE CHOICE OF OPERATION U WANT TO PERFOEM\nPlease enter a number:  ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				InsertApp.insertion();
				break;
			case 2:
				SelectApp.selection();
				break;
			case 3:
				UpdateApp.updation();
				break;
			case 4:
				DeleteApp.deletion();
				break;
			default:
				System.out.println("enter a number between (1-4)");
		}
		

	}


}
