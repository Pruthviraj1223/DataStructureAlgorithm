package arrays;

class Frogs {
    public int minNumberOfFrogs(String croakOfFrogs) {

        int cnt[] = new int[5]; // 5 is fixed bcoz 'croak' has 5 letter

        int frogs = 0, max_frogs = 0;

        for (var i = 0; i < croakOfFrogs.length(); ++i) {

            var ch = croakOfFrogs.charAt(i);

            var n = "croak".indexOf(ch);

            ++cnt[n];

            if (n == 0)
                max_frogs = Math.max(max_frogs, ++frogs);
            
            else if (--cnt[n - 1] < 0)

                return -1;

            else if (n == 4)

                --frogs;

        }

        return frogs == 0 ? max_frogs : -1;

    }
}

public class minimumFrogsCroaking {
    public static void main(String[] args) {

        new Frogs().minNumberOfFrogs("crcoakroak");
        //croakcroak
        //croakcrook

    }
}
