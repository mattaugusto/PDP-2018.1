package main;

import java.util.ArrayList;
import java.util.Map;

import adapter.TreeMapAdapter;

public class Client {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> keyValue = new ArrayList<String>();
		ArrayList<String> keyValue2 = new ArrayList<String>();
		
		keyValue.add("0");
		keyValue.add("pudim");
		
		keyValue2.add("1");
		keyValue2.add("lasanha");
		
		matriz.add(keyValue);
		matriz.add(keyValue2);
		
		TreeMapAdapter tmapAdapter = new TreeMapAdapter(matriz); 
		
		for(Map.Entry<Integer, String> entry : tmapAdapter.entrySet()) {
			  Integer key = entry.getKey();
			  String value = entry.getValue();

			  System.out.println(key + " => " + value);
		}
	}

}
