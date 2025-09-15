public class secondbig_small {
    
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 63, 29, 23, 89};
        findsecLargest(arr);
    }

    static void findsecLargest(int[] x) {
        int fbig, sbig, fsmall, ssmall;
        fbig = sbig = fsmall = ssmall = x[0];

        for (int i=1;i<x.length;i++) {
            if (x[i]>fbig) {
                sbig=fbig;
                fbig=x[i];
            } else if(x[i]>sbig &&x[i]!= fbig) {
                sbig=x[i];
            }

            if (x[i]<fsmall) {
                ssmall=fsmall;
                fsmall=x[i];
            } else if(x[i]<ssmall && x[i]!=fsmall) {
                ssmall=x[i];
            }
        }
        
        System.out.println("Second Largest: " + sbig);
        System.out.println("Second Smallest: " + ssmall);
    }
}

