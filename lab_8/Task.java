package lab_8;

public class Task {
    private String task_name;
    private int energy_cost;
    public Task(String task,int cost){
        task_name=task;
        energy_cost=cost;
    }
    public int getEnergy_cost(){return energy_cost;}
    public String getTask_name(){return task_name;}

    public void describe_task(String task,int cost){
        System.out.println("lab_8.Task: "+task+", energy cost of task: "+cost);
    }

}
