import java.util.*;
public class CODEVITA_BoardGame {
  static class Cell{
    int x;
    int y;
    int moves;
    Cell(int x, int y,  int moves){
      this.x = x;
      this.y = y;
      this.moves = moves;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int[][] grid = new int[M][N];
    for(int i = 0; i < M; i++){
      for(int j = 0; j < N; j++){
        grid[i][j] = sc.nextInt();
      }
    }
    int startx = sc.nextInt();
    int starty = sc.nextInt();
    int endx = sc.nextInt();
    int endy = sc.nextInt();

    int movesx = sc.nextInt();
    int movesy = sc.nextInt();

    if(startx == endx && starty == endy){
      System.out.print(0);
      return;
    }
    int result = minMoves(grid,M,N, startx, starty, endx, endy, movesx, movesy);
    System.out.print(result);
    sc.close();
  }


  public static int minMoves(int[][] grid, int M , int N, int startx, int starty, int endx,int endy,int movesx,int movesy)
  {
    if(grid[startx][starty] != 0 || grid[endx][endy] != 0)
      return -1;


  Queue<Cell> q = new LinkedList<>();
  boolean[][] visited = new boolean[M][N];
    q.add(new Cell(startx, starty, 0));
    visited[startx][starty] = true;

    int [][]d = {{movesx, movesy}, {movesy, -movesx}, {-movesy, movesx}, {-movesx, -movesy}};

    while(!q.isEmpty()){
      Cell curr = q.poll();
      if(curr.x == endx && curr.y == endy){
        return curr.moves;
      }
      for(int i = 0; i < 4; i++){
        int newx = curr.x + d[i][0];
        int newy = curr.y + d[i][1];
        if(isValid(newx, newy, M, N,grid,visited) ){
            visited[newx][newy] = true;
            q.add(new Cell(newx, newy, curr.moves + 1));
        }
        }
        }
        return -1;
    }
    
    public static boolean isValid(int x, int y, int M, int N, int[][] grid, boolean[][] visited){
      return (x >= 0 && x < M && y >= 0 && y < N && !visited[x][y] && grid[x][y] == 0);
    }
}

