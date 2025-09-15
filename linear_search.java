
public class linear_search {

    public static void main(String[] args) {
        int ar[] = {23, 45, 56, 78, 89};
        int ele = 23, index = -1;
        
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] == ele) {
                index = i;
                break;
            }
        }
        
        if(index != -1) {
            System.out.println(ele + " present");
        } else {
            System.out.println(ele + " not present");
        }
    }
}
