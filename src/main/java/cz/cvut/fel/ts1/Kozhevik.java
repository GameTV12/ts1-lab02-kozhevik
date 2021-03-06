package cz.cvut.fel.ts1;

public class Kozhevik {
    public long factorial (int n){
        int result=1,i=1;
        while(i<=n){
            result=result*i;
            i++;
        }

        return result;
    }
}
