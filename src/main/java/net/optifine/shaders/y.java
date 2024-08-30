package net.optifine.shaders;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public class y implements net.optifine.shaders.s {
   private int ctr;
   private final int cDM;
   private final .aaK cDN;

   public int ahR() {
      return this.ctr;
   }

   public int ahQ() {
      return this.cDM;
   }

   public y(.aaK var1, .aaH var2, int var3, int var4, int var5, .aaI var6, .aaJ var7, ByteBuffer var8, int var9, boolean var10, boolean var11) {
      // $FF: Couldn't be decompiled
   }

   public int ahP() {
      return this.cDN.B();
   }

   public void ahS() {
      if (this.ctr > 0) {
         GL11.glDeleteTextures(this.ctr);
         this.ctr = 0;
      }

   }
}
