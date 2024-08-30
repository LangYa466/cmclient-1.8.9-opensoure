import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class qh {
   private static final PX ale = (new PX(-0.20000000298023224D, 1.0D, 0.699999988079071D)).XT();
   private static FloatBuffer alf = py.bN(16);
   private static final PX alg = (new PX(0.20000000298023224D, 1.0D, -0.699999988079071D)).XT();

   private static FloatBuffer q(double var0, double var2, double var4, double var6) {
      return o((float)var0, (float)var2, (float)var4, (float)var6);
   }

   public static void pi() {
      pz.oe();
      pz.cc(0);
      pz.cc(1);
      pz.nV();
      pz.N(1032, 5634);
      float var0 = 0.4F;
      float var1 = 0.6F;
      float var2 = 0.0F;
      GL11.glLight(16384, 4611, q(alg.bUV, alg.bUW, alg.bUX, 0.0D));
      GL11.glLight(16384, 4609, o(var1, var1, var1, 1.0F));
      GL11.glLight(16384, 4608, o(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16384, 4610, o(var2, var2, var2, 1.0F));
      GL11.glLight(16385, 4611, q(ale.bUV, ale.bUW, ale.bUX, 0.0D));
      GL11.glLight(16385, 4609, o(var1, var1, var1, 1.0F));
      GL11.glLight(16385, 4608, o(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16385, 4610, o(var2, var2, var2, 1.0F));
      pz.bP(7424);
      GL11.glLightModel(2899, o(var0, var0, var0, 1.0F));
   }

   public static void pj() {
      pz.nx();
      pz.cb(0);
      pz.cb(1);
      pz.oh();
   }

   public static void pk() {
      pz.nE();
      pz.i(-30.0F, 0.0F, 1.0F, 0.0F);
      pz.i(165.0F, 1.0F, 0.0F, 0.0F);
      pi();
      pz.nF();
   }

   private static FloatBuffer o(float var0, float var1, float var2, float var3) {
      alf.clear();
      alf.put(var0).put(var1).put(var2).put(var3);
      alf.flip();
      return alf;
   }
}
