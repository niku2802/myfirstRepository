package generics;
//bounded type parameters

   class Box<T> {

        private T t;

        public void set(T t) {
            this.t = t;
        }


        public <U extends Object> void inspect(U u) {
            System.out.println("T: " + t.getClass().getName());
            System.out.println("U: " + u.getClass().getName());


        }
    }
    public class Generics3{

        public static void main(String[] args) {
            Box<String> integerBox = new Box<>();
            integerBox.set(new String("ABC"));
            integerBox.inspect("NikitaGupta"); // error: this is still String!
        }
    }

