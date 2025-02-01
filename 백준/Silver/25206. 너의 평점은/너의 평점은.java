import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subject = new String[20];
        double[] number = new double[20];
        double[] grade = new double[20];

        for(int i=0;i<20;i++){
            String result = sc.nextLine();
            String[] resultSplit = result.split(" ");

            subject[i] = resultSplit[0];

            number[i] = Double.parseDouble(resultSplit[1]);

            switch (resultSplit[2]){
                case "A+":
                    grade[i]=4.5;
                    break;
                case "A0":
                    grade[i]=4.0;
                    break;
                case "B+":
                    grade[i]=3.5;
                    break;
                case "B0":
                    grade[i]=3.0;
                    break;
                case "C+":
                    grade[i]=2.5;
                    break;
                case "C0":
                    grade[i]=2.0;
                    break;
                case "D+":
                    grade[i]=1.5;
                    break;
                case "D0":
                    grade[i]=1.0;
                    break;
                case "F":
                    grade[i]=0.0;
                    break;
                case "P":
                    number[i]=0.0;
                    grade[i]=0.0;
                    break;
            }
        }

        double numberSum = 0.0;
        double majorSum = 0.0;
        for(int i=0;i<20;i++){
            numberSum = numberSum + number[i];
            majorSum = majorSum + (number[i] * grade[i]);
        }
        double result = majorSum / numberSum;

        System.out.println(result);
    }
}
