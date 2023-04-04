package multipicationTable;

public class MultTableUpto10 {
	int Number;
	int multiNumber;
	void multiTable() {
		for(int i=1; i<=10;i++) {
			multiNumber=Number*i;
			System.out.println(i+" X "+Number+" = "+multiNumber);
		}
	}

}
