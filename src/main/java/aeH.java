import java.util.HashMap;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.Pbuffer;

public class aeh {
   private static boolean djj = (boolean)(23441 & 15);
   private static HashMap djk = new HashMap();
   private static boolean djl = (boolean)(-29669 & 17217);
   private static boolean djm = (boolean)(-26560 & 16937);
   private static boolean djn = (boolean)(8769 & 7175);

   private static void init() {
      djm = (boolean)(1569 & 18569);
      if (djl) {
         djl = GLContext.getCapabilities().GL_EXT_framebuffer_object;
      }

      djj = (boolean)((Pbuffer.getCapabilities() & 8705 & -32473) != 0 ? 1665 & 371 : 16396 & -20848);
      djn = (boolean)((Pbuffer.getCapabilities() & -32669 & 18822) != 0 ? -15293 & 6817 : 16514 & 10240);
      if (!djl && !djj && !djn) {
         throw new acA(w.q[23677 & -10243 & -15873 & -20993]);
      }
   }

   private static acv w(acw var0) {
      init();
      if (djl) {
         try {
            return new aeg(var0);
         } catch (Exception var2) {
            djl = (boolean)(-20446 & 2200);
         }
      }

      if (djj) {
         return (acv)(djn ? new aei(var0) : new aej(var0));
      } else {
         throw new acA(w.q[2815 & 25470 & -28802 & -20994]);
      }
   }

   public static boolean asE() {
      return djl;
   }

   public static void e(acw var0) {
      acv var1 = (acv)djk.remove(var0.apE());
      if (var1 != null) {
         var1.destroy();
      }

   }

   public static acv r(acw var0) {
      acv var1 = (acv)djk.get(var0.apE());
      if (var1 == null) {
         var1 = w(var0);
         djk.put(var0.apE(), var1);
      }

      return var1;
   }

   public static void cS(boolean var0) {
      djl = var0;
   }

   public static boolean asF() {
      return (boolean)(!djl && djj ? 7461 & 8217 : -32747 & 1288);
   }
}
