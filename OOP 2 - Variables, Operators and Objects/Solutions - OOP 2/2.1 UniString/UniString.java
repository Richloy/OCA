// Assignment 2.1 UniString

 public class UniString{ 
   public static void main(String[] args){
	/* 
	  Note, unicode for the € symbol outputs as a ? in MS-DOS. This is because
      the € symbol is not part of MS-DOS's default character set. There is a 
	  workaround but for the purposes of the assignment, it is fine to output the ?
	*/
	 char euroChar = '\u20AC';
	 char one = '1';
	 char eight = '8';
		
	 System.out.println(euroChar+ "" + one+ "" + eight+ "" + eight);
		
	 char jChar = 'j';
	 char oChar = 'o';
	 char eChar = 'e';

	 System.out.print(Character.toUpperCase(jChar));
	 System.out.print(Character.toUpperCase(oChar));
	 System.out.print(Character.toUpperCase(eChar));
	}
 }