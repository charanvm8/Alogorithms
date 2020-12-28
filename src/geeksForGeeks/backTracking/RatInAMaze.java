package geeksForGeeks.backTracking;

public class RatInAMaze {

    public static boolean canRatReachEnd(int[][] maze,int final1,int final2){
        return canRatReach(maze,0,0,final1,final2);
    }

    public static boolean canRatReach(int[][] maze,int currIndex1,int currIndex2,int final1,int final2){
        if(currIndex1>final1 || currIndex2>final2 || maze[currIndex1][currIndex2]==0){
            return false;
        }
        if(currIndex1 == final1 && currIndex2 == final2){
            return true;
        }
        return canRatReach(maze,currIndex1+1,currIndex2,final1,final2) ||
                canRatReach(maze,currIndex1,currIndex2+1,final1,final2);
    }

//    public static boolean ratInMaze(){
//
//    }



    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        System.out.println(canRatReachEnd(maze,maze.length-1,maze[0].length-1));
    }
}
