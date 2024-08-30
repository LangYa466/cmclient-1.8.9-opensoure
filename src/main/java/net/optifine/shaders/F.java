package net.optifine.shaders;

import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBGeometryShader4;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Vector4f;

public class F {
   public static final String[] cGP = new String[]{.u.q[-15411 & 4781], .u.q[656 & -20848]};
   public static final boolean cGQ = true;
   public static .tF cGR = null;
   public static .aav cGS;
   private static .aan cGT = null;
   static boolean cGU = true;
   static float cGV = 0.0F;
   public static boolean cGW = false;
   public static .aav cGX;
   public static .aay cGY;
   public static .aau cGZ;
   static float cHa;
   public static String cHb;
   static final float[] cHc = new float[16];
   static int cHd = 0;
   static final FloatBuffer cHe = jm(16);
   public static Properties cHf = null;
   public static boolean cHg = false;
   public static .aaC cHh;
   public static float cHi = 0.6F;
   public static boolean[] cHj = new boolean[2];
   public static int cHk = 0;
   public static .ZI cHl = new .ZI(.u.q[9910 & -11356], .u.q[8933 & 2989], 0);
   private static final int[] cHm = new int[]{33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901};
   public static .aav cHn;
   public static final int[] cHo = new int[]{9728, 9984, 9986};
   public static .ZI cHp = new .ZI(.u.q[4758 & -29802], .u.q[-29033 & 17367], 0);
   public static .aav cHq;
   public static .aav cHr;
   public static final net.optifine.shaders.j cHs;
   static final int[] cHt = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
   static float cHu = 0.0F;
   static boolean cHv = false;
   public static float cHw = 2.0F;
   public static .aaC cHx;
   public static final net.optifine.shaders.j cHy;
   private static boolean cHz;
   public static .aav cHA;
   public static final String cHB = "shaderpacks";
   static final IntBuffer cHC = jg(16);
   static .hS G = .hS.eV();
   private static boolean cHD;
   public static .aav cHE;
   public static Vector4f[] cHF = new Vector4f[8];
   public static .aav cHG;
   public static final net.optifine.shaders.j[] cHH;
   static final float[] cHI = new float[16];
   static final IntBuffer cHJ = (IntBuffer)jg(8).limit(0);
   public static .aau cHK;
   public static int cHL = 0;
   public static final net.optifine.shaders.j[] cHM;
   static float cHN = 0.0F;
   static float cHO = 0.0F;
   public static float cHP = 10.0F;
   public static .aay cHQ;
   public static final net.optifine.shaders.j cHR;
   public static boolean[] cHS = new boolean[8];
   public static final net.optifine.shaders.j cHT;
   public static .aaC cHU;
   public static final String cHV = "OFF";
   public static .aav cHW;
   public static final net.optifine.shaders.j cHX;
   public static .aay cHY;
   static float cHZ = 0.0F;
   public static .aav cIa;
   private static net.optifine.shaders.s cIb;
   static final FloatBuffer cIc = jm(16);
   public static final net.optifine.shaders.j cId;
   public static int cIe = 0;
   public static boolean cIf = false;
   static float cIg;
   public static final net.optifine.shaders.j cIh;
   public static .ZI cIi = new .ZI(.u.q[17150 & 6814], .u.q[-31841 & 28319], 0);
   public static .ZI cIj = new .ZI(.u.q[11180 & -27925], .u.q[29671 & 679], 0);
   public static .aax cIk;
   static float[] cIl = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   public static .ZI cIm = new .ZI(.u.q[1677 & -27703], .u.q[-27734 & 2714], 0);
   static boolean cIn = false;
   public static final File cIo;
   public static boolean cIp = false;
   public static .aay cIq;
   public static .aav cIr;
   static int cIs = 0;
   static final int cIt = 2;
   static float cIu = 0.0F;
   public static int cFe = 0;
   public static .ZI cIv = new .ZI(.u.q[-32074 & 17062], .u.q[17399 & 8871], 0);
   public static .aaC cIw;
   public static int[] cIx = new int[32];
   static float cIy;
   static final FloatBuffer cIz = jm(16);
   static int cIA = 0;
   public static .aax cIB;
   private static boolean cIC;
   public static float cID = 0.8F;
   public static net.optifine.shaders.j cIE;
   static double cIF;
   static final float[] cIG = new float[16];
   public static int cIH = 0;
   static final FloatBuffer cII = jm(16);
   static int cIJ = 1;
   public static .aav cIK;
   public static .aax cIL;
   public static int cIM = 12;
   static File cIN;
   static Map cIO;
   public static .aav cIP;
   public static .aaC cIQ;
   public static int cIR = 0;
   public static .ZI cIS = new .ZI(.u.q[1775 & -13653], .u.q[29612 & -29010], 0);
   public static .aau cIT;
   private static net.optifine.shaders.s[] cIU = null;
   public static .aau cIV;
   public static .aay cIW;
   private static final net.optifine.shaders.k cIX = new net.optifine.shaders.k();
   static final IntBuffer cIY = (IntBuffer)jg(8).put(36064).position(0).limit(1);
   public static .ZI cIZ = new .ZI(.u.q[19120 & -28000], .u.q[673 & 21165], 0);
   public static boolean[] cJa = new boolean[8];
   public static boolean cJb = false;
   static long cJc = 0L;
   public static String cJd;
   public static boolean cJe = false;
   static Map cJf = new HashMap();
   public static final net.optifine.shaders.j cJg;
   private static final String[] cJh = new String[]{.u.q[8942 & 2990], .u.q[12015 & 943], .u.q[688 & -15624], .u.q[15281 & 691], .u.q[2738 & 8947], .u.q[691 & 3063], .u.q[1724 & 2741], .u.q[-7499 & 7093], .u.q[2742 & -30730], .u.q[8887 & 1783], .u.q[591 & 27166], .u.q[8889 & 1720], .u.q[761 & 24511], .u.q[-21570 & 17083], .u.q[699 & 2747], .u.q[2748 & 12988], .u.q[17087 & 701], .u.q[18430 & -27970], .u.q[18111 & 959], .u.q[-23836 & 705], .u.q[-32031 & 7875], .u.q[4802 & -31805], .u.q[-27057 & 908], .u.q[2602 & 17226], .u.q[-31773 & 19143], .u.q[5086 & 8933], .u.q[25285 & 717], .u.q[967 & -30010], .u.q[-15625 & 4807], .u.q[4808 & 11004], .u.q[17097 & 1001], .u.q[6122 & 17098], .u.q[-31029 & 8907], .u.q[4814 & -12580], .u.q[-18739 & 973], .u.q[-5170 & 734], .u.q[719 & 2783]};
   static float cJi = 160.0F;
   private static final int cJj = 0;
   public static .aav cJk;
   public static int cJl = 0;
   public static int cJm = 0;
   static boolean cJn = true;
   public static float cJo = 0.0F;
   public static .aav cJp;
   static .aab[] cJq = null;
   static long Jj = 0L;
   public static boolean cJr = false;
   public static .ZI cJs = new .ZI(.u.q[7049 & 17099], .u.q[13003 & 2718], 0);
   static int cJt = 0;
   public static boolean[] cJu = new boolean[8];
   private static final int cJv = 2;
   public static final net.optifine.shaders.j cJw;
   static float cJx;
   static int cJy = 0;
   public static boolean[] cJz = new boolean[2];
   public static boolean cJA = true;
   static long bxA = 0L;
   public static .aaC cJB;
   public static .ZI cJC = new .ZI(.u.q[4764 & 26553], .u.q[669 & 29337], 0);
   public static int cJD = 0;
   public static boolean cJE;
   static float cJF = 0.0F;
   public static final net.optifine.shaders.j cJG;
   static final IntBuffer cJH = jg(8);
   public static .ZI cJI = new .ZI(.u.q[3036 & -7492], .u.q[9981 & 669], 0);
   public static float cJJ = 0.0F;
   public static .aav cJK;
   public static final net.optifine.shaders.j cJL;
   static final FloatBuffer cJM = jm(16);
   static final FloatBuffer cJN = jm(16);
   static int cJO = 1024;
   public static .aav cJP;
   public static .aav cJQ;
   public static final net.optifine.shaders.j cJR;
   public static .ZI cJS = new .ZI(.u.q[8875 & 19423], .u.q[1676 & -32099], 0);
   public static int cJT = 0;
   public static .aav cJU;
   static float cJV = 0.0F;
   static final float[] cJW = new float[16];
   static float[] cJX = new float[4];
   static final int cJY = 8;
   public static .ZI cJZ = new .ZI(.u.q[4770 & -5146], .u.q[959 & 1699], 0);
   static long cKa = 0L;
   public static .aav cKb;
   public static .aay cKc;
   static final FloatBuffer cKd = jm(16);
   static boolean cKe = false;
   public static .aau cKf;
   static final net.optifine.shaders.p cKg = new net.optifine.shaders.p(cHC, 8);
   private static final int cKh;
   public static int cKi = 0;
   public static .aav cKj;
   public static .aaC cKk;
   public static int cKl = 0;
   public static .aav cKm;
   public static .aau cKn;
   public static final net.optifine.shaders.j cKo;
   private static int cKp = 3;
   public static boolean cKq = false;
   public static final net.optifine.shaders.j cKr;
   public static final boolean cKs = System.getProperty(.u.q[701 & -19731], .q.q[242 & -31886]).equals(.q.q[375 & -13199]);
   public static ContextCapabilities cKt;
   public static .aav cKu;
   private static net.optifine.shaders.d cKv = null;
   public static .ZI cKw = new .ZI(.u.q[-15406 & 1691], .u.q[1715 & -15461], 0);
   static float cKx = 1.0F;
   public static final net.optifine.shaders.j cKy;
   static final int cKz = 8;
   static final IntBuffer cKA = jg(3);
   public static boolean[] cKB = new boolean[2];
   public static .aav cKC;
   public static final net.optifine.shaders.j cKD;
   public static String cKE;
   public static boolean cKF = false;
   static final int cKG = 8;
   static final FloatBuffer cKH = jm(16);
   public static .aav cKI;
   static float[] cKJ = new float[4];
   public static .aav cKK;
   static double cKL;
   static int cKM = 0;
   public static final String cKN = "/shaders/shaders.properties";
   public static Properties cKO = null;
   static .pp Bt;
   public static boolean cKP = false;
   static final float[] cKQ = new float[16];
   static int cKR = 0;
   private static int cKS = 256;
   public static int cKT = 11;
   public static final String[] cKU = new String[]{.u.q[-21841 & 909], .u.q[718 & -30050], .u.q[-26737 & 8879]};
   public static .aav cKV;
   private static boolean cKW;
   public static final net.optifine.shaders.j cKX;
   static int cKY = 0;
   static long cKZ = 0L;
   private static boolean cLa = false;
   public static int cLb = 0;
   static float[] cLc = new float[4];
   static float cLd = 0.0F;
   public static int cLe = 10;
   public static .aav cLf;
   public static .aaC cLg;
   public static .aau cLh;
   static final FloatBuffer cLi = jm(16);
   public static .ZI cLj = new .ZI(.u.q[6077 & 8873], .u.q[-24914 & 682], 0);
   public static int cLk = 16;
   public static float cLl = 200.0F;
   static float cLm = 0.0F;
   private static net.optifine.shaders.s[] cLn = null;
   public static boolean cLo = false;
   private static Map cLp = new HashMap();
   public static final net.optifine.shaders.j cLq;
   public static boolean cLr = false;
   static final IntBuffer cLs = jg(8);
   public static final int[] cLt = new int[]{9728, 9729};
   public static float cLu = -1.0F;
   static int cLv = 0;
   public static .aaC cLw;
   static Map cLx = null;
   private static .QI bZJ = null;
   public static boolean cLy = false;
   public static .aau cLz;
   static double cLA;
   static final FloatBuffer cLB = jm(16);
   public static .aau cLC;
   public static .aau cLD;
   public static .aau cLE;
   public static boolean cLF = false;
   private static int cLG = 0;
   static float cLH = 0.0F;
   public static final net.optifine.shaders.j cLI;
   private static final int cLJ = 1;
   public static .aav cLK;
   public static .aav cLL;
   private static int cLM = 0;
   private static net.optifine.shaders.s[] cLN = null;
   static boolean cLO = false;
   public static .aav cLP;
   static final float[] cLQ = new float[16];
   public static .aav cLR;
   static int cLS = 0;
   static int cLT = 0;
   private static .ZP[] cLU = null;
   public static int cLV = 0;
   public static boolean cLW = true;
   public static .aav cLX;
   public static boolean cLY = false;
   public static final int cLZ = 2;
   static float cMa = 90.0F;
   static int cMb = 1024;
   public static float cMc;
   private static int cMd = 0;
   public static int[] cMe = new int[2];
   public static boolean cMf = false;
   private static Set cMg = null;
   public static .aav cMh;
   static final FloatBuffer cMi = jm(16);
   public static .aav cMj;
   public static final net.optifine.shaders.j cMk;
   public static .aav cMl;
   static IntBuffer cMm = null;
   public static boolean cMn = false;
   private static final float[] cMo = new float[16];
   public static final net.optifine.shaders.j cMp;
   public static .aaA cMq;
   static final float[] cMr = new float[16];
   public static final net.optifine.shaders.j cMs;
   private static final int[] cMt = new int[8];
   public static float cMu = 1.0F;
   static int cMv;
   static float cMw = -1.0F;
   public static final net.optifine.shaders.j cMx;
   public static float cMy = 0.5F;
   public static .aay cMz;
   public static boolean cMA = true;
   public static .aav cMB;
   public static float cMC = 1.0F;
   static float[] cMD = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   static int cME;
   private static final ByteBuffer cMF;
   static double cMG;
   public static .aay cMH;
   public static .aav cMI;
   public static .aax cMJ;
   public static final net.optifine.shaders.j cMK;
   private static boolean cML;
   public static .aau cMM;
   private static final net.optifine.shaders.z cMN = new net.optifine.shaders.z();
   private static final String[] cMO = new String[]{.t.q[17018 & 4722], .t.q[15223 & 638], .t.q[1918 & -27916]};
   static int cMP = 0;
   public static .aau cMQ;
   public static .ZI cMR = new .ZI(.u.q[651 & 3019], .u.q[10892 & 17100], 0);
   public static final net.optifine.shaders.j cMS;
   static int cMT = 0;
   public static float cMU = 0.125F;
   static float[] cMV = new float[4];
   public static final net.optifine.shaders.j cMW;
   public static final net.optifine.shaders.j cMX;
   public static .aav cMY;
   public static boolean cMZ = false;
   public static boolean cNa = false;
   private static boolean cNb = false;
   public static .aav cNc;
   public static boolean cNd = false;
   private static boolean cNe = false;
   private static final List cNf = new ArrayList();
   public static .aav cNg;
   public static .aav cNh;
   static int cNi = 0;
   public static final net.optifine.shaders.j cNj;
   private static boolean cNk = false;
   static float cNl = 0.0F;
   public static int cNm = 0;
   public static .aaz cNn;
   static float cNo = 0.0F;
   static final float[] cNp = new float[16];
   static final IntBuffer cNq = jg(2);
   public static .aav cNr;
   public static .aau cNs;
   public static float cNt = 600.0F;
   public static boolean cNu = false;
   static double cNv;
   public static .ZI cNw = new .ZI(.u.q[23194 & 730], .u.q[17051 & 2715], 0);
   public static .aav cNx;
   public static .aav cNy;
   static int cNz = 1024;
   public static boolean cNA = false;
   private static final Pattern cNB = Pattern.compile(.u.q[-32038 & 20468]);
   public static float cNC;
   public static .aau cND;
   static float cNE;
   public static final net.optifine.shaders.j[] cNF = cMN.aip();
   static int cNG;
   static float cNH;
   public static final net.optifine.shaders.j cNI;
   private static final .aaD cNJ = new .aaD();
   public static float cNK = 0.0F;
   public static .aau cNL = cNJ.gG(.y.q[2271 & 16894]);
   public static float cNM;
   public static final int cNN = 3;
   public static .ZI cNO = new .ZI(.u.q[-31043 & 19158], .u.q[757 & 15005], 0);
   static int cNP = 1024;
   public static .aaC cNQ = cNJ.gI(.y.q[-23082 & 17110]);
   public static .aav cNR = cNJ.gH(.y.q[-30985 & 4535]);
   static float[] cNS = new float[4];
   static double cNT;
   static final FloatBuffer cNU = jm(16);
   static float[] cNV = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
   public static final net.optifine.shaders.j cNW;
   public static String cNX;
   public static final String cNY = "optionsshaders.txt";
   static final int cNZ = 3;
   private static final boolean cOa = true;
   static final IntBuffer cOb = jg(8);
   static int avc = 0;
   public static .aau cOc = cNJ.gG(.y.q[17127 & 6382]);
   static long Bh = 0L;
   public static .aav cOd = cNJ.gH(.u.q[24422 & 740]);
   private static String cOe = null;
   public static boolean cOf = false;
   public static final net.optifine.shaders.j cOg;
   public static .aav cOh = cNJ.gH(.q.q[-23923 & 20493]);
   public static .ZH cOi = new .ZH(.w.q[-31926 & 842], .u.q[15057 & 17051], 0);
   static float cOj = 0.0F;
   public static final int cOk = cMN.afk();
   public static final String cOl = "(internal)";

