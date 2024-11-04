package testesisolados;

public class UtilitariosString {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        int l = original.indexOf("bc");
        int m = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + l);
        System.out.println("Last index of 'bc': " + m);


        String frutas = "Laranja Morango Uva Maçã";
        String[] frutasSplit = frutas.split(" ");
        // For each
        for (String s : frutasSplit) {
            System.out.println(s);
        }
        // For comum
        for (int i = 0; i < frutasSplit.length; i++) {
            System.out.println(frutasSplit[i]);
        }
    }


}
