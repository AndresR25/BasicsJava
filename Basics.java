import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        AllNumbers();
        odds();
        int sigma=Sigma();
        int[] nums = {23,40,-10,-23,5,-5};
        int max=FindMax(nums);
        oddsArray();
        Loop(nums);
    }
    public static void AllNumbers() {
		for(int i = 0; i <= 255; i++){
            System.out.println(i);
        }	
	}

    public static void odds() {
        System.out.println("Odds numbers: ");

        for(int i = 0; i <= 255; i++){
            if(i%2!=0){
                System.out.println(i);
            }

        }
    }
    public static int Sigma() {
        int sum=0;
		for(int i = 0; i <= 255; i++){
            sum+=i;
        }	
        return sum;

	}

    public static int FindMax(int[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void oddsArray() {
        ArrayList<Integer> y=new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++){
            if(i%2!=0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public static void Loop(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }

}



