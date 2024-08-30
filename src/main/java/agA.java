import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public class aga {
   public String av;
   public afF dsM;
   public int dto;
   public afZ dtp;
   public int dtq;
   public int dtr;
   public FloatBuffer dts;
   public int dtt;
   public afS dtu;
   public FloatBuffer dkM;
   public IntBuffer dtv;
   public FloatBuffer dtw;

   private void init() {
      this.dkM = BufferUtils.createFloatBuffer(this.dtu.dsN.length);
      this.dkM.put(this.dtu.dsN).flip();
      this.dts = BufferUtils.createFloatBuffer(this.dtu.dsS.length);
      this.dts.put(this.dtu.dsS).flip();
      this.dtw = BufferUtils.createFloatBuffer(this.dtu.dsR.length);
      this.dtw.put(this.dtu.dsR).flip();
      this.dtv = BufferUtils.createIntBuffer(this.dtu.dsQ.length);
      this.dtv.put(this.dtu.dsQ).flip();
      this.dtt = GL15.glGenBuffers();
      GL15.glBindBuffer(538024346 & '貓', this.dtt);
      GL15.glBufferData(-2147308654 & 449943762, this.dkM, 50825450 & 612956393);
      this.dtq = GL15.glGenBuffers();
      GL15.glBindBuffer(-2013213514 & 2132179, this.dtq);
      GL15.glBufferData(18057882 & 742436278, this.dts, -669610772 & 562154230);
      this.dtr = GL15.glGenBuffers();
      GL15.glBindBuffer(86019254 & 563347, this.dtr);
      GL15.glBufferData(142708478 & 307820690, this.dtw, 1480821733 & 35687668);
      this.dto = GL15.glGenBuffers();
      GL15.glBindBuffer(-2113828385 & 268478643, this.dto);
      GL15.glBufferData(270175155 & 1143269531, this.dtv, 1147844837 & 268798692);
      GL15.glBindBuffer(69265555 & 276995250, 7040 & 16454);
      GL15.glBindBuffer(142657747 & -1286762821, -7544 & 304);
   }

   public void q(agb var1) {
      if (var1 == null || var1.hW) {
         if (var1 != null) {
            var1.avp();
            int var2 = var1.jr;
            float var3 = (float)(var2 >> (7190 & -15599) & 767 & -23297) / (0.05263158F * 4845.0F);
            float var4 = (float)(var2 >> (17048 & 6186) & 5375 & 10495) / (91.53846F * 2.7857144F);
            float var5 = (float)(var2 & 4607 & 9983) / (8.0F * 31.875F);
            GL11.glColor4f(var3, var4, var5, var1.Gk);
            if (var1.dtz) {
               GL11.glShadeModel(7497 & -25307);
            }
         }

         GL15.glBindBuffer('貖' & 340171483, this.dtt);
         GL11.glVertexPointer(-31642 & 20996, 7190 & 5415, 17 & 17410, 265258L & 473988043226251649L);
         GL15.glBindBuffer(1287702963 & 841132694, this.dtq);
         GL11.glNormalPointer(-26986 & 13607, 772 & 128, 8606792515270478978L & -8606792515695148288L);
         GL15.glBindBuffer(4515986 & -1610577477, this.dtr);
         GL11.glTexCoordPointer(15363 & -32734, -10434 & 5318, 2114 & 8364, 303863888L & 146940320L);
         GL11.glEnableClientState(1124106614 & 406494452);
         GL11.glEnableClientState(1220583669 & 103715445);
         GL11.glEnableClientState(1017977 & 304128120);
         GL15.glBindBuffer(43027611 & -1474242377, this.dto);
         GL11.glDrawElements(-32475 & 1734, this.dtu.dsQ.length, -25555 & 5191, 1351876614L & 203506697L);
         GL15.glBindBuffer(3911090 & 377542802, -12187 & 8208);
         GL11.glDisableClientState(560112245 & 110923902);
         GL11.glDisableClientState(-1254037131 & 1147637);
         GL11.glDisableClientState(806921081 & -2128307080);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         if (var1 != null && var1.dtz) {
            GL11.glShadeModel(7488 & -8930);
         }
      }

   }

   public float[] avn() {
      acm var1 = new acm();
      acm var2 = new acm(0.0F, 0.0F, 0.0F, 0.0F);
      float[] var3 = this.dtu.dsN;
      float[] var4 = new float[var3.length];
      acj[] var5 = this.dsM.dsh;
      int var6 = 5256 & 10358;

      for(int var7 = var4.length / (4 & 2567); var6 < var7; ++var6) {
         int var8 = -27545 & 26904;

         for(int var9 = 548 & 1408; var9 < (4108 & 18519); ++var9) {
            float var10 = this.dtu.dsT[var6 * (140 & 84) + var9];
            if (var10 > 0.0F) {
               int var11 = this.dtu.dsP[var6 * (-28666 & 27172) + var9];
               var1.l(var3[var6 * (205 & 6166)], var3[var6 * (9222 & 2245) + (8197 & 3361)], var3[var6 * (388 & -22972) + (-26054 & 17670)], 1.0F);
               var5[var11].q(var1);
               var2.w(var1.bT(var10));
               ++var8;
            }
         }

         if (var8 == 0) {
            var2.l(var3[var6 * (-28602 & 16677)], var3[var6 * (2148 & 4612) + (16391 & -24511)], var3[var6 * (2388 & 1540) + (4615 & 394)], 1.0F);
         }

         var4[var6 * (1103 & -32732)] = var2.bUa;
         var4[var6 * (16470 & 644) + (3521 & 3)] = var2.bUb;
         var4[var6 * (6276 & 16655) + (518 & 22594)] = var2.bTZ;
         var4[var6 * (7173 & 692) + (4439 & 1155)] = var2.dcN;
         var2.l(0.0F, 0.0F, 0.0F, 0.0F);
      }

      return var4;
   }

   public void aW() {
      this.dkM.clear();
      this.dkM.put(this.avn()).flip();
      GL15.glBindBuffer(100711058 & -1737700142, this.dtt);
      GL15.glBufferData(218422167 & 1654761722, this.dkM, 672696570 & 1375898093);
      GL15.glBindBuffer(268486802 & 104110290, -32730 & 5697);
   }

   public void avo() {
      GL15.glDeleteBuffers(this.dtt);
      GL15.glDeleteBuffers(this.dtq);
      GL15.glDeleteBuffers(this.dtr);
      GL15.glDeleteBuffers(this.dto);
      this.dkM = null;
      this.dts = null;
      this.dtw = null;
      this.dtv = null;
   }

   public aga(afZ var1, String var2, afS var3) {
      this.dtp = var1;
      this.av = var2;
      this.dtu = var3;
      (this.dsM = this.dtu.dsO.dsM).avh();
      this.init();
   }
}
