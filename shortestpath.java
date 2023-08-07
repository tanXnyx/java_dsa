import java.security.PublicKey;

public class shortestpath {
public static float getshortestpath( String path){
    int x=0, y=0;
    for (int i = 0 ;i<path.length();i++ ){
        char dir = path.charAt(i);
       if(dir=='N'){
            y++;
        } 
       else if(dir=='S'){
            y--;
        }
      else  if(dir=='E'){
            x++;
        }
      else  if(dir=='W'){
            x--;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
}
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path is : "+getshortestpath(path));
    }
}
