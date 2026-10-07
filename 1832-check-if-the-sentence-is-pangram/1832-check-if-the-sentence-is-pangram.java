class Solution {
    public boolean checkIfPangram(String sentence) {
        char[]a=sentence.toLowerCase().toCharArray();
        int count=0;
        for(int i=97;i<=122;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==i)
                {
                    count++;
                    break;
                }
            }
        }
            if(count==26)
            {
                return true;
            }
            return false;
        }
    }
