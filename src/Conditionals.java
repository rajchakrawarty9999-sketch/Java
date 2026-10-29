import java.util.Scanner;

public class Conditionals {
    static void main() {
//        Scanner sc= new Scanner(System.in);
//

//        int dailyPractice = 12;
//
//        if (dailyPractice >= 10) {
//            System.out.println("Good consistency!");

//        System.out.print("Enter your age:-");
//        int age = sc.nextInt();
//
//        if(age>=18) {
//            System.out.println("You are eligible for vote");
//
//        }
//        else{
//            System.out.println("You are not eligible for vote");
//        }



//        int score = 26;
//
//        if (score >= 50) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }


//                int accuracy = 78;
//
//                if (accuracy >= 90) {
//                    System.out.println("Excellent");
//                }
//                else if (accuracy >= 75) {
//                    System.out.println("Good");
//                }
//                else if (accuracy >= 60) {
//                    System.out.println("Average");
//                }
//                else {
//                    System.out.println("Needs Improvement");
//                }
//
//
//        int day =3;
//
//        System.out.println("Enter your Number 1 to 7:- ");
//        int day = sc.nextInt();
//
//        if (day == 1) {
//            System.out.println("Monday");
//        }
//        else if (day == 2) {
//            System.out.println("Monday");
//        }
//        else if (day == 3) {
//            System.out.println("Monday");
//        }
//        else if (day == 4) {
//            System.out.println("Monday");
//        }
//        else if (day == 5) {
//            System.out.println("Monday");
//        }
//        else if (day == 6) {
//            System.out.println("Monday");
//        }
//        else if (day == 7) {
//            System.out.println("Monday");
//        }
//        else {
//            System.out.println("Your type Wrong number, pls choice under 1 to 7 ");
//        }




//
//        System.out.println("Enter Your Age:- ");
//        int age = sc.nextInt();
//
//        System.out.println("Enter Your Gender Male ('M') Female ('F') Transgender ('T') ");
//        char gender = sc.next().charAt(0);
//
//        if (gender == 'M') {
//            System.out.println("You are Male");
//            if(age > 18) {
//                System.out.println("You are male and your age is > 18");
//            }else if ( age == 18){
//                System.out.println("You are male and your age is = 18");
//            }
//            else {
//                System.out.println("You are male and your age is < 18");
//            }
//        }
//        else if (gender == 'F') {
//            System.out.println("You are Female");
//            if(age > 18) {
//                System.out.println("You are Female and your age is > 18");
//            }else if ( age == 18){
//                System.out.println("You are Female and your age is = 18");
//            }
//            else {
//                System.out.println("You are Female and your age is < 18");
//            }
//        }
//        else if (gender == 'T') {
//            System.out.println("You are Transgender");
//            if(age > 18) {
//                System.out.println("You are Transgender and your age is > 18");
//            }else if ( age == 18){
//                System.out.println("You are Transgender and your age is = 18");
//            }
//            else {
//                System.out.println("You are Transgender and your age is < 18");
//            }
//        }
//        else {
//            System.out.println("Your chose wrong gender");
//        }




//                int streakDays = 35;
//
//                String status = (streakDays >= 30) ? "Consistent" : "Irregular";
//
//                System.out.println(status);


//        System.out.println("Enter Your age:- ");
//        int age = sc.nextInt();
//
//        String ans = (age <= 18) ? "kuta" : "kutiya";
//        System.out.println("Ans; " + ans);



//                int dayNumber = 3;
//
//                switch (dayNumber) {
//                    case 1:
//                        System.out.println("Monday");
//                        break;
//
//                    case 2:
//                        System.out.println("Tuesday");
//                        break;
//
//                    case 3:
//                        System.out.println("Wednesday");
//                        break;
//
//                    default:
//                        System.out.println("Invalid day");
//                }

            Scanner sc = new Scanner(System.in);
        int day;
        System.out.println("Enter Your Number 1 to 7:- ");
        day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Kya kya tipata rahata hi be");
        }


















//        sc.close();
    }
}

