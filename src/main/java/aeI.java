import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.Pbuffer;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.RenderTexture;

public class aei extends acv {
   private acw ddj;
   private Pbuffer djo;

   protected void amm() {
      dcU.aar();
      dcU.ch(7649 & -29213, this.ddj.apE().arV());
      this.djo.bindTexImage(12675 & 10387);

      try {
         Display.makeCurrent();
      } catch (LWJGLException var2) {
         var2.printStackTrace();
      }

      aea.asr();
   }

   public aei(acw var1) {
      super(var1.apE().arZ(), var1.apE().asa());
      this.ddj = var1;
      if ((Pbuffer.getCapabilities() & 16391 & -28639) == 0) {
         throw new acA(w.q[23996 & -8705 & 20990 & 494]);
      } else if ((Pbuffer.getCapabilities() & 34 & -30974) == 0) {
         throw new acA(o.q[994 & 23522 & 13806 & -17950]);
      } else {
         this.init();
      }
   }

   protected void apu() {
      aea.asu();

      try {
         if (this.djo.isBufferLost()) {
            this.djo.destroy();
            this.init();
         }

         this.djo.makeCurrent();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }

      dcU.ch(8169 & 11763, this.ddj.apE().arV());
      this.djo.releaseTexImage(12419 & 10979);
      aed.asy();
      this.asD();
   }

   public void aar() {
      super.aar();
      this.ddj.apL();
   }

   protected void asD() {
      GL11.glEnable(-29213 & 24569);
      GL11.glShadeModel(23809 & -25315);
      GL11.glDisable(20337 & 15345);
      GL11.glDisable(20308 & 2899);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(4070 & 3042);
      GL11.glBlendFunc(1807 & 11090, 779 & -11353);
      GL11.glViewport(1040 & -10236, -32662 & 27776, this.dea, this.ddY);
      GL11.glMatrixMode(16130 & 6096);
      GL11.glLoadIdentity();
      this.asC();
   }

   public void destroy() {
      super.destroy();
      this.djo.destroy();
   }

   private void init() {
      try {
         aec var1 = adU.asi().aq(this.ddj.ab(), this.ddj.ac(), this.ddj.apM());
         RenderTexture var2 = new RenderTexture((boolean)(11265 & 610), (boolean)(26441 & 23), (boolean)(6656 & 8458), (boolean)(1564 & 8320), 26746 & -22530, 19200 & 5286);
         this.djo = new Pbuffer(this.dea, this.ddY, new PixelFormat(16394 & 3164, -26496 & 8451, 28672 & -32319), var2, (Drawable)null);
         this.djo.makeCurrent();
         this.asD();
         dcU.ch(-12829 & 3557, var1.arV());
         this.djo.releaseTexImage(8371 & 8579);
         this.ddj.C(0.0F, 0.0F);
         this.ddj.q(var1);
         Display.makeCurrent();
      } catch (Exception var3) {
         throw new acA(w.q[-28225 & -31235 & -23121 & 10175]);
      }
   }

   protected void asC() {
      GL11.glMatrixMode(-24685 & 30469);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.dea, 0.0D, (double)this.ddY, 1.0D, -0.5333333333333333D * 1.875D);
      GL11.glMatrixMode(-26814 & 24448);
   }
}
