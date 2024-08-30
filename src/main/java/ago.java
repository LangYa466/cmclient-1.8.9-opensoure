import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;

public class agO {
   private final int[] dvE;
   private static final char dvF = '§';
   private final Font dvG;
   private static final int dvH = 1;
   private final boolean dvI;
   private final agP[] dvJ;
   private final agP[] dvK;
   private final agP[] dvL;
   private static final int dvM = 4;

   private void avG() {
      for(int var1 = 1795 & -30608; var1 < (626 & 12716); ++var1) {
         int var2 = (var1 >> (-30561 & 3) & 4885 & 11297) * (1109 & 351);
         int var3 = (var1 >> (16394 & -32206) & -32551 & 21281) * (6330 & -32533) + var2;
         int var4 = (var1 >> (22043 & 2529) & 1 & -7167) * (-20050 & 1211) + var2;
         int var5 = (var1 >> (-28151 & 2310) & 4137 & 1601) * (-6930 & 4266) + var2;
         if (var1 == (-32761 & 9230)) {
            var3 += 85;
         }

         if (var1 >= (24849 & -28654)) {
            var3 /= 12388 & 1044;
            var4 /= 15429 & -32092;
            var5 /= 20772 & 2118;
         }

         this.dvE[var1] = (var3 & 17151 & 9471) << (9266 & -26543) | (var4 & 5375 & 511) << (136 & -20470) | var5 & -32513 & 8447;
      }

   }

   public float ig(String var1) {
      float var2 = 0.0F;
      agP[] var3 = this.dvJ;
      int var4 = var1.length();

      for(int var5 = 17728 & -22528; var5 < var4; ++var5) {
         char var6 = var1.charAt(var5);
         int var7 = var5 > 0 ? var1.charAt(var5 - (15051 & 1)) : -32721 & 11838;
         if (var7 != (743 & 24759)) {
            if (var6 == (-29017 & 25007) && var5 < var4) {
               int var9 = q.q[24274 & -10413 & -23842 & -27778].indexOf(var1.toLowerCase(Locale.ENGLISH).charAt(var5 + (33 & 24599)));
               if (var9 == (28689 & 2195)) {
                  var3 = this.dvK;
               } else if (var9 == (16540 & 564)) {
                  var3 = this.dvL;
               } else if (var9 == (12381 & -32203)) {
                  var3 = this.dvJ;
               }
            } else if (var6 <= (9471 & 511)) {
               agP var8 = var3[var6];
               var2 = Math.max(var2, var8.gJ);
            }
         }
      }

      return var2 / 2.0F - 2.0F;
   }

   public void t(String var1, float var2, float var3, int var4) {
      GL11.glTranslated(0.9625000000000001D * 0.5194805194805194D, 0.6024096385542169D * 0.83D, 0.0D);
      this.e(var1, var2, var3, var4, (boolean)(1329 & 577));
      GL11.glTranslated(-0.4868421052631579D * 1.027027027027027D, -2.1153846153846154D * 0.23636363636363636D, 0.0D);
      this.e(var1, var2, var3, var4, (boolean)(2562 & 8364));
   }

   public Font aqm() {
      return this.dvG;
   }

