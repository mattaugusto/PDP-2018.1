package adapter;

import java.util.ArrayList;
import java.util.TreeMap;
import target.NewTreeMap;

@SuppressWarnings("serial")
public class TreeMapAdapter extends TreeMap<Integer,String> implements NewTreeMap {
	
	public TreeMapAdapter(ArrayList<ArrayList<String>> matriz) {
		
		for(ArrayList<String> keyValue: matriz) {
			this.put(Integer.parseInt(keyValue.get(0)), keyValue.get(1));
		}
		
	}

}
