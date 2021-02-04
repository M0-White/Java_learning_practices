public class operate {
    public static void main(String[] args) {
        double sum=0;

        int cnt=1;
        while(cnt<=20) {
            int temp=cnt;
            int ans=temp;
            while(temp>1) {
                ans=ans*(--temp);
            }
            sum+=1.0/ans;
            cnt++;
        }

        System.out.println(sum);
    }
}
