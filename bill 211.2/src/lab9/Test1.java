package lab9;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {
public static void main(String[] args)
{
	
// Verilen Double a sayisinin yarisini doner
	Function<Double, Double> yariyaBol = new Function<Double, Double>() {
		@Override
		public Double apply(Double a) {
			return a/2;
		}
	};
// Verilen Double a sayisinin 2.0 degerinden buyuk olup olmadigini doner
// buyukse true kucukse false
Predicate<Double> ikidenBuyuk = a -> (a>2);
// Verilen Double a sayisinin yarisinin 2.0 degerinden buyuk olup olmadigini doner
Function<Double, Boolean> test1 = new Function<Double, Boolean>(){
	
	@Override
	public Boolean apply(Double t) {
		if((t/2)>2)
		return true;
		else
			return false;
	}
	
};

// COZUM BURADA BASLAR
// GOREV: Ilk argumana (args[0]) ait yariyaBol sonucunu ekrana bas
	System.out.println(yariyaBol.apply(Double.parseDouble(args[0])));
// GOREV: Ilk argumana (args[0]) ait ikidenBuyuk predicate sonucunu ekrana bas
	System.out.println(ikidenBuyuk.test(Double.parseDouble(args[0])));
// GOREV: Ilk argumana (args[0]) ait test1 sonucunu ekrana bas
	System.out.println(test1.apply(Double.parseDouble(args[0])));
// Not: Function ve Predicate icin tanimlanmis uygun metotlari kullanmaniz gerekmektedir (hint: apply() gibi)
// COZUM BURADA BITER
}
}