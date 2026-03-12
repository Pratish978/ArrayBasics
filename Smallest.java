public class Smallest {

    public static int smalle(int num[]){
        int Smallest=Integer.MAX_VALUE;//+Infinty

        for(int i=0;i<num.length;i++){
            if(num[i]<Smallest){
                Smallest=num[i];
            }
        }
        return Smallest;
    }
    public static void main(String[] args){
        int num[]={1,2,6,3,5};
        int Smallest=smalle(num);
        System.out.println("The Smallest Number is "+Smallest);
    }
}
