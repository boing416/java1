public class Calculator{
    private int result;

    public void add(int ...  parrams)
    {
        for (Integer param : parrams)
        {
            this.result += param;
        }
    }

    public int getResult()
    {
        return this.result;
    }

    public void cleanResult()
    {
        this.result = 0;
    }
}