/**
 * 老鼠走迷宫
 * @author  cjy
 * @version  1.0
 */
public class MiGong {
	public static void main(String[] args) {
        //创建迷宫
        int[][] map = new int[7][7];
        for (int i = 0; i < map.length; i++) {
            map[0][i] = 1;
            map[map.length - 1][i] = 1;
            map[i][0] = 1;
            map[i][map.length - 1] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[3][3] = 1;
        // 打印初始迷宫
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        T a = new T();
        a.findWay(map, 1, 1);

        System.out.println("_________________________");
        // 打印迷宫
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
	    }   
    }
}

class T {
    public boolean findWay(int[][] map, int i, int j) {
        if (i == 5 && j == 5) {
            map[i][j] = 3;
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;

                if (findWay(map, i+1, j)) {
                    return true;
                } else if (findWay(map, i, j+1)) {
                    return true;
                } else if (findWay(map, i-1, j)) {
                    return true;
                } else if (findWay(map, i, j-1)) {
                    return true;
                } else {
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}