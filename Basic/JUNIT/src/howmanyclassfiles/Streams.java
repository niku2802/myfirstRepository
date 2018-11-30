package howmanyclassfiles;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        boolean s = list.stream().anyMatch(i -> i == 12);
        System.out.println(s);
    }
}
        /*
                //.filter(i->i%2==0)
                //.mapToInt(i->i)
                //.sum();
        System.out.println(s);
        try {
            Thread.sleep(1000);
        }catch(Exception e){

        }

    }
}
*/