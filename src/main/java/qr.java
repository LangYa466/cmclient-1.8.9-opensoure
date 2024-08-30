import org.lwjgl.util.vector.Vector3f;

public class qR {
   public static final qR anB = new qR(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
   public final Vector3f anC;
   public final Vector3f anD;
   public final Vector3f anE;

   public int hashCode() {
      int var1 = this.anE.hashCode();
      var1 = 31 * var1 + this.anD.hashCode();
      var1 = 31 * var1 + this.anC.hashCode();
      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         qR var2 = (qR)var1;
         return !this.anE.equals(var2.anE) ? false : (!this.anC.equals(var2.anC) ? false : this.anD.equals(var2.anD));
      }
   }

   public qR(Vector3f var1, Vector3f var2, Vector3f var3) {
      this.anE = new Vector3f(var1);
      this.anD = new Vector3f(var2);
      this.anC = new Vector3f(var3);
   }
}