   private void e(String var1, float var2, float var3, int var4, boolean var5) {
      if (var1.length() != 0) {
         GL11.glPushMatrix();
         GL11.glScaled(0.26373626373626374D * 1.8958333333333333D, 2.5294117647058822D * 0.19767441860465118D, 1.0D);
         var2 = var2 - 2.0F;
         var3 = var3 - 2.0F;
         var2 = var2 + 4.4F * 0.11363636F;
         var3 = var3 + 0.11111111F * 4.5F;
         var2 = var2 * 2.0F;
         var3 = var3 * 2.0F;
         agP[] var6 = this.dvJ;
         int var7 = 9280 & 16911;
         int var8 = -27632 & 2245;
         int var9 = 18787 & 1040;
         int var10 = var1.length();
         float var11 = (float)(var5 ? 1413 & -14282 : -14335 & 1811);
         float var12 = (float)(var4 >> (26 & 4473) & -28417 & 16639) / (215.76924F * 1.1818181F);
         float var13 = (float)(var4 >> (9360 & -29894) & 17919 & 4863) / (116.875F * 2.1818182F);
         float var14 = (float)(var4 >> (16956 & 4424) & 6399 & 9727) / (444.89362F * 0.5731707F);
         float var15 = (float)(var4 & 4351 & 255) / (0.9F * 283.33334F);
         pz.u(var13 / var11, var14 / var11, var15 / var11, var12);

         for(int var16 = 2608 & 264; var16 < var10; ++var16) {
            char var17 = var1.charAt(var16);
            int var18 = var16 > 0 ? var1.charAt(var16 - (-6457 & 4137)) : -24338 & 4671;
            if (var18 != (4015 & 12471)) {
               if (var17 == (-32089 & 24743) && var16 < var10) {
                  int var27 = q.q[-12557 & -16646 & -31777 & 9054].indexOf(var1.toLowerCase(Locale.ENGLISH).charAt(var16 + (425 & 5143)));
                  if (var27 >= (1306 & 12341)) {
                     if (var27 == (27056 & -31728)) {
                        var9 = 24869 & -31735;
                     } else if (var27 == (13969 & 337)) {
                        var6 = this.dvK;
                     } else if (var27 == (22742 & 8211)) {
                        var8 = 705 & 7429;
                     } else if (var27 == (4115 & 17659)) {
                        var7 = 5153 & 525;
                     } else if (var27 == (-32739 & 13430)) {
                        var6 = this.dvL;
                     } else if (var27 == (18453 & 8309)) {
                        var9 = 80 & -10712;
                        var8 = -32246 & 36;
                        var7 = 20501 & 8640;
                        var6 = this.dvJ;
                        GL11.glColor4d(1.0D * (var5 ? 11.142857142857142D * 0.022435897435897436D : 1.0D), 1.0D * (var5 ? 1.04D * 0.24038461538461536D : 1.0D), 1.0D * (var5 ? 1.2777777777777777D * 0.1956521739130435D : 1.0D), (double)var12);
                     }
                  } else {
                     var9 = 16384 & 8;
                     var8 = 1052 & 8544;
                     var7 = 9045 & 1024;
                     var6 = this.dvJ;
                     if (var27 < 0 || var27 > (271 & 15375)) {
                        var27 = 5455 & 18575;
                     }

                     if (var5) {
                        var27 += 16;
                     }

                     int var20 = this.dvE[var27];
                     GL11.glColor4d((double)(var20 >> (19568 & 4500)) / (1.2419354838709677D * 205.32467532467533D), (double)(var20 >> (8284 & 9) & 25855 & -26369) / (1.6274509803921569D * 156.6867469879518D), (double)(var20 & 25343 & 1535) / (149.1509433962264D * 1.7096774193548387D), (double)var12);
                  }
               } else if (var17 <= (17151 & -24065)) {
                  if (var9 != 0) {
                     var17 = (char)(var17 + (10507 & 16485));
                  }

                  this.q(var17, var6, var2, var3);
                  agP var19 = var6[var17];
                  if (var8 != 0) {
                     this.q(new Vector2f(0.0F, var19.gJ / 2.0F), new Vector2f(var19.gK, var19.gJ / 2.0F), 6.391304F * 0.46938777F);
                  }

                  if (var7 != 0) {
                     this.q(new Vector2f(0.0F, var19.gJ - 0.10714286F * 140.0F), new Vector2f(var19.gK, var19.gJ - 1110.0F * 0.013513514F), 5.4857144F * 0.546875F);
                  }

                  var2 += var19.gK - 5.5652175F * 1.4375F;
               }
            }
         }

         GL11.glPopMatrix();
         GL11.glColor4d(1.0D, 1.0D, 1.0D, 1.0D);
         pz.bW(4237 & 2050);
      }
   }

   private void q(char var1, agP[] var2, float var3, float var4) {
      agP var5 = var2[var1];
      var5.apq();
      GL11.glPushMatrix();
      GL11.glEnable(19450 & -25630);
      GL11.glBlendFunc(-14574 & 2850, 931 & 17219);
      GL11.glBegin(423 & 2055);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2d((double)var3, (double)var4);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2d((double)var3, (double)(var4 + var5.gJ));
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2d((double)(var3 + var5.gK), (double)(var4 + var5.gJ));
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2d((double)(var3 + var5.gK), (double)var4);
      GL11.glEnd();
      GL11.glDisable(4082 & -21522);
      GL11.glPopMatrix();
      GL11.glBindTexture(11749 & -29213, 4100 & 3779);
   }

   public void y(String var1, float var2, float var3, int var4) {
      this.e(var1, var2, var3, var4, (boolean)(21584 & 10758));
   }

