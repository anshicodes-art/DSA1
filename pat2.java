import java.util.*;
public class pat2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i;j++){
                System.out.print(" ");
                    }  

            for(int j=1;j<i+2;j++){
                System.out.print("*");
                }
            if(i!=0){
                    for(int k=1;k<=i;k++){
                        System.out.print("*");
                    }
                    }
        
            System.out.println();
                }
    }
}


