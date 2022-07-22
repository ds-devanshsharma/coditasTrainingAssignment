package coreJAVA.Week_1.Day_4;
class Pattern2_code{
    public void printer(){
        for(int i=1;i<=6;i++)
        {
            int j=1;
            boolean b1=false;
            while(j>0){
                char c=(char)(65+i);
             System.out.print(c+"");
                b1=(j==i)?true:false;
                if(b1==true)
                {
                    j--;
                }
                else
                    j++;
            }
            System.out.println();
        }
    }
}
public class Pattern2 {
    public static void main(String[] args) {
        Pattern2_code pattern2_code =new Pattern2_code();
        pattern2_code.printer();
    }
}
