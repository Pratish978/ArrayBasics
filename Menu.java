public class Menu {
        public static int Search(String num[], String Key){
        for(int i=0; i<num.length; i++){
            if(num[i] == Key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String num[]={"Dosa","Idli","Samosa","Wada","Puri"};
        String key="Samosa";

        int index = Search(num, key);
        if(index == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
