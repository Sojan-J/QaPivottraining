package multipicationTable;
import java.util.Scanner;
public class multimain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		MultTableUpto10 mTable= new MultTableUpto10();
		System.out.println("please enter a number: ");
		mTable.Number=input.nextInt();
		mTable.multiTable();

	}

}
