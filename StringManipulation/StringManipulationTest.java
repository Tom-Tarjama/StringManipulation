public class StringManipulationTest{
    public static void main(String[] args){
        StringManipulation manipulator = new StringManipulation();
            String str = manipulator.trimAndConcat("    Hello    ", "   World    ");
            System.out.println(str);

            Integer a = manipulator.getIndexOrNull("Coding", 'g');
            System.out.println(a);
            Integer b = manipulator.getIndexOrNull("Hello World", 'o');
            System.out.println(b);
            Integer c = manipulator.getIndexOrNull("Hello World", 'p');
            System.out.println(c);

            Integer d = manipulator.getIndexOrNull("Hello World", "ld");
            System.out.println(d);
            Integer e = manipulator.getIndexOrNull("Hello World", "goodbye");
            System.out.println(e);

            String p = manipulator.concatSubstring("Hello", 1, "world", 2);
            System.out.println(p);
    };
}