import java.util.Arrays;
class MergeSort{
    public static int[] sortjoin(int[] a,int[] b){
        int[] join=new int[a.length+b.length];
        int x1=0,x2=0;
        int ii=0;
        while(ii<a.length+b.length){
            if(x1>=a.length){
                join[ii]=b[x2];
                x2++;
                ii++;
            }else if(x2>=b.length){
                join[ii]=a[x1];
                x1++;
                ii++;
            }else if(a[x1]>b[x2]){
                join[ii]=b[x2];
                x2++;
                ii++;
            }else{
                join[ii]=a[x1];
                x1++;
                ii++; 
            }
        }
        return join;
    }
    static int[] mergeSort(int[] a){
        if(a.length<=1) return a;
        int n=(a.length/2);
        return sortjoin(mergeSort(Arrays.copyOfRange(a, 0,n)),mergeSort(Arrays.copyOfRange(a, n,a.length)));
    }
    public static void main(String[] args) {
        int[] a={100,35,12,10,45,7};
        a=mergeSort(a);
        for(int i : a)System.out.println(i);
    }
}
