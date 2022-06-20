


class Test{
	int fee;
    int id;
    String name;
    
    Test(int fee,int id,String name)
    {
    	this.fee=fee;
    	this.id=id;
    	this.name=name;//this refer to the current instance variable
    }
    
    
	void display() {
		System.out.println(fee+" "+id+" "+name);
	}
	
}
public class IthisKeyword {
	
	/*
	 * IthisKeyword(int f,int i) { fee=f; id=i; System.out.println(f+ " "+i);
	 * 
	 * }
	 */
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IthisKeyword tk=new IthisKeyword(10,20);
		Test tk1=new Test(10,20,"meghana");
		tk1.display();

	}

}
