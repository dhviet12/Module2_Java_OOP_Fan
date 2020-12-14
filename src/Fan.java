public class Fan {
    final int SLOW = 1;
    final int MEDIUM= 2;
    final int FAST= 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int number){
        this.speed=number;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double number){
        this.radius=number;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean getStatus(){
        return on;
    }
    public void setStatus(boolean on){
       this.on =on;
    }

    public String getInfo(){
        if (!on){
            return "color:" + color + "/" + " radius:" + radius + "/"+ " fan is off";
        }
        else
            return "speed:" + speed + "/"+ " color:" + color + "/"+ " radius:" + radius+ "/" + " fan is on";
    }





}
