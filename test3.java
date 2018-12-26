import java.util.*;
public class test3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	int n = sc.nextInt();
    	/*for(int i = m ; i <= n ; i++){
    		System.out.print(i + " ");
    	}
    	System.out.print("\n");*/
    	//sendtreepay(m , n);
    	s(m , n);
    }
    /*static int sendtreepay(int m , int n){
    	System.out.print(m + " ");
    	if(m == n) return m;
    	m++;
    	return sendtreepay(m , n);
    }*/
    static void s(int m , int n){
    	System.out.print(m + " ");
    	if(m < n) s(++m , n);
    }
}
