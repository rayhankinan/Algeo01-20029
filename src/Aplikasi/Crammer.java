package Aplikasi;

import Matrix.*;
import Utility.IO;

public class Crammer {
  public static void crammer(Matrix m){
    Matrix a, b;

    a = new Matrix();
    b = new Matrix();

    Operation.splitAugmentedMatrix(m, a, b);

    double temp = Determinan.ekspansiKofaktor(a);
    if(temp == 0){
      System.out.println("Determinan Matrix 0");
    }else if(a.getCol() != a.getRow()){
      System.out.println("Jumlah persamaan tidak sama dengan jumlah variabel");
    }
    else{
      double[] listDet = new double[a.getRow()];
      for(int i = 0; i < a.getCol(); i++){
        Matrix c = new Matrix();
        c = c.copyMatrix(a);
        Operation.setCol(c, b, i, 0);
        listDet[i] = Determinan.ekspansiKofaktor(c)/temp;
        System.out.println(String.format("X%d: %,.4f", i+1, listDet[i]));
      }
    }
  }

  public static void FileCrammer(Matrix m, String namaFile){
    Matrix a, b;

    a = new Matrix();
    b = new Matrix();

    Operation.splitAugmentedMatrix(m, a, b);

    double temp = Determinan.ekspansiKofaktor(a);
    if(temp == 0){
      IO.writeFileString(namaFile, "Determinan Matrix 0");
    }else if(a.getCol() != a.getRow()){
      IO.writeFileString(namaFile, "Jumlah persamaan tidak sama dengan jumlah variabel");
    }
    else{
      double[] listDet = new double[a.getRow()];
      String tempString = "";
      for(int i = 0; i < a.getCol(); i++){
        Matrix c = new Matrix();
        c = c.copyMatrix(a);
        Operation.setCol(c, b, i, 0);
        listDet[i] = Determinan.ekspansiKofaktor(c)/temp;
        tempString += String.format("X%d: %,.4f", i+1, listDet[i]) + "\n";
      }
      IO.writeFileString(namaFile, tempString);
    }
  }
}
