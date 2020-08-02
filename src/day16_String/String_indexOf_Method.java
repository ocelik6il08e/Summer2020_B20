package day16_String;

public class String_indexOf_Method {
    public static void main(String[] args) {
        String s = "I like to stay in cybertek, we are learning java";

        int r1 = s.indexOf("r");
        int r2 = s.indexOf("re");   // Burada sadece r'in index'si ni bulur. e sadece r'in yerine belirlemede
                                    // ipucu olarak kulaniliyor..
        int r3 = s.indexOf("re")+1; // Burada da r'dan sonraki e'nin yerini bulmak istersen bu yontem kullanilir.
        int r4 = s.indexOf("java");

        String a = "Java";
        int b = a.indexOf("A"); /* "A" variable icinde bulunmayan bir karakterin index'ni bulmak istediginizde
                                 sistem print olarak : -1 cikarir.
                                 Index number decimal number olamaz ve 0'dan kucuk olamaz. Minumum index number is
                                  zero */

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(s.charAt(r1));
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(b);
    }
}
