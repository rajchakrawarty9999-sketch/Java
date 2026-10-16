import java.sql.SQLOutput;

public class DataType {
    static void main() {


        long value1 = 123456789; // Explicit conversion
        int value2 = (int)value1;
        System.out.println(value2);




//        Numeric DataType - shot, byte, int, long

        byte num1 = 127;

        long newNum = num1; //Implicit  conversion
//        btye num1 = 500; //error aayega kyuki byte ka range -128 to 127 hi hota hai
        System.out.println(num1);

        short num2 = 32767;
        System.out.println(num2);

        int num3 = 50000;
        long num4 = 1545424545;
        System.out.println(num3);
        System.out.println(num4);

//        floating DataTypes
        float num5 = 3.142444f;
        System.out.println(num5);

        double num6 = 3.142435464;
        System.out.println(num6);

        //other - Char, Boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("My First Character is: " + firstCharacter);
        System.out.println("My First Character is: " + (char)(firstCharacter+2));





    }
}
