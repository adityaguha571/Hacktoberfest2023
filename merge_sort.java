public class merge_sort {
    public static void conqure(int[]arr,int si,int mid,int ei){
        int[]result=new int[ei-si+1];
        int i1=si;
        int i2=mid+1;
        int x=0;
        while(i1<=mid && i2<=ei){
            if(arr[i1]<=arr[i2]){
                result[x++]=arr[i1++];
            }
            else{
                result[x++]=arr[i2++];
            }
        }
        while(i1<=mid){
            result[x++]=arr[i1++];
        }
        while(i2<=ei){
            result[x++]=arr[i2++];
        }
        for(int i=0;i<result.length;i++,si++){
            arr[si]=result[i];
        }
    }
    public static void devide (int[]arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int []arr={6,5,9,6,2,4,6,7};
        devide(arr,0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
