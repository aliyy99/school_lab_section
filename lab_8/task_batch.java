package lab_8;

public class task_batch {
    private Task[] tasks;
    private int task_count;
    private Robot robot;

    public task_batch(){
        tasks=new Task[5];
        task_count=0;
    }
    public void addtask(Task t){
        if(task_count<5){
            tasks[task_count]=t;
            task_count++;
        }
        else {
            System.out.println("Already robot has 5 tasks !!!");
        }
    }
    public int gettotalenergy(){
        if(tasks!=null){
            int sum=0;
            for(int i=0;i<task_count;i++){
                sum+=tasks[i].getEnergy_cost();
            }
            return sum;
        }
        else {
            return 0;
        }
    }
    public String gettask(){
        if(tasks!=null){
            for(int i=0;i<task_count;i++){
                return tasks[i].getTask_name();
            }
        }
        return "there is no task";
    }
    public void printbatch_info(){
        if(tasks!=null){
            for(int i=0;i<task_count;i++){
                System.out.println("task's name: "+tasks[i].getTask_name()+", energy cost of task: "+tasks[i].getEnergy_cost());
            }
        }
        else {
            System.out.println("There are no tasks");
        }



    }
}
