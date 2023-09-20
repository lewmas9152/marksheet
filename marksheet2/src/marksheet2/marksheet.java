package marksheet2;

import java.util.Scanner;

public class marksheet {

	public static void main(String[] args) {
		int n=3;
	    int[] no = new int[n];
	    String[] name =new String[n];
	    int [] sub1 = new int[n];
	    int [] sub2 = new int[n];
	    int[] sub3 = new int[n];
	    int[] sub4 = new int[n];
	    int[] sub5 = new int[n];
	    int[] total =new int[n];
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the sNo: ");
		for (int i=0; i<n;i++) {
			no[i] = input.nextInt();
		}
		
		System.out.println("Enter the student names: ");
		for (int i=0; i<n;i++) {
			name[i] = input.next();
		}
		
		System.out.println("Enter sub1 marks: ");
		for (int i=0; i<n;i++) {
			sub1[i] = input.nextInt();
		}
		System.out.println("Enter sub2 marks: ");
		for (int i=0; i<n;i++) {
			sub2[i] = input.nextInt();
		}
		
		System.out.println("Enter sub3 marks: ");
		for (int i=0; i<n;i++) {
			sub3[i] = input.nextInt();
		}
		
		System.out.println("Enter sub4 marks: ");
		for (int i=0; i<n;i++) {
			sub4[i] = input.nextInt();
		}
		
		System.out.println("Enter sub5 marks: ");
		for (int i=0; i<n;i++) {
			sub5[i] = input.nextInt();
		}
		
		System.out.println("Welcome to Student Mark list Application");
		String hyphen = new String(new char[70]).replace('\0','_');
		System.out.println(hyphen);
		System.out.println("SNo" + "   Student Name" + "     " + "Sub1" + "   " +"Sub2" +"   "+ "Sub3" + "   "+ "Sub4" + "   " + "Sub5" + "   " + "Total" +"   "+"Average");
		System.out.println(hyphen);
		System.out.println(no[0]+ "     " + name[0]+ "           "  + sub1[0]+ "     "  +sub2[0]+ "     "  + sub3[0]+ "      "  + sub4[0]+ "     "  + sub5[0] +"    "+(sub1[0]+sub2[0]+sub3[0]+sub5[0])+"     " +((sub1[0]+sub2[0]+sub3[0]+sub5[0])/5));
		System.out.println(no[1]+ "     " + name[1]+ "          "  + sub1[1]+ "     "  +sub2[1]+ "     "  + sub3[1]+ "      "  + sub4[1]+ "     "  + sub5[1] + "   "+(sub1[1]+sub2[1]+sub3[1]+sub5[1])+"     " + ((sub1[1]+sub2[1]+sub3[1]+sub5[1])/5));
		System.out.println(no[2]+ "     " + name[2]+ "        "  + sub1[2]+ "     "  +sub2[2]+ "     "  + sub3[2]+ "      "  + sub4[2]+ "     "  + sub5[2] +"    "+(sub1[2]+sub2[2]+sub3[2]+sub5[2])+"     " + ((sub1[2]+sub2[2]+sub3[2]+sub5[2])/5));
		System.out.println("Average:"+"               "+((sub1[0]+sub1[1]+sub1[2])/3)+"     "+((sub2[0]+sub2[1]+sub2[2])/3)+"     "+((sub3[0]+sub3[1]+sub3[2])/3)+"      "+((sub4[0]+sub4[1]+sub4[2])/3)+"     "+((sub5[0]+sub5[1]+sub5[2])/3));
		System.out.println(hyphen);
		

		
		
		
		

	}

}
