class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        if(s.length() % 2 != 0) return false;

        String replaces = s.replace("()", "")
                            .replace("{}", "")
                            .replace("[]", "");
        if(replaces.equals(s)) return false;

        return isValid(replaces);
    }
}