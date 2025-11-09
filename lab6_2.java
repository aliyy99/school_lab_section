import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class lab6_2 {
    public static void main(String[] args) {
        //scenario3

        Random random=new Random();

        String[] probably={"sunny","sunny","sunny","sunny","cloudy","cloudy","cloudy","rainy","rainy","stormy"};
        int sunny=0;
        int cloudy=0;
        int rainy=0;
        int stormy=0;

        int total_weather=1000000;

        for(int i=0;i<total_weather;i++){
            int index=random.nextInt(10);
            String weather=probably[index];
            switch (weather){
                case "sunny":sunny++;break;
                case "cloudy":cloudy++;break;
                case "rainy":rainy++;break;
                case "stormy":stormy++;break;
            }


        }
        float sunny_rate= ( (float) sunny/total_weather)*100;
        float cloudy_rate=((float) cloudy/total_weather)*100;
        float rainy_rate=((float) rainy/total_weather)*100;
        float stormy_rate=((float) stormy/total_weather)*100;

        System.out.printf("Sunny times: %d, rate: %% %.2f\n",sunny,sunny_rate);
        System.out.printf("cloudy times: %d, rate: %% %.2f\n",cloudy,cloudy_rate);
        System.out.printf("rainy times: %d, rate: %% %.2f\n",rainy,rainy_rate);
        System.out.printf("stormy times: %d, rate: %% %.2f",stormy,stormy_rate);

        //scenario4

        int[] numbers= new int[30];
        for(int i=0;i<30;i++){
            int num=random.nextInt(100)+1;
            numbers[i]=num;
        }
        ArrayList<Integer> peak_numbers=new ArrayList<>();
        int peak_count=0;
        for(int a=1;a<29;a++){
            if(numbers[a]>numbers[a+1] && numbers[a]>numbers[a-1]){
                peak_count++;
                peak_numbers.add(numbers[a]);

            }
        }

        System.out.println("\noriginal list: "+ Arrays.toString(numbers));
        System.out.println("peak count: "+peak_count);
        System.out.println("peak numbers: "+peak_numbers);
        System.out.println("max of peak numbers: "+ Collections.max(peak_numbers));

        //BONUS

        int[][] grades=new int[5][4];

        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                int grade=random.nextInt(101);
                grades[i][j]=grade;
            }
        }
        //The shortcut for addition is the following line:
        int sum=Arrays.stream(grades[0]).sum();

        System.out.println(Arrays.deepToString(grades));
        int sum1=0;
        for(int num:grades[0]){
            sum1+=num;
        }
        double student1=(double)sum1/4;

        int sum2=0;
        for(int num:grades[1]){
            sum2+=num;
        }
        double student2=(double) sum2/4;
        int sum3=0;
        for(int num:grades[2]){
            sum3+=num;
        }
        double student3=(double)sum3 /4;

        int sum4=0;
        for(int num:grades[3]){
            sum4+=num;
        }
        double student4=(double) sum4/4;
        int sum5=0;
        for(int num:grades[4]){
            sum5+=num;
        }
        double student5=(double) sum5/4;

        System.out.printf("average of student1's grades: %.2f\n",student1);
        System.out.printf("average of student2's grades: %.2f\n",student2);
        System.out.printf("average of student3's grades: %.2f\n",student3);
        System.out.printf("average of student4's grades: %.2f\n",student4);
        System.out.printf("average of student5's grades: %.2f\n",student5);

        int exam1=0;
        int exam2=0;
        int exam3=0;
        int exam4=0;
        for(int i=0;i<5;i++) {
            exam1+=grades[i][0];
            exam2+=grades[i][1];
            exam3+=grades[i][2];
            exam4+=grades[i][3];
        }

        double exam_1=(double) exam1/5;
        double exam_2=(double) exam2/5;
        double exam_3=(double) exam3/5;
        double exam_4=(double) exam4/5;

        System.out.printf("average of exam1: %.2f\n",exam_1);
        System.out.printf("average of exam2: %.2f\n",exam_2);
        System.out.printf("average of exam3: %.2f\n",exam_3);
        System.out.printf("average of exam4: %.2f\n",exam_4);

        int max = grades[0][0];
        for(int[] row : grades)
            for(int value : row)
                if(value > max){
                    max=value;
                }
        System.out.println("max of grades: "+max);
        boolean find=false;

        for(int i=0;i< grades.length && !find;i++){
            for(int j=0;j<grades[i].length && !find;j++){
                if(max==grades[i][j]){
                    System.out.printf("\nindex of max: [%d][%d]",i,j);
                }
            }
        }
    }
}
