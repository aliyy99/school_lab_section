package lab_8;

public class Robot {
    private String model_name;
    private int battery_level;
    private String status;

    public Robot(String name,int battery,String st){
        model_name=name;
        battery_level=battery;
        status=st;
    }
    public void setModel_name(String name){model_name=name;}
    public void setBattery_level(int level){battery_level=level;}
    public void setStatus(String st){status=st;}
    public String getModel_name(){return model_name;}
    public int getBattery_level(){return battery_level;}
    public String getStatus(){return status;}

    public void displayrobot_info(){
        System.out.println("robos's model name: "+model_name+" battery level: "+battery_level+" current status: "+status);

    }
    public boolean isbatteryenough(int required_amount){
        if(battery_level>=required_amount){
            return true;
        }
        else {
            return false;
        }
    }
    public void consumebattery(int amount){
        battery_level-=amount;
    }
    public void chargebattery(int amount){
        battery_level+=amount;
        if(battery_level==100){
            status="Active";
        }
        else {
            status="Charging";
        }
    }
    public void performTask(Task t) {
        System.out.println("\nlab_8.Robot is trying to complete the task !");
        if (status == "Charging") {
            System.out.println("lab_8.Robot is charging !!!");
            chargebattery(100-battery_level);
            status="Active";

        }
        System.out.println("\nbattery level is enough for task ?: "+isbatteryenough(t.getEnergy_cost()));
        if(isbatteryenough(t.getEnergy_cost())){
            consumebattery(t.getEnergy_cost());
            System.out.println("\nlab_8.Robot completed the task !");
        }
        else {
            System.out.println("lab_8.Robot doesn't have enough battery !!!");
            status="Charging";
        }
    }
    public void performtaskbatch(task_batch batch){
        if(batch==null){
            System.out.println("Task batch contains no tasks !!!");
        }
        System.out.println("Total energy cost of batch: "+batch.gettotalenergy());
        if(battery_level<batch.gettotalenergy()){
            System.out.println("Robot doesn't have enough energy !!!");
            battery_level=100;
            status="Active";
        }
        else {
            System.out.println("Robot is processing the batch");
        }
    }
}
