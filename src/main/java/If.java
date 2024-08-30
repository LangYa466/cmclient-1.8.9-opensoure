import java.util.concurrent.Callable;
import org.lwjgl.opengl.GL11;

class if1 implements Callable {
   // $FF: synthetic field
   final hS Da;

   if1(hS var1) {
      this.Da = var1;
   }

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }

   public String gm() {
      return GL11.glGetString(7937) + o.q[12022 & 944] + GL11.glGetString(7938) + q.q[3054 & 5231] + GL11.glGetString(7936);
   }
}
