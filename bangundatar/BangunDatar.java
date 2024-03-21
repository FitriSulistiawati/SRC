package bangundatar;
public abstract class BangunDatar {
   public abstract double luas();
   public abstract double keliling();
   
   public void getInfo() {
        System.out.printIn("Luas: " + luas());
        System.out.printIn("Keliling: " + keliling());
   }
   
}