import java.util.Scanner;
import java.io.IOException;

public class Love {

	public static void main(String[] args) throws IOException {

		Scanner heart = new Scanner(System.in);
		
		String words_of_my_heart = " Sen, ben hiç hazýr deðilken, dediðin gibi ben iyi deðilken, ben gerçekten yavaþ yavaþ parçalanýrken."
				+ "Elim kolum tutmaz olmuþken. Ben gerçek bir aþkýn, samimi bir sevginin kokusunu yýllardýr almamýþken. Ben güzele kör olmuþken. Ben sevmekten"
				+ "korkarken, ben aþktan kaçarken. Ben mutlu olmayý unutmuþ en son ne zaman mutlu olduðumu hatýrlayamaz olmuþken. Yüzümü"
				+ "gülerken göremez olmuþken. Hevesim kalmamýþ, umutlarýmý yitirmiþken. Ben kendimi kaybetmiþ, her þeyden kopmuþken. Ben"
				+ "yýkýlmak üzereyken. Ailem daðýlmýþ, huzurum kalmamýþ, düþünemez olmuþken, yaslanýcak kimsem kalmamýþken. Ben birdaha sevilemeyeceðimi "
				+ "hatta hiç sevilmediðimi hissetmeye baþlamýþken. Ben pencereme oturmuþ ayaklarýmý dýþarý sarkýtýrken. Ne zaman atlýyacaðýmý merakla bekleyip"
				+ "yukardan zemini seyrederken. Kýsaca senin dediðin gibi ben iyi deðilken nasýl oldu anlamadým, anlamýyorum bir güneþ gibi, benim güneþim gibi"
				+ "parlayýverdin. Yýllardýr gözümün önümdeymiþssin gibi ben farkedememiþim gibi ben neþe ne demek unutmuþken seninle hatýrladým. Ben heyecanlanmaya baþladým"
				+ "en son ne zaman heyecanlandýðýmý hatýrlamýyorken.";
				
				
				
				
		System.out.println("Bundan emin misin? Yapmak istiyor musun?");
		String fate = heart.next();
		
		if (fate.equals("evet")) {
			System.out.println(words_of_my_heart);

		} 
		else if (fate.equals("hayýr")) {
			System.exit(0);
		}

	}

}