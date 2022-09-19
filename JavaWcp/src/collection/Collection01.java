package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Collection01 {
	public static void main(String[] args) {
//		list
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("りんご");
		list1.add("みかん");
		list2.add(1);
		
		list1.add(1,"バナナ");
		
		System.out.println(list1.get(0));
		System.out.println(list1.contains("バナナ"));
		System.out.println(list1.size());
		
		list1.remove(0);
		System.out.println(list1.get(0));
		
//		map
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
		
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		map2.put("人","歩く");
		
		map1.put(0, "マスカット");
		System.out.println(map1.get(0));
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));
		System.out.println(map1.size());
		
		map1.remove(0);
		System.out.println(map1.get(0));
		
//		set
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		set1.add("スイカ");
		set1.add("メロン");
		set1.add("ウリ");
		set2.add(2);
		
		for(String set : set1) {
			System.out.println(set);
		}
		
		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.size());
		
		set1.remove("スイカ");
	}
}