   public static void aiw() {
      net.optifine.shaders.x.fv(.u.q[14812 & 18397]);
      ++cIR;
      net.optifine.shaders.x.fv(.u.q[989 & 19935]);
      G.Cv.oH();
   }

   static {
      cNn = cNJ.gE(.u.q[1633 & -21909]);
      cNr = cNJ.gH(.u.q[614 & 21218]);
      cJQ = cNJ.gH(.u.q[-30097 & 16995]);
      cHn = cNJ.gH(.y.q[-23830 & 17827]);
      cLR = cNJ.gH(.y.q[9443 & -16221]);
      cJp = cNJ.gH(.y.q[16550 & 10412]);
      cKu = cNJ.gH(.t.q[17270 & -32144]);
      cKI = cNJ.gH(.y.q[-31579 & 22695]);
      cJK = cNJ.gH(.y.q[2470 & -20314]);
      cGX = cNJ.gH(.y.q[19703 & 12463]);
      cNg = cNJ.gH(.y.q[2281 & 4266]);
      cHG = cNJ.gH(.y.q[-32339 & 18665]);
      cKV = cNJ.gH(.y.q[-29014 & 4602]);
      cNh = cNJ.gH(.y.q[-30293 & 4283]);
      cMY = cNJ.gH(.y.q[-28482 & 684]);
      cNc = cNJ.gH(.y.q[173 & -10067]);
      cLP = cNJ.gH(.y.q[8622 & 2750]);
      cJP = cNJ.gH(.y.q[8959 & 4271]);
      cHA = cNJ.gH(.y.q[4273 & -30792]);
      cJk = cNJ.gH(.t.q[630 & 1654]);
      cMh = cNJ.gH(.y.q[4341 & 9913]);
      cLX = cNJ.gH(.y.q[20146 & 434]);
      cIP = cNJ.gH(.y.q[179 & 15551]);
      cHr = cNJ.gH(.y.q[4540 & 18678]);
      cLL = cNJ.gH(.y.q[1215 & 949]);
      cNy = cNJ.gH(.y.q[-25929 & 8630]);
      cHW = cNJ.gH(.y.q[2488 & -31560]);
      cNx = cNJ.gH(.y.q[2233 & 5565]);
      cJU = cNJ.gH(.y.q[-32326 & 3834]);
      cIa = cNJ.gH(.y.q[-31301 & 2815]);
      cKC = cNJ.gH(.y.q[9212 & -14148]);
      cLK = cNJ.gH(.y.q[1469 & -15619]);
      cHE = cNJ.gH(.y.q[16575 & 190]);
      cKm = cNJ.gH(.y.q[4287 & -21249]);
      cMl = cNJ.gH(.y.q[6610 & 1225]);
      cKj = cNJ.gH(.y.q[8897 & 1489]);
      cIK = cNJ.gH(.u.q[29285 & -32003]);
      cKK = cNJ.gH(.y.q[738 & 194]);
      cKf = cNJ.gG(.u.q[18294 & 8807]);
      cHQ = cNJ.gF(.y.q[11983 & -16157]);
      cKc = cNJ.gF(.y.q[11748 & 4828]);
      cMB = cNJ.gH(.y.q[17639 & 8413]);
      cKb = cNJ.gH(.u.q[5759 & 17127]);
      cIr = cNJ.gH(.y.q[25798 & -28474]);
      cHq = cNJ.gH(.u.q[9848 & 620]);
      cIT = cNJ.gG(.u.q[8955 & 18029]);
      cIV = cNJ.gG(.y.q[1255 & -19769]);
      cLh = cNJ.gG(.y.q[4344 & -15666]);
      cHK = cNJ.gG(.y.q[12527 & 17097]);
      cND = cNJ.gG(.y.q[10714 & 714]);
      cGZ = cNJ.gG(.y.q[459 & 17643]);
      cKn = cNJ.gG(.y.q[6348 & 1278]);
      cLC = cNJ.gG(.y.q[13039 & 1485]);
      cLD = cNJ.gG(.y.q[19150 & 4606]);
      cMQ = cNJ.gG(.t.q[-29234 & 4586]);
      cIW = cNJ.gF(.y.q[12527 & -15921]);
      cMH = cNJ.gF(.y.q[5372 & -24111]);
      cMz = cNJ.gF(.u.q[-30854 & 6763]);
      cIq = cNJ.gF(.y.q[4595 & 10965]);
      cGY = cNJ.gF(.y.q[210 & 16882]);
      cHY = cNJ.gF(.y.q[-32041 & 211]);
      cKk = cNJ.gI(.y.q[-10538 & 8404]);
      cHh = cNJ.gI(.y.q[-24355 & 213]);
      cIQ = cNJ.gI(.y.q[1271 & 727]);
      cLg = cNJ.gI(.y.q[1016 & 6361]);
      cHx = cNJ.gI(.y.q[-23303 & 221]);
      cLw = cNJ.gI(.y.q[-29478 & 24794]);
      cIw = cNJ.gI(.y.q[2779 & -20257]);
      cJB = cNJ.gI(.y.q[-30465 & 9436]);
      cHU = cNJ.gI(.y.q[10717 & 16637]);
      cLE = cNJ.gG(.y.q[-8993 & 8415]);
      cIk = cNJ.gJ(.y.q[20707 & 248]);
      cIL = cNJ.gJ(.y.q[6131 & 8417]);
      cMJ = cNJ.gJ(.y.q[-21278 & 226]);
      cMj = cNJ.gH(.y.q[29923 & 487]);
      cMI = cNJ.gH(.y.q[12532 & -15636]);
      cLz = cNJ.gG(.u.q[-12693 & 619]);
      cNs = cNJ.gG(.r.q[325 & 835]);
      cMM = cNJ.gG(.u.q[892 & 19054]);
      cLf = cNJ.gH(.y.q[237 & 25061]);
      cIB = cNJ.gJ(.y.q[-32529 & 8679]);
      cMq = cNJ.gD(.u.q[14191 & 19181]);
      cGS = cNJ.gH(.u.q[8959 & 17262]);
      cJG = cMN.aiq();
      cHR = cMN.w(.t.q[21235 & -23696], cJG);
      cLI = cMN.w(.u.q[2815 & -32145], cHR);
      cHX = cMN.w(.u.q[17018 & -24976], cHR);
      cHT = cMN.q(.u.q[8821 & 761], cJG);
      cMp = cMN.q(.u.q[-29070 & 8831], cHT);
      cKr = cMN.q(.u.q[-18701 & 2943], cMp);
      cMX = cMN.q(.u.q[17142 & 7028], cHT);
      cMW = cMN.q(.u.q[-23563 & 4725], cMp);
      cMx = cMN.q(.u.q[5759 & -29962], cMp);
      cMK = cMN.q(.u.q[767 & 21111], cKr);
      cId = cMN.q(.u.q[-32136 & 17151], cMK);
      cKD = cMN.q(.u.q[633 & 21499], cMK);
      cMk = cMN.q(.u.q[1018 & 634], cMK);
      cMs = cMN.q(.u.q[891 & -15745], cMK);
      cLq = cMN.q(.u.q[-32002 & 636], cMK);
      cHs = cMN.q(.u.q[10877 & 21501], cMp);
      cIh = cMN.q(.u.q[13054 & -14722], cKr);
      cMS = cMN.q(.u.q[-13697 & 1023], cKr);
      cNW = cMN.q(.u.q[5760 & 692], cMS);
      cKo = cMN.q(.u.q[21195 & 9089], cMp);
      cOg = cMN.q(.u.q[17042 & 10150], cMp);
      cJg = cMN.q(.u.q[-29781 & 4759], cKr);
      cKy = cMN.q(.u.q[20100 & 9125], cKr);
      cJR = cMN.fp(.u.q[645 & 4791]);
      cHM = cMN.m(.t.q[-14596 & 884], 16);
      cNI = cHM[0];
      cNj = cMN.q(.u.q[25286 & 6823], cMK);
      cJw = cMN.q(.u.q[735 & 17031], cJg);
      cJL = cMN.fp(.u.q[-26737 & 11000]);
      cHH = cMN.A(.t.q[630 & 8951], 16);
      cHy = cHH[0];
      cKX = cMN.fq(.t.q[16874 & 490]);
      cIE = cJG;
      cKh = (285 + 8 * cOk) * 4;
      cMF = (ByteBuffer)BufferUtils.createByteBuffer(cKh).limit(0);
      cIo = new File(.hS.eV().Ci, .t.q[-31909 & 889]);
      cIN = new File(.hS.eV().Ci, .u.q[19409 & 5873]);
   }

   public static boolean w(.vL var0) {
      if (!cLo) {
         return true;
      } else {
         fD(.u.q[-32043 & 1663]);
         return cOf ? cJb : var0.aDl > 0;
      }
   }

   public static void aix() {
      if (cLF && cOg.B() != cJG.B()) {
         e(cMS);
         .pz.nB();
      }

   }

   public static void aiy() {
      e(cKr);
   }

   public static void q(String var0, IntBuffer var1) {
      StringBuilder var2 = new StringBuilder(128);
      var2.append(var0).append(.u.q[-24132 & 16829]).append(var1.position()).append(.u.q[2495 & 957]).append(var1.limit()).append(.u.q[19902 & -19970]).append(var1.capacity()).append(.u.q[-15361 & 6591]);
      int var3 = var1.limit();

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.append(.q.q[-32438 & 21867]).append(var1.get(var4));
      }

