import com.java.util.*;
class TMIteratorTestCase
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
for(int e=0;e<=10;e++) list1.add(e);
TMArrayList list2=new TMArrayList();
for(int e=1001;e<=1011;e++) list2.add(e);

System.out.println("Iterating on linkedList");

TMIterator iterator1=list1.iterator();
int x;
while(iterator1.hasNext())
{
x=iterator1.next();
System.out.println(x);
}

System.out.println("Iterating on ArrayList");

TMIterator iterator2=list2.iterator();
while(iterator2.hasNext())
{
x=iterator2.next();
System.out.println(x);
}
}
}