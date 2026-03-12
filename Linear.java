public class Linear {
    public static int Search(int num[], int Key){
        for(int i=0; i<num.length; i++){
            if(num[i] == Key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=10;

        int index = Search(num, key);
        if(index == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
