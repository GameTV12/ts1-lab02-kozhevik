package cz.cvut.fel.ts1;

public class Kozhevik {
    public long factorial (int n){
        int result = n;
        for (int i = 1; i<n; i++){
            result = result * (n - i);
        }
        return result;
    }
}
