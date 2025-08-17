package ct.week02;

import java.util.List;
import java.util.ArrayList;

/*
 * List 
 */
public class EX21 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //다형성
		list.add("Java");   // add는 리스트 내 값을 추가
		list.add("Spring");
		list.add("MyBatis");
		System.out.println(list.toString());
		list.add(2,"Oracle");
		System.out.println(list.toString());
		
		list.set(3, "Mybatis");  // set은 수정함
		System.out.println(list.toString());
		
		list.remove(0); // remove는 삭제
		System.out.println(list.toString());
		list.add("Mybatis");
		list.add("Mybatis");
		System.out.println(list.toString());
		list.remove("Mybatis");
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.clear();
		if(list.isEmpty()) { //list.size() == 0
			
		}else {
			
		}
	}
}
