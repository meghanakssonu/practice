package inheritence;

class Address{
	String info;
	String city;
	String state;
	Address(String info,String city,String state)
	{
		this.info=info;
		this.city=city;
		this.state=state;	
	}
	
}

class Emp{
	int id;
	String name;
	Address Address;
	Emp(int id,String name,Address Address)
	{
		this.id=id;
		this.name=name;
		this.Address=Address;	
	}
	
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(Address.city+" "+Address.info+" "+Address.state);

	}
	
	
}

public class Iagreegation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1=new Address("bdvt","acbdg","karnataka");

		Emp e1=new Emp(1,"meghana",a1);
		e1.display();
		
		

	}

}
