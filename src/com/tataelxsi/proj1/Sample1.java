package com.tataelxsi.proj1;

public class Sample1 {

	public static void main(String[] args) {
		Employee e1 = new Employee () ;
		e1.setId(1001);
		e1.setName("Sanvi");
		e1.setSalary(30000);
	}
	
}
		class Employee
		{
			int id;
			String name;
			int salary;
			
			int annualSalary() {
				int res;
				res = 12 * salary;
				return res;
			}
			public void setSalary(int i) {
				id = i;
				
				
			}
			public void setName(String string) {
				// TODO Auto-generated method stub
				
			}
			public void setId(int i) {
				// TODO Auto-generated method stub
				
			}
			void display() {
				System.out.println("The id is:"+id);
				System.out.println("The name is:"+name);
				System.out.println("The salary is:"+salary);
			}
		}

	


