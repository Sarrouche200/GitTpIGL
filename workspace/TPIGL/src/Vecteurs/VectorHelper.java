package Vecteurs;
import java.util.Scanner;


/**
 * @author sara
 *
 */

public class VectorHelper {
	
	public int vect[] = new int[10];
	
	
	
	/************************METHODE TRIER_VECT***********************************/
	/**
	 * cette methode  permet de trier un vecteur en ordre croissant de ses elements et retourne le tableau trié
	 */
	
	public void Trier_Vect(){
		
		int i=0;
		
	    int x;
	    
		
	    
	             while( i< vect.length-1){
          	    	
	    
	                   if (vect[i]> vect[i+1]) { 
	    
	                     x=vect[i];  //PERMUTATION DES DEUX CASES
	    		         vect[i]= vect[i+1];
	    		         vect[i+1]=x;
	    		         i=0;
	    	                                   }
	                   else {i++;}
	  
	    
	                                      }
		
		
                         	}

	/*************************************METHODE MAXMIN***********************************/
	
	/**
	 * cette methode  permet de donner le maximum d'un tableau ainsi que son minimum en meme temps 
	 */
	
	public void  MaxMin(){
	int max; int min;
	int k=1; int l=1;	
	max=vect[0];
	min=vect[0];
	
   while(k<vect.length & l < vect.length){
	  
	   if(vect[k]>=  max){
		   max= vect[k];
		   k++;
	   }
	   else{k++;}
	   if(vect[l]<= min){
		   min= vect[l];
		   l++;
	   }else{l++;}
	   
	   
	   
   }
		
		
	System.out.println(" valeurrrr du maximumm est "+max);	
	System.out.println(" valeurrrr du minimum   est "+min);	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	

                          }