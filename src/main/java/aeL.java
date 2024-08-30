import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.EXTSecondaryColor;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class ael implements aep {
   private float[] djp;
   private int eC;
   protected float djq;
   private int eo;

   public void T(int var1, int var2, int var3, int var4) {
      GL11.glScissor(var1, var2, var3, var4);
   }

   public float[] asH() {
      return this.djp;
   }

   public void w(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      GL11.glGetTexImage(var1, var2, var3, var4, var5);
   }

   public void asI() {
      GL11.glPopMatrix();
   }

   public void cV(boolean var1) {
      GL11.glDepthMask(var1);
   }

   public boolean asJ() {
      return GLContext.getCapabilities().GL_EXT_texture_mirror_clamp;
   }

   public void q(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9) {
      GL11.glTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void w(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9) {
      GL11.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void A(float var1, float var2, float var3, float var4) {
      var4 = var4 * this.djq;
      this.djp[-28672 & 8258] = var1;
      this.djp[2829 & 21505] = var2;
      this.djp[1559 & -14206] = var3;
      this.djp[2755 & 8211] = var4;
      GL11.glColor4f(var1, var2, var3, var4);
   }

   public void kE(int var1) {
      GL11.glCallList(var1);
   }

   public void cp(float var1) {
      GL11.glPointSize(var1);
   }

   public boolean asK() {
      return GLContext.getCapabilities().GL_EXT_secondary_color;
   }

   public void ch(int var1, int var2) {
      GL11.glBindTexture(var1, var2);
   }

   public void X(float var1, float var2) {
      GL11.glVertex2f(var1, var2);
   }

   public void ci(int var1, int var2) {
      GL11.glMatrixMode(-26879 & 22305);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.eo, (double)this.eC, 0.0D, 1.0D, -0.5813953488372093D * 1.72D);
      GL11.glMatrixMode(5954 & 22273);
      GL11.glTranslatef((float)((this.eo - var1) / (17411 & -30450)), (float)((this.eC - var2) / (29451 & 130)), 0.0F);
   }

   public void R(int var1, int var2) {
      GL11.glNewList(var1, var2);
   }

   public void w(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      GL11.glCopyTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void K(float var1, float var2, float var3) {
      GL11.glTranslatef(var1, var2, var3);
   }

   public void t(IntBuffer var1) {
      GL11.glDeleteTextures(var1);
   }

   public void kF(int var1) {
      GL11.glEnable(var1);
   }

   public void bU(int var1) {
      GL11.glBegin(var1);
   }

   public void kG(int var1) {
      GL11.glDepthFunc(var1);
   }

   public void nY() {
      GL11.glEndList();
   }

   public void w(boolean var1, boolean var2, boolean var3, boolean var4) {
      GL11.glColorMask(var1, var2, var3, var4);
   }

   public void kH(int var1) {
      GL11.glClear(var1);
   }

   public void w(FloatBuffer var1) {
      GL11.glLoadMatrix(var1);
   }

   public void q(byte var1, byte var2, byte var3) {
      EXTSecondaryColor.glSecondaryColor3ubEXT(var1, var2, var3);
   }

   public void t(int var1, IntBuffer var2) {
      GL11.glGetInteger(var1, var2);
   }

   public void L(float var1, float var2, float var3) {
      GL11.glVertex3f(var1, var2, var3);
   }

   public void ar(int var1, int var2, int var3) {
      GL11.glTexEnvi(var1, var2, var3);
   }

   public void B(float var1, float var2, float var3, float var4) {
      GL11.glClearColor(var1, var2, var3, var4);
   }

   public void cq(float var1) {
      GL11.glClearDepth((double)var1);
   }

   public void k(int var1, int var2, int var3) {
      GL11.glTexParameteri(var1, var2, var3);
   }

   public void u(int var1, FloatBuffer var2) {
      GL11.glGetFloat(var1, var2);
   }

   public void aar() {
   }

   public int kI(int var1) {
      return GL11.glGenLists(var1);
   }

   public void cj(int var1, int var2) {
      GL11.glBlendFunc(var1, var2);
   }

   public void q(int var1, DoubleBuffer var2) {
      GL11.glClipPlane(var1, var2);
   }

   public void q(int var1, int var2, int var3, int var4, int var5, int var6, ByteBuffer var7) {
      GL11.glReadPixels(var1, var2, var3, var4, var5, var6, var7);
   }

   public void asL() {
      GL11.glPushMatrix();
   }

   public ael() {
      float[] var10001 = new float[-29876 & 9236];
      var10001[1025 & 2826] = 1.0F;
      var10001[-32735 & 13385] = 1.0F;
      var10001[6 & 19474] = 1.0F;
      var10001[-16237 & 8555] = 1.0F;
      this.djp = var10001;
      this.djq = 1.0F;
   }

   public void cr(float var1) {
      GL11.glLineWidth(var1);
   }

   public void M(float var1, float var2, float var3) {
      GL11.glScalef(var1, var2, var3);
   }

   public void nT() {
      GL11.glEnd();
   }

   public void asM() {
      GL11.glLoadIdentity();
   }

   public void C(float var1, float var2, float var3, float var4) {
      GL11.glRotatef(var1, var2, var3, var4);
   }

   public void cs(float var1) {
      this.djq = var1;
   }

   public void ck(int var1, int var2) {
      this.eo = var1;
      this.eC = var2;
      String var3 = GL11.glGetString(7947 & 7987);
      GL11.glEnable(-23 & 3559);
      GL11.glShadeModel(7433 & 16259);
      GL11.glDisable(7029 & 3057);
      GL11.glDisable(7161 & -29870);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(-16409 & 19426);
      GL11.glBlendFunc(4994 & 1834, -31861 & 8963);
      GL11.glViewport(11016 & 16, -28671 & 2392, var1, var2);
      GL11.glMatrixMode(5915 & -18688);
   }

   public void kJ(int var1) {
      GL11.glDisable(var1);
   }

   public void y(IntBuffer var1) {
      GL11.glGenTextures(var1);
   }

   public void O(int var1, int var2) {
      GL11.glDeleteLists(var1, var2);
   }

   public void Y(float var1, float var2) {
      GL11.glTexCoord2f(var1, var2);
   }

   public void asN() {
      GL11.glGetError();
   }
}
