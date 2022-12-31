public class ExpressedasPrime {
    public static void main(String[] args) {
        int a=14;
        int x=0;
        for(int i=2;i<a;i++){
            if(checkprime(i)==true){
                if(checkprime(a-i)==true){
                    System.out.println(a+"="+i+"+"+(a-i));
                    x=1;
                }
            }
        }
        if(x==0){
            System.out.println("can'b expressed as prime");
        }


    }
    static boolean checkprime(int a){
        if(a<2){
            return false;
        }
        for(int j=2;j<a;j++){
            if(a%j==0){
                return false;
            }
        }
        return true;
    }
}
