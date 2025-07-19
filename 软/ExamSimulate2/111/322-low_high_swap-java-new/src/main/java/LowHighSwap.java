public class LowHighSwap {
    //请实现swap方法
    public int[] swap(int[] array){
        int head = 0;
        int tail = array.length - 1;
        while(head < tail){
            int a = array[head];
            int b = array[tail];
            if(a > b){
                int tmp = a;
                array[head] = b;
                array[tail] = tmp;
            }
            head++;
            tail--;
        }
        return array;
    }
}
