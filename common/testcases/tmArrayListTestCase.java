import com.thinking.machines.util.*;
class TestCase
{
public static void main(String gg[])
{
TMArrayList list1=new TMArrayList();
list1.add(100);
list1.add(200);
list1.add(300);
list1.add(400);
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
list1.removeAt(0);
System.out.println("After removing");
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
list1.removeAt(1);

System.out.println("After removing");
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
list1.removeAt(1);

System.out.println("After removing");
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
list1.insert(0,100);
System.out.println("After inserting");
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
System.out.println("After inserting");
list1.insert(2,200);
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
System.out.println("After inserting");
list1.insert(1,1456);
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));

}
}