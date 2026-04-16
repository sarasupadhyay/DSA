//package DSA;

public class IntegerToRoman {
        public String intToRoman(int num) {
        int i=1;
        int n1=num;
        while(n1>0){
            i=i*10;
            n1=n1/10;
        }
        String str="";
        System.out.println("the value "+i);
        System.out.println("num remain"+n1);
        i=i/10;
        while(i>0)
        {
            if(i==1000)
            {
                int temp=num/i;
                if(temp==1)
                    str=str.concat("M");
                else if(temp==2)
                    str=str.concat("MM");
                else if(temp==3)
                    str=str.concat("MMMM");
                num=num%i;
                i=i/10;
            }
            else if(i==100)
            {
                int temp=num/i;
                if(temp==1)
                    str=str.concat("C");
                else if(temp==2)
                     str=str.concat("CC");
                else if(temp==3)
                     str=str.concat("CCC");
                else if(temp==4)
                     str=str.concat("CD");
                else if(temp==5)
                     str=str.concat("D");
                else if(temp==6)
                     str=str.concat("DC");
                else if(temp==7)
                     str=str.concat("DCC");
                else if(temp==8)
                     str=str.concat("DCCC");
                else if(temp==9)
                    str=str.concat("CM");
                  num=num%i;
                    i=i/10;
            }
            else if(i==10)
            {
                int temp=num/i;
                  if(temp==1)
                    str=str.concat("X");
                else if(temp==2)
                     str=str.concat("XX");
                else if(temp==3)
                     str=str.concat("XXX");
                else if(temp==4)
                     str=str.concat("XL");
                else if(temp==5)
                     str=str.concat("L");
                else if(temp==6)
                     str=str.concat("LX");
                else if(temp==7)
                     str=str.concat("LXX");
                else if(temp==8)
                     str=str.concat("LXXX");
                else if(temp==9)
                    str=str.concat("XC");
                  num=num%i;
                    i=i/10;
            }
              else if(i==1)
            {
                int temp=num/i;
                  if(temp==1)
                    str=str.concat("I");
                else if(temp==2)
                     str=str.concat("II");
                else if(temp==3)
                     str=str.concat("III");
                else if(temp==4)
                     str=str.concat("IV");
                else if(temp==5)
                     str=str.concat("V");
                else if(temp==6)
                     str=str.concat("VI");
                else if(temp==7)
                     str=str.concat("VII");
                  else if(temp==8)
                     str=str.concat("VIII");
                else if(temp==9)
                    str=str.concat("IX");
                  num=num%i;
                    i=i/10;
            }

        }
          System.out.println("the value "+i);
        System.out.println("num remain"+n1);
        System.out.println("string is "+str);
        return "hellow";
    }
    public String intToRoman1(int num) {
        String[] ones={"","I","II","III","IV","V","VI","VII","VIII","IX",};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC",};
        String[] hundred={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM",};
        String[] thousand={"","M","MM","MMM"};
        return new StringBuilder()
            .append(thousand[num/1000])
            .append(hundred[(num/100)%10])
            .append(tens[(num/10)%10])
            .append(ones[(num/1)%10])
            .toString();
    }
    public static void main(String args[]) {
        IntegerToRoman p=new IntegerToRoman();
        String h=p.intToRoman1(3749);
        System.out.println("String is "+h);
    }
}
    
