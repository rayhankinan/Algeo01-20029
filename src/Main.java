import Matrix.*;
import Utility.*;
import Aplikasi.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import Aplikasi.RLB;

public class Main{
  public static void main(String[] args) {
    // Matrix a = IO.readAugmentMatrix("1spl_a.txt");
    // Matrix ans = SistemPersamaanLinear.SPLGaussJordan(a);
    //NOTE tentuin ini logicnya mau di main nya apa di menu nya aja biar literally pendek gitu di sininya oke makasih
    // Menu.mainMenu();
    Matrix m = new Matrix(3, 3);
    m.createMatrix();
    m.displayMatrix();
    //RLB.convertRLBMatrix(m).displayMatrix();
    // SistemPersamaanLinear.SPLGaussJordan(m);
  }
}