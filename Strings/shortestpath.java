package Strings;

public class shortestpath {

    public static float shortest(String path) {
        int x =0, y = 0;
        for (int i = 0; i < path.length(); i++) {

            //direction
            char dir = path.charAt(i);

            //south
            if (dir == 'S') {
                
            }
            //NORTH
            else if (dir == 'N') {
                y++;
            }
            //WEST
            else if (dir == 'W') {
                x--;
            }
            //EAST
            else{
                x++;
            }              
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }


    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortest(path));
    }
}
