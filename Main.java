import java.io.IOException;
public class  Main {
    public static void main(String[] args) {
        try {
            String filename = "boole.txt";
            String booleanFunction = DogrulukTablosu.booleanFonksiyonunuDosyadanOkuma(filename);
            booleanFunction = booleanFunction.substring(2, booleanFunction.length()).replace(" ", "");

            if (booleanFunction.trim().charAt(0) != 'F' & booleanFunction.trim().charAt(1) != '=') {
                System.out.println(filename + " dosyası okundu.");
                System.out.println("doğruluk tablosu:");
                DogrulukTablosu Dogruluk = new DogrulukTablosu();
                String binary = Dogruluk.ikiliyeDonusturme(booleanFunction);
                String[] binarylist = binary.split(" ");
                System.out.println("A B C D F");
                Dogruluk.dogrulukTablosu(binarylist); 
            } 
        } catch (IOException e) {
    System.err.println("Dosya okunurken hata oluştu: " + e.getMessage());
        }
    }

   
}
