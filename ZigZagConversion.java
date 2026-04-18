public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int len=s.length();
        String words[]=new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            words[i]="";
        }
        String res="";
        int l=0;
        while(l<len)
        {
        for(int i=0;i<numRows;i++)
        {
             if(l==len)
            break;
            words[i]=words[i]+s.charAt(l);
            l++;
           
        }
        for(int j=numRows-2;j>0;j--)
        {
            if(l==len)
            break;
            words[j]=words[j]+s.charAt(l);
            l++;
  
        }
        }
        for(int i=0;i<numRows;i++)
        {
          System.out.println(words[i]);
        res=res+words[i];
        }

        return res;
  }
   public String convert1(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        int n = s.length();

        while (index < n) {
            // Downward
            for (int i = 0; i < numRows && index < n; i++) {
                rows[i].append(s.charAt(index++));
            }
            // Upward diagonal
            for (int i = numRows - 2; i > 0 && index < n; i--) {
                rows[i].append(s.charAt(index++));
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
  public static void main(String[] args) {
    ZigZagConversion obj=new ZigZagConversion();
    System.out.println(obj.convert("PAYPALISHIRING",4));
  }
}
