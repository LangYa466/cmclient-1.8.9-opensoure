import java.util.concurrent.Callable;
import org.lwjgl.Sys;

class ie implements Callable {
   // $FF: synthetic field
   final hS CZ;

   ie(hS var1) {
      this.CZ = var1;
   }

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }

   public String gm() {
      return Sys.getVersion();
   }
}
