import java.util.*;
public class pat3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(a%2==0)
                System.out.print("1");
            else
                System.out.print("0");
            a++;
                    }   
                    System.out.println();
    }
    
}
}
