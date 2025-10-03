package com.java.core.selfdeveloped.collection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Employee {
	private Integer id;
	private String name;
	
	//let's Implement hashcode() and equals() methods
	
//	@Override
//	public boolean equals(Object obj){
//		if(this==obj) {
//			return true;
//		}
//		if(obj==null) {
//			return false;
//		}
//		if(this.getClass()!=obj.getClass()) {
//			return false;
//		}
//		
//		Employee emp = (Employee) obj;
//		return (this.id==emp.id || this.id.equals(emp.id))&&
//				(this.name==emp.name || this.name.equals(emp.name));
//	}
//	
//	@Override
//	public int hashCode() {
//		int hash = (this.id.hashCode() + this.name.hashCode());
//		return hash;
//	}
}
