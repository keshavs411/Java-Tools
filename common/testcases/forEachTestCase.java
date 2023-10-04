import com.thinking.machines.util.*;
class TMIteratorTestCase
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
for(int e=0;e<=10;e++) list1.add(e);
list1.forEach((p)->{
System.out.println(p);
});
System.out.println("*******************");
TMArrayList list2=new TMArrayList();
for(int e=1001;e<=1011;e++) list2.add(e);
list2.forEach((p)->{
System.out.println(p);
});

}
}