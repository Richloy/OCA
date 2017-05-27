public class JAT5Ex15{
  public static void main(String[] args){
	 String[][] colours = new String [][] { {"green","white","orange"}, {"red","white","blue","yellow","black","green"} };
	 
	 for(int i=0; i<colours.length; i++){
	     System.out.print ("Row " + (i+1) + " ");
	   for(int j=0; j<colours[i].length; j++){
		if(j<colours[i].length-1){
		  System.out.print(colours[i][j]+"\t");
		}else{
		  System.out.println(colours[i][j]);
		}
	   }// inner loop
	 }// outer
   }// main
}// class

