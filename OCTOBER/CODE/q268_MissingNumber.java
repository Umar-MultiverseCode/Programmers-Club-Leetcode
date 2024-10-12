package CODE;

public class q268_MissingNumber {


        public static void main(String[] args) {
            int []a={0,1};
            int ans=return_missing(a);
            System.out.println(ans);
        }

        static int return_missing(int []a){

            int []sorted=sort(a);
            for(int i=0;i<a.length;i++){
                if(i!=a[i]){
                    return i;
                }
            }
            return a.length; // // pehle wale ke isme mene -1 return kiya joki galai tha
        }

        static int [] sort(int []arr){

            int i=0;
            while(i< arr.length){

                if(arr[i]< arr.length && i!=arr[i]){ /*ye bhulna mat tune yehi pe bohot problem kiya tha
                faltu me tune isko complicate kiya jabki ye easy hai */

                    swap(arr,i,arr[i]);

                }else {
                    i++;
                }
            }
            return arr;
        }

        static void swap(int []a,int f,int s){
            int temp=a[f];
            a[f]=a[s];
            a[s]=temp;
        }
    }