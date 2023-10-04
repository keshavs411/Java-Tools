package com.thinking.machines.util;
import java.io.*;
public class Keyboard
{
BufferedReader bufferedReader;
public Keyboard()
{
bufferedReader=new BufferedReader(new InputStreamReader(System.in));
}
public String getString()
{
String str;
try
{
str=bufferedReader.readLine();
}catch(IOException ioException)
{
str="";
}
return str;
}

public String getString(String message)
{
System.out.print(message);
return getString();
}

public char getCharacter()
{
return getString().charAt(0);
}

public char getCharacter(String message)
{
System.out.print(message);
return getCharacter();
}

public long getLong()
{
long m;
try
{
m=Long.parseLong(getString());
}catch(NumberFormatException numberFormatException)
{
m=0;
}
return m;
}

public long getLong(String message)
{
System.out.print(message);
return getLong();
}

public int getInt()
{
int m;
try
{
m=Integer.parseInt(getString());
}catch(NumberFormatException numberFormatException)
{
m=0;
}
return m;
}

public int getInt(String message)
{
System.out.print(message);
return getInt();
}

public short getShort()
{
short m;
try
{
m=Short.parseShort(getString());
}catch(NumberFormatException numberFormatException)
{
m=0;
}
return m;
}

public short getShort(String message)
{
System.out.print(message);
return getShort();
}

public byte getByte()
{
byte m;
try
{
m=Byte.parseByte(getString());
}catch(NumberFormatException numberFormatException)
{
m=0;
}
return m;
}

public byte getByte(String message)
{
System.out.print(message);
return getByte();
}

public double getDouble()
{
double m;
try
{
m=Double.parseDouble(getString());
}catch(NumberFormatException numberFormatException)
{
m=0;
}
return m;
}

public double getDouble(String message)
{
System.out.print(message);
return getDouble();
}

public float getFloat()
{
float m;
try
{
m=Float.parseFloat(getString());
}catch(NumberFormatException numberFormatException)
{
m=0;
}
return m;
}

public float getFloat(String message)
{
System.out.print(message);
return getFloat();
}

public boolean getBoolean()
{
Boolean m;
try
{
m=Boolean.parseBoolean(getString());
}catch(NumberFormatException numberFormatException)
{
m=false;
}
return m;
}

public boolean getBoolean(String message)
{
System.out.print(message);
return getBoolean();
}

}