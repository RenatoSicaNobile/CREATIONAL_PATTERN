import java.io.*;    

/*Genera Fattura utilizzando la GetFabbricaPiano per ottenere l'oggetto delle classi concrete (un oggetto Piano)
passando un'informazione come tipo di piano (PIANO DOMESTICO / PIANO COMMERCIALE / PIANO ISTITUZIONALE)
a GetFabbricaPiano per ottenere il tipo di oggetto di cui ha bisogno.*/

public class GeneraFattura {
        public static void main(String args[])throws IOException{  
            GetFabbricaPiano fabbricaPiano = new GetFabbricaPiano();  
            
          System.out.print("Digita il nome del piano per cui verrà generata la fattura: ");  
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
          String nomePiano=br.readLine();  
          System.out.print("Digita il numero di unità di consumo per cui verrà generata la fattura: ");  
          int unita=Integer.parseInt(br.readLine());  
      
          Piano p = fabbricaPiano.getPiano(nomePiano);  
          //chiama il metodo getTariffa() e calcolaFattura() del piano scelto.  
      
           System.out.print("L'ammontare fattura del "+nomePiano+" di "+unita+" unità di consumo è: ");  
               p.getTariffa();  
               p.calcolaFattura(unita);  
        }  
}
