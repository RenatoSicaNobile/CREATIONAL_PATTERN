//Crea un GetFabbricaPiano per generare oggetti di classi concrete in base alle informazioni fornite

public class GetFabbricaPiano {
    
        //usa il metodo getPiano per ottenere oggetti di tipo Piano.   
            public Piano getPiano(String planType){  
                 if(planType == null){  
                  return null;  
                 }  
               if(planType.equalsIgnoreCase("PIANO DOMESTICO")) {  
                      return new PianoDomestico();  
                    }   
                else if(planType.equalsIgnoreCase("PIANO COMMERCIALE")){  
                     return new PianoCommerciale();  
                 }   
               else if(planType.equalsIgnoreCase("PIANO ISTITUZIONALE")) {  
                     return new PianoIstituzionale();  
               }  
           return null;  
        }  
}
