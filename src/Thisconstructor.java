
public class Thisconstructor{
	int id;
	String student;
	String name;
	String itr;
	

	Thisconstructor(int id,String student,String name)
	{
		this.id=id;
		this.student=student;
		this.name=name;
	}
	Thisconstructor(int id,String student,String name,String itr)
	{
		this(id,student,name);//reusing constructor
		this.itr=itr;
	}
	
	void display()
	{
		System.out.println(id+" "+student+" "+name+ "  "+itr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thisconstructor tc=new Thisconstructor(10,"meghana","avs","abc");

		Thisconstructor tc1=new Thisconstructor(20,"royalstag","ib");
		tc.display();
		tc1.display();
		
		

	}

}
