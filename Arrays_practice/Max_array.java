public class Max_array {
    public static void main(String[] args) {
        int[] a={-6,8,14,-2,23,43,54,59};
        int max=a[0];
        int smax=-1;
        int tmax=-2;

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                tmax=smax;
                smax=max;
                max=a[i];
            }else if(a[i]>max){
                  tmax=smax;
                  smax=a[i];
            }else if(a[i]>tmax){
                tmax=a[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);
    }
}
