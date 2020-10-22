package Caixa;

import java.util.Scanner;

public class Caixa_Troco {

	public static void main(String[] args) {
		
		

		        Scanner valorDigitado = new Scanner(System.in);

		        
		  

		        double feijao = 10.00;
		      

		        System.out.println("Valos Produtos \n FEIJÂO = 10.00 ");
 
		        
		        
		    
		        double numero;
		      double x = 1;

		      
		        
		       while(x >= 0) {
		        
		      
		    	   System.out.println("Insira Valor:");
			        
			         numero =  valorDigitado.nextDouble();
			
			       
		       
		       if(numero >= feijao) {
		       
	
		        double troco =   (numero - feijao);
		        
		        

		        if (numero   > feijao) {
		            System.out.println("Valor do troco:"+troco);
		
		        }
		        
		        
		        else {
		        	
		        	if ( troco == 0 ) {
		        		System.out.println("Nao havera troco");
		        		 
		        	       
		 		       x++;
		        	
		        }
		        	
		        	
		        	
		        	
		        
		  }
		        
		    	
		        }
		       
else{
		    	   
		    	   System.out.println("valor abaixo do permitido tente novamente");
		    	   
		       }
		       
		       
		       
		       
		       
		       if(numero == 0) {
	        		
		    		
		    		break;
	        		
	        	}
		       
		      
		       }
	}//while
		       
}
		
			
			
			
		
	
	
	
	