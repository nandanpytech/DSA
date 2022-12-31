public class Moths_date {
    public static void main(String[] args) {
        int month=2;
        int year=100;
        if(month==2 && checkleap(year)){
            System.out.println("29");
        }
        else if(month==2) System.out.println("28");
        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");
    }
    static boolean checkleap(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
            }else{
                return true;
            }
        }
        return false;
    }
}
