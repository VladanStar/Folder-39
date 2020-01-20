
package beskonacnapetlja;

import java.util.Scanner;


public class BeskonacnaPetlja {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double broj, zbir = 0;
        double as;
        int brojac = 0;
        
        for(;;){
        System.out.print("Unesite "+ (brojac +1) + " broj: ");
        broj = input.nextInt();
        if(broj !=0){
            brojac++;
            zbir+= broj;
            continue;
        
        }
        else{
        break;
        }
    }
        System.out.println("Zbir je: " + zbir);
        System.out.println("Aritmeticka sredina je: " + zbir/brojac);
    }
}
