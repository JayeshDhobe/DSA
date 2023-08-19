package Graph5;

public class Floodman {

    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {

        if (sr < 0 || sc < 0 || sr >= image.length || sr >= image[0].length || vis[sr][sc]) {
            return;
        }
        image[sc][sr] = color;
        helper(image, sr, sc - 1, color, vis, orgCol);// left
        helper(image, sr, sc + 1, color, vis, orgCol);// right
        helper(image, sr - 1, sc, color, vis, orgCol);// up
        helper(image, sr + 1, sc, color, vis, orgCol);// down

    }

    public int[][] Floodfill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, color);
        return image;
    }

    public static void main(String[] args) {
    }
}
