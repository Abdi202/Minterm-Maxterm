import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DogrulukTablosu{
	
public static String booleanFonksiyonunuDosyadanOkuma(String filename) throws IOException {
  StringBuilder sb = new StringBuilder();
   try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
         String line;
         while ((line = br.readLine()) != null) {
            sb.append(line);
            }
        }
        return sb.toString().trim();
    }
                
public static String ikiliyeDonusturme(String booleanFunction) {//ikili tabana dönüştürme
     String[] terms = booleanFunction.split("\\+");
     StringBuilder binaryStringBuilder = new StringBuilder();
 for (String term : terms) {
 for (int i = 0; i < term.length(); i++) {
     char variable = term.charAt(i);
       if (i + 1 < term.length() && term.charAt(i + 1) == '\'') {
        binaryStringBuilder.append("0");
 i++;
  }
   else if (term.charAt(i) == 'X') {
    binaryStringBuilder.append("X");
    } 
   else {
  binaryStringBuilder.append("1"); 
  
  }
       
 }
 binaryStringBuilder.append(" "); 

 }
 binaryStringBuilder.setLength(binaryStringBuilder.length() - 1);
  return binaryStringBuilder.toString();
  
 }
       
public static void dogrulukTablosu(String[] binarylist) { //doğrulukTablosu
   String result = "F = ";
   String result2 = "F = ";
   String result3 = "F= Σ(";
   String result4 = "F= ∏(";
     for (int a = 0; a <= 1; a++) {
     for (int b = 0; b <= 1; b++) {
     for (int c = 0; c <= 1; c++) {
     for (int d = 0; d <= 1; d++) {
   String rows = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);
   System.out.print(a + " " + b + " " + c + " " + d);
                        
      boolean bul = false;
    for (int i=0;i<binarylist.length;i++) {
 if ((bul == false) & (binarylist[i].charAt(0) == rows.charAt(0) | binarylist[i].charAt(0) == 'X') &  (binarylist[i].charAt(1) == rows.charAt(1) | binarylist[i].charAt(1) == 'X') & (binarylist[i].charAt(2) == rows.charAt(2) | binarylist[i].charAt(2) == 'X') & (binarylist[i].charAt(3) == rows.charAt(3) | binarylist[i].charAt(3) == 'X')) {
                        		bul = true;
                        		
 System.out.print(" " + "1\n");
 result += a == 1 ? "A" : "A'";
 result += b == 1 ? "B" : "B'";
 result += c == 1 ? "C" : "C'";
 result += d == 1 ? "D" : "D'";
 result += " + ";
 String row = ""+a+b+c+d;
 result3 += String.valueOf(Integer.parseInt(row,2)) +",";
}
 }
if(bul == false) {
System.out.print(" " + "0\n");
  result2 += "(";
  result2 += a == 0 ? "A" : "A'";
  result2 += "+";
  result2 += b == 0 ? "B" : "B'";
  result2 += "+";
  result2 += c == 0 ? "C" : "C'";
  result2 += "+";
  result2 += d == 0 ? "D" : "D'";
  result2 += ")";
  result2 += " . ";
        String row = ""+a+b+c+d;
 result4 += String.valueOf(Integer.parseInt(row,2)) +",";
}

 }
     
 }
     
 }
}
System.out.println("Fonksiyon İfadeleri:");
        result3 += ")";
        result4 += ")";
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
       
    }
    }
 
