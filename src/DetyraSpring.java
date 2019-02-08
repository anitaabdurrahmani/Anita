public class DetyraSpring {


        public static void main(String[] args) {

            bashkoStringjet();

        }

        public static void bashkoStringjet(){
            String [] numb = {"1", "2", "3","4","5"};
            String [] let = {"a","b","c"};
            String result = "";

            for (int i = 0; Math.max(numb.length, let.length) > i; i++) {

                if(i < numb.length)
                    result = numb[i];
                if(i < let.length)
                    result = result + let[i];

                result = result + "";

                System.out.print( result);
            }
        }
    }




