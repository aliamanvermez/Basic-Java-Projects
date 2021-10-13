public class BinarySearch {



    public static void main (String args[]){

        int a[] = {1,2,3,4,5,6,7,8,9,10};

        int search = 1;

        int ml=10;
        int ms = -1;
        int flag = 0 ;

        while (ml-ms > 1 ){
            int bakilan = (ml+ms)/2;

            if (a[bakilan]==search){

                flag = 1;
                System.out.println("bulunan:"+ bakilan);
                break;


            }

            else if (a[bakilan]<search){
                ms = bakilan;
            }

            else {
                ml = bakilan;
            }


        }

        if (flag == 0 ){
            System.out.println("sayi bulunamadı");
        }



    }






}
