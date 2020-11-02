package pom;

import java.util.PriorityQueue;
public class dropdown {
public static void main(String[]args)
{
	PriorityQueue a1= new PriorityQueue();
	a1.add(10);
	a1.add(5);
	a1.add(20);
	a1.add(15);
	a1.add(10);
	a1.add(20);
	System.out.println(a1);
	System.out.println(a1.poll());
	System.out.println(a1);
	System.out.println(a1.peek());
	System.out.println(a1);
}
}
