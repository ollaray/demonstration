package com.demonstration.study.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	//The Map DS is a collection but doesn't implement the collection framework, it stores data in key value pairs
	//The key of a map is always unique.
	//The Map is an interface which is implemented by: HashMap, LinkedHashMap, HashTable and TreeMap
	
	//HashMap is unsorted, unordered and it uses the key's hashcode()
	
	//Hashtable is synchronized, thread safe version of he HashMap it also implements the Map interface: it is unsorted and unordered; it uses the key's hashcode;
	//While hashmap allows a key to be null, Hashtable doesn't
	
	
	//LinkedHasMap: it implements the Map interface; Insertion order is maintained but not sorted; Slower insertion & deletion; faster iteration
	
	//TreeMap: Sorted Order is maintained, Implements both the Map and NavigableMap interfaces
	
	//When you see Hash with any collection(Hashtable, HashMap,...) just know that such collection uses the hashcode, unsorted and unordered
	//When you see Linked with any collection just know that it is ordered(maintains insertion order), unsorted but uses the hashcode
	//when you see Tree with any collection e.g TreeMap, TreeSet,..(Tree structure) know that it is sorted in natural order and uses the 
	//NavigableSet or NavigableMap,...
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static Map<String, Integer> map = Map.of("A",3, "B",5, "Z", 10);
	
	public static void basicMapOps() {
		//Basic Map Operations
		
		System.out.println(map.get("A"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue(3));
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
	
	public static void hashMapOps() {
		Map<String, Integer> hashMap = new HashMap<>(map);
		hashMap.put("F", 5);
		hashMap.put("L", 250);
		System.out.println(hashMap);
	}
	
	public static void hashMapOperation() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 5);
		hashMap.put("Z", 15);
		hashMap.put("F", 25);
		hashMap.put("L", 250);
		System.out.println(hashMap);
	}
	public static void linkedHashMapOps() {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("A", 5);
		linkedHashMap.put("Z", 15);
		linkedHashMap.put("F", 25);
		linkedHashMap.put("L", 250);
		System.out.println(linkedHashMap);
	}
	
	public static void treeMapOps() {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("A", 5);
		treeMap.put("Z", 15);
		treeMap.put("F", 25);
		treeMap.put("L", 250);
		System.out.println(treeMap);
	}
	
	public static void treeMapCollection() {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("A", 5);
		treeMap.put("Z", 15);
		treeMap.put("F", 25);
		treeMap.put("L", 250);
		treeMap.put("B", 35);
		treeMap.put("G", 100);
		System.out.println(treeMap);
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.higherKey("B")); //> B
		System.out.println(treeMap.ceilingKey("B"));    //>= B
		System.out.println(treeMap.lowerKey("B"));		// < C
		System.out.println(treeMap.floorKey("B"));		//<=B
		System.out.println(treeMap.firstEntry());
		System.out.println(treeMap.lastEntry());
		System.out.println(treeMap.subMap("C", "Y"));
		System.out.println(treeMap.subMap("B",true, "Z",true));
	
	}
	
	//Looping True a Map
	//Simply put, we can extract the contents of a Map using entrySet(), keySet(), or values(). 
	//Since these are all sets, similar iteration principles apply to all of them.
	
	public static void firstMapLoop() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 5);
		hashMap.put("Z", 15);
		hashMap.put("F", 25);
		hashMap.put("L", 250);
		hashMap.put("B", 35);
		hashMap.put("G", 100);
		Iterator<Map.Entry<String, Integer>> itr = hashMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key = "+entry.getKey()+ " Value "+entry.getValue());
		}
	}
	
	//looping using foreach 
	public static void secondMapLoop() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 5);
		hashMap.put("Z", 15);
		hashMap.put("F", 25);
		hashMap.put("L", 250);
		hashMap.put("B", 35);
		hashMap.put("G", 100);
		for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
	}
	
	public static void thirdMapLoop() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 5);
		hashMap.put("Z", 15);
		hashMap.put("F", 25);
		hashMap.put("L", 250);
		hashMap.put("B", 35);
		hashMap.put("G", 100);
		for(String key: hashMap.keySet()) {
			System.out.println("Key = "+key+" Value = "+hashMap.get(key));
		}
	}
	

}
