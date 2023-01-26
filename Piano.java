      
//Crea una classe astratta Piano

abstract class Piano{  
         protected double tariffa;  
         abstract void getTariffa();  
   
         public void calcolaFattura(int unita){  
              System.out.println(unita*tariffa);  
          }  
}