   private agP[] q(agP[] var1, int var2) {
      this.avG();
      Font var3 = this.dvG.deriveFont(var2);
      BufferedImage var4 = new BufferedImage(-32357 & 1093, 1027 & 8745, 4642 & 16530);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      var5.setFont(var3);
      FontMetrics var6 = var5.getFontMetrics();

      for(int var7 = 17476 & -32255; var7 < var1.length; ++var7) {
         char var8 = (char)var7;
         Rectangle2D var9 = var6.getStringBounds(var8 + q.q[-23472 & -23416 & 4476 & 29452], var5);
         float var10 = (float)var9.getWidth() + 17.290323F * 0.46268657F;
         float var11 = (float)var9.getHeight();
         BufferedImage var12 = new BufferedImage(Pq.E((double)var10), Pq.E((double)var11), 1078 & 4546);
         Graphics2D var13 = (Graphics2D)var12.getGraphics();
         var13.setFont(var3);
         var13.setColor(new Color(767 & 8447, -30209 & 9471, 18687 & 8447, 7690 & 16481));
         var13.fillRect(10256 & 16388, 9251 & -32564, var12.getWidth(), var12.getHeight());
         var13.setColor(Color.WHITE);
         var13.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
         var13.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var13.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var13.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.dvI ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
         var13.drawString(var8 + q.q[14785 & -17943 & -11219 & 19690], -23420 & 535, var6.getAscent());
         int var14 = GL11.glGenTextures();
         this.w(var14, var12);
         var1[var7] = new agP(this, var8, (float)var12.getWidth(), (float)var12.getHeight(), var14);
      }

      return var1;
   }

   public agO(Font var1, int var2, boolean var3) {
      this.dvE = new int[-31706 & 11185];
      this.dvG = var1;
      this.dvI = var3;
      this.dvJ = this.q(new agP[var2], 2050 & 4097);
      this.dvK = this.q(new agP[var2], 3 & 24957);
      this.dvL = this.q(new agP[var2], 20994 & 9606);
   }

   public agO(Font var1, int var2) {
      this(var1, var2, (boolean)(28689 & 1579));
   }

   private void q(Vector2f var1, Vector2f var2, float var3) {
      GL11.glDisable(-12829 & 3569);
      GL11.glLineWidth(var3);
      GL11.glBegin(1555 & -20279);
      GL11.glVertex2f(var1.x, var1.y);
      GL11.glVertex2f(var2.x, var2.y);
      GL11.glEnd();
      GL11.glEnable(12275 & -29211);
   }

   public agO(Font var1) {
      this(var1, 28112 & 781);
   }

   private void w(int var1, BufferedImage var2) {
      int[] var3 = new int[var2.getWidth() * var2.getHeight()];
      var2.getRGB(-11000 & 2100, 20480 & 3337, var2.getWidth(), var2.getHeight(), var3, 8449 & 5268, var2.getWidth());
      ByteBuffer var4 = BufferUtils.createByteBuffer(var2.getWidth() * var2.getHeight() * (548 & 5511));

      for(int var5 = 10240 & -16346; var5 < var2.getHeight(); ++var5) {
         for(int var6 = 132 & 20513; var6 < var2.getWidth(); ++var6) {
            int var7 = var3[var5 * var2.getWidth() + var6];
            var4.put((byte)(var7 >> (-5552 & 312) & 255 & 21247));
            var4.put((byte)(var7 >> (16586 & -30711) & 26367 & 255));
            var4.put((byte)(var7 & 6399 & 1023));
            var4.put((byte)(var7 >> (1658 & 4120) & 16895 & 4351));
         }
      }

      var4.flip();
      pz.bW(var1);
      GL11.glTexParameteri(3579 & -12831, 14343 & 10257, 9755 & 12160);
      GL11.glTexParameteri(16353 & 3569, 30728 & -21632, -22985 & 30208);
      GL11.glTexImage2D(7653 & 28153, 25686 & 2560, 14601 & 6460, var2.getWidth(), var2.getHeight(), -28672 & 8944, 6504 & 15642, 21771 & 5637, var4);
      pz.bW(29024 & -30703);
   }

   public float id(String var1) {
      float var2 = 0.0F;
      agP[] var3 = this.dvJ;
      int var4 = var1.length();

      for(int var5 = 68 & -12264; var5 < var4; ++var5) {
         char var6 = var1.charAt(var5);
         int var7 = var5 > 0 ? var1.charAt(var5 - (-16363 & 161)) : 2222 & 17775;
         if (var7 != (-32025 & 423)) {
            if (var6 == (-3913 & 167) && var5 < var4) {
               int var9 = q.q[-14597 & -4494 & 22487 & 11254].indexOf(var1.toLowerCase(Locale.ENGLISH).charAt(var5 + (3189 & 897)));
               if (var9 == (13621 & -32749)) {
                  var3 = this.dvK;
               } else if (var9 == (-8107 & 3614)) {
                  var3 = this.dvL;
               } else if (var9 == (24757 & 3605)) {
                  var3 = this.dvJ;
               }
            } else if (var6 <= (14847 & 255)) {
               agP var8 = var3[var6];
               var2 += (var8.gK - 16.0F * 0.5F) / 2.0F;
            }
         }
      }

      return var2 + 2.0F;
   }
}
