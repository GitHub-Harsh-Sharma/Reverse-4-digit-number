import java.io.*;
class Reverse
{
    public static void main(String args[])throws IOException
    {
        int num,rev=0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter 4 digit number");
        num=Integer.parseInt(br.readLine());
        rev=(num%10)+(rev*10);
        num=num/10;
        rev=(num%10)+(rev*10);
        num=num/10;
        rev=(num%10)+(rev*10);
        num=num/10;
        rev=(num%10)+(rev*10);
        System.out.println("reverse="+rev);
    }
}