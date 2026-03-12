public class Largest {

    public static int Large(int num[]){
        int Largest=Integer.MIN_VALUE;//-Infinty

        for(int i=0; i<num.length; i++){
            if(num[i] > Largest){
                Largest = num[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        int largest = Large(num);
        System.out.println("The largest number is: " + largest);
    }
}
