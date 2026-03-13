public class SubArrays {
    
    public static void PrintSubArrays(int num[]){
        int ts=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                System.out.print("[ ");
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.print("]");
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = "+ ts);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        PrintSubArrays(num);
    }
}

//n(n+1)/2  = 