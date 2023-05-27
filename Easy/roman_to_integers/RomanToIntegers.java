import java.util.HashMap;

public class RomanToIntegers {

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i=0; i<s.length(); i++) {
            int num = map.get(s.charAt(i));
            if (i < s.length()-1) {
                switch(s.charAt(i)) {
                    case 'I': {
                        if (s.charAt(i+1) == 'V') {
                            num = 4;
                            i++;
                        }
                        else if (s.charAt(i+1) == 'X') {
                            num = 9;
                            i++;
                        };
                        break;
                    }
                    case 'X': {
                        if (s.charAt(i+1) == 'L') {
                            num = 40;
                            i++;
                        }
                        else if (s.charAt(i+1) == 'C') {
                            num = 90;
                            i++;
                        }
                        break;
                    }
                    case 'C': {
                        if (s.charAt(i+1) == 'D') {
                            num = 400;
                            i++;
                        }
                        else if (s.charAt(i+1) == 'M') {
                            num = 900;
                            i++;
                        }
                        break;
                    }
                }
            }
            res += num;
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToIntegers r = new RomanToIntegers();
        System.out.println(r.romanToInt("III"));
    }
}
