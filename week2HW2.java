//A1063308
import java.util.HashMap;
import java.util.Scanner;

public class week2HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var hmap=new HashMap<>();
		hmap.put(1,"January");
		hmap.put(2,"February");
		hmap.put(3,"March");
		hmap.put(4,"April");
		hmap.put(5,"May");
		hmap.put(6,"June");
		hmap.put(7,"July");
		hmap.put(8,"August");
		hmap.put(9,"September");
		hmap.put(10,"October");
		hmap.put(11,"November");
		hmap.put(12,"December");
		
		while(true) {
			System.out.println("請輸入1~12？");
			Scanner sc=new Scanner(System.in);
			int month=sc.nextInt();
			if(month<1 || month>12) {
				System.out.println("範圍錯誤！");
				continue;
			}else {
				System.out.println(month+"月的英文單字為"+hmap.get(month));
				break;
			}
		}
		
	}

}
