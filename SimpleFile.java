import java.util.*;

class SimpleFile{
    public static void main(String[] args){
        int x=1234;
        int num =x;
        int rev=0;
        while(x>0){
            int rem = x%10;
            rev = (rev*10)+rem;
            x/=10;
        }
        System.out.println("Rev of "+num+" is "+rev);
    }
}