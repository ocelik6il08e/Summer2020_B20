package day20_whileLoops;

public class WhileLoop_Practice1 {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");

        }

        System.out.println();

        int num = 1;
        while(num <= 10){

            System.out.println(num);

            num++;
        }

/*
Bu hali ile while loop ile for loop aynidir.Dikkat edilmesi gereken
while looplarda iterator'i (num++) print stament 'dan sonra kulllanmaktir.
Eger oncesinde kullanirsak logical bir hata aliriz. Sonuc farkli cikar,
Bu arada unutma While loop single if statement konumundadir.

 */

    }
}
