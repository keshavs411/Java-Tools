import java.lang.reflect.*;
class Analyzer
{
public static void main(String gg[])
{
if(gg.length!=1)
{
System.out.println("Usage : java Analyzer class_name");
return;
}
try
{
String classToAnalyze=gg[0];
Class c=Class.forName(classToAnalyze);
System.out.println("Name(include package) : "+c.getName());
System.out.println("Simple Name : "+c.getSimpleName());
Method methods[];
methods=c.getMethods();
System.out.println("Number of methods :"+methods.length);
Method m;
String methodName;
Class methodReturnType;
Class parameters[];
int e,i;
for(e=0;e<methods.length;e++)
{
m=methods[e];
methodName=m.getName();
System.out.println("Name of method : "+methodName);
methodReturnType=m.getReturnType();
System.out.println("Return type :" +methodReturnType.getName());
parameters=m.getParameterTypes();
System.out.println("Number of parameters : " +parameters.length);
for(i=0;i<parameters.length;i++)
{
System.out.printf("Parameter number %d , Type : %s\n",i+1,parameters[i].getName());
}
System.out.println("------------------------------------------------------------------------------");
}
Field fields[];
fields=c.getFields();
System.out.println("Number of fields : " +fields.length);
Field f;
String fieldName;
Class fieldType;
for(i=0;i<fields.length;++i)
{
f=fields[i];
fieldName=f.getName();
fieldType=f.getType();
System.out.printf("Field numeber : %d ,Name :  %s , Type : %s \n",i+1,fieldName,fieldType.getName());
}
}catch(ClassNotFoundException cnfe)
{
System.out.println("Class :"+ cnfe.getMessage()+ " Not found");
}
}
}