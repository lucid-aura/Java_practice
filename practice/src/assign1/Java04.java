package assign1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java04 {

	public static void main(String[] args)  throws Exception{
		String name1 = "홍길동";
		String name2 = "일지매";
		String name3 = "장옥정";
		
		int age1 = 20;
		int age2 = 18;
		int age3 = 14;
		
		boolean man1 = true;
		boolean man2 = true;
		boolean man3 = false;
		
		String phone1 = "010-111-2222";
		String phone2 = "02-123-4567";
		String phone3 = "02-345-7890";
		
		double height1 = 175.12;
		double height2 = 180.01;
		double height3 = 155.78;
		
		String address1 = "경기도";
		String address2 = "서울";
		String address3 = "부산";
		
		
		System.out.println("============================================================");
		System.out.println("\\ name\t\tage\t\tman\tphone\t\t\theight\taddress\t\\");
		System.out.println("============================================================");
		System.out.println("\\ "+ name1 + "\t\t" + age1 + "\t\t" + man1 + "\t"  + phone1 + "\t" + height1 + "\t\"" + address1 + "\"\t\\");
		System.out.println("\\ "+ name2 + "\t\t" + age2 + "\t\t" + man2 + "\t"  + phone2 + "\t" + height2 + "\t\"" + address2 + "\"\t\\");
		System.out.println("\\ "+ name3 + "\t\t" + age3 + "\t\t" + man3 + "\t"  + phone3 + "\t" + height3 + "\t\"" + address3 + "\"\t\\");
		System.out.println("============================================================");

		
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("name = ");
		String name = scan.next();
		
		System.out.print("age = ");
		int age = scan.nextInt();
		
		System.out.print("man = ");
		boolean man = scan.nextBoolean();
		
		System.out.print("phone = ");
		String phone = scan.next();
		
		System.out.print("height = ");
		double height = scan.nextDouble();
		
		System.out.print("address = ");
		String address = br.readLine();
		
		System.out.print("============================================================\n");
		System.out.print("\\ name\t\tage\t\tman\tphone\t\t\theight\taddress\t\\\n");
		System.out.print("============================================================\n");
		System.out.print("\\ "+ name + "\t\t" + age + "\t\t" + man + "\t"  + phone + "\t" + height + "\t\"" + address + "\"\t\\\n");
		System.out.print("============================================================\n");
	}

}

