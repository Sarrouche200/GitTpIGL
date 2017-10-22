package Vect;

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
		
																 
		
		 int i =0; int j=0;  int mx=0 , min=0;
		 
		
		
		/**
		 * AFFICHAGE du tableau
		 */
		 
		 
		 while ( i< tab1.vect.length){
			 System.out.println(" la case de ce tableau :"+ tab1.vect[i]+"|");
			 i++;
		 }
		 
		 
		 
		
		 System.out.println(" LAAAAAA MAX MINI"+ tab1.MaxMin(mx,min));
		
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
