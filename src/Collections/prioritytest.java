package Collections;

import java.util.PriorityQueue;

public class prioritytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("zibra");
		queue.add("meghana");
		queue.add("darshan");
		queue.add("darshan");
		queue.add("darshan");
		queue.add("meghana");


		for(String q:queue)
		{
			System.out.println(q);
		}
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.remove());
		System.out.println(queue.poll());




		
	}

}
