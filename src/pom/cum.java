package pom;
import java.util.TreeSet;
public class cum {
	static TreeSet get_collection_value()
{
TreeSet a1=new TreeSet();
a1.add(10);
a1.add(5);
a1.add(20);
a1.add(15);
a1.add(10);
a1.add(20);
return a1;
}
public static void main(String[]args)
{
	TreeSet a2=get_collection_value();
System.out.println(a2);

}
}
