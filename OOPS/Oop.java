public class Oop {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor = "Blue";
        System.out.println(p1.setColor);
        
    }
}


class pen {
    public char[] setTip;
    public String setColor;


     String color;
     int tip;

    public String getColor(){
        return this.color;
    }
    public int gettip(){
        return this.tip;
    }

    void setColor(String newColor){
       color = newColor;
    }
    void setTip(int newTip){
       tip = newTip;
    }
}