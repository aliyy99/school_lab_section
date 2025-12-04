package lab_8;

import java.util.Scanner;

public class factory_demo {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Robot r1=new Robot("SE115",80,"Active");
        Robot r2=new Robot("SE116",57,"Active");
        r1.displayrobot_info();
        r2.displayrobot_info();
        //
        System.out.print("\nenter amount of battery to consume: ");
        int amount=sc.nextInt();
        r1.consumebattery(amount);
        //
        Task t1=new Task("clean the room",25);
        r1.consumebattery(t1.getEnergy_cost());
        System.out.println();
        t1.describe_task(t1.getTask_name(),t1.getEnergy_cost());
        System.out.println();
        int energy=t1.getEnergy_cost();
        System.out.println("battery level is enough for task ?: "+r1.isbatteryenough(energy));
        System.out.println();
        r1.displayrobot_info();
        System.out.println();
        //
        Task t2=new Task("write code",60);
        t2.describe_task(t2.getTask_name(),t2.getEnergy_cost());
        r1.performTask(t2);
        //
        Task t3=new Task("study the math",35);
        Task t4=new Task("go to school",45);
        task_batch tb=new task_batch();
        tb.addtask(t2);
        tb.addtask(t3);
        tb.addtask(t4);
        tb.printbatch_info();
        System.out.println(tb.gettotalenergy());
        //
        r1.displayrobot_info();
        r1.performtaskbatch(tb);
        r1.displayrobot_info();



    }
}
