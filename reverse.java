public class ReverseString {

    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "hello";

        System.out.println(reverse(str));
    }
}
/*
public class ReverseString {

    public static String reverse(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hello";

        System.out.println(reverse(str));
    }
}

*/

/*
public class ReverseString {

    public static void main(String[] args) {

        String str = "hello";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());
    }
} */


    /*
    
    
    public class ReverseString {

    public static String reverse(String str) {

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String str = "hello";

        System.out.println(reverse(str));
    }
}*/