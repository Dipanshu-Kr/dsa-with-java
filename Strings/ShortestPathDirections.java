public class ShortestPathDirections {

    public static float shortestPath(String path) {

        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);

            if (ch == 'N') y++;
            else if (ch == 'S') y--;
            else if (ch == 'E') x++;
            else if (ch == 'W') x--;
        }

        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        System.out.println(shortestPath("WNEENESENNN"));
    }
}
