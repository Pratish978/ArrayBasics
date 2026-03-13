public class Reverse {
    
    public static int Reverse1(int num[]){
        int start=0;
        int end=num.length-1;

        while(start<=end){
            //swap
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;

            start++;
            end--;
        }
        return 0;
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16};
        Reverse1(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
 
    }
}