      var2.append(.q.q[13212 & -31811]);
      net.optifine.shaders.x.fv(var2.toString());
   }

   private static net.optifine.shaders.s q(int var0, String var1, String var2, .aaK var3, .aaH var4, int var5, int var6, int var7, .aaI var8, .aaJ var9) {
      try {
         String var10 = .u.q[16802 & -23122] + net.optifine.util.J.Q(var2, .q.q[9311 & 639]);
         InputStream var11 = cKv.fm(var10);
         if (var11 == null) {
            net.optifine.shaders.x.fu(.u.q[8615 & -30301] + var2);
            return null;
         } else {
            byte[] var12 = .MV.p(var11);
            IOUtils.closeQuietly(var11);
            ByteBuffer var13 = .py.bM(var12.length);
            var13.put(var12);
            var13.flip();
            .vw var14 = net.optifine.shaders.K.q(var10, new .vw(true, true, new ArrayList()));
            net.optifine.shaders.y var15 = new net.optifine.shaders.y(var3, var4, var5, var6, var7, var8, var9, var13, var0, var14.tX(), var14.tZ());
            return var15;
         }
      } catch (IOException var16) {
         net.optifine.shaders.x.fu(.u.q[422 & -14339] + var2);
         net.optifine.shaders.x.fu(var16.getClass().getName() + .q.q[-31082 & 709] + var16.getMessage());
         return null;
      }
   }

   private static boolean aA(.GX var0) {
      if (var0 == null) {
         return false;
      } else {
         .Fm var1 = var0.do1();
         if (var1 == null) {
            return false;
         } else if (!(var1 instanceof .FO)) {
            return false;
         } else {
            .FO var2 = (.FO)var1;
            .cv var3 = var2.ds();
            if (var3 == null) {
               return false;
            } else {
               .OS var4 = var3.cn();
               return var4 == .OS.bSm;
            }
         }
      }
   }

   public static void aiz() {
      if (cLF) {
         cLr = false;
      }

   }

   public static void aiA() {
      if (cLF) {
         fD(.u.q[1880 & 730]);
         a((.No)null);
         e(cKe ? cKr : cMp);
         net.optifine.shaders.I.w(cGR.rH());
      }

   }

   public static void bH(int var0, int var1) {
      ++cFe;
      cIx[cFe * 2] = var0 & '\uffff' | var1 << 16;
      cIx[cFe * 2 + 1] = 0;
   }

   public static void ai(.zk var0) {
      if (cNr.aml()) {
         int var1 = net.optifine.util.p.am(var0);
         int var2 = net.optifine.shaders.o.iN(var1);
         if (var2 >= 0) {
            var1 = var2;
         }

         cNr.ju(var1);
      }

   }

   public static void aiB() {
      if (!cOf && cLO) {
         cKH.clear();
         GL11.glReadPixels(cKl / 2, cJm / 2, 1, 1, 6402, 5126, cKH);
         cLd = cKH.get(0);
         float var0 = (float)cKa * 0.01F;
         float var1 = (float)Math.exp(Math.log(0.5D) * (double)var0 / (double)cKx);
         cOj = cOj * var1 + cLd * (1.0F - var1);
      }

   }

   public static void C(float var0, float var1, float var2) {
      cNM = var0;
      cMc = var1;
      cNC = var2;
      q(cHQ, cNM, cMc, cNC);
   }

   public static boolean aiC() {
      return !cMR.afN() ? cMR.akZ() : cJS.afN() || cJS.akZ();
   }

   public static void x(.QI var0) {
      if (bZJ != var0) {
         .QI var1 = bZJ;
         bZJ = var0;
         al(G.gj());
         int var2 = c(var1);
         int var3 = c(var0);
         if (var3 != var2) {
            boolean var4 = cNf.contains(Integer.valueOf(var2));
            boolean var5 = cNf.contains(Integer.valueOf(var3));
            if (var4 || var5) {
               ajW();
            }
         }

         .aaE.amo();
      }

   }

   public static .ZP fx(String var0) {
      return net.optifine.shaders.E.q(var0, cLU);
   }

   public static void aiD() {
      net.optifine.shaders.j var0 = cIX.aio();
      e(var0);
   }

   public static void F(.cv var0) {
      ++cFe;
      int var1 = var0.cC();
      cIx[cFe * 2] = .cv.nk.x(var0) & '\uffff' | var1 << 16;
      cIx[cFe * 2 + 1] = 0;
   }

   public static String A(String var0, String var1) {
      String var2 = (String)cLp.get(var0);
      return var2 == null ? var1 : var2;
   }

   public static void aiE() {
      cLG = 0;
   }

   public static void e(net.optifine.shaders.j var0) {
      // $FF: Couldn't be decompiled
   }

   private static void q(.ZP[] var0, net.optifine.shaders.d var1) {
      net.optifine.util.F var2 = new net.optifine.util.F();
      if (cLU != null) {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            .ZP var4 = var0[var3];
            if (var4.alF() && var4.J()) {
               var2.setProperty(var4.bY(), var4.wx());
            }
         }
      }

      try {
         q(var1, var2);
      } catch (IOException var5) {
         .MV.cJ(.u.q[422 & -23129] + cKv.bY());
         var5.printStackTrace();
      }

   }

   public static int iY(int var0) {
      cIx[cFe * 2 + 1] = cIx[cFe * 2 + 1] & -65536 | var0 & '\uffff';
      return var0;
   }

   public static void nQ() {
      cGU = true;
      q(cKK, cHL);
      q(cKf, cJJ);
   }

   public static void aiF() {
      if (cLF) {
         if (cOf) {
            ;
         }

         e(cKe ? cKr : cMp);
      }

   }

   public static void aiG() {
      ajR();
      GL11.glColor3f(cNM, cMc, cNC);
      ajH();
      GL11.glColor3f(cIy, cHa, cJx);
   }

   public static int fy(String var0) {
      return !var0.equals(.y.q[181 & 29693]) && !var0.equals(.y.q[18862 & -32593]) ? (!var0.equals(.y.q[-23881 & 4350]) && !var0.equals(.y.q[2479 & -30977]) ? (!var0.equals(.y.q[183 & -32321]) && !var0.equals(.y.q[16564 & 6576]) ? (!var0.equals(.y.q[-32006 & 5309]) && !var0.equals(.t.q[1655 & 3062]) ? (!var0.equals(.y.q[441 & 18105]) && !var0.equals(.y.q[-24395 & 18609]) ? (!var0.equals(.y.q[1278 & 25274]) && !var0.equals(.y.q[-32074 & 1210]) ? (!var0.equals(.y.q[191 & -31813]) && !var0.equals(.y.q[187 & 11507]) ? (!var0.equals(.y.q[252 & 21436]) && !var0.equals(.y.q[180 & 23036]) ? -1 : 7) : 6) : 5) : 4) : 3) : 2) : 1) : 0;
   }

   public static void e(.hS var0) {
      ajF();
      var0 = .hS.eV();
      cKt = GLContext.getCapabilities();
      cHb = GL11.glGetString(7938);
      cKE = GL11.glGetString(7936);
      cNX = GL11.glGetString(7937);
      net.optifine.shaders.x.fv(.w.q[9038 & 1010] + cHb);
      net.optifine.shaders.x.fv(.u.q[16832 & 9166] + cKE);
      net.optifine.shaders.x.fv(.u.q[25065 & 5057] + cNX);
      net.optifine.shaders.x.fv(.u.q[-32310 & 28118] + (cKt.OpenGL20 ? .u.q[8663 & -27709] : .r.q[19315 & 8315]) + (cKt.OpenGL21 ? .u.q[-31804 & 486] : .r.q[1395 & 29439]) + (cKt.OpenGL30 ? .u.q[-15419 & 2533] : .r.q[115 & 3699]) + (cKt.OpenGL32 ? .u.q[21958 & 454] : .r.q[4215 & 371]) + (cKt.OpenGL40 ? .u.q[967 & 14823] : .r.q[2163 & 1147]));
      net.optifine.shaders.x.fv(.u.q[-3636 & 2523] + GL11.glGetInteger(34852));
      net.optifine.shaders.x.fv(.u.q[-15879 & 3019] + GL11.glGetInteger(36063));
      net.optifine.shaders.x.fv(.u.q[-27186 & 491] + GL11.glGetInteger(34930));
      cMn = cKt.OpenGL30;
      n();
   }

   private static boolean q(int var0, String var1, List var2) {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      int var4 = GL20.glGetShaderi(var0, 35716);
      if (var4 <= 1) {
         return true;
      } else {
         for(int var5 = 0; var5 < var2.size(); ++var5) {
            String var6 = (String)var2.get(var5);
            net.optifine.shaders.x.fv(.u.q[-31169 & 2590] + (var5 + 1) + .w.q[4639 & 16927] + var6);
         }

         String var7 = GL20.glGetShaderInfoLog(var0, var4);
         var7 = net.optifine.util.J.N(var7, .u.q[-27716 & 604]);
         net.optifine.shaders.x.fv(.u.q[21087 & 11935] + var1 + .q.q[374 & 26811] + var7);
         return false;
      }
   }

   public static void N(int var0, int var1, int var2, int var3) {
      .pz.q(true, true, true, true);
      if (cOf) {
         GL11.glViewport(0, 0, cNz, cMb);
      } else {
         GL11.glViewport(0, 0, cKl, cJm);
         EXTFramebufferObject.glBindFramebufferEXT(36160, cHd);
         cKq = true;
         .pz.nL();
         .pz.ob();
         e(cHJ);
         e(cMp);
         fD(.u.q[-32181 & 9827]);
      }

   }

   public static void aiH() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      ajn();
      int var0 = cIE.aif();
      if (var0 > 1) {
         for(int var1 = 1; var1 < var0; ++var1) {
            cGS.ju(var1);
            ajn();
         }

         cGS.ju(0);
      }

   }

   public static .ZP[] fz(String var0) {
      .ZP[] var1 = (.ZP[])cLU.clone();
      if (cLx == null) {
         if (cJq != null) {
            .ZQ var10 = new .ZQ(cJq, var1);
            var1 = (.ZP[]).MV.q(var1, var10, 0);
         }

         var1 = w(var1);
         return var1;
      } else {
         String var2 = var0 != null ? .t.q[-21648 & 1828] + var0 : .w.q[19308 & -28055];
         .ZK var3 = (.ZK)cLx.get(var2);
         if (var3 == null) {
            return new .ZP[0];
         } else {
            .ZP[] var4 = var3.alc();
            ArrayList var5 = new ArrayList();

            for(int var6 = 0; var6 < var4.length; ++var6) {
               .ZP var7 = var4[var6];
               if (var7 == null) {
                  var5.add((Object)null);
               } else if (var7 instanceof .ZS) {
                  .ZP[] var8 = q(cLx, var1);
                  var5.addAll(Arrays.asList(var8));
               } else {
                  var5.add(var7);
               }
            }

            .ZP[] var11 = (.ZP[])var5.toArray(new .ZP[var5.size()]);
            return var11;
         }
      }
   }

   public static void aiI() {
      ajD();
      e(cHT);
   }

   private static net.optifine.shaders.s u(int var0, String var1) {
      String var2 = var1.trim();
      byte var3 = 0;
      if (var2.startsWith(.u.q[19349 & -23115])) {
         var2 = net.optifine.util.J.S(var2, .q.q[428 & 20575]);
         if (var2.endsWith(.u.q[-28265 & 958])) {
            var2 = net.optifine.util.J.y(var2, .u.q[5023 & -12810], .q.q[1164 & -24532]);
            var3 = 1;
         } else if (var2.endsWith(.u.q[25079 & 8087])) {
            var2 = net.optifine.util.J.y(var2, .u.q[407 & 2967], .q.q[1804 & 10300]);
            var3 = 2;
         }
      }

      .PJ var4 = new .PJ(var2);
      net.optifine.shaders.t var5 = new net.optifine.shaders.t(var0, var4, var3);
      return var5;
   }

   private static void q(.aaC var0, boolean var1, FloatBuffer var2) {
      var0.q(var1, var2);
   }

   public static void aiJ() {
      .pz.nx();
      .pz.nz();
   }

   public static void aiK() {
      cMZ = true;
      cGU = true;
      e(cJH);
      e(cMW);
      bH(-2, 0);
   }

   private static String iZ(int var0) {
      switch(var0) {
      case 33305:
         return .u.q[2483 & 1023];
      case 36053:
         return .u.q[20916 & -31818];
      case 36054:
         return .u.q[6077 & 27063];
      case 36055:
         return .u.q[2487 & 29630];
      case 36059:
         return .u.q[7095 & 1527];
      case 36060:
         return .u.q[-30792 & 25021];
      case 36061:
         return .u.q[5561 & 10745];
      case 36182:
         return .u.q[1466 & -32322];
      case 36264:
         return .u.q[10683 & -14917];
      default:
         return .q.q[2303 & 5113];
      }
   }

   public static void aiL() {
      G.CF.Ol();
   }

   public static void aiM() {
      if (ajV()) {
         cMy = 0.5F;
         cHi = 0.6F;
         cID = 0.8F;
      } else {
         cMy = 1.0F;
         cHi = 1.0F;
         cID = 1.0F;
      }

   }

   public static void ng() {
      cKe = false;
      if (cIE == cKr) {
         e(cMp);
      }

   }

   public static .NW aiN() {
      return new .NW(cKL, cMG, cLA);
   }

   private static IntBuffer[] bI(int var0, int var1) {
      IntBuffer[] var2 = new IntBuffer[var0];

      for(int var3 = 0; var3 < var0; ++var3) {
         var2[var3] = jg(var1);
      }

      return var2;
   }

   public static void aiO() {
      net.optifine.shaders.x.fv(.u.q[13182 & -31236]);
      if (cKO == null) {
         cKO = new net.optifine.util.F();
      }

      .ZB[] var0 = .ZB.values();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         .ZB var2 = var0[var1];
         String var3 = var2.akM();
         String var4 = w(var2);
         cKO.setProperty(var3, var4);
      }

      try {
         FileWriter var6 = new FileWriter(cIN);
         cKO.store(var6, (String)null);
         var6.close();
      } catch (Exception var5) {
         net.optifine.shaders.x.ft(.u.q[-16003 & 11647] + var5.getClass().getName() + .q.q[1756 & -32090] + var5.getMessage());
      }

   }

   public static void z(.PX var0) {
      cIy = (float)var0.bUV;
      cHa = (float)var0.bUW;
      cJx = (float)var0.bUX;
      q(cKc, cIy, cHa, cJx);
   }

   public static void aiP() {
      if (cLF) {
         fD(.u.q[734 & 6742]);
         e(cLq);
      }

   }

   public static boolean aiQ() {
      return !cNw.akY();
   }

   public static boolean aiR() {
      return cIj.akZ();
   }

   public static boolean s(.OS var0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aiS() {
      return !cIC && !cHD;
   }

   public static boolean aiT() {
      return cIC;
   }

   private static Properties w(net.optifine.shaders.d var0) {
      net.optifine.util.F var1 = new net.optifine.util.F();
      String var2 = .u.q[-15897 & 8615] + var0.bY() + .u.q[-32344 & 16889];
      File var3 = new File(.hS.eV().Ci, var2);
      if (var3.exists() && var3.isFile() && var3.canRead()) {
         FileInputStream var4 = new FileInputStream(var3);
         var1.load(var4);
         var4.close();
         return var1;
      } else {
         return var1;
      }
   }

   public static void aiU() {
      fD(.u.q[-3499 & 593]);
      fH(.u.q[8025 & 8817]);
      if (!cOf) {
         e(cMK);
      }

      fD(.u.q[4690 & 1662]);
      fH(.u.q[-23973 & 19026]);
   }

   private static void q(.aau var0, float var1) {
      var0.bK(var1);
   }

   public static void bF(float var0) {
      .zk var1 = G.gj();
      double var2 = var1.aOD + (var1.aNZ - var1.aOD) * (double)var0;
      double var4 = var1.aNE + (var1.aNK - var1.aNE) * (double)var0;
      double var6 = var1.aOC + (var1.aOt - var1.aOC) * (double)var0;
      aj(var1);
      cKL = var2 - (double)cMv;
      cMG = var4;
      cLA = var6 - (double)cNG;
      GL11.glGetFloat(2983, (FloatBuffer)cNU.position(0));
      net.optifine.shaders.c.q((FloatBuffer)cLi.position(0), (FloatBuffer)cNU.position(0), cHc, cMr);
      cNU.position(0);
      cLi.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)cHe.position(0));
      net.optifine.shaders.c.q((FloatBuffer)cII.position(0), (FloatBuffer)cHe.position(0), cJW, cLQ);
      cHe.position(0);
      cII.position(0);
      GL11.glViewport(0, 0, cNz, cMb);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      if (cJn) {
         GL11.glOrtho((double)(-cJi), (double)cJi, (double)(-cJi), (double)cJi, 0.05000000074505806D, 256.0D);
      } else {
         GLU.gluPerspective(cMa, (float)cNz / (float)cMb, 0.05F, 256.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -100.0F);
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      cHZ = G.Cg.by(var0);
      cJV = cHZ < 0.75F ? cHZ + 0.25F : cHZ - 0.75F;
      float var8 = cHZ * -360.0F;
      float var9 = cNK > 0.0F ? var8 % cNK - cNK * 0.5F : 0.0F;
      if ((double)cJV <= 0.5D) {
         GL11.glRotatef(var8 - var9, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(cJo, 1.0F, 0.0F, 0.0F);
         cNl = cJV;
      } else {
         GL11.glRotatef(var8 + 180.0F - var9, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(cJo, 1.0F, 0.0F, 0.0F);
         cNl = cJV - 0.5F;
      }

      if (cJn) {
         float var10 = cHw;
         float var11 = var10 / 2.0F;
         GL11.glTranslatef((float)var2 % var10 - var11, (float)var4 % var10 - var11, (float)var6 % var10 - var11);
      }

      float var17 = cJV * 6.2831855F;
      float var18 = (float)Math.cos((double)var17);
      float var12 = (float)Math.sin((double)var17);
      float var13 = cJo * 6.2831855F;
      float var14 = var18;
      float var15 = var12 * (float)Math.cos((double)var13);
      float var16 = var12 * (float)Math.sin((double)var13);
      if ((double)cJV > 0.5D) {
         var14 = -var18;
         var15 = -var15;
         var16 = -var16;
      }

      cLc[0] = var14;
      cLc[1] = var15;
      cLc[2] = var16;
      cLc[3] = 0.0F;
      GL11.glGetFloat(2983, (FloatBuffer)cKd.position(0));
      net.optifine.shaders.c.q((FloatBuffer)cJM.position(0), (FloatBuffer)cKd.position(0), cKQ, cIG);
      cKd.position(0);
      cJM.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)cLB.position(0));
      net.optifine.shaders.c.q((FloatBuffer)cIc.position(0), (FloatBuffer)cLB.position(0), cHI, cNp);
      cLB.position(0);
      cIc.position(0);
      q(cIQ, false, cNU);
      q(cLg, false, cLi);
      q(cNQ, false, cJN);
      q(cKk, false, cHe);
      q(cHh, false, cII);
      q(cHx, false, cIz);
      q(cLw, false, cKd);
      q(cIw, false, cJM);
      q(cJB, false, cLB);
      q(cHU, false, cIc);
      G.Br.aCr = 1;
      fD(.u.q[9031 & 20063]);
   }

   private static void aiV() {
      if (cJy >= 1) {
         .pz.bQ(33988);
         .pz.bW(cNq.get(0));
         if (cJy >= 2) {
            .pz.bQ(33989);
            .pz.bW(cNq.get(1));
         }
      }

      .pz.bQ(33984);

      for(int var0 = 0; var0 < cLT; ++var0) {
         .pz.bW(cKg.iO(var0));
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
         .pz.bW(cKg.iP(var0));
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
      }

      .pz.bW(0);

      for(int var1 = 0; var1 < 4 && 4 + var1 < cLT; ++var1) {
         .pz.bQ('蓇' + var1);
         .pz.bW(cKg.iO(4 + var1));
      }

      .pz.bQ(33990);
      .pz.bW(cKA.get(0));
      if (cIs >= 2) {
         .pz.bQ(33995);
         .pz.bW(cKA.get(1));
         if (cIs >= 3) {
            .pz.bQ(33996);
            .pz.bW(cKA.get(2));
         }
      }

      for(int var2 = 0; var2 < cLS; ++var2) {
         .pz.bQ('蓍' + var2);
         .pz.bW(cLs.get(var2));
      }

      if (cNe) {
         .pz.bQ('蓀' + cIb.ahQ());
         .pz.bW(cIb.ahR());
      }

      q(cIU);
      .pz.bQ(33984);
   }

   public static void aiW() {
      if (cMn) {
         for(int var0 = 0; var0 < cLT; ++var0) {
            if ((cLM & 1 << var0) != 0) {
               .pz.bQ('蓀' + cHt[var0]);
               GL11.glTexParameteri(3553, 10241, 9987);
               GL30.glGenerateMipmap(3553);
            }
         }

         .pz.bQ(33984);
      }

   }

   public static void cq(boolean var0) {
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5888);
      if (var0) {
         e(cJw);
      } else {
         e(cJg);
      }

      fD(.u.q[-32037 & 15995]);
      fH(.u.q[17115 & 15963]);
   }

   private static void q(.aay var0, float var1, float var2, float var3) {
      var0.D(var1, var2, var3);
   }

   private static int ja(int var0) {
      switch(var0) {
      case 33333:
      case 33334:
      case 33339:
      case 33340:
      case 36208:
      case 36209:
      case 36226:
      case 36227:
         return 36251;
      default:
         return 32993;
      }
   }

   public static void aiX() {
      og();
      ais();
      e(cKe ? cKr : cMp);
   }

   public static boolean fA(String var0) {
      return cMg != null && cMg.contains(var0);
   }

   private static void aiY() {
      .ZJ var0 = cIE.ahX();
      if (var0 != null) {
         int var1 = (int)((float)cKl * var0.alb());
         int var2 = (int)((float)cJm * var0.ala());
         int var3 = (int)((float)cKl * var0.G());
         int var4 = (int)((float)cJm * var0.G());
         GL11.glViewport(var1, var2, var3, var4);
      }

   }

   public static void jb(int var0) {
      GL11.glDisable(var0);
      nC();
   }

   public static void aiZ() {
      cMZ = false;
      e(cJH);
      e(cKe ? cKr : cMp);
      ais();
   }

   public static boolean fB(String var0) {
      if (var0 == null) {
         return false;
      } else if (var0.length() <= 0) {
         return false;
      } else {
         int var1 = var0.lastIndexOf(.q.q[127 & 351]);
         if (var1 >= 0) {
            var0 = var0.substring(var1 + 1);
         }

         net.optifine.shaders.j var2 = fo(var0);
         return var2 != null;
      }
   }

   private static void aja() {
      cKq = false;
      G.fk().aa(true);
      .qa.w(.qa.aja, .qa.aip, 3553, G.fk().aHV, 0);
      GL11.glViewport(0, 0, G.Cr, G.BB);
      if (.pp.aeT) {
         boolean var0 = .pp.aeJ != 0;
         .pz.q(var0, !var0, !var0, true);
      }

      .pz.O(true);
      GL11.glClearColor(cNE, cIg, cNH, 1.0F);
      GL11.glClear(16640);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      .pz.nP();
      .pz.nB();
      .pz.nz();
      .pz.ob();
      .pz.bR(519);
      .pz.O(false);
      fD(.u.q[-29875 & 5839]);
      e(cKX);
      fD(.t.q[-5653 & 5102]);
      if (cLM != 0) {
         aiW();
      }

      aiH();
      fD(.u.q[-15793 & 590]);
   }

   private static void q(net.optifine.shaders.d var0, Properties var1) {
      String var2 = .u.q[-31753 & 24999] + var0.bY() + .u.q[428 & 25001];
      File var3 = new File(.hS.eV().Ci, var2);
      if (var1.isEmpty()) {
         var3.delete();
      } else {
         FileOutputStream var4 = new FileOutputStream(var3);
         var1.store(var4, (String)null);
         var4.flush();
         var4.close();
      }

   }

   public static boolean ajb() {
      return !cNO.akY();
   }

   private static int fC(String var0) {
      var0 = var0.trim();

      for(int var1 = 0; var1 < cJh.length; ++var1) {
         String var2 = cJh[var1];
         if (var0.equals(var2)) {
            return cHm[var1];
         }
      }

      return 0;
   }

   public static void o(.No var0) {
      if (cLF) {
         fD(.u.q[4727 & 855]);
         e(cLq);
         a(var0);
      }

   }

   public static boolean ajc() {
      return cIv.akZ();
   }

   public static void ajd() {
      if (!cOf) {
         boolean var0 = y(cJR);
         if (cNb) {
            fD(.u.q[-11569 & 1642]);
            q(cHM, false);
            var0 = true;
         }

         if (var0) {
            aiV();

            for(int var1 = 0; var1 < cLT; ++var1) {
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var1, 3553, cKg.iO(var1), 0);
            }

            if (cNj.aie() != null) {
               e(cNj.aie());
            } else {
               e(cJH);
            }

            .pz.bQ(33984);
            G.fJ().o(.tU.awb);
         }
      }

   }

   public static void aje() {
      if (!cOf) {
         if (cIs >= 3) {
            .pz.bQ(33996);
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, cKl, cJm);
            .pz.bQ(33984);
         }

         .pz.ob();
         .pz.nX();
         .pz.P(770, 771);
         .pz.hT();
         e(cKy);
      }

   }

   private static int i(int var0, String var1) {
      if (var0 == 0) {
         if (var1.equals(.q.q[18189 & 95])) {
            return 0;
         }

         if (var1.equals(.y.q[-30542 & 10214])) {
            return 1;
         }

         if (var1.equals(.y.q[17059 & -27485])) {
            return 2;
         }

         if (var1.equals(.y.q[-32586 & 23716])) {
            return 3;
         }

         if (var1.equals(.y.q[-32593 & 16550]) || var1.equals(.y.q[19437 & 5287])) {
            return 4;
         }

         if (var1.equals(.t.q[20080 & 637])) {
            return cIn ? 5 : 4;
         }

         if (var1.equals(.y.q[4279 & -32025])) {
            return 5;
         }

         if (var1.equals(.y.q[4280 & 490])) {
            return 6;
         }

         if (var1.equals(.y.q[2225 & 4275])) {
            return 7;
         }

         if (var1.equals(.y.q[-30542 & 434])) {
            return 8;
         }

         if (var1.equals(.y.q[17651 & -30537])) {
            return 9;
         }

         if (var1.equals(.y.q[10932 & 4342])) {
            return 10;
         }

         if (var1.equals(.y.q[1449 & 8875])) {
            return 12;
         }

         if (var1.equals(.y.q[-22337 & 5867]) || var1.equals(.y.q[25022 & 4330])) {
            return 13;
         }

         if (var1.equals(.y.q[2285 & 8636])) {
            return 14;
         }

         if (var1.equals(.y.q[4285 & 10925])) {
            return 15;
         }
      }

      if (var0 == 1 || var0 == 2) {
         if (var1.equals(.y.q[12469 & -16131]) || var1.equals(.y.q[437 & 247])) {
            return 0;
         }

         if (var1.equals(.y.q[502 & -26442]) || var1.equals(.y.q[-15889 & 8383])) {
            return 1;
         }

         if (var1.equals(.y.q[12727 & -32065]) || var1.equals(.y.q[4272 & -30991])) {
            return 2;
         }

         if (var1.equals(.y.q[-23878 & 2488]) || var1.equals(.t.q[638 & 10102])) {
            return 3;
         }

         if (var1.equals(.y.q[2238 & 9383]) || var1.equals(.y.q[11445 & 173])) {
            return 4;
         }

         if (var1.equals(.t.q[4728 & -29838])) {
            return cIn ? 5 : 4;
         }

         if (var1.equals(.y.q[167 & -26969])) {
            return 5;
         }

         if (var1.equals(.y.q[426 & -28504]) || var1.equals(.y.q[16637 & 9663])) {
            return 6;
         }

         if (var1.equals(.y.q[3515 & 185]) || var1.equals(.y.q[4537 & -22351])) {
            return 7;
         }

         if (var1.equals(.y.q[16570 & 6910]) || var1.equals(.y.q[6330 & 25266])) {
            return 8;
         }

         if (var1.equals(.y.q[447 & 20667]) || var1.equals(.y.q[20979 & -32077])) {
            return 9;
         }

         if (var1.equals(.y.q[2238 & -15620]) || var1.equals(.y.q[4084 & 182])) {
            return 10;
         }

         if (var1.equals(.y.q[-27987 & 8633])) {
            return 11;
         }

         if (var1.equals(.y.q[190 & 19647])) {
            return 12;
         }

         if (var1.equals(.y.q[-30485 & 13999]) || var1.equals(.y.q[8362 & 5370])) {
            return 13;
         }

         if (var1.equals(.y.q[8876 & -16147])) {
            return 14;
         }

         if (var1.equals(.y.q[16557 & 5117])) {
            return 15;
         }
      }

      return -1;
   }

   private static void ajf() {
      cIO = new IdentityHashMap(300);
      if (cIO.isEmpty()) {
         for(.PJ var1 : .cv.nk.Xx()) {
            .cv var2 = (.cv).cv.nk.k(var1);
            int var3 = .cv.nk.x(var2);
            cIO.put(var2, Integer.valueOf(var3));
         }
      }

      BufferedReader var10 = null;

      try {
         var10 = new BufferedReader(new InputStreamReader(cKv.fm(.u.q[31283 & -31193])));
      } catch (Exception var8) {
         ;
      }

      if (var10 != null) {
         String var11;
         try {
            while((var11 = var10.readLine()) != null) {
               Matcher var12 = cNB.matcher(var11);
               if (var12.matches()) {
                  String var13 = var12.group(1);
                  String var4 = var12.group(2);
                  int var5 = Integer.parseInt(var4);
                  .cv var6 = .cv.z(var13);
                  if (var6 != null) {
                     cIO.put(var6, Integer.valueOf(var5));
                  } else {
                     net.optifine.shaders.x.u(.u.q[8748 & -25948], var13);
                  }
               } else {
                  net.optifine.shaders.x.u(.u.q[-29787 & 8741], var11);
               }
            }
         } catch (Exception var9) {
            net.optifine.shaders.x.fu(.u.q[-32217 & 1638]);
         }
      }

      if (var10 != null) {
         try {
            var10.close();
         } catch (Exception var7) {
            ;
         }
      }

   }

   private static void ajg() {
      cLp = new HashMap();
      if (cLo) {
         ArrayList var0 = new ArrayList();
         String var1 = .u.q[-3488 & 628];
         String var2 = .r.q[17098 & 3525];
         String var3 = .t.q[1023 & -13313];
         var0.add(var1 + var2 + var3);
         if (!.MV.SL().aDL.equals(var2)) {
            var0.add(var1 + .MV.SL().aDL + var3);
         }

         try {
            for(String var5 : var0) {
               InputStream var6 = cKv.fm(var5);
               if (var6 != null) {
                  net.optifine.util.F var7 = new net.optifine.util.F();
                  .XH.q(var6, var7);
                  var6.close();

                  for(Object var9 : var7.keySet()) {
                     String var10 = (String)var9;
                     String var11 = var7.getProperty(var10);
                     cLp.put(var10, var11);
                  }
               }
            }
         } catch (IOException var12) {
            var12.printStackTrace();
         }
      }

   }

   private static void ajh() {
      if (cIb == null && cOe != null) {
         cIb = o(15, cOe);
      }

      if (cIb == null) {
         cIb = new net.optifine.shaders.a(cKS, cKS);
      }

   }

   public static void n() {
      net.optifine.shaders.x.fv(.u.q[20345 & 8573]);

      try {
         if (!cIo.exists()) {
            cIo.mkdir();
         }
      } catch (Exception var8) {
         net.optifine.shaders.x.ft(.u.q[17786 & -32261] + cIo);
      }

      cKO = new net.optifine.util.F();
      cKO.setProperty(.ZB.cOI.akM(), .q.q[3082 & -16316]);
      if (cIN.exists()) {
         try {
            FileReader var0 = new FileReader(cIN);
            cKO.load(var0);
            var0.close();
         } catch (Exception var7) {
            ;
         }
      }

      if (!cIN.exists()) {
         try {
            aiO();
         } catch (Exception var6) {
            ;
         }
      }

      .ZB[] var9 = .ZB.values();

      for(int var1 = 0; var1 < var9.length; ++var1) {
         .ZB var2 = var9[var1];
         String var3 = var2.akM();
         String var4 = var2.akN();
         String var5 = cKO.getProperty(var3, var4);
         q(var2, var5);
      }

      akp();
   }

   private static void aj(.zk var0) {
      double var1 = Math.abs(cKL - cNv);
      double var3 = Math.abs(cLA - cNT);
      double var5 = Math.abs(cKL);
      double var7 = Math.abs(cLA);
      if (var1 > 1000.0D || var3 > 1000.0D || var5 > 1000000.0D || var7 > 1000000.0D) {
         al(var0);
      }

   }

   private static int q(net.optifine.shaders.j var0, String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(35633);
      if (var2 == 0) {
         return 0;
      } else {
         StringBuilder var3 = new StringBuilder(131072);
         BufferedReader var4 = null;

         try {
            var4 = new BufferedReader(fF(var1));
         } catch (Exception var10) {
            ARBShaderObjects.glDeleteObjectARB(var2);
            return 0;
         }

         .ZP[] var5 = q(cLU);
         ArrayList var6 = new ArrayList();
         if (var4 != null) {
            try {
               var4 = .ZY.q(var4, var1, cKv, 0, var6, 0);
               .ZF var7 = new .ZF();

               while(true) {
                  String var8 = var4.readLine();
                  if (var8 == null) {
                     var4.close();
                     break;
                  }

                  var8 = w(var8, var5);
                  var3.append(var8).append('\n');
                  if (var7.fO(var8)) {
                     .ZL var9 = .aaa.gr(var8);
                     if (var9 != null) {
                        if (var9.fU(.u.q[-32286 & 1514])) {
                           cNu = true;
                           cIf = true;
                        } else if (var9.fU(.u.q[15851 & -31773])) {
                           cNd = true;
                           cGW = true;
                        } else if (var9.fU(.u.q[2021 & -32284])) {
                           cHg = true;
                           cJr = true;
                        }

                        if (var9.fR(.u.q[5623 & 16871])) {
                           var0.iX(var9.aln());
                           net.optifine.shaders.x.fv(.u.q[2542 & -24087] + var0.aif());
                        }
                     }
                  }
               }
            } catch (Exception var11) {
               net.optifine.shaders.x.ft(.u.q[-32275 & 30185] + var1 + .w.q[2871 & 380]);
               var11.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var2);
               return 0;
            }
         }

         if (cKs) {
            B(var1, var3.toString());
         }

         ARBShaderObjects.glShaderSourceARB(var2, var3);
         ARBShaderObjects.glCompileShaderARB(var2);
         if (GL20.glGetShaderi(var2, 35713) != 1) {
            net.optifine.shaders.x.ft(.u.q[-29717 & 5626] + var1);
         }

         q(var2, var1, var6);
         return var2;
      }
   }

   private static void q(.aax var0, int var1, int var2) {
      var0.bO(var1, var2);
   }

   public static boolean RC() {
      return cKw.afN() || cKw.akZ();
   }

   public static boolean aji() {
      return cKW;
   }

   public static boolean ajj() {
      return cLY;
   }

   public static void ais() {
      cIx[cFe * 2] = 0;
      cIx[cFe * 2 + 1] = 0;
      --cFe;
   }

   public static int fD(String var0) {
      int var1 = .pz.nM();
      if (var1 != 0 && .XD.U(var1)) {
         String var2 = .MV.gm(var1);
         String var3 = d(var1, var0);
         String var4 = String.format(.u.q[9149 & -32337], var1, var2, var3, var0);
         net.optifine.shaders.x.ft(var4);
         if (.MV.RX() && net.optifine.util.O.e(.u.q[11758 & -28242], 10000L)) {
            String var5 = .uI.q(.w.q[21327 & 11215], var1, var2);
            fJ(var5);
         }
      }

      return var1;
   }

   public static boolean ajk() {
      return !cJC.akY();
   }

   private static net.optifine.shaders.s o(int var0, String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         return var1.indexOf(58) >= 0 ? u(var0, var1) : (var1.indexOf(32) >= 0 ? p(var0, var1) : s(var0, var1));
      }
   }

   private static void ajl() {
      if (cHd != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(cHd);
         .pz.q(cKA);
         .pz.q(cHC);
      }

      cHd = EXTFramebufferObject.glGenFramebuffersEXT();
      GL11.glGenTextures((IntBuffer)cKA.clear().limit(cIs));
      GL11.glGenTextures((IntBuffer)cHC.clear().limit(16));
      cKA.position(0);
      cHC.position(0);
      EXTFramebufferObject.glBindFramebufferEXT(36160, cHd);
      GL20.glDrawBuffers(0);
      GL11.glReadBuffer(0);

      for(int var0 = 0; var0 < cIs; ++var0) {
         .pz.bW(cKA.get(var0));
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
         GL11.glTexParameteri(3553, 34891, 6409);
         GL11.glTexImage2D(3553, 0, 6402, cKl, cJm, 0, 6402, 5126, (ByteBuffer)null);
      }

      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, cKA.get(0), 0);
      GL20.glDrawBuffers(cJH);
      GL11.glReadBuffer(0);
      fD(.u.q[2865 & 22199]);

      for(int var2 = 0; var2 < cLT; ++var2) {
         .pz.bW(cKg.iO(var2));
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexImage2D(3553, 0, cMt[var2], cKl, cJm, 0, ja(cMt[var2]), 33639, (ByteBuffer)null);
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var2, 3553, cKg.iO(var2), 0);
         fD(.u.q[-24774 & 755]);
      }

      for(int var3 = 0; var3 < cLT; ++var3) {
         .pz.bW(cKg.iP(var3));
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexImage2D(3553, 0, cMt[var3], cKl, cJm, 0, ja(cMt[var3]), 33639, (ByteBuffer)null);
         fD(.u.q[1019 & 8755]);
      }

      int var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var4 == 36058) {
         fG(.u.q[3895 & -24004]);

         for(int var1 = 0; var1 < cLT; ++var1) {
            .pz.bW(cKg.iO(var1));
            GL11.glTexImage2D(3553, 0, 6408, cKl, cJm, 0, 32993, 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var1, 3553, cKg.iO(var1), 0);
            fD(.u.q[23354 & 1650]);
         }

         var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         if (var4 == 36053) {
            net.optifine.shaders.x.fv(.u.q[631 & -23755]);
         }
      }

      .pz.bW(0);
      if (var4 != 36053) {
         fG(.u.q[8758 & -13769] + var4 + .w.q[18527 & 12573]);
      } else {
         net.optifine.shaders.x.fv(.u.q[567 & 16191]);
      }

   }

   public static void fE(String var0) {
      cJd = var0;
      cKO.setProperty(.ZB.cOI.akM(), var0);
      akp();
   }

   private static IntBuffer r(IntBuffer var0) {
      int var1 = var0.limit();

      for(int var2 = var0.position(); var2 < var1; ++var2) {
         var0.put(var2, 0);
      }

      return var0;
   }

   public static void ajm() {
      if ((double)cMU != 1.0D) {
         GL11.glScaled(1.0D, 1.0D, (double)cMU);
      }

   }

   private static Reader fF(String var0) {
      return new InputStreamReader(cKv.fm(var0));
   }

   public static void nP() {
      if (cMZ) {
         e(cMW);
      } else if (cIE == cHT) {
         e(cKe ? cKr : cMp);
      }

   }

   public static void init() {
      boolean var0;
      if (!cLy) {
         cLy = true;
         var0 = true;
      } else {
         var0 = false;
      }

      if (!cIp) {
         fD(.u.q[2011 & 8655]);
         if (ajy() != null) {
            ;
         }

         if (!cKt.OpenGL20) {
            fG(.u.q[17357 & 462]);
         }

         if (!cKt.GL_EXT_framebuffer_object) {
            fG(.u.q[3535 & -15923]);
         }

         cJH.position(0).limit(8);
         cHC.position(0).limit(16);
         cKA.position(0).limit(3);
         cOb.position(0).limit(8);
         cNq.position(0).limit(2);
         cLs.position(0).limit(8);
         cLT = 4;
         cIs = 1;
         cLS = 0;
         cJy = 0;
         cNi = 1;
         cKR = 1;
         Arrays.fill(cMt, 6408);
         Arrays.fill(cHS, true);
         Arrays.fill(cHF, (Object)null);
         Arrays.fill(cKB, false);
         Arrays.fill(cJz, false);
         Arrays.fill(cHj, false);
         Arrays.fill(cJa, false);
         Arrays.fill(cJu, false);
         cLO = false;
         cNe = false;
         cJo = 0.0F;
         cHw = 2.0F;
         cNz = 1024;
         cMb = 1024;
         cNP = 1024;
         cJO = 1024;
         cMa = 90.0F;
         cJi = 160.0F;
         cJn = true;
         cMw = -1.0F;
         cLu = -1.0F;
         cNu = false;
         cNd = false;
         cHg = false;
         cIn = false;
         cNk = false;
         aiM();
         .aaE.amo();
         cNJ.pK();
         if (cGT != null) {
            cGT.pK();
         }

         .aab var1 = net.optifine.shaders.E.q(cJq, cLU, false);
         String var2 = .q.q[4256 & 25105];
         if (bZJ != null) {
            int var3 = bZJ.bXI.ZQ();
            if (cNf.contains(Integer.valueOf(var3))) {
               var2 = .u.q[16862 & 8654] + var3 + .q.q[-32673 & 8319];
            }
         }

         for(int var13 = 0; var13 < cNF.length; ++var13) {
            net.optifine.shaders.j var4 = cNF[var13];
            var4.aij();
            var4.ail();
            if (var4.aid() != net.optifine.shaders.l.cEP) {
               String var5 = var4.bY();
               String var6 = var2 + var5;
               boolean var7 = true;
               if (cJf.containsKey(var6)) {
                  var7 = var7 && ((net.optifine.expr.f)cJf.get(var6)).agj();
               }

               if (var1 != null) {
                  var7 = var7 && !var1.gx(var6);
               }

               if (!var7) {
                  net.optifine.shaders.x.fv(.u.q[1519 & 4559] + var6);
                  var5 = .u.q[-15406 & 4561];
                  var6 = var2 + var5;
               }

               String var8 = .y.q[592 & 512] + var6;
               String var9 = var8 + .t.q[727 & 4991];
               String var10 = var8 + .u.q[17905 & 8661];
               String var11 = var8 + .t.q[603 & 8921];
               q(var4, var9, var10, var11);
               int var12 = var4.B();
               if (var12 > 0) {
                  net.optifine.shaders.x.fv(.u.q[-5674 & 506] + var6);
               }

               t(var4);
               r(var4);
            }
         }

         cNb = false;

         for(int var14 = 0; var14 < cHM.length; ++var14) {
            if (cHM[var14].B() != 0) {
               cNb = true;
               break;
            }
         }

         cNi = cLT;
         cMP = cJy > 0 ? 1 : 0;
         cKF = cJy > 0;
         net.optifine.shaders.x.fv(.u.q[16887 & -29741] + cLT);
         net.optifine.shaders.x.fv(.u.q[25556 & 2548] + cIs);
         net.optifine.shaders.x.fv(.u.q[29181 & 1493] + cLS);
         net.optifine.shaders.x.fv(.u.q[-32298 & 31710] + cJy);
         net.optifine.shaders.x.fv(.u.q[-22561 & 16855] + cNi);
         net.optifine.shaders.x.fv(.u.q[3576 & 20952] + cKR);
         cJH.position(0).limit(cKR);
         cHC.position(0).limit(cLT * 2);
         cKg.pK();

         for(int var15 = 0; var15 < cKR; ++var15) {
            cJH.put(var15, '賠' + var15);
         }

         int var16 = GL11.glGetInteger(34852);
         if (cKR > var16) {
            fG(.u.q[4569 & 8697] + cKR + .u.q[-30214 & 1498] + var16);
         }

         cOb.position(0).limit(cLS);

         for(int var17 = 0; var17 < cLS; ++var17) {
            cOb.put(var17, '賠' + var17);
         }

         for(int var18 = 0; var18 < cNF.length; ++var18) {
            net.optifine.shaders.j var20 = cNF[var18];

            net.optifine.shaders.j var21;
            for(var21 = var20; var21.B() == 0 && var21.aim() != var21; var21 = var21.aim()) {
               ;
            }

            if (var21 != var20 && var20 != cHR) {
               var20.q(var21);
            }
         }

         ajM();
         ajS();
         if (cNe) {
            ajh();
         }

         if (cGR == null) {
            cGR = net.optifine.shaders.I.akJ();
         }

         .pz.nE();
         .pz.i(-90.0F, 0.0F, 1.0F, 0.0F);
         ajw();
         ajE();
         .pz.nF();
         cIp = true;
         ajf();
         aiw();
         if (!var0) {
            ;
         }

         fD(.u.q[20987 & 10203]);
      }

   }

   public static void Y(float var0) {
      cJJ = var0;
      if (cGU) {
         q(cKf, var0);
      }

   }

   private static void ajn() {
      if (!ajN()) {
         GL11.glBegin(5);
         GL11.glTexCoord2f(0.0F, 0.0F);
         GL11.glVertex3f(0.0F, 0.0F, 0.0F);
         GL11.glTexCoord2f(1.0F, 0.0F);
         GL11.glVertex3f(1.0F, 0.0F, 0.0F);
         GL11.glTexCoord2f(0.0F, 1.0F);
         GL11.glVertex3f(0.0F, 1.0F, 0.0F);
         GL11.glTexCoord2f(1.0F, 1.0F);
         GL11.glVertex3f(1.0F, 1.0F, 0.0F);
         GL11.glEnd();
      } else {
         GL11.glBegin(7);
         GL11.glTexCoord2f(0.0F, 0.0F);
         GL11.glVertex3f(0.0F, 0.0F, 0.0F);
         GL11.glTexCoord2f(1.0F, 0.0F);
         GL11.glVertex3f(1.0F, 0.0F, 0.0F);
         GL11.glTexCoord2f(1.0F, 1.0F);
         GL11.glVertex3f(1.0F, 1.0F, 0.0F);
         GL11.glTexCoord2f(0.0F, 1.0F);
         GL11.glVertex3f(0.0F, 1.0F, 0.0F);
         GL11.glEnd();
      }

   }

   public static void jc(int var0) {
      GL11.glDisable(var0);
      og();
   }

   public static boolean ajo() {
      return !cJI.akY();
   }

   public static void bJ(int var0, int var1) {
      GL11.glFogi(var0, var1);
      if (var0 == 2917) {
         cHL = var1;
         if (cGU) {
            q(cKK, cHL);
         }
      }

   }

   public static void cr(boolean var0) {
      if (var0) {
         cHk += 2;
         if (cHk > 4) {
            cHk = 0;
         }
      } else {
         cHk -= 2;
         if (cHk < 0) {
            cHk = 4;
         }
      }

      cHk = cHk / 2 * 2;
      cHk = .MV.B(cHk, 0, 4);
   }

   private static void ajp() {
      if (cJy != 0) {
         if (cMT != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(cMT);
            .pz.q(cNq);
            .pz.q(cLs);
         }

         cMT = EXTFramebufferObject.glGenFramebuffersEXT();
         EXTFramebufferObject.glBindFramebufferEXT(36160, cMT);
         GL11.glDrawBuffer(0);
         GL11.glReadBuffer(0);
         GL11.glGenTextures((IntBuffer)cNq.clear().limit(cJy));
         GL11.glGenTextures((IntBuffer)cLs.clear().limit(cLS));
         cNq.position(0);
         cLs.position(0);

         for(int var0 = 0; var0 < cJy; ++var0) {
            .pz.bW(cNq.get(var0));
            GL11.glTexParameterf(3553, 10242, 33071.0F);
            GL11.glTexParameterf(3553, 10243, 33071.0F);
            int var1 = cHj[var0] ? 9728 : 9729;
            GL11.glTexParameteri(3553, 10241, var1);
            GL11.glTexParameteri(3553, 10240, var1);
            if (cKB[var0]) {
               GL11.glTexParameteri(3553, 34892, 34894);
            }

            GL11.glTexImage2D(3553, 0, 6402, cNz, cMb, 0, 6402, 5126, (ByteBuffer)null);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, cNq.get(0), 0);
         fD(.u.q[2748 & 17211]);

         for(int var2 = 0; var2 < cLS; ++var2) {
            .pz.bW(cLs.get(var2));
            GL11.glTexParameterf(3553, 10242, 33071.0F);
            GL11.glTexParameterf(3553, 10243, 33071.0F);
            int var4 = cJu[var2] ? 9728 : 9729;
            GL11.glTexParameteri(3553, 10241, var4);
            GL11.glTexParameteri(3553, 10240, var4);
            GL11.glTexImage2D(3553, 0, 6408, cNz, cMb, 0, 32993, 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var2, 3553, cLs.get(var2), 0);
            fD(.u.q[569 & 6073]);
         }

         .pz.bW(0);
         if (cLS > 0) {
            GL20.glDrawBuffers(cOb);
         }

         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         if (var3 != 36053) {
            fG(.u.q[4991 & -20806] + var3 + .w.q[18717 & 4223]);
         } else {
            net.optifine.shaders.x.fv(.u.q[-30853 & 2747]);
         }
      }

   }

   public static .ZP[] q(.ZP[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         .ZP var3 = var0[var2];
         if (var3.J() && var3.alF()) {
            var1.add(var3);
         }
      }

      .ZP[] var4 = (.ZP[])var1.toArray(new .ZP[var1.size()]);
      return var4;
   }

   private static net.optifine.shaders.s p(int var0, String var1) {
      // $FF: Couldn't be decompiled
   }

   private static int p(.No var0) {
      if (var0 == null) {
         return -1;
      } else {
         .cv var1 = var0.LQ();
         if (var1 == null) {
            return 0;
         } else {
            int var2 = .cv.w(var1);
            int var3 = var0.dT();
            int var4 = net.optifine.shaders.w.bF(var2, var3);
            if (var4 >= 0) {
               var2 = var4;
            }

            return var2;
         }
      }
   }

   public static float ajq() {
      return cMw < 0.0F ? -1.0F : cJi * cMw;
   }

   private static String w(String var0, .ZP[] var1) {
      if (var1 != null && var1.length > 0) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            .ZP var3 = var1[var2];
            if (var3.gg(var0)) {
               var0 = var3.alq();
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static void i(boolean var0, boolean var1) {
      cML = var0;
      cHz = var1;
   }

   private static int w(net.optifine.shaders.j var0, String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(36313);
      if (var2 == 0) {
         return 0;
      } else {
         StringBuilder var3 = new StringBuilder(131072);
         BufferedReader var4 = null;

         try {
            var4 = new BufferedReader(fF(var1));
         } catch (Exception var11) {
            ARBShaderObjects.glDeleteObjectARB(var2);
            return 0;
         }

         .ZP[] var5 = q(cLU);
         ArrayList var6 = new ArrayList();
         cLa = false;
         cKp = 3;
         if (var4 != null) {
            try {
               var4 = .ZY.q(var4, var1, cKv, 0, var6, 0);
               .ZF var7 = new .ZF();

               while(true) {
                  String var8 = var4.readLine();
                  if (var8 == null) {
                     var4.close();
                     break;
                  }

                  var8 = w(var8, var5);
                  var3.append(var8).append('\n');
                  if (var7.fO(var8)) {
                     .ZL var9 = .aaa.gr(var8);
                     if (var9 != null) {
                        if (var9.fW(.u.q[17387 & 511])) {
                           String var10 = .MV.cQ(var9.wx());
                           if (var10.equals(.u.q[8700 & 1004]) || var10.equals(.u.q[8687 & 509]) || var10.equals(.u.q[1022 & -21010])) {
                              cLa = true;
                           }
                        }

                        if (var9.fR(.u.q[1519 & -3089])) {
                           cKp = var9.aln();
                        }
                     }
                  }
               }
            } catch (Exception var12) {
               net.optifine.shaders.x.ft(.u.q[23017 & 489] + var1 + .w.q[-32396 & 2487]);
               var12.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var2);
               return 0;
            }
         }

         if (cKs) {
            B(var1, var3.toString());
         }

         ARBShaderObjects.glShaderSourceARB(var2, var3);
         ARBShaderObjects.glCompileShaderARB(var2);
         if (GL20.glGetShaderi(var2, 35713) != 1) {
            net.optifine.shaders.x.ft(.u.q[29178 & 2032] + var1);
         }

         q(var2, var1, var6);
         return var2;
      }
   }

   public static void ajr() {
      if (cLF && !cOf) {
         e(cMS.aie());
      }

   }

   private static int c(.QI var0) {
      return var0 == null ? Integer.MIN_VALUE : var0.bXI.ZQ();
   }

   public static boolean ajs() {
      return cGT != null;
   }

   public static void ajt() {
      if (cLF) {
         if (!cOf) {
            ajd();
            e(cNj);
            .pz.nX();
            .pz.O(true);
         } else {
            .pz.O(true);
         }
      }

   }

   public static void aB(.GX var0) {
      cMf = aA(var0);
   }

   public static void o(boolean var0, boolean var1) {
      cIC = var0;
      cHD = var1;
   }

   private static void r(net.optifine.shaders.j var0) {
      boolean[] var1 = var0.aib();
      Boolean[] var2 = var0.ahY();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Boolean var4 = var2[var3];
         if (var4 != null) {
            var1[var3] = var4.booleanValue();
         }
      }

   }

   private static .ZP[] aju() {
      try {
         String[] var0 = cMN.air();
         .ZP[] var1 = .ZY.q(cKv, var0, cNf);
         Properties var2 = w(cKv);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            .ZP var4 = var1[var3];
            String var5 = var2.getProperty(var4.bY());
            if (var5 != null) {
               var4.akQ();
               if (!var4.ge(var5)) {
                  .MV.cJ(.u.q[-30229 & 16809] + var4.bY() + .r.q[17787 & -31845] + var5);
               }
            }
         }

         return var1;
      } catch (IOException var6) {
         .MV.cJ(.u.q[18863 & -23574] + cKv.bY());
         var6.printStackTrace();
         return null;
      }
   }

   public static boolean ajv() {
      return cHz;
   }

   public static void ajw() {
      GL11.glRotatef(cJo, 0.0F, 0.0F, 1.0F);
      fD(.u.q[25544 & -32183]);
   }

   public static void ajx() {
      e(cMp);
   }

   private static void q(net.optifine.shaders.s[] var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            net.optifine.shaders.s var2 = var0[var1];
            .pz.bQ('蓀' + var2.ahQ());
            int var3 = var2.ahR();
            int var4 = var2.ahP();
            if (var4 == 3553) {
               .pz.bW(var3);
            } else {
               GL11.glBindTexture(var4, var3);
            }
         }
      }

   }

   public static void ak(.zk var0) {
      if (cLF) {
         e(cMS);
         ai(var0);
      }

   }

   public static void B(String var0, String var1) {
      try {
         File var2 = new File(cIo, .u.q[31290 & 1758] + var0);
         var2.getParentFile().mkdirs();
         .MV.q(var2, var1);
      } catch (IOException var3) {
         .MV.cJ(.u.q[3707 & -23909] + var0);
         var3.printStackTrace();
      }

   }

   public static String ajy() {
      return cKv == null ? null : (cKv instanceof net.optifine.shaders.B ? null : cKv.bY());
   }

   public static int ajz() {
      return cIx[cFe * 2 + 1];
   }

   private static void fG(String var0) {
      net.optifine.shaders.x.ft(var0);
      G.BZ.iA().e(new .Oo(var0));
   }

   private static void o(File var0) {
      if (var0.exists() && var0.isDirectory()) {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            for(int var2 = 0; var2 < var1.length; ++var2) {
               File var3 = var1[var2];
               if (var3.isDirectory()) {
                  o(var3);
               }

               var3.delete();
            }
         }
      }

   }

   public static void cs(boolean var0) {
      cKW = var0;
   }

   private static net.optifine.shaders.j jd(int var0) {
      for(int var1 = 0; var1 < cNF.length; ++var1) {
         net.optifine.shaders.j var2 = cNF[var1];
         if (var2.B() == var0) {
            return var2;
         }
      }

      return cJG;
   }

   private static boolean a(int var0, String var1) {
      IntBuffer var2 = BufferUtils.createIntBuffer(1);
      ARBShaderObjects.glGetObjectParameterARB(var0, 35716, var2);
      int var3 = var2.get();
      if (var3 > 1) {
         ByteBuffer var4 = BufferUtils.createByteBuffer(var3);
         var2.flip();
         ARBShaderObjects.glGetInfoLogARB(var0, var2, var4);
         byte[] var5 = new byte[var3];
         var4.get(var5);
         if (var5[var3 - 1] == 0) {
            var5[var3 - 1] = 10;
         }

         String var6 = new String(var5, Charsets.US_ASCII);
         var6 = net.optifine.util.J.N(var6, .u.q[-15651 & 540]);
         net.optifine.shaders.x.fv(.u.q[21149 & 2655] + var1 + .q.q[17458 & 4346] + var6);
         return false;
      } else {
         return true;
      }
   }

   private static net.optifine.shaders.s s(int var0, String var1) {
      var1 = var1.trim();
      if (var1.indexOf(46) < 0) {
         var1 = var1 + .q.q[-30164 & 5324];
      }

      try {
         String var2 = .u.q[434 & 490] + net.optifine.util.J.Q(var1, .q.q[-11681 & 2143]);
         InputStream var3 = cKv.fm(var2);
         if (var3 == null) {
            net.optifine.shaders.x.fu(.w.q[2124 & -8114] + var1);
            return null;
         } else {
            IOUtils.closeQuietly(var3);
            net.optifine.shaders.K var4 = new net.optifine.shaders.K(var2);
            var4.w(G.fF());
            net.optifine.shaders.r var5 = new net.optifine.shaders.r(var0, var2, var4);
            return var5;
         }
      } catch (IOException var6) {
         net.optifine.shaders.x.fu(.u.q[487 & 29093] + var1);
         net.optifine.shaders.x.fu(var6.getClass().getName() + .q.q[900 & 17030] + var6.getMessage());
         return null;
      }
   }

   private static String d(int var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      if (var0 == 1286) {
         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         String var4 = iZ(var3);
         String var5 = .u.q[16815 & -31313] + var3 + .w.q[-4106 & 820] + var4 + .w.q[16927 & 4253];
         var2.append(var5);
      }

      String var6 = cIE.bY();
      if (var6.isEmpty()) {
         var6 = .q.q[-11212 & 2197];
      }

      var2.append(.u.q[-19535 & 16822] + var6);
      net.optifine.shaders.j var7 = jd(cNm);
      if (var7 != cIE) {
         String var8 = var7.bY();
         if (var8.isEmpty()) {
            var8 = .q.q[8724 & 1276];
         }

         var2.append(.w.q[2868 & 6012] + var8 + .w.q[3741 & 8253]);
      }

      if (var1.equals(.u.q[433 & -15439])) {
         var2.append(.u.q[2995 & 17846] + cIE.ain());
      }

      return var2.toString();
   }

   public static void je(int var0) {
      GL11.glDisable(var0);
      if (var0 == 3553) {
         nC();
      } else if (var0 == 2912) {
         og();
      }

   }

   public static int fH(String var0) {
      int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var1 != 36053) {
         System.err.format(.u.q[-23636 & 3566], var1, var0);
      }

      return var1;
   }

   public static void nj() {
      cKe = true;
      if (cIE == cMp) {
         e(cKr);
      }

   }

   public static void ajA() {
      fD(.u.q[19292 & 4702]);
      fH(.u.q[-19844 & 3932]);
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      .pz.P(770, 771);
      fD(.u.q[733 & -7329]);
   }

   public static void nC() {
      if (cMZ) {
         e(cMX);
      } else if (cIE == cMp || cIE == cKr) {
         e(cHT);
      }

   }

   public static void e(IntBuffer var0) {
      if (var0 == null) {
         var0 = cHJ;
      }

      if (cMm != var0) {
         cMm = var0;
         GL20.glDrawBuffers(var0);
         fD(.u.q[947 & 1529]);
      }

   }

   private static void al(.zk var0) {
      if (var0 == null) {
         cMv = 0;
         cNG = 0;
      } else {
         cMv = (int)var0.aNZ / 1000 * 1000;
         cNG = (int)var0.aOt / 1000 * 1000;
      }

   }

   public static void ajB() {
      if (cOf) {
         fD(.u.q[5709 & -5530]);
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, cNq.get(0), 0);
         GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL20.glDrawBuffers(cHR.aie());
         fH(.u.q[6853 & 615]);
         GL11.glClear(16640);
         fD(.u.q[2637 & 8917]);
      } else {
         fD(.u.q[9206 & 1606]);
         if (cHS[0]) {
            Vector4f var0 = cHF[0];
            if (var0 != null) {
               GL11.glClearColor(var0.getX(), var0.getY(), var0.getZ(), var0.getW());
            }

            if (cKg.iQ(0)) {
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, cKg.iP(0), 0);
               GL20.glDrawBuffers(36064);
               GL11.glClear(16384);
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, cKg.iO(0), 0);
            }

            GL20.glDrawBuffers(36064);
            GL11.glClear(16384);
         }

         if (cHS[1]) {
            GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
            Vector4f var2 = cHF[1];
            if (var2 != null) {
               GL11.glClearColor(var2.getX(), var2.getY(), var2.getZ(), var2.getW());
            }

            if (cKg.iQ(1)) {
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, cKg.iP(1), 0);
               GL20.glDrawBuffers(36065);
               GL11.glClear(16384);
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, cKg.iO(1), 0);
            }

            GL20.glDrawBuffers(36065);
            GL11.glClear(16384);
         }

         for(int var3 = 2; var3 < cLT; ++var3) {
            if (cHS[var3]) {
               GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               Vector4f var1 = cHF[var3];
               if (var1 != null) {
                  GL11.glClearColor(var1.getX(), var1.getY(), var1.getZ(), var1.getW());
               }

               if (cKg.iQ(var3)) {
                  EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var3, 3553, cKg.iP(var3), 0);
                  GL20.glDrawBuffers('賠' + var3);
                  GL11.glClear(16384);
                  EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var3, 3553, cKg.iO(var3), 0);
               }

               GL20.glDrawBuffers('賠' + var3);
               GL11.glClear(16384);
            }
         }

         e(cJH);
         fH(.w.q[111 & -31635]);
         fD(.w.q[8301 & 6013]);
      }

   }

   public static void ajC() {
      .pz.nz();
      e(cKr);
   }

   public static void ajD() {
      cIX.w(cIE);
   }

   public static void ajE() {
      FloatBuffer var0 = cMi;
      var0.clear();
      GL11.glGetFloat(2982, var0);
      var0.get(cMo, 0, 16);
      net.optifine.shaders.c.e(cKJ, cMo, cMD);
      net.optifine.shaders.c.e(cMV, cMo, cNV);
      System.arraycopy(cNl == cJV ? cKJ : cMV, 0, cJX, 0, 3);
      q(cIW, cKJ[0], cKJ[1], cKJ[2]);
      q(cMH, cMV[0], cMV[1], cMV[2]);
      q(cMz, cJX[0], cJX[1], cJX[2]);
      if (cGT != null) {
         cGT.aW();
      }

      fD(.u.q[4717 & -29879]);
   }

   private static ByteBuffer jf(int var0) {
      ByteBuffer var1 = cMF;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0);
      return var1.slice();
   }

   public static void ajF() {
      try {
         Class var0 = Class.forName(.u.q[894 & 17119]);
      } catch (Throwable var1) {
         return;
      }

      throw new RuntimeException(.u.q[21343 & -32033]);
   }

   public static void og() {
      cGU = false;
      q(cKK, 0);
   }

   private static void q(.aav var0, int var1) {
      var0.ju(var1);
   }

   private static void ajG() {
      cNf.clear();

      for(int var0 = -128; var0 <= 128; ++var0) {
         String var1 = .t.q[-23810 & 1766] + var0;
         if (cKv.fl(var1)) {
            cNf.add(Integer.valueOf(var0));
         }
      }

      if (cNf.size() > 0) {
         Integer[] var2 = (Integer[])cNf.toArray(new Integer[cNf.size()]);
         .MV.cM(.u.q[16799 & 4517] + .MV.w(var2));
      }

   }

   private static .ZP[] q(Map var0, .ZP[] var1) {
      HashSet var2 = new HashSet();

      for(String var4 : var0.keySet()) {
         .ZK var5 = (.ZK)var0.get(var4);
         .ZP[] var6 = var5.alc();

         for(int var7 = 0; var7 < var6.length; ++var7) {
            .ZP var8 = var6[var7];
            if (var8 != null) {
               var2.add(var8.bY());
            }
         }
      }

      ArrayList var9 = new ArrayList();

      for(int var10 = 0; var10 < var1.length; ++var10) {
         .ZP var12 = var1[var10];
         if (var12.alz()) {
            String var13 = var12.bY();
            if (!var2.contains(var13)) {
               var9.add(var12);
            }
         }
      }

      .ZP[] var11 = (.ZP[])var9.toArray(new .ZP[var9.size()]);
      return var11;
   }

   public static void q(.hS var0, float var1, long var2) {
      fD(.u.q[1916 & 16958]);
      x(G.Cg);
      G = var0;
      G.CF.cf(.u.q[573 & 7871]);
      Bt = G.Bt;
      if (!cIp) {
         try {
            init();
         } catch (IllegalStateException var11) {
            if (.MV.cQ(var11.getMessage()).equals(.u.q[639 & 574])) {
               fG(.u.q[703 & -18561] + var11.getMessage());
               var11.printStackTrace();
               fE(.q.q[-31757 & 18342]);
               return;
            }
         }
      }

      if (G.Cr != cMd || G.BB != cLG) {
         ajM();
      }

      if (cKP) {
         ajS();
      }

      bxA = G.Cg.Kx();
      cJc = (bxA - cKZ) % 24000L;
      if (cJc < 0L) {
         cJc += 24000L;
      }

      cKZ = bxA;
      cJt = G.Cg.ZL();
      ++avc;
      if (avc >= 720720) {
         avc = 0;
      }

      Bh = System.currentTimeMillis();
      if (Jj == 0L) {
         Jj = Bh;
      }

      cKa = Bh - Jj;
      Jj = Bh;
      cGV = (float)cKa / 1000.0F;
      cLm += cGV;
      cLm %= 3600.0F;
      cHN = var0.Cg.bu(var1);
      float var4 = (float)cKa * 0.01F;
      float var5 = (float)Math.exp(Math.log(0.5D) * (double)var4 / (double)(cHO < cHN ? cLl : cNt));
      cHO = cHO * var5 + cHN * (1.0F - var5);
      .zk var6 = G.gj();
      if (var6 != null) {
         cJE = var6 instanceof .zz && ((.zz)var6).zV();
         cNo = (float)var6.aNK * var1 + (float)var6.aNE * (1.0F - var1);
         cLv = var6.I(var1);
         var5 = (float)cKa * 0.01F;
         float var7 = (float)Math.exp(Math.log(0.5D) * (double)var5 / (double)cHP);
         cJF = cJF * var7 + (float)(cLv & '\uffff') * (1.0F - var7);
         cHu = cHu * var7 + (float)(cLv >> 16) * (1.0F - var7);
         .cv var8 = .oU.q(G.Cg, var6, var1);
         .hn var9 = var8.cB();
         if (var9 == .hn.zS) {
            cKM = 1;
         } else if (var9 == .hn.zY) {
            cKM = 2;
         } else {
            cKM = 0;
         }

         if (G.CM != null) {
            cLH = 0.0F;
            if (G.CM.q(.LG.bCc)) {
               cLH = .MV.eV().Bt.q(G.CM, var1);
            }

            cIu = 0.0F;
            if (G.CM.q(.LG.bCh)) {
               int var10 = G.CM.w(.LG.bCh).EW();
               cIu = .MV.c((float)var10 / 20.0F, 0.0F, 1.0F);
            }
         }

         .PX var14 = G.Cg.i(var6, var1);
         var14 = .Xh.q(var14, bZJ, var6, var1);
         cIy = (float)var14.bUV;
         cHa = (float)var14.bUW;
         cJx = (float)var14.bUX;
      }

      cLF = true;
      cNA = false;
      cOf = false;
      cML = false;
      cHz = false;
      cIC = false;
      cHD = false;
      aiV();
      cNv = cKL;
      cIF = cMG;
      cNT = cLA;
      cJN.position(0);
      cNU.position(0);
      cJN.put(cNU);
      cJN.position(0);
      cNU.position(0);
      cIz.position(0);
      cHe.position(0);
      cIz.put(cHe);
      cIz.position(0);
      cHe.position(0);
      fD(.u.q[5698 & 25180]);
      net.optifine.shaders.H.q(Bt, 0, var1, var2);
      G.CF.Ol();
      EXTFramebufferObject.glBindFramebufferEXT(36160, cHd);

      for(int var13 = 0; var13 < cLT; ++var13) {
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var13, 3553, cKg.iO(var13), 0);
      }

      fD(.u.q[8789 & -30109]);
   }

   public static void ajH() {
      .qq var0 = .qk.pm().pl();
      float var1 = (float)(G.Br.ajy * 16);
      double var2 = (double)var1 * 0.9238D;
      double var4 = (double)var1 * 0.3826D;
      double var6 = -var4;
      double var8 = -var2;
      double var10 = 16.0D;
      double var12 = -cMG;
      var0.q(7, .us.axO);
      var0.i(var6, var12, var8).pJ();
      var0.i(var6, var10, var8).pJ();
      var0.i(var8, var10, var6).pJ();
      var0.i(var8, var12, var6).pJ();
      var0.i(var8, var12, var6).pJ();
      var0.i(var8, var10, var6).pJ();
      var0.i(var8, var10, var4).pJ();
      var0.i(var8, var12, var4).pJ();
      var0.i(var8, var12, var4).pJ();
      var0.i(var8, var10, var4).pJ();
      var0.i(var6, var10, var2).pJ();
      var0.i(var6, var12, var2).pJ();
      var0.i(var6, var12, var2).pJ();
      var0.i(var6, var10, var2).pJ();
      var0.i(var4, var10, var2).pJ();
      var0.i(var4, var12, var2).pJ();
      var0.i(var4, var12, var2).pJ();
      var0.i(var4, var10, var2).pJ();
      var0.i(var2, var10, var4).pJ();
      var0.i(var2, var12, var4).pJ();
      var0.i(var2, var12, var4).pJ();
      var0.i(var2, var10, var4).pJ();
      var0.i(var2, var10, var6).pJ();
      var0.i(var2, var12, var6).pJ();
      var0.i(var2, var12, var6).pJ();
      var0.i(var2, var10, var6).pJ();
      var0.i(var4, var10, var8).pJ();
      var0.i(var4, var12, var8).pJ();
      var0.i(var4, var12, var8).pJ();
      var0.i(var4, var10, var8).pJ();
      var0.i(var6, var10, var8).pJ();
      var0.i(var6, var12, var8).pJ();
      var0.i(var8, var12, var8).pJ();
      var0.i(var8, var12, var2).pJ();
      var0.i(var2, var12, var2).pJ();
      var0.i(var2, var12, var8).pJ();
      .qk.pm().pn();
   }

   public static IntBuffer jg(int var0) {
      ByteBuffer var1 = cMF;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0 * 4);
      return var1.asIntBuffer();
   }

   public static int ajI() {
      return cIx[cFe * 2];
   }

   public static void ajJ() {
      q(cLU, cKv);
   }

   public static void jh(int var0) {
      GL11.glEnable(var0);
      nP();
   }

   public static void ajK() {
   }

   private static void ajL() {
      .ZJ var0 = cIE.ahX();
      if (var0 != null) {
         GL11.glViewport(0, 0, cKl, cJm);
      }

   }

   public static void afE() {
      ajg();
      if (cLo) {
         net.optifine.shaders.w.afE();
         net.optifine.shaders.f.afE();
         net.optifine.shaders.o.afE();
      }

   }

   private static void t(net.optifine.shaders.j var0) {
      int var1 = GL11.glGetInteger(34852);
      Arrays.fill(var0.aib(), false);
      if (var0 == cKX) {
         var0.e((IntBuffer)null);
      } else if (var0.B() == 0) {
         if (var0 == cHR) {
            var0.e(cHJ);
         } else {
            var0.e(cIY);
         }
      } else {
         String var2 = var0.ain();
         if (var2 == null) {
            if (var0 != cHR && var0 != cLI && var0 != cHX) {
               var0.e(cJH);
               cKR = cLT;
               Arrays.fill(var0.aib(), 0, cLT, true);
            } else {
               var0.e(cOb);
            }
         } else {
            IntBuffer var3 = var0.aic();
            int var4 = var2.length();
            cKR = Math.max(cKR, var4);
            var4 = Math.min(var4, var1);
            var0.e(var3);
            var3.limit(var4);

            for(int var5 = 0; var5 < var4; ++var5) {
               int var6 = q(var0, var2, var5);
               var3.put(var5, var6);
            }
         }
      }

   }

   public static InputStream fI(String var0) {
      return cKv == null ? null : cKv.fm(var0);
   }

   public static String w(.ZB var0) {
      // $FF: Couldn't be decompiled
   }

   public static void a(.No var0) {
      if (cJQ.aml()) {
         int var1 = p(var0);
         cJQ.ju(var1);
      }

   }

   private static void ajM() {
      cMd = G.Cr;
      cLG = G.BB;
      cKl = Math.round((float)cMd * cMu);
      cJm = Math.round((float)cLG * cMu);
      ajl();
   }

   private static void fJ(String var0) {
      G.BZ.iA().e(new .Oo(var0));
   }

   public static boolean ajN() {
      return !cNk || cKt.GL_NV_geometry_shader4;
   }

   public static void ji(int var0) {
      GL11.glEnable(var0);
      nQ();
   }

   private static void q(net.optifine.shaders.j var0, String var1, String var2, String var3) {
      fD(.u.q[478 & 2558]);
      int var4 = ARBShaderObjects.glCreateProgramObjectARB();
      fD(.u.q[5599 & 19455]);
      if (var4 != 0) {
         cIf = false;
         cGW = false;
         cJr = false;
         int var5 = q(var0, var1);
         int var6 = w(var0, var2);
         int var7 = e(var0, var3);
         fD(.u.q[-15873 & 479]);
         if (var5 == 0 && var6 == 0 && var7 == 0) {
            ARBShaderObjects.glDeleteObjectARB(var4);
            var4 = 0;
            var0.aij();
         } else {
            if (var5 != 0) {
               ARBShaderObjects.glAttachObjectARB(var4, var5);
               fD(.u.q[21984 & 994]);
            }

            if (var6 != 0) {
               ARBShaderObjects.glAttachObjectARB(var4, var6);
               fD(.u.q[-15390 & 3552]);
               if (cLa) {
                  ARBGeometryShader4.glProgramParameteriARB(var4, 36315, 4);
                  ARBGeometryShader4.glProgramParameteriARB(var4, 36316, 5);
                  ARBGeometryShader4.glProgramParameteriARB(var4, 36314, cKp);
                  fD(.u.q[-31759 & 489]);
               }

               cNk = true;
            }

            if (var7 != 0) {
               ARBShaderObjects.glAttachObjectARB(var4, var7);
               fD(.u.q[1512 & 6628]);
            }

            if (cIf) {
               ARBVertexShader.glBindAttribLocationARB(var4, cLe, .u.q[-15894 & 994]);
               fD(.u.q[1506 & 7138]);
            }

            if (cGW) {
               ARBVertexShader.glBindAttribLocationARB(var4, cKT, .u.q[6647 & 483]);
               fD(.u.q[16883 & 9187]);
            }

            if (cJr) {
               ARBVertexShader.glBindAttribLocationARB(var4, cIM, .u.q[17383 & -30236]);
               fD(.u.q[31204 & -31764]);
            }

            ARBShaderObjects.glLinkProgramARB(var4);
            if (GL20.glGetProgrami(var4, 35714) != 1) {
               net.optifine.shaders.x.ft(.u.q[8677 & 6647] + var4 + .w.q[6973 & 9142] + var0.bY() + .w.q[1279 & 2845]);
            }

            a(var4, var0.bY());
            if (var5 != 0) {
               ARBShaderObjects.glDetachObjectARB(var4, var5);
               ARBShaderObjects.glDeleteObjectARB(var5);
            }

            if (var6 != 0) {
               ARBShaderObjects.glDetachObjectARB(var4, var6);
               ARBShaderObjects.glDeleteObjectARB(var6);
            }

            if (var7 != 0) {
               ARBShaderObjects.glDetachObjectARB(var4, var7);
               ARBShaderObjects.glDeleteObjectARB(var7);
            }

            var0.iW(var4);
            var0.iU(var4);
            e(var0);
            ARBShaderObjects.glValidateProgramARB(var4);
            e(cJG);
            a(var4, var0.bY());
            int var8 = GL20.glGetProgrami(var4, 35715);
            if (var8 != 1) {
               String var9 = .q.q[6965 & 8759];
               fG(.u.q[27110 & -28178] + var9 + var0.bY() + var9);
               ARBShaderObjects.glDeleteObjectARB(var4);
               var4 = 0;
               var0.aij();
            }
         }
      }

   }

   public static net.optifine.shaders.j fo(String var0) {
      return cMN.fo(var0);
   }

   private static void ajO() {
      cOi.akQ();
      cJS.akQ();
      cKw.akQ();
      cIm.akQ();
      cNO.akQ();
      cHp.akQ();
      cJC.akQ();
      cNw.akQ();
      cJI.akQ();
      cIi.akQ();
      cIZ.akQ();
      cJZ.akQ();
      cHl.akQ();
      cIv.akQ();
      cIj.akQ();
      cLj.akQ();
      cIS.akQ();
      net.optifine.shaders.w.pK();
      net.optifine.shaders.f.pK();
      net.optifine.shaders.o.pK();
      cGT = null;

      for(int var0 = 0; var0 < cNF.length; ++var0) {
         net.optifine.shaders.j var1 = cNF[var0];
         var1.aii();
      }

      if (cKv != null) {
         net.optifine.shaders.w.q(cKv);
         net.optifine.shaders.f.q(cKv);
         net.optifine.shaders.o.q(cKv);
         String var4 = .u.q[8647 & -12914];

         try {
            InputStream var5 = cKv.fm(var4);
            if (var5 == null) {
               return;
            }

            var5 = .ZE.w(var5, var4);
            net.optifine.util.F var2 = new net.optifine.util.F();
            var2.load(var5);
            var5.close();
            cOi.r(var2);
            cJS.r(var2);
            cKw.r(var2);
            cIm.r(var2);
            cNO.r(var2);
            cHp.r(var2);
            cJC.r(var2);
            cJI.r(var2);
            cNw.r(var2);
            cIi.r(var2);
            cIZ.r(var2);
            cJZ.r(var2);
            cHl.r(var2);
            cIv.r(var2);
            cIj.r(var2);
            cLj.r(var2);
            cIS.r(var2);
            cMg = .ZY.q(var2, cLU);
            cJq = .ZY.e(var2, cLU);
            cLx = .ZY.q(var2, cJq, cLU);
            cJf = .ZY.w(var2, cLU);
            cIU = w(var2, 0);
            cLn = w(var2, 1);
            cLN = w(var2, 2);
            cOe = var2.getProperty(.u.q[-32369 & 455]);
            if (cOe != null) {
               cNe = true;
            }

            cGT = .ZY.o(var2);
            .ZY.t(var2);
            .ZY.u(var2);
            .ZY.i(var2);
            .ZY.y(var2);
         } catch (IOException var3) {
            .MV.cJ(.u.q[905 & 4492] + var4);
         }
      }

   }

   public static void ajP() {
      e(cKr);
   }

   private static void q(net.optifine.shaders.j[] var0, boolean var1) {
      if (!cOf) {
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, 0.0D, 1.0D);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         .pz.nP();
         .pz.nB();
         .pz.nz();
         .pz.ob();
         .pz.bR(519);
         .pz.O(false);
         .pz.nx();
         if (cJy >= 1) {
            .pz.bQ(33988);
            .pz.bW(cNq.get(0));
            if (cJy >= 2) {
               .pz.bQ(33989);
               .pz.bW(cNq.get(1));
            }
         }

         for(int var2 = 0; var2 < cLT; ++var2) {
            .pz.bQ('蓀' + cHt[var2]);
            .pz.bW(cKg.iO(var2));
         }

         .pz.bQ(33990);
         .pz.bW(cKA.get(0));
         if (cIs >= 2) {
            .pz.bQ(33995);
            .pz.bW(cKA.get(1));
            if (cIs >= 3) {
               .pz.bQ(33996);
               .pz.bW(cKA.get(2));
            }
         }

         for(int var5 = 0; var5 < cLS; ++var5) {
            .pz.bQ('蓍' + var5);
            .pz.bW(cLs.get(var5));
         }

         if (cNe) {
            .pz.bQ('蓀' + cIb.ahQ());
            .pz.bW(cIb.ahR());
         }

         if (var1) {
            q(cLn);
         } else {
            q(cLN);
         }

         .pz.bQ(33984);

         for(int var6 = 0; var6 < cLT; ++var6) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var6, 3553, cKg.iP(var6), 0);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, cKA.get(0), 0);
         GL20.glDrawBuffers(cJH);
         fD(.u.q[17245 & 9838]);

         for(int var7 = 0; var7 < var0.length; ++var7) {
            net.optifine.shaders.j var3 = var0[var7];
            if (var3.B() != 0) {
               e(var3);
               fD(var3.bY());
               if (cLM != 0) {
                  aiW();
               }

               aiY();
               aiH();
               ajL();

               for(int var4 = 0; var4 < cLT; ++var4) {
                  if (var3.aib()[var4]) {
                     cKg.iR(var4);
                     .pz.bQ('蓀' + cHt[var4]);
                     .pz.bW(cKg.iO(var4));
                     EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var4, 3553, cKg.iP(var4), 0);
                  }
               }

               .pz.bQ(33984);
            }
         }

         fD(.t.q[19070 & 631]);
         if (var1) {
            aja();
            cNA = true;
         }

         .pz.oe();
         .pz.nP();
         .pz.hT();
         .pz.nX();
         .pz.bR(515);
         .pz.O(true);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         e(cJG);
      }

   }

   public static void jj(int var0) {
      GL11.glEnable(var0);
      if (var0 == 3553) {
         nP();
      } else if (var0 == 2912) {
         nQ();
      }

   }

   public static boolean ajQ() {
      return !cHp.akY();
   }

   public static void bG(float var0) {
      .zk var1 = G.gj();
      double var2 = var1.aOD + (var1.aNZ - var1.aOD) * (double)var0;
      double var4 = var1.aNE + (var1.aNK - var1.aNE) * (double)var0;
      double var6 = var1.aOC + (var1.aOt - var1.aOC) * (double)var0;
      aj(var1);
      cKL = var2 - (double)cMv;
      cMG = var4;
      cLA = var6 - (double)cNG;
      GL11.glGetFloat(2983, (FloatBuffer)cNU.position(0));
      net.optifine.shaders.c.q((FloatBuffer)cLi.position(0), (FloatBuffer)cNU.position(0), cHc, cMr);
      cNU.position(0);
      cLi.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)cHe.position(0));
      net.optifine.shaders.c.q((FloatBuffer)cII.position(0), (FloatBuffer)cHe.position(0), cJW, cLQ);
      cHe.position(0);
      cII.position(0);
      fD(.u.q[583 & -26009]);
   }

   public static int B(String var0, int var1) {
      String var2 = var0 != null ? .t.q[-26828 & 9120] + var0 : .w.q[17000 & 5998];
      if (cLx == null) {
         return var1;
      } else {
         .ZK var3 = (.ZK)cLx.get(var2);
         return var3 == null ? var1 : var3.ald();
      }
   }

   public static void ajR() {
      FloatBuffer var0 = cMi;
      var0.clear();
      GL11.glGetFloat(2982, var0);
      var0.get(cMo, 0, 16);
      net.optifine.shaders.c.e(cNS, cMo, cIl);
      q(cIq, cNS[0], cNS[1], cNS[2]);
      if (cGT != null) {
         cGT.aW();
      }

   }

   private static void ajS() {
      cKP = false;
      cNz = Math.round((float)cNP * cMC);
      cMb = Math.round((float)cJO * cMC);
      ajp();
   }

   public static void jk(int var0) {
      cHL = var0;
      if (cGU) {
         q(cKK, var0);
      }

   }

   public static void w(int var0, float var1, long var2) {
      if (!cOf) {
         EXTFramebufferObject.glBindFramebufferEXT(36160, cHd);
         GL11.glViewport(0, 0, cKl, cJm);
         cMm = null;
         net.optifine.shaders.I.w(cGR.rH());
         e(cMp);
         fD(.u.q[5698 & 17139]);
      }

   }

   public static void ajT() {
      aiD();
   }

   public static boolean ajU() {
      return cML;
   }

   public static boolean ajV() {
      return !cJs.afN() ? cJs.akZ() : cIm.afN() || cIm.akZ();
   }

   public static void ajW() {
      if (cIp) {
         fD(.u.q[8743 & 1575]);

         for(int var0 = 0; var0 < cNF.length; ++var0) {
            net.optifine.shaders.j var1 = cNF[var0];
            if (var1.aia() != 0) {
               ARBShaderObjects.glDeleteObjectARB(var1.aia());
               fD(.u.q[827 & -31124]);
            }

            var1.iU(0);
            var1.iW(0);
            var1.fn((String)null);
            var1.e((IntBuffer)null);
            var1.iV(0);
         }

         cNb = false;
         if (cHd != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(cHd);
            cHd = 0;
            fD(.u.q[10093 & 16939]);
         }

         if (cMT != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(cMT);
            cMT = 0;
            fD(.u.q[13290 & 574]);
         }

         if (cKA != null) {
            .pz.q(cKA);
            r(cKA);
            fD(.u.q[555 & 747]);
         }

         if (cHC != null) {
            .pz.q(cHC);
            r(cHC);
            fD(.u.q[686 & 1644]);
         }

         if (cNq != null) {
            .pz.q(cNq);
            r(cNq);
            fD(.u.q[2861 & 9853]);
         }

         if (cLs != null) {
            .pz.q(cLs);
            r(cLs);
            fD(.u.q[-28882 & 4783]);
         }

         if (cJH != null) {
            r(cJH);
         }

         if (cIb != null) {
            cIb.ahS();
            cIb = null;
         }

         net.optifine.shaders.x.fv(.u.q[4847 & -15809]);
         cMP = 0;
         cKF = false;
         cIp = false;
         fD(.u.q[17076 & -31942]);
      }

   }

   public static void jl(int var0) {
      ++cFe;
      cIx[cFe * 2] = var0 & '\uffff';
      cIx[cFe * 2 + 1] = 0;
   }

   public static void g(float var0, float var1, float var2, float var3) {
      .pz.y(var0, var1, var2, var3);
      cNE = var0;
      cIg = var1;
      cNH = var2;
   }

   public static void ajX() {
      if (cLF) {
         cLr = true;
      }

   }

   public static void ajY() {
      if (cLF) {
         ai((.zk)null);
         e(cKe ? cKr : cMp);
      }

   }

   private static int e(net.optifine.shaders.j var0, String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(35632);
      if (var2 == 0) {
         return 0;
      } else {
         StringBuilder var3 = new StringBuilder(131072);
         BufferedReader var4 = null;

         try {
            var4 = new BufferedReader(fF(var1));
         } catch (Exception var14) {
            ARBShaderObjects.glDeleteObjectARB(var2);
            return 0;
         }

         .ZP[] var5 = q(cLU);
         ArrayList var6 = new ArrayList();
         if (var4 != null) {
            try {
               var4 = .ZY.q(var4, var1, cKv, 0, var6, 0);
               .ZF var7 = new .ZF();

               while(true) {
                  String var8 = var4.readLine();
                  if (var8 == null) {
                     var4.close();
                     break;
                  }

                  var8 = w(var8, var5);
                  var3.append(var8).append('\n');
                  if (var7.fO(var8)) {
                     .ZL var9 = .aaa.gr(var8);
                     if (var9 != null) {
                        if (var9.ale()) {
                           String var24 = var9.bY();
                           int var28;
                           if ((var28 = .aaa.gq(var24)) >= 0) {
                              cJy = Math.max(cJy, var28 + 1);
                           } else if ((var28 = .aaa.gt(var24)) >= 0) {
                              cLS = Math.max(cLS, var28 + 1);
                           } else if ((var28 = .aaa.gw(var24)) >= 0) {
                              cIs = Math.max(cIs, var28 + 1);
                           } else if (var24.equals(.y.q[255 & 20655]) && cMt[1] == 6408) {
                              cMt[1] = 34836;
                           } else if ((var28 = .aaa.gv(var24)) >= 0) {
                              cLT = Math.max(cLT, var28 + 1);
                           } else if (var24.equals(.y.q[13566 & -30490])) {
                              cLO = true;
                           }
                        } else if (!var9.fR(.t.q[24299 & -23831]) && !var9.ga(.u.q[4593 & 2551])) {
                           if (!var9.fV(.t.q[11242 & 4858]) && !var9.ga(.u.q[-11790 & 10738])) {
                              if (!var9.fV(.t.q[7151 & 763]) && !var9.ga(.u.q[499 & -8205])) {
                                 if (var9.fV(.t.q[1772 & -29716])) {
                                    cMw = var9.alk();
                                    net.optifine.shaders.x.fv(.u.q[18942 & -31755] + cMw);
                                 } else if (var9.fV(.t.q[4845 & 749])) {
                                    cHw = var9.alk();
                                    net.optifine.shaders.x.fv(.u.q[21493 & 10749] + cHw);
                                 } else if (var9.h(.t.q[8190 & 750], true)) {
                                    Arrays.fill(cJz, true);
                                    net.optifine.shaders.x.fv(.u.q[511 & -30218]);
                                 } else if (var9.h(.t.q[1791 & -5137], true)) {
                                    Arrays.fill(cJa, true);
                                    net.optifine.shaders.x.fv(.u.q[-27137 & 2551]);
                                 } else if (var9.h(.t.q[753 & 22268], true)) {
                                    Arrays.fill(cKB, true);
                                    net.optifine.shaders.x.fv(.u.q[505 & 18940]);
                                 } else if (var9.h(.t.q[9201 & -25861], true)) {
                                    cKB[0] = true;
                                    net.optifine.shaders.x.fv(.t.q[-32005 & 4853]);
                                 } else if (var9.h(.t.q[17146 & 3059], true)) {
                                    cKB[1] = true;
                                    net.optifine.shaders.x.fv(.t.q[762 & -13326]);
                                 } else if (var9.q(.t.q[1779 & -7437], .t.q[-27914 & 20212], true)) {
                                    cJz[0] = true;
                                    net.optifine.shaders.x.fv(.t.q[4851 & -28933]);
                                 } else if (var9.h(.t.q[12021 & 1023], true)) {
                                    cJz[1] = true;
                                    net.optifine.shaders.x.fv(.t.q[4855 & -29955]);
                                 } else if (var9.q(.t.q[19198 & 758], .t.q[-7433 & 5879], true)) {
                                    cJa[0] = true;
                                    net.optifine.shaders.x.fv(.t.q[1782 & 19190]);
                                 } else if (var9.q(.t.q[7934 & 8952], .t.q[-11523 & 11259], true)) {
                                    cJa[1] = true;
                                    net.optifine.shaders.x.fv(.t.q[-31746 & 11001]);
                                 } else if (var9.q(.t.q[4858 & 2815], .t.q[4859 & 28667], .t.q[-26628 & 8956], true)) {
                                    cHj[0] = true;
                                    net.optifine.shaders.x.fv(.t.q[8958 & 2042]);
                                 } else if (var9.q(.t.q[19453 & 5885], .t.q[-13569 & 1790], true)) {
                                    cHj[1] = true;
                                    net.optifine.shaders.x.fv(.t.q[17405 & 4861]);
                                 } else if (var9.q(.t.q[-23553 & 5887], .t.q[8994 & 20224], .t.q[10113 & 2915], true)) {
                                    cJu[0] = true;
                                    net.optifine.shaders.x.fv(.t.q[19455 & 8959]);
                                 } else if (var9.q(.t.q[21410 & 9998], .t.q[-23741 & 1923], .t.q[-27834 & 18212], true)) {
                                    cJu[1] = true;
                                    net.optifine.shaders.x.fv(.t.q[25387 & 3970]);
                                 } else if (!var9.fV(.t.q[6981 & 1797]) && !var9.ga(.u.q[2557 & 1529])) {
                                    if (!var9.fV(.t.q[-12521 & 4934]) && !var9.ga(.u.q[16894 & 2043])) {
                                       if (var9.fV(.t.q[-29945 & 13079])) {
                                          cHP = var9.alk();
                                          net.optifine.shaders.x.fv(.u.q[-15365 & 511] + cHP);
                                       } else if (var9.fV(.t.q[1928 & 810])) {
                                          cKx = var9.alk();
                                          net.optifine.shaders.x.fv(.u.q[508 & 2558] + cKx);
                                       } else if (var9.fV(.t.q[793 & 24427])) {
                                          cJo = var9.alk();
                                          net.optifine.shaders.x.fv(.u.q[2557 & -11777] + cJo);
                                       } else if (var9.fV(.t.q[5034 & 1882])) {
                                          cLu = .MV.c(var9.alk(), 0.0F, 1.0F);
                                          net.optifine.shaders.x.fv(.u.q[510 & -6146] + cLu);
                                       } else if (var9.fR(.t.q[-30805 & 863])) {
                                          int var23 = var9.aln();
                                          if (var23 > 1) {
                                             net.optifine.shaders.x.fv(.u.q[4607 & 8703] + var23 + .q.q[11387 & 20947]);
                                             cIJ = var23;
                                          } else {
                                             cIJ = 1;
                                          }
                                       } else if (var9.fR(.t.q[-31890 & 17180])) {
                                          cKS = var9.aln();
                                          cNe = true;
                                          net.optifine.shaders.x.fv(.u.q[2572 & 17201]);
                                          net.optifine.shaders.x.fv(.u.q[1009 & 521] + cKS);
                                       } else if (var9.fS(.u.q[2626 & 13834])) {
                                          String var22 = net.optifine.util.J.P(var9.bY(), .u.q[4690 & 514]);
                                          String var27 = var9.wx();
                                          int var34 = fy(var22);
                                          int var13 = fC(var27);
                                          if (var34 >= 0 && var13 != 0) {
                                             cMt[var34] = var13;
                                             net.optifine.shaders.x.t(.u.q[-31981 & 527], var22, var27);
                                          }
                                       } else if (var9.g(.u.q[8964 & -10611], false)) {
                                          if (.aaa.gu(var1) || .aaa.gp(var1)) {
                                             String var21 = net.optifine.util.J.P(var9.bY(), .u.q[-15610 & 5636]);
                                             int var26 = fy(var21);
                                             if (var26 >= 0) {
                                                cHS[var26] = false;
                                                net.optifine.shaders.x.t(.u.q[-27875 & 9765], var21);
                                             }
                                          }
                                       } else if (var9.fT(.u.q[17166 & 1575])) {
                                          if (.aaa.gu(var1) || .aaa.gp(var1)) {
                                             String var20 = net.optifine.util.J.P(var9.bY(), .u.q[19102 & 1574]);
                                             int var25 = fy(var20);
                                             if (var25 >= 0) {
                                                Vector4f var33 = var9.ali();
                                                if (var33 != null) {
                                                   cHF[var25] = var33;
                                                   net.optifine.shaders.x.t(.u.q[663 & 9735], var20, var33.getX(), var33.getY(), var33.getZ(), var33.getW());
                                                } else {
                                                   net.optifine.shaders.x.fu(.u.q[-14584 & 527] + var9.wx());
                                                }
                                             }
                                          }
                                       } else if (var9.D(.u.q[5789 & 841], .u.q[6666 & 17386])) {
                                          cMt[7] = 34836;
                                          net.optifine.shaders.x.fv(.u.q[587 & 1547]);
                                       } else if (var9.D(.u.q[13833 & -15847], .u.q[21054 & 8717])) {
                                          cMt[7] = 34837;
                                          net.optifine.shaders.x.fv(.u.q[8989 & 18127]);
                                       } else if (var9.D(.u.q[523 & -32151], .u.q[-21874 & 4910])) {
                                          cMt[7] = 32852;
                                          net.optifine.shaders.x.fv(.u.q[-13745 & 10159]);
                                       } else if (var9.g(.u.q[2768 & 16914], true)) {
                                          if (.aaa.gu(var1) || .aaa.gp(var1) || .aaa.go(var1)) {
                                             String var19 = net.optifine.util.J.P(var9.bY(), .u.q[2836 & 657]);
                                             int var11 = fy(var19);
                                             if (var11 >= 0) {
                                                int var12 = var0.aih();
                                                var12 = var12 | 1 << var11;
                                                var0.iV(var12);
                                                net.optifine.shaders.x.t(.u.q[1589 & 17169], var19);
                                             }
                                          }
                                       } else if (var9.ga(.u.q[1558 & 659])) {
                                          String var10 = var9.wx();
                                          if (.aaa.gs(var10)) {
                                             var0.fn(var10);
                                          } else {
                                             net.optifine.shaders.x.fu(.u.q[575 & 9107] + var10);
                                          }
                                       }
                                    } else {
                                       cLl = var9.alk();
                                       net.optifine.shaders.x.fv(.u.q[532 & 19318] + cLl);
                                    }
                                 } else {
                                    cNt = var9.alk();
                                    net.optifine.shaders.x.fv(.u.q[-32203 & 661] + cNt);
                                 }
                              } else {
                                 cJi = var9.alk();
                                 cJn = true;
                                 net.optifine.shaders.x.fv(.u.q[2591 & 1750] + cJi);
                              }
                           } else {
                              cMa = var9.alk();
                              cJn = false;
                              net.optifine.shaders.x.fv(.u.q[671 & 27223] + cMa);
                           }
                        } else {
                           cNP = cJO = var9.aln();
                           cNz = cMb = Math.round((float)cNP * cMC);
                           net.optifine.shaders.x.fv(.u.q[4637 & 3034] + cNP);
                        }
                     }
                  }
               }
            } catch (Exception var15) {
               net.optifine.shaders.x.ft(.u.q[17913 & -25619] + var1 + .w.q[-31818 & 18740]);
               var15.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var2);
               return 0;
            }
         }

         if (cKs) {
            B(var1, var3.toString());
         }

         ARBShaderObjects.glShaderSourceARB(var2, var3);
         ARBShaderObjects.glCompileShaderARB(var2);
         if (GL20.glGetShaderi(var2, 35713) != 1) {
            net.optifine.shaders.x.ft(.u.q[4699 & -12515] + var1);
         }

         q(var2, var1, var6);
         return var2;
      }
   }

   private static net.optifine.shaders.s[] w(Properties var0, int var1) {
      String var2 = .q.q[-29809 & 16926] + cMO[var1] + .q.q[3683 & -15913];
      Set var3 = var0.keySet();
      ArrayList var4 = new ArrayList();

      for(Object var6 : var3) {
         String var7 = (String)var6;
         if (var7.startsWith(var2)) {
            String var8 = net.optifine.util.J.Q(var7, var2);
            var8 = net.optifine.util.J.t(var8, new String[]{.u.q[-27655 & 393], .u.q[9690 & -9814], .u.q[17835 & -24177], .u.q[6606 & 428], .u.q[-32353 & 27021], .u.q[398 & -28194], .u.q[-15409 & 447], .u.q[979 & 12688], .u.q[2005 & -15981], .u.q[8598 & 6554]});
            String var9 = var0.getProperty(var7).trim();
            int var10 = i(var1, var8);
            if (var10 < 0) {
               net.optifine.shaders.x.fu(.u.q[9619 & 951] + var7);
            } else {
               net.optifine.shaders.s var11 = o(var10, var9);
               if (var11 != null) {
                  net.optifine.shaders.x.fv(.u.q[10644 & 404] + var7 + .w.q[543 & 575] + var9);
                  var4.add(var11);
               }
            }
         }
      }

      if (var4.size() <= 0) {
         return null;
      } else {
         net.optifine.shaders.s[] var12 = (net.optifine.shaders.s[])var4.toArray(new net.optifine.shaders.s[var4.size()]);
         return var12;
      }
   }

   public static boolean ajZ() {
      return cMf;
   }

   public static void aka() {
      if (cIs >= 2) {
         .pz.bQ(33995);
         fD(.u.q[6907 & -15527]);
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, cKl, cJm);
         fD(.u.q[-23714 & 731]);
         .pz.bQ(33984);
      }

      net.optifine.shaders.I.w(cGR.rH());
   }

   public static void akb() {
      if (!cOf) {
         y(cJL);
         fD(.u.q[16991 & -22837]);
         q(cHH, true);
      }

   }

   private static void q(.ZB var0, String var1) {
      // $FF: Couldn't be decompiled
   }

   private static FloatBuffer jm(int var0) {
      ByteBuffer var1 = cMF;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0 * 4);
      return var1.asFloatBuffer();
   }

   public static void akc() {
      cKP = true;
   }

   private static int q(net.optifine.shaders.j var0, String var1, int var2) {
      int var3 = 0;
      if (var2 >= var1.length()) {
         return var3;
      } else {
         int var4 = var1.charAt(var2) - 48;
         if (var0 == cHR) {
            if (var4 >= 0 && var4 <= 1) {
               var3 = var4 + '賠';
               cLS = Math.max(cLS, var4);
            }

            return var3;
         } else {
            if (var4 >= 0 && var4 <= 7) {
               var0.aib()[var4] = true;
               var3 = var4 + '賠';
               cNi = Math.max(cNi, var4);
               cLT = Math.max(cLT, var4);
            }

            return var3;
         }
      }
   }

   private static .ZP[] w(.ZP[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         .ZP var3 = var0[var2];
         if (var3.alz()) {
            var1.add(var3);
         }
      }

      .ZP[] var4 = (.ZP[])var1.toArray(new .ZP[var1.size()]);
      return var4;
   }

   public static boolean akd() {
      return !cIS.akY();
   }

   public static .ZP[] ake() {
      return cLU;
   }

   public static net.optifine.shaders.d akf() {
      return cKv;
   }

   public static ArrayList akg() {
      ArrayList var0 = new ArrayList();
      var0.add(.q.q[2978 & 2042]);
      var0.add(.u.q[21969 & 10627]);
      int var1 = var0.size();

      try {
         if (!cIo.exists()) {
            cIo.mkdir();
         }

         File[] var2 = cIo.listFiles();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            File var4 = var2[var3];
            String var5 = var4.getName();
            if (var4.isDirectory()) {
               if (!var5.equals(.u.q[454 & 20892])) {
                  File var6 = new File(var4, .u.q[491 & 6059]);
                  if (var6.exists() && var6.isDirectory()) {
                     var0.add(var5);
                  }
               }
            } else if (var4.isFile() && var5.toLowerCase().endsWith(.q.q[-16145 & 431])) {
               var0.add(var5);
            }
         }
      } catch (Exception var7) {
         ;
      }

      List var8 = var0.subList(var1, var0.size());
      Collections.sort(var8, String.CASE_INSENSITIVE_ORDER);
      return var0;
   }

   public static void akh() {
      if (cLF) {
         net.optifine.shaders.I.q(cGR);
         if (!cOf) {
            e(cIY);
         }
      }

   }

   public static boolean aki() {
      return cLj.akZ();
   }

   public static void akj() {
      if (cLF) {
         e(cLq);
      }

   }

   public static void h(float var0, float var1, float var2, float var3) {
      if (cLF && !cOf) {
         cNn.j(var0, var1, var2, var3);
      }

   }

   public static int jn(int var0) {
      cIx[cFe * 2] = cIx[cFe * 2] & '\uffff' | var0 << 16;
      return var0;
   }

   public static void akk() {
      if (cLF) {
         e(cHs);
      }

   }

   public static void akl() {
      fD(.u.q[6739 & 8927]);
      fH(.u.q[-30117 & 13011]);
      if (!cOf) {
         e(cMK);
      }

      fD(.u.q[884 & 21213]);
      fH(.u.q[-11683 & 3796]);
   }

   private static void w(net.optifine.shaders.j var0, net.optifine.shaders.j var1) {
      if (var0.ahZ() != null) {
         .pz.of();
      }

      if (var0.aik() != null) {
         .pz.ny();
      }

      .Zw var2 = var1.ahZ();
      if (var2 != null) {
         .pz.q(var2);
      }

      .Zx var3 = var1.aik();
      if (var3 != null) {
         .pz.e(var3);
      }

   }

   private static void w(net.optifine.shaders.s[] var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            net.optifine.shaders.s var2 = var0[var1];
            var2.ahS();
         }
      }

   }

   public static void akm() {
      if (cLF && cOg.B() != cJG.B()) {
         e(cOg);
         .pz.hT();
         .pz.t(516, 0.0F);
         .pz.P(770, 771);
      }

   }

   public static net.optifine.shaders.d fK(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         if (!var0.isEmpty() && !var0.equals(.q.q[25507 & -29774])) {
            if (var0.equals(.u.q[20869 & -32271])) {
               return new net.optifine.shaders.m();
            } else {
               try {
                  File var1 = new File(cIo, var0);
                  return (net.optifine.shaders.d)(var1.isDirectory() ? new net.optifine.shaders.A(var0, var1) : (var1.isFile() && var0.toLowerCase().endsWith(.q.q[-24337 & 21679]) ? new net.optifine.shaders.C(var0, var1) : null));
               } catch (Exception var2) {
                  var2.printStackTrace();
                  return null;
               }
            }
         } else {
            return null;
         }
      }
   }

   private static boolean y(net.optifine.shaders.j var0) {
      boolean var1 = false;
      Boolean[] var2 = var0.ahY();

      for(int var3 = 0; var3 < cLT; ++var3) {
         if (.MV.w(var2[var3])) {
            cKg.iR(var3);
            var1 = true;
         }
      }

      return var1;
   }

   public static void aC(.GX var0) {
      cLY = aA(var0);
   }

   public static void akn() {
      cGU = true;
      bH(-3, 0);
      e(cMx);
   }

   public static .QI ako() {
      return bZJ;
   }

   public static void akp() {
      boolean var0 = cLo;
      boolean var1 = ajV();
      if (G.Cv != null) {
         G.Cv.ph();
      }

      cLo = false;
      if (cKv != null) {
         cKv.close();
         cKv = null;
         cLp.clear();
         cNf.clear();
         cLU = null;
         cMg = null;
         cJq = null;
         cLx = null;
         cJf.clear();
         cOi.akQ();
         cJS.akQ();
         cKw.akQ();
         cIm.akQ();
         aks();
         cOe = null;
      }

      boolean var2 = false;
      if (.MV.QW()) {
         net.optifine.shaders.x.fv(.u.q[-29826 & 21887] + .MV.Sy() + .q.q[347 & 18547]);
         var2 = true;
      }

      if (.MV.Rc()) {
         net.optifine.shaders.x.fv(.u.q[-32385 & 10111] + .MV.RY() + .q.q[479 & 2131]);
         var2 = true;
      }

      if (.MV.Rz()) {
         net.optifine.shaders.x.fv(.u.q[950 & -23167]);
         var2 = true;
      }

      String var3 = cKO.getProperty(.ZB.cOI.akM(), .u.q[10627 & 18373]);
      if (!var2) {
         cKv = fK(var3);
         cLo = cKv != null;
      }

      if (cLo) {
         net.optifine.shaders.x.fv(.u.q[16859 & 902] + ajy());
      } else {
         net.optifine.shaders.x.fv(.u.q[13711 & -31869]);
         cKv = new net.optifine.shaders.B();
      }

      if (cKs) {
         o(new File(cIo, .u.q[388 & 10661]));
      }

      ajg();
      ajG();
      cLU = aju();
      ajO();
      boolean var4 = cLo != var0;
      boolean var5 = ajV() != var1;
      if (var4 || var5) {
         .us.sM();
         aiM();
      }

      if (G.fV() != null) {
         .Xe.aW();
      }

      if (G.Cv != null) {
         G.Cv.oE();
      }

      if ((var4 || var5) && G.fF() != null) {
         G.fG();
      }

   }

   public static void akq() {
      if (cLF) {
         e(cMS);
      }

   }

   public static boolean akr() {
      return cML && cHz;
   }

   public static void afs() {
      if (cOf) {
         fD(.u.q[16975 & 11215]);
      } else {
         if (!cNA) {
            akb();
         }

         cLF = false;
         .pz.q(true, true, true, true);
         e(cJG);
         .qh.pj();
         fD(.u.q[3920 & 4856]);
      }

   }

   private static void aks() {
      w(cIU);
      w(cLn);
      w(cLN);
      cIU = null;
      cLn = null;
      cLN = null;
   }
}
