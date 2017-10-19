package TesteTp;

//import Vecteurs.VectorHelper;

/**
 * @author sara
 *
 */
public class Driver {

	/**
	 * @param args : arguments
	 */
	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 VectorHelper tab1 = new VectorHelper(); 
		 tab1.vect[0]=5;
		 tab1.vect[1]=6;
		 tab1.vect[2]=2;
	     tab1.vect[3]=3;
         tab1.vect[4]=15;
         tab1.vect[5]=4;
		 tab1.vect[6]=8;
	     tab1.vect[7]=9;
		 tab1.vect[8]=7;
		 tab1.vect[9]=12;
																 
		
		 int i =0; int j=0; 
		 
		
		
		/**
		 * AFFICHAGE du tableau
		 */
		 
		 
		 while ( i< tab1.vect.length){
			 System.out.println(" la case de ce tableau :"+ tab1.vect[i]+"|");
			 i++;
		 }
		 
		 
		 
		 tab1.MaxMin();
		 
		
		 tab1.Trier_Vect();
		 
		 System.out.println(" Aprés le tri du tableau");
	
		 while ( j< tab1.vect.length){
			 System.out.println(" la case de ce tableau :"+ tab1.vect[j]+"|");
			 j++;
		 } 
		 
		// tab1.MaxMin(mx, mn);
		// System.out.println(" le maximum est "+mx+"   le minimum est"+ mn);
		

	}

}
