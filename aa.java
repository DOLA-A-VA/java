import java.util.*;

public class aa {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		//pCol(sc.nextInt() , sc.nextInt());
    		XX(sc.nextInt());
    		//int n = sc.nextInt();
    		//System.out.print(n/2);
    	}
    }
    static void pCol(int m ,int n){
		for(int j = 1 ; j <= m ; j++) {
			if(j < n) continue;
			for(int i = 1 ; i <= (m-j) ; i++){
				System.out.print(" ");
			}
			for(int i = 1 ; i <= (2*j-1) ; i++){
				System.out.print("*");
			}
			for(int i = 1 ; i <= (m-j) ; i++){
				System.out.print(" ");
			}
			System.out.print("\n");
		}
    }
    static void XX(int k){
    	//材︽
    	for(int i = 1 ; i <= k ; i++){
    		System.out.print("*");
    	}
    	System.out.print("\n");
    	//场程
    	for(int j = 0 ; j < k/2 ; j++){
    		for(int i = 1 ; i <= k/2-j ; i++){
	    		System.out.print("*");
	    	}
	    	for(int i = 1 ; i <= 2*j+1 ; i++){
	    		System.out.print(" ");
	    	}
	    	for(int i = 1 ; i <= k/2-j ; i++){
	    		System.out.print("*");
	    	}
	    	System.out.print("\n");
    	}
    	//场ぃ程
		for(int j = k/2-2 ; j >= 0 ; j--){
			for(int i = 1 ; i <= k/2-j ; i++){
	    		System.out.print("*");
	    	}
	    	for(int i = 1 ; i <= 2*j+1 ; i++){
	    		System.out.print(" ");
	    	}
	    	for(int i = 1 ; i <= k/2-j ; i++){
	    		System.out.print("*");
	    	}
	    	System.out.print("\n");
    	}
    	//程︽
    	for(int i = 1 ; i <= k ; i++){
    		System.out.print("*");
    	}
    	System.out.print("\n");
    }
}
