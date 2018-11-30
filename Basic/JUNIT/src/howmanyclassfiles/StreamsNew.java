package howmanyclassfiles;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamsNew {

        public static void  main(String[] args){
            List<Integer> list= Arrays.asList(1,3,2,4,7,20);
            long s=list.stream()
                    .filter(new Predicate<Integer>() {
                        @Override
                        public boolean test(Integer i) {
                            return i%2==0;
                        }
                    })
                    .mapToInt(new ToIntFunction<Integer>() {
                        @Override
                        public int applyAsInt(Integer i) {
                            return i;
                        }
                    })
                    .sum();
            System.out.println(s);
        }
    }


