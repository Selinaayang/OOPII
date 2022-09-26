//A1063308
import java.util.*;
public class week2HW1 {

	public static void main(String[] args) {
		TreeSet<Integer> intSet=new TreeSet<>();
		int num=1;
		
		System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼...");
		
		while(intSet.size()<10){
			int r=(int)(Math.random()*100)+1;//亂數1-100
			if(intSet.contains(r)){
				continue;//重複的不加入
			}else{
				intSet.add(r);
			}
			System.out.println("第"+num+"個號碼："+r);num++;
		}
		
		System.out.println("物件內元素個數為："+intSet.size());
		System.out.println("物件內元素的內容："+intSet);
		System.out.println("第一個元素內容為："+intSet.first());
		System.out.println("最後一個元素內容："+intSet.last());

		System.out.println("內容介於30~70者："+intSet.subSet(31,70));
		//fromElement是包含的，toElement是排除的
	}

}
