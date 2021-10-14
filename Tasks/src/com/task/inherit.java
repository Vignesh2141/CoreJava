package com.task;

class inherit
{
public static void main (String args[])
{
a superOb = new a();
b subOb = new b();

// the superclass may be used by itself
superOb.i = 10;
superOb.j = 20;
System.out.println("Contents of superOb:");
superOb.showij() ;
System.out.println ( );
//the subclass has access to all public members of its superclass
subOb. i = 1;
subOb. j = 2;
subOb. k = 3;
System.out.println ("Contents of supOb:" );
subOb.showij ( ) ;
subOb.showk ( );
System.out.println ( );
System.out.println ("Sum of i, j and k in subob:" );
subOb.sum ( );
}
} 
