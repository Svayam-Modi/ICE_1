/*
Student ID:- 991661363
 */
package cardtrickice1;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Svayam Modi
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
         Card  luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuits("diamonds");
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(Card.RandomValue());
            c1.setSuits(Card.RandomSuit());
            magicHand[i]= c1;
            
        }
        
        System.out.println("Enter the card number");
        int num = kb.nextInt();
        System.out.println("Enter the card suits");
        String suit = kb.next();
        boolean match = true ;
        for(int i =0; i < magicHand.length;i++)
        {
            match = true;
            if((magicHand[i].getValue() == num) && (magicHand[i].getSuits().equals(suit)))
            {
                System.out.println("card is found");
                break;
            }

            else
            {
                match = false;
            }
        }
        
        if(match == false)
        {
            System.out.println("Card not found");
        }
    }
    
}
