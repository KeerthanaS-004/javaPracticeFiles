import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SecretDecoder {

    static class Point {
        int x;
        int y;
        char ch;

        Point(int x, int y, char ch) {
            this.x = x;
            this.y = y;
            this.ch = ch;
        }
    }

    public static void decodeSecretMessage(String urlString) throws Exception {

        URL url = new URL(urlString);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        List<Point> points = new ArrayList<>();

        String line;

        int maxX = 0;
        int maxY = 0;

        while ((line = br.readLine()) != null) {

            line = line.trim();

            // Skip empty lines and headers
            if (line.isEmpty())
                continue;

            // Expected format:
            // x y character
            String[] parts = line.split("\\s+");

            if (parts.length < 3)
                continue;

            try {
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                char ch = parts[2].charAt(0);

                points.add(new Point(x, y, ch));

                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);

            } catch (NumberFormatException e) {
                // Ignore non-data lines
            }
        }

        br.close();

        char[][] grid = new char[maxY + 1][maxX + 1];

        for (int i = 0; i <= maxY; i++) {
            for (int j = 0; j <= maxX; j++) {
                grid[i][j] = ' ';
            }
        }

        for (Point p : points) {
            grid[p.y][p.x] = p.ch;
        }

        for (int i = 0; i <= maxY; i++) {
            System.out.println(new String(grid[i]));
        }
    }

    public static void main(String[] args) throws Exception {

        decodeSecretMessage(
                "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub"
        );
    }
}