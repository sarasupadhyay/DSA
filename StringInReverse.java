public class StringInReverse {
     public String reverseWords(String s) {
        int len=s.length();
        String str="";
        String last="";
        int prev=1;
        int l=len-1;
        while(l>=0)
        {
            char ch1=s.charAt(l);
            if(ch1!=' ')
            {
                last=ch1+last;
                prev=0;
                if(l==0)
                str=str+last;
            }
            else
            {
            if(prev==0)
            {
                
                str=str+last+" ";
                prev++;
                last="";
                System.out.println("Check"+str);
            }
            }
            l--;
        }
        return str;
    }
     public String reverseWords1(String s){
               // Step 1: Remove leading/trailing spaces
        s = s.trim();
        
        // Step 2: Split by one or more spaces
        String[] words = s.split("\\s+");
        
        // Step 3: Reverse words
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
     }
    public static void main(String[] args) {
        {
            StringInReverse in=new StringInReverse();
            System.out.println("Words is : "+in.reverseWords1("the Sky is blue"));
        }
    }
}
