import com.java.util.*;
class KeyboardTestCase
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
a=k.getString("Enter a String : ");
char b;
b=k.getCharacter("Enter a character : ");
long c;
c=k.getLong("Enter a long type value : ");
int d;
d=k.getInt("Enter an int type value : ");
short e;
e=k.getShort("Enter a short type value : ");
byte f;
f=k.getByte("Enter a byte type value : ");
double g;
g=k.getDouble("Enter a double type value : ");
float h;
h=k.getFloat("Enter a float type value : ");
boolean i;
i=k.getBoolean("Enter a boolean type value : ");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
}
}
