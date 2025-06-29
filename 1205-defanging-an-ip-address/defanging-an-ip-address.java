class Solution {
    public String defangIPaddr(String address) {
        StringBuilder temp = new StringBuilder();
        for(char i : address.toCharArray())
        {
            if(i == '.')
            {
                temp.append('[');
                temp.append('.');
                temp.append(']');
            }
            else {
                temp.append(i);
            }
        }

        return temp.toString();
    }
}