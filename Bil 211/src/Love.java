import java.util.Scanner;
import java.io.IOException;

public class Love {

	public static void main(String[] args) throws IOException {

		Scanner heart = new Scanner(System.in);
		
		String words_of_my_heart = " Sen, ben hi� haz�r de�ilken, dedi�in gibi ben iyi de�ilken, ben ger�ekten yava� yava� par�alan�rken."
				+ "Elim kolum tutmaz olmu�ken. Ben ger�ek bir a�k�n, samimi bir sevginin kokusunu y�llard�r almam��ken. Ben g�zele k�r olmu�ken. Ben sevmekten"
				+ "korkarken, ben a�ktan ka�arken. Ben mutlu olmay� unutmu� en son ne zaman mutlu oldu�umu hat�rlayamaz olmu�ken. Y�z�m�"
				+ "g�lerken g�remez olmu�ken. Hevesim kalmam��, umutlar�m� yitirmi�ken. Ben kendimi kaybetmi�, her �eyden kopmu�ken. Ben"
				+ "y�k�lmak �zereyken. Ailem da��lm��, huzurum kalmam��, d���nemez olmu�ken, yaslan�cak kimsem kalmam��ken. Ben birdaha sevilemeyece�imi "
				+ "hatta hi� sevilmedi�imi hissetmeye ba�lam��ken. Ben pencereme oturmu� ayaklar�m� d��ar� sark�t�rken. Ne zaman atl�yaca��m� merakla bekleyip"
				+ "yukardan zemini seyrederken. K�saca senin dedi�in gibi ben iyi de�ilken nas�l oldu anlamad�m, anlam�yorum bir g�ne� gibi, benim g�ne�im gibi"
				+ "parlay�verdin. Y�llard�r g�z�m�n �n�mdeymi�ssin gibi ben farkedememi�im gibi ben ne�e ne demek unutmu�ken seninle hat�rlad�m. Ben heyecanlanmaya ba�lad�m"
				+ "en son ne zaman heyecanland���m� hat�rlam�yorken.";
				
				
				
				
		System.out.println("Bundan emin misin? Yapmak istiyor musun?");
		String fate = heart.next();
		
		if (fate.equals("evet")) {
			System.out.println(words_of_my_heart);

		} 
		else if (fate.equals("hay�r")) {
			System.exit(0);
		}

	}

}