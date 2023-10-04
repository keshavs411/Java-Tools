package com.java.util;
public class TMLinkedList implements TMList
{
class TMNode
{
private int data;
private TMNode next;
public TMNode()
{
this.data=0;
this.next=null;
}
}
private int size;
private TMNode start,end;
public class TMLinkedListIterator implements TMIterator
{
private TMNode ptr;
public TMLinkedListIterator(TMNode ptr)
{
this.ptr=ptr;
}
public boolean hasNext()
{
return this.ptr!=null;
}
public int next()
{
if(ptr==null) throw new InvalidIteratorException("Iterator has no more elements");
int data=this.ptr.data;
this.ptr=this.ptr.next;
return data;
}
}
public TMIterator iterator()
{
return new TMLinkedListIterator(this.start);
}

public void add(int data)
{
TMNode t=new TMNode();
t.data=data;
if(this.start==null)
{
this.start=t;
this.end=t;
}
else
{
this.end.next=t;
this.end=t;
}
this.size++;
}
public void add(int index,int data)
{
if(index<0 || index>this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
TMNode t,p1,p2=null;
t=new TMNode();
int x;
t.data=data;
if(index>=this.size)
{
this.add(data);
return;
}
else if(index==0) 
{
t.next=this.start;
this.start=t;
this.size++;
return;
}
x=0;
p1=this.start;
while(x<index)
{
p2=p1;
p1=p1.next;
x++;
}
p2.next=t;
t.next=p1;
this.size++;
}
public void insert(int index,int data)
{
this.add(index,data);
}

public int removeAt(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : " +index);
int x,data;
TMNode p1,p2=null;
if(this.start==this.end)
{
data=this.start.data;
this.start=null;
this.end=null;
this.size--;
return data;
}
else if(index==0)
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
x=0;
p1=this.start;
while(x<index)
{
p2=p1;
p1=p1.next;
x++;
}
data=p1.data;
p2.next=p1.next;
if(this.end==p1)
{
this.end=p2;
}
this.size--;
return data;
}

public void removeAll()
{
this.size=0;
}

public void clear()
{
this.removeAll();
}

public void update(int index,int data)
{
TMNode p1;
int x;
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
if(index==0)
{
this.start.data=data;
return;
}
if(index==this.size-1)
{
this.end.data=data;
return;
}
x=0;
p1=this.start;
while(x<index)
{
p1=p1.next;
x++;
}
p1.data=data;
}

public void copyTo(TMList other)
{
other.clear();
for(int x=0;x<this.size();x++) other.add(this.get(x));
}
public void copyFrom(TMList other)
{
this.clear();
for(int x=0;x<other.size();x++) this.add(other.get(x));
}
public void appendTo(TMList other)
{
for(int x=0;x<this.size();x++) other.add(this.get(x));
}
public void appendFrom(TMList other)
{
for(int x=0;x<other.size();x++) this.add(other.get(x));
}

public int size()
{
return this.size;
}
public int get(int index)
{
TMNode p1;
int x;
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
x=0;
p1=this.start;
while(x<index)
{
p1=p1.next;
x++;
}
return p1.data;
}

public void forEach(TMListItemAcceptor a)
{
if(a==null) return;
TMNode t;
for(t=start;t!=null;t=t.next) a.accept(t.data);
}
}