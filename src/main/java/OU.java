import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class oU {
   private static final FloatBuffer acK = py.bN(16);
   private static final FloatBuffer acL = py.bN(16);
   private static float acM;
   private static float acN;
   private static float acO;
   private static final FloatBuffer acP = py.bN(3);
   private static float acQ;
   private static float acR;
   private static final IntBuffer acS = py.bL(16);
   private static PX acT = new PX(0.0D, 0.0D, 0.0D);

   public static PX mO() {
      return acT;
   }

   public static float mP() {
      return acN;
   }

   public static cv q(QI var0, zk var1, float var2) {
      PX var3 = q(var1, (double)var2);
      NW var4 = new NW(var3);
      hI var5 = var0.g(var4);
      cv var6 = var5.ds();
      if (var6.cB().eo()) {
         float var7 = 0.0F;
         if (var5.ds() instanceof ey) {
            var7 = ey.Y(((Integer)var5.w(ey.rN)).intValue()) - 0.11111111F;
         }

         float var8 = (float)(var4.aX() + 1) - var7;
         if (var3.bUW >= (double)var8) {
            var6 = var0.g(var4.Vi()).ds();
         }
      }

      return var6;
   }

   public static PX q(zk var0, double var1) {
      double var3 = var0.aOf + (var0.aNZ - var0.aOf) * var1;
      double var5 = var0.aNH + (var0.aNK - var0.aNH) * var1;
      double var7 = var0.aNW + (var0.aOt - var0.aNW) * var1;
      double var9 = var3 + acT.bUV;
      double var11 = var5 + acT.bUW;
      double var13 = var7 + acT.bUX;
      return new PX(var9, var11, var13);
   }

   public static void q(DD var0, boolean var1) {
      pz.w(2982, acK);
      pz.w(2983, acL);
      GL11.glGetInteger(2978, acS);
      float var2 = (float)((acS.get(0) + acS.get(2)) / 2);
      float var3 = (float)((acS.get(1) + acS.get(3)) / 2);
      GLU.gluUnProject(var2, var3, 0.0F, acK, acL, acS, acP);
      acT = new PX((double)acP.get(0), (double)acP.get(1), (double)acP.get(2));
      int var4 = var1 ? 1 : 0;
      ahj var5 = aew.atw().dmB;
      float var6 = var5.cx(var0.aNN);
      float var7 = var5.cw(var0.aOn);
      acN = Pq.bi(var7 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      acR = Pq.bk(var7 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      acQ = -acR * Pq.bk(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      acM = acN * Pq.bk(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      acO = Pq.bi(var6 * 3.1415927F / 180.0F);
   }

   public static float mQ() {
      return acO;
   }

   public static float mR() {
      return acM;
   }

   public static float mS() {
      return acQ;
   }

   public static float mT() {
      return acR;
   }
}
