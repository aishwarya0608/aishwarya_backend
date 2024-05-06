package secondproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeHashMap {
	
	
	
	int id;
	String name;
	String dept;
	String designation;
	
	public EmployeeHashMap(int id,String name,String dept,String designation) {
		
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.designation=designation;
		
	}
	
	public int getid() {
	return id;
	}
	
	public void setid() {
		this.id=id;
	}
	
	public String getname() {
		return name;
	}
	public void setname() {
		this.name=name;
	}
	
	public String getdept() {
		return dept;
	}
	public void setdept() {
		this.dept=dept;
	}
public String getdesignation() {
	return designation;
}
	public void setdesignation() {
		this.designation=designation;
	}
	
	public static void main(String[] args) {
		 
		HashMap<Integer, EmployeeHashMap> hashMap = new HashMap<>();
		
		EmployeeHashMap emp1 = new EmployeeHashMap(4,"Rashmi","Computer Scinece","HR");
		EmployeeHashMap emp2 = new EmployeeHashMap(1,"Aishwarya","Chemistry","Manager");
		EmployeeHashMap emp3 = new EmployeeHashMap(3,"chetana","Physics","lecturer");
		EmployeeHashMap emp4 = new EmployeeHashMap(5,"smitha","biology","assitant professor");
		EmployeeHashMap emp5 = new EmployeeHashMap(2,"soumya","biology","professor");
		
		hashMap.put(4, emp1);
        hashMap.put(1, emp2);
        hashMap.put(3, emp3);
        hashMap.put(5, emp4);
        hashMap.put(2, emp5);

        
        for (Entry<Integer, EmployeeHashMap> entry : hashMap.entrySet()) {
            System.out.println("id: " + entry.getKey() + ", name: " + entry.getValue().getname() +
                    ", dept: " + entry.getValue().getdept() + ", designation: " + entry.getValue().getdesignation());
		
	}
	}
}
