package main;

import creator.AltNameManager;
import creator.NameManager;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class main {
    
    public static int getType(String str) {
        String nameManager = "^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$"; 
        String altNameManager = "^([A-Z][a-z]*,((\\s)))+[A-Z][a-z]*$"; 
              
        if(str.matches(nameManager))
            return 1;
        else if(str.matches(altNameManager))
            return 2;
        else
            return 0;    
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
           while(true)
           {
                System.out.println(" - Digite um nome: ");
                String fullName = scanner.nextLine();
                int fullNameType = getType(fullName);
                
                if(fullNameType == 1)
                    NameManager.criar(fullName);
                else if(fullNameType == 2)
                    AltNameManager.criar(fullName);
                else{
                    System.out.println(" - MFormato inválido!");
                    break;      
                } 
           }
        System.out.println("------ Names -------");
        NameManager.printNames();
        AltNameManager.printNames();
    }
    

    
    
}
