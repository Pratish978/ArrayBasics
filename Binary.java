public class Binary {
    
    public static int Search(int num[],int key){
        int start=0;
        int end=num.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(num[mid]==key){
                return mid;
            } 
            if(num[mid]>key){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=10;

        int index=Search(num,key);
        if(index==-1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
