
public class consecutiveOnes {

    public static void main(String[] args) {
        int a[] = {1,1,1,1,0,1,1,0,1,1};
        int count = 0;
        int result = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == 1){  
                
                count++;
                int result = Math.max(count, result);

            }
            else{
                count = 0;
            }      
        System.out.println("Maximum consecutive occ of 1's are: "+count);
        }
    }
}
