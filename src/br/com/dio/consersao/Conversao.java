package br.com.dio.consersao;

public class Conversao {

	public static void main(String[] args) {
		 byte b1;
		 short s1 = 1000;
		 b1 =(byte) s1;
		 
		 long l1;
		 int il = 10;
		 l1 = il;
		 
		 int i2;
		 long l2 = 10000000000000000L;
		 i2 = (int) l2;
		 
		 int i3;
		 long l3 = 10000L;
		 i3 = (int) l3;
		 
		 double d1;
		 float f1 = 10.5f;
		 d1 = f1;
		 
		 float f2;
		 float f3;
		 double d2 = 100000.56d;
		 f2 = (float) d2;
		 
		 int i4;
		 float f4 = 11.56676f;
		 i4 = (int) f4;
		 
		 System.out.println(" :" + s1 );
		 System.out.println(" :" + il );
		 System.out.println(" :" + l2 );
		 System.out.println(" :" + l3);
		 System.out.println(" :" + d2 );
		 System.out.println(" :" + f4 );
		 System.out.println(" :" + d1 );
		 
	}

}
