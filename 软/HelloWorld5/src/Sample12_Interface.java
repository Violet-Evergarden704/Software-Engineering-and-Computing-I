public class Sample12_Interface {


}
interface Calculate
{
    int VAR = 0;
    void cal(int item);
}
class Display implements Calculate
{
    int x;
    public  void cal(int item)
    {
        if (item<2)
            x = VAR;
        else
            x = item * item;
    }
}
