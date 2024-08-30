import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class aeg extends acv {
   private acw ddj;
   private boolean cvX = (boolean)(22861 & 9745);
   private int dji;

   private void asB() {
      int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(1644727752 & 12701008);
      switch(var1) {
      case 36053:
         return;
      case 36054:
         throw new acA(a.q[-23249 & -5137 & 7855 & 5310] + this.dji + a.q[-15057 & -32321 & -5521 & 25455]);
      case 36055:
         throw new acA(a.q[3134 & 22206 & -9361 & -17170] + this.dji + a.q[-28488 & -24335 & 9853 & 11959]);
      case 36056:
      default:
         throw new acA(a.q[24949 & 31607 & 23229 & 15039] + var1);
      case 36057:
         throw new acA(a.q[17582 & -15186 & 12350 & -19906] + this.dji + a.q[2483 & 19249 & 4785 & 20667]);
      case 36058:
         throw new acA(a.q[3951 & 1070 & -28097 & 4655] + this.dji + a.q[-32705 & -3533 & 17591 & 20151]);
      case 36059:
         throw new acA(a.q[-2497 & -2385 & -29953 & 4206] + this.dji + a.q[9786 & -31685 & -32393 & -15434]);
      case 36060:
         throw new acA(a.q[-32338 & -13650 & 19902 & -31105] + this.dji + a.q[19583 & 11710 & -19723 & -5889]);
      }
   }

   private void asy() {
      EXTFramebufferObject.glBindFramebufferEXT(184593864 & 1080135024, 473 & 31234);
      GL11.glReadBuffer(1733 & 19717);
   }

   public void aar() {
      super.aar();
      this.ddj.apL();
   }

   protected void asC() {
      GL11.glMatrixMode(16325 & -26847);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.dea, 0.0D, (double)this.ddY, 1.0D, -4.071428571428572D * 0.24561403508771928D);
      GL11.glMatrixMode(-26824 & 5888);
   }

   protected void amm() {
      dcU.aar();
      this.asy();
      GL11.glPopClientAttrib();
      GL11.glPopAttrib();
      GL11.glMatrixMode(-26743 & 14080);
      GL11.glPopMatrix();
      GL11.glMatrixMode(7959 & 14249);
      GL11.glPopMatrix();
      GL11.glMatrixMode(24492 & -18606);
      aea.asr();
   }

   protected void asD() {
      GL11.glEnable(-29207 & 3559);
      GL11.glShadeModel(7937 & 23855);
      GL11.glDisable(2929 & -25731);
      GL11.glDisable(2896 & -13328);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(3050 & 12263);
      GL11.glBlendFunc(774 & 6930, 2979 & 10007);
      GL11.glViewport(4228 & 8736, 10 & 18548, this.dea, this.ddY);
      GL11.glMatrixMode(14160 & 7980);
      GL11.glLoadIdentity();
      this.asC();
   }

   private void init() {
      IntBuffer var1 = BufferUtils.createIntBuffer(4609 & -32767);
      EXTFramebufferObject.glGenFramebuffersEXT(var1);
      this.dji = var1.get();

      try {
         aec var2 = adU.asi().aq(this.ddj.ab(), this.ddj.ac(), this.ddj.apM());
         EXTFramebufferObject.glBindFramebufferEXT(-2012172474 & 1663147352, this.dji);
         EXTFramebufferObject.glFramebufferTexture2DEXT(847351616 & -2055541428, -1857909280 & 1152699632, 19943 & 3553, var2.arV(), 1089 & 8362);
         this.asB();
         this.asy();
         this.clear();
         this.aar();
         this.q(this.ddj, 0.0F, 0.0F);
         this.ddj.q(var2);
      } catch (Exception var3) {
         throw new acA(a.q[20790 & 28919 & -19841 & 8831]);
      }
   }

   public aeg(acw var1) {
      super(var1.apE().arZ(), var1.apE().asa());
      this.ddj = var1;
      boolean var2 = GLContext.getCapabilities().GL_EXT_framebuffer_object;
      if (!var2) {
         throw new acA(a.q[-32321 & -20051 & -16593 & 14911]);
      } else {
         this.init();
      }
   }

   protected void apu() {
      if (!this.cvX) {
         throw new RuntimeException(a.q[-7105 & 55 & -1929 & -2953]);
      } else {
         aea.asu();
         GL11.glPushAttrib(307232767 & 1048575);
         GL11.glPushClientAttrib(-1 & -1);
         GL11.glMatrixMode(14225 & -24825);
         GL11.glPushMatrix();
         GL11.glMatrixMode(6004 & 22274);
         GL11.glPushMatrix();
         this.apq();
         this.asD();
      }
   }

   public void destroy() {
      super.destroy();
      IntBuffer var1 = BufferUtils.createIntBuffer(10529 & -31653);
      var1.put(this.dji);
      var1.flip();
      EXTFramebufferObject.glDeleteFramebuffersEXT(var1);
      this.cvX = (boolean)(640 & 9226);
   }

   private void apq() {
      EXTFramebufferObject.glBindFramebufferEXT(1800572228 & -1879007902, this.dji);
      GL11.glReadBuffer(185241570 & 1620348129);
   }
}
