public class MyMain {
    public static void main (String [] args){
//        MyPair<String, Integer> a = new MyPair<String, Integer>("Anders", 13);
//        MyPair<String, Double> b = new MyPair<String, Double>("Phoenix", 39.7);
//        a = b;

//        MyPair<String, Integer>[] grades = new MyPair[5];
//        grades[0] = new MyPair<String, Integer>("A", 1);
//        grades[1] = new MyPair<String, Integer>("B", 2);
//        grades[2] = new MyPair<String, Integer>("C", 3);
//        for (MyPair k : grades){
//            System.out.println(k);
//        }

        MyPair<MyPair<Integer, Integer>, String> appointment = new MyPair<MyPair<Integer, Integer>, String>(new MyPair<Integer, Integer>(4, 5), "D");
        System.out.println(appointment.Fst.Snd);
        System.out.println(appointment.toString());
        System.out.println(appointment.Swap());
    }
}
