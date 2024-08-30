import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vU {
   private static vU aIv;
   private static final Logger aIw = LogManager.getLogger();

   public void q(vX var1) {
      var1.vu().q(var1);
      var1.vt().q(var1);
      qa.ci(var1.vq());
   }

   public static vU vi() {
      return aIv;
   }

   public void w(vX var1) {
      var1.vu().e(var1);
      var1.vt().e(var1);
      qa.ce(var1.vq());
      int var2 = qa.aa(var1.vq(), qa.aix);
      if (var2 == 0) {
         aIw.warn(p.q[2997 & -23113] + var1.vt().vl() + p.q[1526 & -7754] + var1.vu().vl() + p.q[13759 & -15433]);
         aIw.warn(qa.W(var1.vq(), 32768));
      }

   }

   public static void vj() {
      aIv = new vU();
   }

   public int vk() {
      int var1 = qa.oC();
      if (var1 <= 0) {
         throw new wa(p.q[-29260 & 16830] + var1 + w.q[-32451 & 22623]);
      } else {
         return var1;
      }
   }
}
