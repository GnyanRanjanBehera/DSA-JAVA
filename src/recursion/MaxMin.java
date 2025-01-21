package recursion;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr={5,3,2,4};
        int n=arr.length;
        int maxNo=max(arr,n);
        int minNo=min(arr,n);
        System.out.println("maximum of arrary "+ maxNo);
        System.out.println("maximum of arrary "+ minNo);

    }

    static int max(int arr[],int size){
        if(size==1){
            return arr[0] ;
        }

        return Math.max(arr[size-1],max(arr,size-1));
    }

    static int min(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],min(arr,n-1));
    }


}
