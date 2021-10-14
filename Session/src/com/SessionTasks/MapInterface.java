package com.SessionTasks;
import java.util.*;
public class MapInterface{
    public static void main(String[] args) {

    	
    	Map<String,employee2> firstMap=new HashMap<String,employee2>();
    	firstMap.put("N00", new employee2("N00","Vignesh",14000));
    	firstMap.put("N01", new employee2("N01","Rakshith",500000));
    	firstMap.put("N02", new employee2("N02","Venkatesh",700000));
    	firstMap.put("N03",new employee2( "N03","Nihal",13000));
    	firstMap.put("N07",new employee2( "N07","Yashwanth",300000));
    	firstMap.put("N04",new employee2( "N04","Vinay",400000));
    	firstMap.put("N09",new employee2("N09","Uday",600000));
    	firstMap.put("N05",new employee2( "N05","Veeresh",12000));
    	firstMap.put("N06",new employee2( "N06","Sachin",50000));
    	firstMap.put("N08",new employee2( "N08","Virat",90000));
    	
    	
    	
    	TreeMap<String,employee2> sorted=new TreeMap<String,employee2>(firstMap);
    	
    	Iterator<String> it=sorted.keySet().iterator();
    	System.out.println("Sorted value of map");
    	while(it.hasNext()) {
    		String key=(String)it.next();
    		System.out.println(key+" "+firstMap.get(key));
    		}
    			
   
    	Iterator<String> itr=firstMap.keySet().iterator();
    	
    	while(itr.hasNext()) {
    		String key=(String)itr.next();
    		
    		employee2 sal=firstMap.get(key);
    	
    		
    			
					if (sal.esal<15000.0) {
						itr.remove();
						
					}
    	}
    	
    	Map<String,employee2> finalMap=new HashMap<String,employee2>();
    	for(Map.Entry<String, employee2> entry:firstMap.entrySet()) {
    		finalMap.put(entry.getKey(), entry.getValue());
    	}
    	
    	System.out.println("================");
    	System.out.println("Value of new Map after removing the employees having salary less than 15000");
    	Iterator<String> itr1=finalMap.keySet().iterator();
    	while(itr1.hasNext()) {
    		String key=(String)itr1.next();
    		System.out.println(key+" "+firstMap.get(key));
    		}
    	firstMap.clear();
    	sorted.clear();
    	finalMap.clear();
    }
	
	
}

class employee2 {
	String eid;
	String ename;
	double esal;
	public employee2(String eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}
	 
	
}