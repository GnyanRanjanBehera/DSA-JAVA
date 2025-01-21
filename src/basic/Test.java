package basic;

public class Test {

    public static void main(String[] args) {
        int[] num={2,5,1,3,4,7};
        int n=3;
        int[] arr=new int[2*n];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int first=0;
        int second=n;
        for(int i=0;i<n;i++){
            arr[first]=num[i];
            System.out.println("arr[first]"+arr[first]);
            arr[first+1]=num[second];
            System.out.println("arr[first+1]"+arr[first+1]);
            second++;
            first+=2;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
