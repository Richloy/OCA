// Note: compiler errors have been commented out.

public class JAT3Ex1{	
  public static void main (String[] args){
	int a = 5;     
	
	int b = 0B101;         
    int c = 0b101;
	
	int d = 05; 
	
	int e = 0x0005;      
	int f = 0xcafe;     
	int g = 0XCAFE;

    int h = 7_000_000;     
	//int i = _7_000;       
	//int j = 7_000_; 

    //double k = 955_456_.45;  
	//double l = 955_456._45; 	
	
	long m = 1L;                
	long n = 1l; // note, the second character is a small l  
	
	//float o = 45.56;            
	//float p = 45.56D;            
	
	boolean q = true;	        
	//boolean r = 1;
	
	char s = 's';
	char t = 1;	
	
	byte u = (byte) n;
	byte v = (int) 127;
	byte w = 127;
	
	//byte x = 128;
	byte y = (byte) 128;
	byte z = -10;
  }	
}