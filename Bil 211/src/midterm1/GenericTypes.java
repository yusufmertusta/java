package midterm1;

import java.util.ArrayList;

public class  GenericTypes{
    public static void main(String[] args){

    }

}
class MyGnericClass<T>{
    T x;
    /*
    static  T y; //static olarak tan�mlanamaz
    static  void staticMethod(){ //generic  bir s�n�f static methodda kullan�lamaz ve ayn� zamanda static method i�inde
        //�nceden tan�mlanm�� static bir method i�inde kullan�lamaz.
        T z; //static method i�inde bir generic type tan�mlanamaz.
        System.out.println(x);
    }*/
    static <T> void genericMethod(T x){ //static methodda eger generic bir tip tan�mlamak i�in b�yle bir method yaz�lmal� ve onceden soylenmeli
        T y; //as you can see
    } //bunun sebebi static tan�m� compile zaman�nda bir hata var m� anla��lmas� laz�m.
}