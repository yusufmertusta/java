package midterm1;

import java.util.ArrayList;

public class  GenericTypes{
    public static void main(String[] args){

    }

}
class MyGnericClass<T>{
    T x;
    /*
    static  T y; //static olarak tanýmlanamaz
    static  void staticMethod(){ //generic  bir sýnýf static methodda kullanýlamaz ve ayný zamanda static method içinde
        //önceden tanýmlanmýþ static bir method içinde kullanýlamaz.
        T z; //static method içinde bir generic type tanýmlanamaz.
        System.out.println(x);
    }*/
    static <T> void genericMethod(T x){ //static methodda eger generic bir tip tanýmlamak için böyle bir method yazýlmalý ve onceden soylenmeli
        T y; //as you can see
    } //bunun sebebi static tanýmý compile zamanýnda bir hata var mý anlaþýlmasý lazým.
}