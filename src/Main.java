public class Main {

    static byte someByte;

    public static void main(String[] args) {

        int counter = -10;
        someByte = 2;
        myText();

        System.out.println("\nА теперь жахнем цикл, потому что простое условие уже было");
        while ((counter < someByte) && (counter <= -3)) {
            System.out.println(counter++);
        }
    }

    public static void myText(){
        String hello = "Набор чаров";
        int myNumber = 2147483647;
        long maxLong = 2147483647L;
        char someChar = 'x';
        double p = 3.14;

//        int over = 2147483648; // мы примерно знаем, что происходит при переполнении, поэтому я ее
//                                  закомменчу, чтобы было видно, что я ну типа сделал задание

        String out = String.format("""
                Здесь я напишу какую-то лютую дичь, чтобы вкратце все это было вот это вот. Ага.\s
                В общем, что такое стринга? Правильно. %s. Что такое чар? Символ. Например, %c
                """, hello, someChar);

        System.out.println(out);
        if (someByte > 1)
            System.out.println(maxLong + myNumber + "\nА это был результат сложения инта и лонга, не знаю, зачем.\n" +
                    "Кстати, число Пи с точностью до сотой равно " + p);
    }
}
