package ct.week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * add말고 put을 쓰자
 */
public class EX25 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 70);
		map.put("이몽룡", 100);
		map.put("변학도", 80);
		map.put("홍길동", 90);
		
		System.out.println(map.size()); // 3
		System.out.println(map.get("홍길동")); // 90
		System.out.println(map.get("홍길도")); // null
		System.out.println(map.getOrDefault("홍길도", 0)); // 0
		
		//map -> set
		Set<String> keySet = map.keySet();
		for(String s : keySet) {
			System.out.printf("%s = %d\n",s, map.get(s));
		}
		
		map.remove("홍길동");
		System.out.println(map.isEmpty());
		System.out.println(map.size());
	}
}
