package com.thinking.machines.util;
public class TMArrayList implements TMList
{
private int collection[];
private int size;
public class TMArrayListIterator implements TMIterator
{
private int index;
public TMArrayListIterator()
{
this.index=0;
}
public boolean hasNext()
{
return index!=size;
}
public int next()
{
if(index==size) throw new InvalidIteratorException("Iterator has no more elements");
int data=get(index);
index++;
return data;
}
}
public TMIterator iterator()
{
return new TMArrayListIterator();
}
public TMArrayList()
{
this.collection=new int[10];
this.size=0;
}

public void add(int data)
{
if(this.size==collection.length)
{
int []tmp=new int[this.size+10];
for(int e=0;e<this.size;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
this.collection[this.size]=data;
this.size++;
}


public void add(int index,int data)
{
if(index<0 ||index>this.size) throw new IndexOutOfBoundsException("Invalid index : "+ index);
if(this.size==collection.length)
{
int [] tmp=new int[this.size+10];
for(int e=0;e<this.size;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
for(int e=this.size;e>index;e--) this.collection[e]=this.collection[e-1];
this.collection[index]=data;
this.size++;
}

public void insert(int index,int data)
{
this.add(index,data);
}

public int removeAt(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
int data=this.collection[index];
int ep=this.size-2;
for(int e=index;e<=ep;e++)
{
this.collection[e]=this.collection[e+1];
}
this.size--;
return data;
}

public int get(int index)
{
if(index<0  || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
return this.collection[index];
}

public int size()
{
return this.size;
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
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
this.collection[index]=data;
}

public void copyTo(TMList other)
{
other.clear();
for(int e=0;e<this.size();e++) other.add(this.get(e));
}

public void copyFrom(TMList other)
{
this.clear();
for(int e=0;e<other.size();e++) this.add(other.get(e));
}

public void appendTo(TMList other)
{
for(int e=0;e<this.size;e++) other.add(this.get(e));
}

public void appendFrom(TMList other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
public void forEach(TMListItemAcceptor a)
{
if(a==null) return;
for(int e=0;e<this.size;e++) a.accept(collection[e]);
}
}