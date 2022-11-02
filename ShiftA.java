// Given two strings A and B, return whether or not A can be shifted some number of times to get B.
// For example, if A is abcde and B is cdeab, return true. 
// If A is abc and B is acb, return false

class ShiftA {
    public boolean rotateString(String s, String goal) {

        int j = s.length();
        for (int i = 1; i < s.length(); i++) {

            if ((s.substring(i, j) + s.substring(0, i)).equals(goal))
                return true;
        }
        return false;

    }
}