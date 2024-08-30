import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class vL {
   public boolean aCg;
   private static final String[] aCh = new String[]{e.q[1497 & 4593], y.q[28673 & 615], y.q[22786 & 1131]};
   public boolean aCi;
   public boolean ru = true;
   public float aCj;
   public boolean aCk;
   public boolean aCl;
   public int aCm;
   public final vP aCn;
   public int aCo;
   public vP aCp;
   public vP aCq;
   public int aCr;
   public boolean aCs;
   public boolean aCt;
   public vP aCu;
   public boolean aCv;
   private static final String[] aCw = new String[]{e.q[2005 & 4571], y.q[4643 & -15351], y.q[22538 & -32410]};
   public boolean aCx;
   public float aCy = 0.44366196F;
   public boolean aCz = true;
   public boolean aCA = true;
   public boolean aCB;
   public boolean aCC;
   public boolean aCD = false;
   public Qr aCE;
   public boolean aCF;
   public boolean aCG;
   public boolean aCH;
   public boolean aCI = false;
   public float aCJ;
   public int aCK;
   public vP aCL;
   public boolean aCM;
   private static final Logger aCN = LogManager.getLogger();
   public boolean aCO;
   public vP aCP;
   public vP[] aCQ;
   public hS G;
   private final Map aCR = Maps.newEnumMap(iv.class);
   public int aCS;
   public boolean aCT;
   public vP aCU;
   public boolean aCV;
   public vP aCW;
   public int aCX;
   public boolean aCY;
   public boolean aCZ;
   private static final Gson aDa = new Gson();
   public boolean aex;
   public float aDb;
   public static final int aDc = 0;
   private static final String[] aDd = new String[]{p.q[17374 & -31769], p.q[7111 & 10223], p.q[25545 & 1992], p.q[-28725 & 17385]};
   public boolean aDe = true;
   public boolean aDf;
   public vP aDg;
   public boolean aDh;
   public boolean aDi;
   private static final String[] aDj = new String[]{p.q[986 & 18414], p.q[1003 & -26661], p.q[3053 & 18398]};
   public float aDk = 1.0F;
   public int aDl = 2;
   public boolean aDm;
   public boolean aDn = true;
   public boolean aDo;
   public vP aDp;
   public float aDq;
   public vP aDr;
   public boolean aDs;
   public int aDt;
   public float aDu = 1.0F;
   public List aDv = Lists.newArrayList();
   private static final ParameterizedType aDw = new vM();
   public int aDx;
   public float aDy = 1.0F;
   public float aDz = 0.5412844F;
   public boolean aDA;
   public final vP aDB;
   public boolean aDC;
   public boolean aDD;
   public float aDE = 0.31690142F;
   public boolean aDF;
   public int aDG = 2;
   public boolean aDH = true;
   public boolean aDI = true;
   public int aDJ;
   public int aDK;
   public String aDL;
   public vP aDM;
   public vP aDN;
   public vP[] aDO;
   public int aDP;
   private static final int[] aDQ = new int[]{0, 1, 4, 2};
   public boolean aDR;
   public vP aDS;
   public vP aDT;
   public vP aDU;
   public float aDV = 0.5F;
   public vP aDW;
   public boolean aDX;
   public vP aDY;
   public boolean aDZ;
   public final vP aEa;
   public int avj = 4;
   public boolean aEb;
   public int aEc;
   public int aEd;
   public boolean aEe;
   public int aEf;
   public vP aEg;
   public boolean aEh;
   public boolean aEi = true;
   public boolean aEj;
   private File aEk;
   public boolean aEl;
   public boolean aEm;
   private final Set aEn = Sets.newHashSet(DI.values());
   public int aEo;
   public List ayS = Lists.newArrayList();
   public int aEp;
   public final vP aEq;
   public int aEr = 1;
   public int aEs;
   public boolean aEt;
   public vP aEu;
   public boolean aEv;
   public vP aEw;
   public boolean aEx;
   public final vP aEy;
   public final vP aEz;
   public boolean aEA;
   public boolean aEB;
   public String aEC;
   public String aED;
   public boolean aEE;
   public int ajy = -1;
   public static final int aEF = 3;
   public float aEG = 1.0F;
   public float aEH = 1.0F;
   public boolean aEI;
   public float aEJ;
   public int aEK;
   public boolean aEL;
   public boolean aEM;
   public float aEN;
   public vP aEO;
   public String aEP;
   public boolean aEQ;
   public boolean aER;
   public int aES;
   public final vP aET;
   public boolean aEU;
   public vP aEV;
   public boolean aEW;
   public boolean aEX;
   public boolean aEY;
   public boolean aEZ = true;
   public boolean aFa = true;
   public int aFb;
   private static final String[] aFc = new String[]{p.q[-31793 & 17389], p.q[-25650 & 974], p.q[3023 & -27697]};
   public boolean aFd;
   public vP aFe;
   public int aFf;
   public int aFg;
   public float aFh = 0.5F;
   public boolean aFi;
   public vP aFj;
   public int aFk;
   public boolean aFl = true;
   private File aFm;
   public int aFn;
   public vP aFo;
   public boolean aFp;
   public boolean aFq = true;
   public int aFr;
   public int aFs;
   public DF aFt = DF.bev;
   public int aFu = 120;
   public boolean aFv;
   public boolean aFw;
   public int aFx;
   public boolean aFy;
   public float aFz = 1.0F;
   public boolean aFA;
   public boolean aFB;
   private static final int[] aFC = new int[]{3, 1, 2};
   public boolean aFD;

   public float q(vO var1) {
      float var2 = this.e(var1);
      return var2 != Float.MAX_VALUE ? var2 : (var1 == vO.aFH ? this.aEN : (var1 == vO.aFI ? this.aCj : (var1 == vO.aFJ ? this.aDq : (var1 == vO.aFG ? this.aDV : (var1 == vO.aFX ? this.aFz : (var1 == vO.aGg ? this.aDy : (var1 == vO.aGh ? this.aCy : (var1 == vO.aGe ? this.aEG : (var1 == vO.aGf ? this.aDk : (var1 == vO.aFN ? (float)this.aFu : (var1 == vO.aGi ? (float)this.avj : (var1 == vO.aFK ? (float)this.ajy : 0.0F))))))))))));
   }

   public float r(iv var1) {
      return this.aCR.containsKey(var1) ? ((Float)this.aCR.get(var1)).floatValue() : 1.0F;
   }

   public vL() {
      this.aED = q.q[256 & 25089];
      this.aEd = 0;
      this.aFx = 0;
      this.aCX = 0;
      this.aEU = true;
      this.aFy = true;
      this.aET = new vP(p.q[18278 & -21769], 48, o.q[639 & 631]);
      this.aDB = new vP(p.q[8807 & 615], 54, o.q[1911 & -32129]);
      this.aEa = new vP(p.q[-23959 & 2936], 184, o.q[2679 & 17015]);
      this.aCn = new vP(p.q[13165 & 761], 56, o.q[1655 & 2679]);
      this.aEq = new vP(p.q[618 & 8810], 50, o.q[-28041 & 19447]);
      this.aEz = new vP(p.q[619 & 4987], 49, o.q[8831 & -30089]);
      this.aEy = new vP(p.q[9069 & 764], 0, o.q[631 & -19849]);
      this.aDU = new vP(p.q[1645 & 17023], 17, p.q[1022 & 4718]);
      this.aCp = new vP(p.q[1647 & 23167], 30, p.q[8814 & 17134]);
      this.aDr = new vP(p.q[8823 & 2800], 31, p.q[4718 & 895]);
      this.aEO = new vP(p.q[625 & 13049], 32, p.q[-23953 & 18174]);
      this.aDg = new vP(p.q[626 & 4979], 57, p.q[-13713 & 1918]);
      this.aEw = new vP(p.q[-23949 & 2931], 42, p.q[10862 & -32146]);
      this.aCu = new vP(p.q[10100 & -15756], 29, p.q[-3474 & 3054]);
      this.aDW = new vP(p.q[8951 & -28043], 18, p.q[1918 & 758]);
      this.aFj = new vP(p.q[631 & 8823], -99, p.q[1020 & 8824]);
      this.aDp = new vP(p.q[8953 & -27015], 16, p.q[6778 & -7560]);
      this.aCL = new vP(p.q[5754 & -32134], -100, p.q[4856 & 638]);
      this.aDS = new vP(p.q[17147 & 895], -98, p.q[17144 & -28037]);
      this.aDM = new vP(p.q[766 & 13949], 20, p.q[-31875 & 21119]);
      this.aEV = new vP(p.q[9854 & 2814], 15, p.q[21503 & 3709]);
      this.aFo = new vP(p.q[767 & -29057], 53, p.q[-32131 & 6783]);
      this.aFe = new vP(p.q[1685 & 27336], 60, p.q[6793 & -14687]);
      this.aEu = new vP(p.q[-10581 & 8914], 63, p.q[641 & 13291]);
      this.aCP = new vP(p.q[-11549 & 8835], 0, p.q[5035 & 641]);
      this.aCq = new vP(p.q[-15649 & 6788], 87, p.q[9105 & 19075]);
      this.aCW = new vP(p.q[661 & 18309], 0, p.q[-29039 & 17057]);
      this.aDY = new vP(p.q[-19545 & 2774], 64, p.q[23439 & 8839]);
      this.aDT = new vP(p.q[684 & 3994], 65, p.q[-11641 & 1935]);
      this.aEg = new vP(p.q[3977 & 667], 0, p.q[24215 & 711]);
      this.aCU = new vP(p.q[17034 & -26677], 0, p.q[8863 & 18087]);
      this.aDO = new vP[]{new vP(p.q[8879 & 19355], 2, p.q[6782 & 630]), new vP(p.q[-26978 & 17037], 3, p.q[886 & 18047]), new vP(p.q[13197 & 1677], 4, p.q[8822 & -32130]), new vP(p.q[8846 & -9522], 5, p.q[630 & -27657]), new vP(p.q[671 & 11919], 6, p.q[2678 & -28042]), new vP(p.q[12944 & 720], 7, p.q[4726 & 10102]), new vP(p.q[-7247 & 6809], 8, p.q[8959 & -13706]), new vP(p.q[-32078 & 30614], 9, p.q[1782 & -19842]), new vP(p.q[-23913 & 22163], 10, p.q[2686 & 21111])};
      this.aEf = 1;
      this.aDb = 0.8F;
      this.aDP = 0;
      this.aCg = false;
      this.aEl = false;
      this.aCV = MV.Rd();
      this.aDF = MV.Rd();
      this.aDX = false;
      this.aDD = false;
      this.aCJ = 1.0F;
      this.aEp = 0;
      this.aEc = 1;
      this.aFr = 0;
      this.aEJ = 0.0F;
      this.aFf = 0;
      this.aDJ = 0;
      this.aCK = 0;
      this.aDK = 3;
      this.aFn = 4000;
      this.aEe = false;
      this.aEY = false;
      this.aDC = false;
      this.aER = true;
      this.aDi = true;
      this.aEv = true;
      this.aFp = true;
      this.aCm = 0;
      this.aCo = 1;
      this.aCY = false;
      this.aFs = 0;
      this.aCi = false;
      this.aCk = false;
      this.aEC = q.q[1015 & 27560];
      this.aEj = true;
      this.aFB = true;
      this.aEm = true;
      this.aCv = true;
      this.aDm = true;
      this.aDh = true;
      this.aEW = true;
      this.aEs = 2;
      this.aDZ = true;
      this.aCC = false;
      this.aEI = true;
      this.aFD = false;
      this.aEh = false;
      this.aCS = 0;
      this.aCG = true;
      this.aCx = true;
      this.aEo = 3;
      this.aCs = true;
      this.aEA = true;
      this.aCB = true;
      this.aFg = 1;
      this.aES = 0;
      this.aDt = 0;
      this.aFi = true;
      this.aEE = true;
      this.aDs = true;
      this.aFd = true;
      this.aEQ = true;
      this.aCM = true;
      this.aDf = true;
      this.aDo = true;
      this.aDA = true;
      this.aEB = true;
      this.aCl = true;
      this.aFv = true;
      this.aEx = true;
      this.aEX = true;
      this.aEL = true;
      this.aCQ = (vP[])ArrayUtils.addAll(new vP[]{this.aCL, this.aFj, this.aDU, this.aCp, this.aDr, this.aEO, this.aDg, this.aEw, this.aCu, this.aDp, this.aDW, this.aDM, this.aEV, this.aDS, this.aFo, this.aFe, this.aEu, this.aCP, this.aDY, this.aDT, this.aEg, this.aCU, this.aCq, this.aCW, this.aET, this.aDB, this.aEa, this.aCn, this.aEq, this.aEz, this.aEy}, this.aDO);
      this.aCE = Qr.bWg;
      this.aEP = q.q[3080 & 21345];
      this.aEN = 70.0F;
      this.aDL = r.q[14530 & -15932];
      this.aCZ = false;
   }

   public void uy() {
      FileInputStream var1 = null;

      label678: {
         try {
            if (this.aFm.exists()) {
               BufferedReader var2 = new BufferedReader(new InputStreamReader(var1 = new FileInputStream(this.aFm)));
               String var3 = q.q[-32510 & 8776];
               this.aCR.clear();

               while((var3 = var2.readLine()) != null) {
                  try {
                     String[] var4 = var3.split(w.q[-24197 & 20594]);
                     if (var4[0].equals(p.q[8870 & 3766])) {
                        this.aDV = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[17071 & 13031])) {
                        this.aEN = this.aF(var4[1]) * 40.0F + 70.0F;
                     }

                     if (var4[0].equals(p.q[20409 & -27926])) {
                        this.aCj = this.aF(var4[1]);
                     }

                     if (var4[0].equals(r.q[9042 & 17874])) {
                        this.aDq = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[11241 & -11587])) {
                        this.aEt = var4[1].equals(q.q[4209 & -29069]);
                     }

                     if (var4[0].equals(p.q[-28694 & 4782])) {
                        this.ajy = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[19115 & 1963])) {
                        this.aFb = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(t.q[11173 & 1966])) {
                        this.aFk = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[750 & 12972])) {
                        this.aFl = var4[1].equals(q.q[-31627 & 4977]);
                     }

                     if (var4[0].equals(p.q[-32019 & 4781])) {
                        this.aDR = var4[1].equals(q.q[20595 & 9077]);
                     }

                     if (var4[0].equals(p.q[-29954 & 6063])) {
                        this.aFu = Integer.parseInt(var4[1]);
                        if (this.aCA) {
                           this.aFu = (int)vO.aFN.uO();
                        }

                        if (this.aFu <= 0) {
                           this.aFu = (int)vO.aFN.uO();
                        }
                     }

                     if (var4[0].equals(p.q[2735 & -23873])) {
                        this.aEZ = var4[1].equals(q.q[16763 & -32655]);
                     }

                     if (var4[0].equals(u.q[1011 & 9202])) {
                        this.aCE = Qr.hh(Integer.parseInt(var4[1]));
                     }

                     if (var4[0].equals(p.q[8884 & -30991])) {
                        this.ru = var4[1].equals(q.q[-32523 & 1907]);
                        this.uA();
                     }

                     if (var4[0].equals(w.q[1007 & 8931])) {
                        if (var4[1].equals(q.q[16625 & 8561])) {
                           this.aDG = 2;
                        } else if (var4[1].equals(q.q[1138 & 24690])) {
                           this.aDG = 0;
                        } else {
                           this.aDG = Integer.parseInt(var4[1]);
                        }
                     }

                     if (var4[0].equals(p.q[1725 & -31823])) {
                        if (var4[1].equals(q.q[-11145 & 8313])) {
                           this.aDl = 2;
                        } else if (var4[1].equals(q.q[127 & 12914])) {
                           this.aDl = 0;
                        } else if (var4[1].equals(w.q[759 & 24183])) {
                           this.aDl = 1;
                        }
                     }

                     if (var4[0].equals(p.q[-32073 & 754])) {
                        this.ayS = (List)aDa.fromJson(var3.substring(var3.indexOf(58) + 1), aDw);
                        if (this.ayS == null) {
                           this.ayS = Lists.newArrayList();
                        }
                     }

                     if (var4[0].equals(p.q[691 & 9147])) {
                        this.aDv = (List)aDa.fromJson(var3.substring(var3.indexOf(58) + 1), aDw);
                        if (this.aDv == null) {
                           this.aDv = Lists.newArrayList();
                        }
                     }

                     if (var4[0].equals(p.q[-23883 & 766]) && var4.length >= 2) {
                        this.aEP = var3.substring(var3.indexOf(58) + 1);
                     }

                     if (var4[0].equals(p.q[31413 & -32075]) && var4.length >= 2) {
                        this.aDL = var4[1];
                     }

                     if (var4[0].equals(p.q[-17737 & 694])) {
                        this.aFt = DF.eS(Integer.parseInt(var4[1]));
                     }

                     if (var4[0].equals(p.q[-32009 & 9151])) {
                        this.aFq = var4[1].equals(q.q[25713 & 2161]);
                     }

                     if (var4[0].equals(p.q[2812 & 12986])) {
                        this.aFa = var4[1].equals(q.q[5233 & 16887]);
                     }

                     if (var4[0].equals(p.q[14073 & 17341])) {
                        this.aDH = var4[1].equals(q.q[377 & 32501]);
                     }

                     if (var4[0].equals(p.q[1723 & -32070])) {
                        this.aFz = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[101 & -7579])) {
                        this.aCt = var4[1].equals(q.q[9333 & -29837]);
                     }

                     if (var4[0].equals(p.q[-23617 & 763])) {
                        this.aCA = var4[1].equals(q.q[-30223 & 22137]);
                        if (this.aCA) {
                           this.aFu = (int)vO.aFN.uO();
                        }

                        this.uE();
                     }

                     if (var4[0].equals(p.q[8958 & 17341])) {
                        this.aCI = var4[1].equals(q.q[371 & 4725]);
                     }

                     if (var4[0].equals(p.q[3773 & 5053])) {
                        this.aCT = var4[1].equals(q.q[2161 & -28047]);
                     }

                     if (var4[0].equals(p.q[9150 & -26946])) {
                        this.aCO = var4[1].equals(q.q[377 & 1271]);
                     }

                     if (var4[0].equals(p.q[-20481 & 17087])) {
                        this.aDn = var4[1].equals(q.q[-31623 & 24693]);
                     }

                     if (var4[0].equals(p.q[4832 & 18116])) {
                        this.aEb = var4[1].equals(q.q[4849 & -21389]);
                     }

                     if (var4[0].equals(p.q[17095 & 1745])) {
                        this.aEK = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[-23614 & 4835])) {
                        this.aDx = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[-30749 & 719])) {
                        this.aCz = var4[1].equals(q.q[-16263 & 9201]);
                     }

                     if (var4[0].equals(p.q[709 & 718])) {
                        this.aDy = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[981 & 4805])) {
                        this.aCy = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[14278 & 742])) {
                        this.aEG = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[975 & -12569])) {
                        this.aDk = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[745 & 23512])) {
                        this.aDe = var4[1].equals(q.q[27249 & 4347]);
                     }

                     if (var4[0].equals(p.q[4809 & 731])) {
                        this.avj = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[11994 & 17355])) {
                        this.aFh = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[10955 & 17359])) {
                        this.aEH = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[-26930 & 716])) {
                        this.aDu = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[5103 & 8909])) {
                        this.aDz = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[-22818 & 5070])) {
                        this.aDE = this.aF(var4[1]);
                     }

                     if (var4[0].equals(p.q[719 & 975])) {
                        this.aEr = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[25333 & 2000])) {
                        this.aDI = var4[1].equals(q.q[1913 & 20597]);
                     }

                     if (var4[0].equals(p.q[721 & -7]) && var4.length >= 2) {
                        this.aED = var3.substring(var3.indexOf(58) + 1);
                     }

                     if (var4[0].equals(p.q[17106 & -31010])) {
                        this.aEd = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[8923 & -27949])) {
                        this.aFx = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[-32036 & 17364])) {
                        this.aCX = Integer.parseInt(var4[1]);
                     }

                     if (var4[0].equals(p.q[3061 & -27939])) {
                        this.aCZ = var4[1].equals(q.q[499 & 125]);
                     }

                     if (var4[0].equals(p.q[18134 & -32041])) {
                        this.aEi = var4[1].equals(q.q[113 & -15375]);
                     }

                     if (var4[0].equals(y.q[16488 & 4460])) {
                        this.aCD = var4[1].equals(q.q[12529 & -32135]);
                     }

                     if (var4[0].equals(p.q[15319 & -32001])) {
                        this.aEU = var4[1].equals(q.q[-24463 & 6769]);
                     }

                     if (var4[0].equals(p.q[985 & 9948])) {
                        this.aFy = var4[1].equals(q.q[16501 & -32653]);
                     }

                     for(vP var8 : this.aCQ) {
                        if (var4[0].equals(p.q[-32003 & 24537] + var8.uU())) {
                           var8.dk(Integer.parseInt(var4[1]));
                        }
                     }

                     for(iv var23 : iv.values()) {
                        if (var4[0].equals(p.q[21210 & 3834] + var23.gD())) {
                           this.aCR.put(var23, Float.valueOf(this.aF(var4[1])));
                        }
                     }

                     for(DI var24 : DI.values()) {
                        if (var4[0].equals(p.q[19451 & 4831] + var24.Gx())) {
                           this.q(var24, var4[1].equals(q.q[-22925 & 113]));
                        }
                     }
                  } catch (Exception var13) {
                     aCN.warn(p.q[11261 & 4828] + var3);
                     var13.printStackTrace();
                  }
               }

               vP.uR();
               var2.close();
               break label678;
            }
         } catch (Exception var14) {
            aCN.error(p.q[10973 & 1759], var14);
            break label678;
         } finally {
            IOUtils.closeQuietly(var1);
         }

         return;
      }

      this.uD();
   }

   private void uz() {
      if (MV.fS()) {
         MV.bIc = true;
      }

      WX.q(this, this.G.Cg);
   }

   public void q(vO var1, float var2) {
      this.w(var1, var2);
      if (var1 == vO.aFG) {
         this.aDV = var2;
      }

      if (var1 == vO.aFH) {
         this.aEN = var2;
      }

      if (var1 == vO.aFI) {
         this.aCj = var2;
      }

      if (var1 == vO.aFN) {
         this.aFu = (int)var2;
         this.aCA = false;
         if (this.aFu <= 0) {
            this.aFu = (int)vO.aFN.uO();
            this.aCA = true;
         }

         this.uE();
      }

      if (var1 == vO.aFX) {
         this.aFz = var2;
         this.G.BZ.iA().iT();
      }

      if (var1 == vO.aGg) {
         this.aDy = var2;
         this.G.BZ.iA().iT();
      }

      if (var1 == vO.aGh) {
         this.aCy = var2;
         this.G.BZ.iA().iT();
      }

      if (var1 == vO.aGf) {
         this.aDk = var2;
         this.G.BZ.iA().iT();
      }

      if (var1 == vO.aGe) {
         this.aEG = var2;
         this.G.BZ.iA().iT();
      }

      if (var1 == vO.aGi) {
         int var3 = this.avj;
         this.avj = (int)var2;
         if ((float)var3 != var2) {
            this.G.fA().cT(this.avj);
            this.G.fJ().o(tU.awb);
            this.G.fA().e(false, this.avj > 0);
            this.G.fG();
         }
      }

      if (var1 == vO.aGk) {
         this.aEi = !this.aEi;
         this.G.Cv.oH();
      }

      if (var1 == vO.aFK) {
         this.ajy = (int)var2;
         this.G.Cv.pf();
      }

   }

   private void uA() {
      switch(this.aFr) {
      case 1:
         this.aDl = 1;
         break;
      case 2:
         this.aDl = 2;
         break;
      case 3:
         this.aDl = 0;
         break;
      default:
         if (this.ru) {
            this.aDl = 2;
         } else {
            this.aDl = 1;
         }
      }

   }

   public void q(vO var1, int var2) {
      this.w(var1, var2);
      if (var1 == vO.aFF) {
         this.aEt = !this.aEt;
      }

      if (var1 == vO.aFS) {
         this.aFb += var2;
         if (kf.jy()) {
            this.aFb = 0;
         }

         DisplayMode var3 = MV.ST();
         int var4 = var3.getWidth() / 320;
         int var5 = var3.getHeight() / 240;
         int var6 = Math.min(var4, var5);
         if (this.aFb < 0) {
            this.aFb = var6 - 1;
         }

         if (this.G.fK() && this.aFb % 2 != 0) {
            this.aFb += var2;
         }

         if (this.aFb < 0 || this.aFb >= var6) {
            this.aFb = 0;
         }
      }

      if (var1 == vO.aFT) {
         this.aFk = (this.aFk + var2) % 3;
      }

      if (var1 == vO.aFL) {
         this.aFl = !this.aFl;
      }

      if (var1 == vO.aFP) {
         this.aDl = (this.aDl + var2) % 3;
      }

      if (var1 == vO.aGj) {
         this.aCZ = !this.aCZ;
         this.G.CB.z(this.G.fU().ts() || this.aCZ);
      }

      if (var1 == vO.aFO) {
         this.aEZ = !this.aEZ;
      }

      if (var1 == vO.aFM) {
         if (!this.aDR && MV.Tf()) {
            MV.g(XH.eD(p.q[10939 & 21145]), XH.eD(p.q[21178 & 922]));
            return;
         }

         this.aDR = !this.aDR;
         this.G.gl();
      }

      if (var1 == vO.aFQ) {
         this.ru = !this.ru;
         this.uA();
         this.G.Cv.oH();
      }

      if (var1 == vO.aFR) {
         this.aDG = (this.aDG + var2) % 3;
         this.G.Cv.oH();
      }

      if (var1 == vO.aFU) {
         this.aFt = DF.eS((this.aFt.Gc() + var2) % 3);
      }

      if (var1 == vO.aFV) {
         this.aFq = !this.aFq;
      }

      if (var1 == vO.aFW) {
         this.aFa = !this.aFa;
      }

      if (var1 == vO.aFY) {
         this.aDH = !this.aDH;
      }

      if (var1 == vO.aGd) {
         this.aEb = !this.aEb;
      }

      if (var1 == vO.aGa) {
         this.aCt = !this.aCt;
         if (this.G.eZ() != this.aCt) {
            this.G.fm();
         }
      }

      if (var1 == vO.aGb) {
         this.aCA = !this.aCA;
         Display.setVSyncEnabled(this.aCA);
      }

      if (var1 == vO.aGc) {
         this.aCI = !this.aCI;
         this.G.Cv.oH();
      }

      if (var1 == vO.aGk) {
         this.aEi = !this.aEi;
         this.G.Cv.oH();
      }

      if (var1 == vO.aGl) {
         this.aCD = !this.aCD;
      }

      if (var1 == vO.aGm) {
         this.aFy = !this.aFy;
      }

      this.uG();
   }

   public String w(vO var1) {
      String var2 = this.r(var1);
      if (var2 != null) {
         return var2;
      } else {
         String var3 = uI.q(var1.uN()) + q.q[21164 & -23916];
         if (!var1.uK()) {
            if (var1.uL()) {
               boolean var7 = this.t(var1);
               return var7 ? var3 + uI.q(e.q[-14862 & 2520]) : var3 + uI.q(e.q[473 & 21489]);
            } else if (var1 == vO.aFS) {
               return this.aFb >= aDd.length ? var3 + this.aFb + q.q[8531 & 7283] : var3 + q(aDd, this.aFb);
            } else if (var1 == vO.aFU) {
               return var3 + uI.q(this.aFt.Gd());
            } else if (var1 == vO.aFT) {
               return var3 + q(aDj, this.aFk);
            } else if (var1 == vO.aFR) {
               return var3 + q(aFc, this.aDG);
            } else if (var1 == vO.aFP) {
               return var3 + q(aCw, this.aDl);
            } else if (var1 == vO.aFQ) {
               if (this.ru) {
                  return var3 + uI.q(y.q[-32630 & 8227]);
               } else {
                  String var6 = y.q[26777 & 263];
                  return var3 + uI.q(y.q[12801 & 16587]);
               }
            } else {
               return var3;
            }
         } else {
            float var4 = this.q(var1);
            float var5 = var1.am(var4);
            return var1 == vO.aGi && (double)var4 >= 4.0D ? var3 + XH.eD(p.q[13215 & -32101]) : (var1 == vO.aFG ? (var5 == 0.0F ? var3 + uI.q(p.q[670 & 5788]) : (var5 == 1.0F ? var3 + uI.q(p.q[-32099 & 19389]) : var3 + (int)(var5 * 200.0F) + q.q[2558 & -15873])) : (var1 == vO.aFH ? (var4 == 70.0F ? var3 + uI.q(p.q[4766 & 3743]) : (var4 == 110.0F ? var3 + uI.q(p.q[17055 & 6847]) : var3 + (int)var4)) : (var1 == vO.aFN ? (var4 == vO.y(var1) ? var3 + uI.q(p.q[19120 & 740]) : var3 + (int)var4 + p.q[-26957 & 8929]) : (var1 == vO.aFP ? (var4 == vO.u(var1) ? var3 + uI.q(p.q[17134 & 2722]) : var3 + ((int)var4 + 128)) : (var1 == vO.aFI ? (var5 == 0.0F ? var3 + uI.q(p.q[-17757 & 691]) : (var5 == 1.0F ? var3 + uI.q(p.q[17396 & 1703]) : var3 + w.q[9055 & -10278] + (int)(var5 * 100.0F) + q.q[5119 & -22018])) : (var1 == vO.aFJ ? var3 + (int)(var5 * 400.0F) + q.q[1535 & 2558] : (var1 == vO.aFX ? var3 + (int)(var5 * 90.0F + 10.0F) + q.q[-13826 & 6142] : (var1 == vO.aGh ? var3 + jJ.m(var5) + p.q[5111 & -12635] : (var1 == vO.aGg ? var3 + jJ.m(var5) + p.q[749 & 12965] : (var1 == vO.aGf ? var3 + jJ.n(var5) + p.q[16109 & 677] : (var1 == vO.aFK ? var3 + (int)var4 + w.q[26863 & 39] : (var1 == vO.aGi ? (var4 == 0.0F ? var3 + uI.q(e.q[8665 & 16853]) : var3 + (int)var4) : var3 + (int)(var5 * 100.0F) + q.q[4606 & 3582]))))))))))));
         }
      }
   }

   private static int q(int var0, int[] var1) {
      int var2 = w(var0, var1);
      if (var2 < 0) {
         return var1[0];
      } else {
         ++var2;
         if (var2 >= var1.length) {
            var2 = 0;
         }

         return var1[var2];
      }
   }

   public void q(vP var1, int var2) {
      var1.dk(var2);
      this.uG();
   }

   private void w(vO var1, int var2) {
      if (var1 == vO.aGn) {
         switch(this.aEf) {
         case 1:
            this.aEf = 2;
            if (!MV.Sz()) {
               this.aEf = 3;
            }
            break;
         case 2:
            this.aEf = 3;
            break;
         case 3:
            this.aEf = 1;
            break;
         default:
            this.aEf = 1;
         }
      }

      if (var1 == vO.aGo) {
         this.aDb += 0.2F;
         if (this.aDb > 0.81F) {
            this.aDb = 0.2F;
         }
      }

      if (var1 == vO.aGq) {
         this.aEl = !this.aEl;
      }

      if (var1 == vO.aGR) {
         this.aCV = !this.aCV;
         MV.SE();
      }

      if (var1 == vO.aGr) {
         ++this.aFr;
         if (this.aFr > 3) {
            this.aFr = 0;
         }

         this.uA();
         this.G.Cv.oV();
      }

      if (var1 == vO.aGt) {
         this.aFf = q(this.aFf, aDQ);
         this.G.Cv.oH();
      }

      if (var1 == vO.aHr) {
         ++this.aCK;
         if (this.aCK > 2) {
            this.aCK = 0;
         }
      }

      if (var1 == vO.aGu) {
         ++this.aDJ;
         if (this.aDJ > 3) {
            this.aDJ = 0;
         }
      }

      if (var1 == vO.aGv) {
         ++this.aES;
         if (this.aES == 1) {
            ++this.aES;
         }

         if (this.aES > 2) {
            this.aES = 0;
         }
      }

      if (var1 == vO.aGw) {
         ++this.aDt;
         if (this.aDt == 1) {
            ++this.aDt;
         }

         if (this.aDt > 2) {
            this.aDt = 0;
         }
      }

      if (var1 == vO.aGx) {
         this.aFi = !this.aFi;
      }

      if (var1 == vO.aGy) {
         this.aEE = !this.aEE;
      }

      if (var1 == vO.aGE) {
         this.aDs = !this.aDs;
      }

      if (var1 == vO.aGF) {
         this.aFd = !this.aFd;
      }

      if (var1 == vO.aGG) {
         this.aEQ = !this.aEQ;
      }

      if (var1 == vO.aGH) {
         this.aCM = !this.aCM;
      }

      if (var1 == vO.aGS) {
         this.aDf = !this.aDf;
      }

      if (var1 == vO.aGT) {
         this.aDo = !this.aDo;
      }

      if (var1 == vO.aGV) {
         this.aEB = !this.aEB;
      }

      if (var1 == vO.aGW) {
         this.aCl = !this.aCl;
      }

      if (var1 == vO.aGX) {
         this.aFv = !this.aFv;
      }

      if (var1 == vO.aGZ) {
         this.aEx = !this.aEx;
      }

      if (var1 == vO.aHc) {
         this.aEX = !this.aEX;
      }

      if (var1 == vO.aHn) {
         this.aEL = !this.aEL;
      }

      if (var1 == vO.aGU) {
         this.aDA = !this.aDA;
      }

      if (var1 == vO.aGA) {
         this.aEe = !this.aEe;
      }

      if (var1 == vO.aGB) {
         this.aDC = !this.aDC;
      }

      if (var1 == vO.aGC) {
         short var3 = 900;
         this.aFn = Math.max(this.aFn / var3 * var3, var3);
         this.aFn *= 2;
         if (this.aFn > 32 * var3) {
            this.aFn = var3;
         }
      }

      if (var1 == vO.aGD) {
         ++this.aDK;
         if (this.aDK > 3) {
            this.aDK = 1;
         }

         this.G.Cv.oH();
      }

      if (var1 == vO.aHj) {
         ++this.aEs;
         if (this.aEs > 3) {
            this.aEs = 1;
         }

         if (this.aEs == 2) {
            this.G.Cv.oH();
         } else {
            this.G.gl();
         }
      }

      if (var1 == vO.aGI) {
         this.aER = !this.aER;
      }

      if (var1 == vO.aGJ) {
         this.aDi = !this.aDi;
      }

      if (var1 == vO.aGK) {
         this.aEv = !this.aEv;
      }

      if (var1 == vO.aGL) {
         this.aFp = !this.aFp;
      }

      if (var1 == vO.aGM) {
         ++this.aCm;
         if (this.aCm > 2) {
            this.aCm = 0;
         }
      }

      if (var1 == vO.aGN) {
         ++this.aCo;
         if (this.aCo > 5) {
            this.aCo = 1;
         }
      }

      if (var1 == vO.aGO) {
         this.aCY = !this.aCY;
      }

      if (var1 == vO.aGP) {
         ++this.aFs;
         if (this.aFs > 2) {
            this.aFs = 0;
         }
      }

      if (var1 == vO.aGQ) {
         this.aCi = !this.aCi;
         this.uz();
      }

      if (var1 == vO.aGY) {
         this.aEY = !this.aEY;
      }

      if (var1 == vO.aHa) {
         this.aCk = !this.aCk;
         this.G.Cv.oH();
      }

      if (var1 == vO.aHd) {
         this.aEj = !this.aEj;
         Xh.aeA();
         this.G.Cv.oH();
      }

      if (var1 == vO.aHe) {
         this.aFB = !this.aFB;
         XP.aW();
      }

      if (var1 == vO.aHf) {
         this.aEm = !this.aEm;
         Xh.aeA();
         this.G.Cv.oH();
      }

      if (var1 == vO.aHg) {
         this.aCv = !this.aCv;
         this.G.CB.q(MV.fF());
         this.G.Cw.q(MV.fF());
      }

      if (var1 == vO.aHh) {
         this.aDm = !this.aDm;
         Xh.aW();
         this.G.Cv.oH();
      }

      if (var1 == vO.aHk) {
         this.aDZ = !this.aDZ;
         this.G.gl();
      }

      if (var1 == vO.aHt) {
         this.aDh = !this.aDh;
         Xw.aW();
      }

      if (var1 == vO.aHi) {
         this.aEW = !this.aEW;
      }

      if (var1 == vO.aHo) {
         this.aCC = !this.aCC;
         XN.aW();
         this.G.Cv.oH();
      }

      if (var1 == vO.aHp) {
         this.aEI = !this.aEI;
         this.G.gl();
      }

      if (var1 == vO.aHu) {
         this.aFD = !this.aFD;
         Pq.bTk = this.aFD;
      }

      if (var1 == vO.aHv) {
         if (!this.aEh && MV.Tf()) {
            MV.g(XH.eD(p.q[8990 & -13314]), XH.eD(p.q[-21601 & 21279]));
            return;
         }

         this.aEh = !this.aEh;
         if (this.aEh) {
            this.G.Bt.ns();
         }

         MV.fX();
      }

      if (var1 == vO.aHw) {
         if (this.aCS == 0) {
            this.aCS = 1;
         } else if (this.aCS == 1) {
            this.aCS = 2;
         } else if (this.aCS == 2) {
            this.aCS = 0;
         } else {
            this.aCS = 0;
         }

         this.G.Cv.oH();
      }

      if (var1 == vO.aHs) {
         this.aDF = !this.aDF;
      }

      if (var1 == vO.aHE) {
         this.aDX = !this.aDX;
         this.G.Cv.oH();
      }

      if (var1 == vO.aHG) {
         this.aDD = !this.aDD;
         this.G.Cv.oH();
      }

      if (var1 == vO.aHx) {
         this.aCG = !this.aCG;
      }

      if (var1 == vO.aHz) {
         this.aCx = !this.aCx;
         this.G.gl();
      }

      if (var1 == vO.aHy) {
         this.aEo = q(this.aEo, aFC);
         Xz.r(this.G.Cv);
      }

      if (var1 == vO.aHC) {
         ++this.aFg;
         if (this.aFg > 4) {
            this.aFg = 1;
         }

         if (!qa.ot()) {
            this.aFg = 1;
         }
      }

      if (var1 == vO.aHA) {
         this.aCs = !this.aCs;
         this.G.gl();
      }

      if (var1 == vO.aHD) {
         this.aEA = !this.aEA;
      }

      if (var1 == vO.aHF) {
         this.aCB = !this.aCB;
      }

      if (var1 == vO.aHq) {
         this.aCz = !this.aCz;
      }

      if (var1 == vO.aHB) {
         this.aCO = !this.aCO;
      }

   }

   public void uB() {
      if (this.G.CM != null) {
         int var1 = 0;

         for(DI var3 : this.aEn) {
            var1 |= var3.Gv();
         }

         this.G.CM.FE.q(new JB(this.aDL, this.ajy, this.aFt, this.aFq, var1));
      }

   }

   public void uC() {
      this.ajy = 8;
      this.aFl = true;
      this.aDR = false;
      this.aFu = (int)vO.aFN.uO();
      this.aCA = false;
      this.uE();
      this.avj = 4;
      this.ru = true;
      this.aDG = 2;
      this.aDl = 2;
      this.aEN = 70.0F;
      this.aCj = 0.0F;
      this.aFb = 0;
      this.aFk = 0;
      this.aCz = true;
      this.aCI = false;
      this.aCZ = false;
      this.aEf = 1;
      this.aDb = 0.8F;
      this.aDP = 0;
      this.aCg = false;
      this.aDD = false;
      this.aEl = false;
      MV.Sc();
      this.aCV = MV.Rd();
      this.aDF = false;
      this.aDX = false;
      this.aFD = false;
      this.aEh = false;
      this.aCS = 0;
      this.aCG = true;
      this.aCx = true;
      this.aEo = 3;
      this.aFg = 1;
      this.aCs = true;
      this.aEA = true;
      this.aCB = true;
      this.aCJ = 1.0F;
      this.aEp = 0;
      this.aEc = 1;
      this.aFr = 0;
      this.aEJ = 0.0F;
      this.aFf = 0;
      this.aDJ = 0;
      this.aDK = 3;
      this.aFn = 4000;
      this.aEe = false;
      this.aDC = false;
      this.aEY = false;
      this.aER = true;
      this.aDi = true;
      this.aEv = true;
      this.aFp = true;
      this.aCm = 0;
      this.aCo = 1;
      this.aCY = false;
      this.aFs = 0;
      this.aCi = false;
      this.aCk = false;
      this.aEC = q.q[11176 & 17382];
      this.aEj = true;
      this.aFB = true;
      this.aEm = true;
      this.aCv = true;
      this.aDm = true;
      this.aDZ = true;
      this.aDh = true;
      this.aEW = true;
      this.aEs = 2;
      this.aCC = false;
      this.aEI = true;
      this.aES = 0;
      this.aDt = 0;
      this.aFi = true;
      this.aEE = true;
      this.aDs = true;
      this.aFd = true;
      this.aEQ = true;
      this.aCM = true;
      this.aDf = true;
      this.aDo = true;
      this.aDA = true;
      this.aEB = true;
      this.aCl = true;
      this.aFv = true;
      this.aEx = true;
      this.aEX = true;
      this.aEL = true;
      net.optifine.shaders.F.fE(q.q[-31833 & 938]);
      net.optifine.shaders.F.cHk = 0;
      net.optifine.shaders.F.ajW();
      net.optifine.shaders.F.aiO();
      this.uz();
      this.G.gl();
      this.uG();
   }

   public void uD() {
      try {
         File var1 = this.aEk;
         if (!var1.exists()) {
            var1 = this.aFm;
         }

         if (!var1.exists()) {
            return;
         }

         BufferedReader var2 = new BufferedReader(new InputStreamReader(new FileInputStream(var1), StandardCharsets.UTF_8));
         String var3 = q.q[4640 & 2249];

         while((var3 = var2.readLine()) != null) {
            try {
               String[] var4 = var3.split(w.q[-16270 & 5374]);
               if (var4[0].equals(p.q[823 & -14473]) && var4.length >= 2) {
                  this.ajy = Integer.valueOf(var4[1]).intValue();
                  this.ajy = MV.B(this.ajy, 2, 1024);
               }

               if (var4[0].equals(p.q[1848 & 5115]) && var4.length >= 2) {
                  this.aEf = Integer.valueOf(var4[1]).intValue();
                  this.aEf = MV.B(this.aEf, 1, 3);
               }

               if (var4[0].equals(p.q[-30915 & 9017]) && var4.length >= 2) {
                  this.aDb = Float.valueOf(var4[1]).floatValue();
                  if (this.aDb < 0.2F) {
                     this.aDb = 0.2F;
                  }

                  if (this.aDb > 0.81F) {
                     this.aDb = 0.8F;
                  }
               }

               if (var4[0].equals(p.q[826 & -23621]) && var4.length >= 2) {
                  this.aDP = Integer.valueOf(var4[1]).intValue();
                  this.aDP = MV.B(this.aDP, 0, 3);
               }

               if (var4[0].equals(p.q[891 & -19649]) && var4.length >= 2) {
                  this.aCg = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[18237 & 9084]) && var4.length >= 2) {
                  this.aEl = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[-25731 & 10047]) && var4.length >= 2) {
                  this.aCV = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[830 & 13246]) && var4.length >= 2) {
                  this.aCJ = Float.valueOf(var4[1]).floatValue();
                  this.aCJ = MV.c(this.aCJ, 0.0F, 1.0F);
               }

               if (var4[0].equals(p.q[-23745 & 4095]) && var4.length >= 2) {
                  this.aFr = Integer.valueOf(var4[1]).intValue();
                  this.aFr = MV.B(this.aFr, 0, 3);
                  this.uA();
               }

               if (var4[0].equals(p.q[869 & -28864]) && var4.length >= 2) {
                  this.aEJ = Float.valueOf(var4[1]).floatValue();
                  this.aEJ = MV.c(this.aEJ, 0.0F, 1.0F);
               }

               if (var4[0].equals(p.q[833 & 1867]) && var4.length >= 2) {
                  this.aFf = Integer.valueOf(var4[1]).intValue();
                  this.aFf = e(this.aFf, aDQ);
               }

               if (var4[0].equals(p.q[962 & 851]) && var4.length >= 2) {
                  this.aCK = Integer.valueOf(var4[1]).intValue();
                  this.aCK = MV.B(this.aCK, 0, 2);
               }

               if (var4[0].equals(p.q[4931 & 10075]) && var4.length >= 2) {
                  this.aDJ = Integer.valueOf(var4[1]).intValue();
                  this.aDJ = MV.B(this.aDJ, 0, 3);
               }

               if (var4[0].equals(p.q[980 & 31597]) && var4.length >= 2) {
                  this.aES = Integer.valueOf(var4[1]).intValue();
                  this.aES = MV.B(this.aES, 0, 2);
               }

               if (var4[0].equals(p.q[4943 & 2021]) && var4.length >= 2) {
                  this.aDt = Integer.valueOf(var4[1]).intValue();
                  this.aDt = MV.B(this.aDt, 0, 2);
               }

               if (var4[0].equals(p.q[17239 & 1998]) && var4.length >= 2) {
                  this.aFi = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[839 & -17457]) && var4.length >= 2) {
                  this.aEE = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[9038 & 3017]) && var4.length >= 2) {
                  this.aDs = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[2907 & 13129]) && var4.length >= 2) {
                  this.aFd = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[4942 & 970]) && var4.length >= 2) {
                  this.aEQ = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[17227 & -29845]) && var4.length >= 2) {
                  this.aCM = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[4988 & 844]) && var4.length >= 2) {
                  this.aDf = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[4941 & -7315]) && var4.length >= 2) {
                  this.aDo = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[974 & -6305]) && var4.length >= 2) {
                  this.aEB = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[847 & -31889]) && var4.length >= 2) {
                  this.aCl = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[13178 & -15532]) && var4.length >= 2) {
                  this.aFv = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[3033 & -11437]) && var4.length >= 2) {
                  this.aEx = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[27474 & -31746]) && var4.length >= 2) {
                  this.aEX = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[-29733 & 22355]) && var4.length >= 2) {
                  this.aEL = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[17364 & -27819]) && var4.length >= 2) {
                  this.aDA = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[-29865 & 853]) && var4.length >= 2) {
                  this.aEe = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[17238 & -25770]) && var4.length >= 2) {
                  this.aDC = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[887 & -31913]) && var4.length >= 2) {
                  this.aFn = Integer.valueOf(var4[1]).intValue();
                  this.aFn = MV.B(this.aFn, 40, 40000);
               }

               if (var4[0].equals(p.q[-31908 & 4954]) && var4.length >= 2) {
                  this.aDK = Integer.valueOf(var4[1]).intValue();
                  this.aDK = MV.B(this.aDK, 1, 3);
               }

               if (var4[0].equals(p.q[17369 & -29827]) && var4.length >= 2) {
                  this.aEs = Integer.valueOf(var4[1]).intValue();
                  this.aEs = MV.B(this.aEs, 1, 3);
               }

               if (var4[0].equals(p.q[19423 & 1882]) && var4.length >= 2) {
                  this.aER = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[9183 & -11429]) && var4.length >= 2) {
                  this.aDi = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[4958 & 1916]) && var4.length >= 2) {
                  this.aEv = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[25439 & -31779]) && var4.length >= 2) {
                  this.aFp = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[862 & 19454]) && var4.length >= 2) {
                  this.aCm = Integer.valueOf(var4[1]).intValue();
                  this.aCm = MV.B(this.aCm, 0, 2);
               }

               if (var4[0].equals(p.q[-8353 & 991]) && var4.length >= 2) {
                  this.aCo = Integer.valueOf(var4[1]).intValue();
                  this.aCo = MV.B(this.aCo, 1, 5);
               }

               if (var4[0].equals(p.q[1012 & -22678]) && var4.length >= 2) {
                  this.aCY = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[2921 & -11295]) && var4.length >= 2) {
                  this.aFs = Integer.valueOf(var4[1]).intValue();
                  this.aFs = MV.B(this.aFs, 0, 2);
               }

               if (var4[0].equals(p.q[874 & -11294]) && var4.length >= 2) {
                  this.aCi = Boolean.valueOf(var4[1]).booleanValue();
                  this.uz();
               }

               if (var4[0].equals(p.q[1891 & -27653]) && var4.length >= 2) {
                  this.aEp = Integer.valueOf(var4[1]).intValue();
                  this.aEp = MV.B(this.aEp, 0, 16);
               }

               if (var4[0].equals(p.q[-17539 & 17252]) && var4.length >= 2) {
                  this.aEc = Integer.valueOf(var4[1]).intValue();
                  this.aEc = MV.B(this.aEc, 1, 16);
               }

               if (var4[0].equals(p.q[26605 & 4967]) && var4.length >= 2) {
                  this.aEY = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[2935 & 17254]) && var4.length >= 2) {
                  this.aCk = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[17263 & -29705]) && var4.length >= 2) {
                  this.aEj = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[-23700 & 4984]) && var4.length >= 2) {
                  this.aFB = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[27497 & -31893]) && var4.length >= 2) {
                  this.aEm = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[890 & 8042]) && var4.length >= 2) {
                  this.aCv = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[7023 & 9067]) && var4.length >= 2) {
                  this.aDm = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[1004 & -31890]) && var4.length >= 2) {
                  this.aDZ = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[-28819 & 879]) && var4.length >= 2) {
                  this.aDh = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[-10370 & 11119]) && var4.length >= 2) {
                  this.aEW = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[895 & 17263]) && var4.length >= 2) {
                  this.aCC = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[1904 & 3066]) && var4.length >= 2) {
                  this.aEI = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[10101 & -29703]) && var4.length >= 2) {
                  this.aDF = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[17266 & -16517]) && var4.length >= 2) {
                  this.aDX = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[19315 & -30853]) && var4.length >= 2) {
                  this.aDD = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[26492 & 7029]) && var4.length >= 2) {
                  this.aCG = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[885 & 11253]) && var4.length >= 2) {
                  this.aCx = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[1014 & -12426]) && var4.length >= 2) {
                  this.aEo = Integer.valueOf(var4[1]).intValue();
                  this.aEo = e(this.aEo, aFC);
               }

               if (var4[0].equals(p.q[9087 & 21367]) && var4.length >= 2) {
                  this.aFg = Integer.valueOf(var4[1]).intValue();
                  this.aFg = MV.B(this.aFg, 1, 4);
               }

               if (var4[0].equals(p.q[-23683 & 6136]) && var4.length >= 2) {
                  this.aCs = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[-29831 & 18299]) && var4.length >= 2) {
                  this.aEA = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[894 & -15494]) && var4.length >= 2) {
                  this.aCB = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[17275 & -30853]) && var4.length >= 2) {
                  this.aEC = var4[1];
               }

               if (var4[0].equals(p.q[5116 & 11132]) && var4.length >= 2) {
                  this.aFD = Boolean.valueOf(var4[1]).booleanValue();
                  Pq.bTk = this.aFD;
               }

               if (var4[0].equals(p.q[9085 & 6141]) && var4.length >= 2) {
                  this.aEh = Boolean.valueOf(var4[1]).booleanValue();
               }

               if (var4[0].equals(p.q[894 & 17278]) && var4.length >= 2) {
                  this.aCS = Integer.valueOf(var4[1]).intValue();
                  this.aCS = MV.B(this.aCS, 0, 2);
               }

               if (var4[0].equals(p.q[17147 & 11229] + this.aDN.uU())) {
                  this.aDN.dk(Integer.parseInt(var4[1]));
               }
            } catch (Exception var5) {
               MV.cM(p.q[8924 & 5085] + var3);
               var5.printStackTrace();
            }
         }

         net.optifine.util.l.q(this.aCQ, new vP[]{this.aDN});
         vP.uR();
         var2.close();
      } catch (Exception var6) {
         MV.cJ(p.q[-23843 & 1791]);
         var6.printStackTrace();
      }

   }

   private float e(vO var1) {
      if (var1 == vO.aGs) {
         return this.aEJ;
      } else if (var1 == vO.aGz) {
         return this.aCJ;
      } else if (var1 == vO.aHl) {
         return (float)this.aEp;
      } else if (var1 == vO.aHm) {
         return (float)this.aEc;
      } else if (var1 == vO.aGp) {
         return (float)this.aDP;
      } else if (var1 != vO.aFN) {
         if (var1 == vO.aHb) {
            if (this.aEC.equals(q.q[13280 & 1968])) {
               return 0.0F;
            } else {
               List var2 = Arrays.asList(MV.QX());
               int var3 = var2.indexOf(this.aEC);
               return var3 < 0 ? 0.0F : (float)(var3 + 1);
            }
         } else {
            return Float.MAX_VALUE;
         }
      } else {
         return (float)this.aFu == vO.aFN.uO() && this.aCA ? 0.0F : (float)this.aFu;
      }
   }

   private String r(vO var1) {
      String var2 = uI.q(var1.uN()) + q.q[8836 & 17380];
      if (var2 == null) {
         var2 = var1.uN();
      }

      if (var1 == vO.aFK) {
         int var11 = (int)this.q(var1);
         String var4 = uI.q(p.q[2852 & 21344]);
         byte var5 = 2;
         if (var11 >= 4) {
            var4 = uI.q(p.q[-6231 & 4915]);
            var5 = 4;
         }

         if (var11 >= 8) {
            var4 = uI.q(p.q[6950 & 25386]);
            var5 = 8;
         }

         if (var11 >= 16) {
            var4 = uI.q(p.q[819 & -7381]);
            var5 = 16;
         }

         if (var11 >= 32) {
            var4 = XH.eD(p.q[13100 & -15564]);
            var5 = 32;
         }

         if (var11 >= 48) {
            var4 = XH.eD(p.q[18213 & 9133]);
            var5 = 48;
         }

         if (var11 >= 64) {
            var4 = XH.eD(p.q[-31945 & 27566]);
            var5 = 64;
         }

         int var6 = this.ajy - var5;
         String var7 = var4;
         if (var6 > 0) {
            var7 = var4 + w.q[-23685 & 2906];
         }

         return var2 + var11 + q.q[330 & 23914] + var7;
      } else if (var1 == vO.aGn) {
         switch(this.aEf) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         case 3:
            return var2 + XH.afF();
         default:
            return var2 + XH.afF();
         }
      } else if (var1 == vO.aGo) {
         return var2 + this.aDb;
      } else if (var1 == vO.aGp) {
         switch(this.aDP) {
         case 0:
            return var2 + XH.eD(p.q[-31945 & 21295]);
         case 1:
            return var2 + XH.eD(p.q[14184 & -15573]);
         case 2:
            return var2 + XH.eD(p.q[-31939 & 19241]);
         case 3:
            return var2 + XH.eD(p.q[14314 & -29909]);
         default:
            return var2 + p.q[5927 & 11063];
         }
      } else if (var1 == vO.aGq) {
         return this.aEl ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGR) {
         return this.aCV ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGr) {
         switch(this.aFr) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         case 3:
            return var2 + XH.afF();
         default:
            return var2 + XH.afD();
         }
      } else if (var1 == vO.aGt) {
         switch(this.aFf) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         case 3:
         default:
            return var2 + XH.afD();
         case 4:
            return var2 + XH.eD(p.q[-31957 & 939]);
         }
      } else if (var1 == vO.aHr) {
         switch(this.aCK) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         default:
            return var2 + XH.afD();
         }
      } else if (var1 == vO.aGu) {
         switch(this.aDJ) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         case 3:
            return var2 + XH.afF();
         default:
            return var2 + XH.afD();
         }
      } else if (var1 == vO.aGv) {
         switch(this.aES) {
         case 1:
            return var2 + XH.eD(p.q[5948 & 940]);
         case 2:
            return var2 + XH.afF();
         default:
            return var2 + XH.afH();
         }
      } else if (var1 == vO.aGw) {
         switch(this.aDt) {
         case 1:
            return var2 + XH.eD(p.q[17260 & 13118]);
         case 2:
            return var2 + XH.afF();
         default:
            return var2 + XH.afH();
         }
      } else if (var1 == vO.aGx) {
         return this.aFi ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGy) {
         return this.aEE ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGE) {
         return this.aDs ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGF) {
         return this.aFd ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGG) {
         return this.aEQ ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGH) {
         return this.aCM ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGS) {
         return this.aDf ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGT) {
         return this.aDo ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGV) {
         return this.aEB ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGW) {
         return this.aCl ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGX) {
         return this.aFv ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGZ) {
         return this.aEx ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHc) {
         return this.aEX ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHn) {
         return this.aEL ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGU) {
         return this.aDA ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGA) {
         return this.aEe ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGB) {
         return this.aDC ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGC) {
         short var10 = 900;
         return this.aFn <= var10 ? var2 + XH.eD(p.q[9023 & 2029]) : (this.aFn <= 2 * var10 ? var2 + XH.eD(p.q[-14546 & 9007]) : (this.aFn <= 4 * var10 ? var2 + XH.eD(p.q[815 & -13377]) : (this.aFn <= 8 * var10 ? var2 + XH.eD(p.q[18292 & 2872]) : (this.aFn <= 16 * var10 ? var2 + XH.eD(p.q[3893 & -31951]) : var2 + XH.eD(p.q[27443 & -30798])))));
      } else if (var1 == vO.aGD) {
         switch(this.aDK) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         default:
            return var2 + XH.afF();
         }
      } else if (var1 == vO.aHj) {
         switch(this.aEs) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         default:
            return var2 + XH.afF();
         }
      } else if (var1 == vO.aGI) {
         return this.aER ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGJ) {
         return this.aDi ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGK) {
         return this.aEv ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGL) {
         return this.aFp ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGM) {
         switch(this.aCm) {
         case 1:
            return var2 + XH.afG();
         case 2:
            return var2 + XH.afI();
         default:
            return var2 + XH.afD();
         }
      } else if (var1 == vO.aGN) {
         return var2 + this.aCo;
      } else if (var1 == vO.aGO) {
         return this.aCY ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aGP) {
         return this.aFs == 1 ? var2 + XH.eD(p.q[9139 & 1915]) : (this.aFs == 2 ? var2 + XH.eD(p.q[950 & 17212]) : var2 + XH.afD());
      } else if (var1 == vO.aGQ) {
         return this.aCi ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHl) {
         String var9 = q.q[-9711 & 8192];
         if (this.aEp != MV.Sy()) {
            var9 = w.q[-15564 & 4918] + XH.eD(p.q[-29899 & 885]) + w.q[6303 & 25885];
         }

         return this.aEp == 0 ? var2 + XH.afF() + var9 : var2 + this.aEp + var9;
      } else if (var1 == vO.aHm) {
         return this.aEc == 1 ? var2 + XH.afF() : var2 + this.aEc;
      } else if (var1 == vO.aGY) {
         return this.aEY ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHa) {
         return this.aCk ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHd) {
         return this.aEj ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHe) {
         return this.aFB ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHf) {
         return this.aEm ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHg) {
         return this.aCv ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHh) {
         return this.aDm ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHt) {
         return this.aDh ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHi) {
         return this.aEW ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHk) {
         return this.aDZ ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHo) {
         return this.aCC ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHp) {
         return this.aEI ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHu) {
         return this.aFD ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHv) {
         return this.aEh ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHw) {
         return this.aCS == 1 ? var2 + XH.afG() : (this.aCS == 2 ? var2 + XH.afI() : var2 + XH.afD());
      } else if (var1 == vO.aHs) {
         return this.aDF ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHE) {
         return this.aDX ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHG) {
         return this.aDD ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHx) {
         return this.aCG ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHz) {
         return this.aCx ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHy) {
         int var8 = w(this.aEo, aFC);
         return var2 + q(aCh, var8);
      } else if (var1 == vO.aHC) {
         return this.aFg <= 1 ? var2 + XH.afD() : var2 + this.aFg + q.q[4575 & -30125];
      } else if (var1 == vO.aHA) {
         return this.aCs ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHD) {
         return this.aEA ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHF) {
         return this.aCB ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHb) {
         return this.aEC.equals(q.q[4001 & 17380]) ? var2 + XH.afD() : var2 + this.aEC;
      } else if (var1 == vO.aHq) {
         return this.aCz ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aHB) {
         return this.aCO ? var2 + XH.afH() : var2 + XH.afF();
      } else if (var1 == vO.aFN) {
         float var3 = this.q(var1);
         return var3 == 0.0F ? var2 + XH.eD(p.q[19318 & -22729]) : (var3 == vO.y(var1) ? var2 + uI.q(p.q[6908 & 17057]) : var2 + (int)var3 + p.q[23201 & 8873]);
      } else {
         return null;
      }
   }

   public void uE() {
      Display.setVSyncEnabled(this.aCA);
   }

   public static boolean q(vP var0) {
      boolean var10000;
      label25: {
         if (var0.bB() != 0) {
            if (var0.bB() < 0) {
               if (Mouse.isButtonDown(var0.bB() + 100)) {
                  break label25;
               }
            } else if (Keyboard.isKeyDown(var0.bB())) {
               break label25;
            }
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static int w(int var0, int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] == var0) {
            return var2;
         }
      }

      return -1;
   }

   public Set uF() {
      return ImmutableSet.copyOf(this.aEn);
   }

   public void q(DI var1, boolean var2) {
      if (var2) {
         this.aEn.add(var1);
      } else {
         this.aEn.remove(var1);
      }

      this.uB();
   }

   public void uG() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.aFm));
         var1.println(p.q[-29985 & 22238] + this.aEt);
         var1.println(p.q[2783 & 18175] + this.aDV);
         var1.println(p.q[-4112 & 744] + (this.aEN - 70.0F) / 40.0F);
         var1.println(p.q[18153 & 13299] + this.aCj);
         var1.println(p.q[1767 & 738] + this.aDq);
         var1.println(p.q[-32029 & 6883] + this.ajy);
         var1.println(p.q[-20500 & 757] + this.aFb);
         var1.println(p.q[17125 & -23571] + this.aFk);
         var1.println(p.q[8942 & 21238] + this.aFl);
         var1.println(p.q[743 & -7449] + this.aDR);
         var1.println(p.q[-31767 & 3820] + this.aFu);
         var1.println(p.q[749 & 28649] + this.aEZ);
         var1.println(p.q[14062 & -31749] + this.aCE.Zb());
         var1.println(p.q[17131 & 6127] + this.ru);
         var1.println(p.q[764 & 14060] + this.aDG);
         switch(this.aDl) {
         case 0:
            var1.println(p.q[-32003 & 3823]);
            break;
         case 1:
            var1.println(p.q[19182 & 8959]);
            break;
         case 2:
            var1.println(p.q[767 & -31761]);
         }

         var1.println(p.q[-32004 & 4848] + aDa.toJson(this.ayS));
         var1.println(p.q[757 & 18417] + aDa.toJson(this.aDv));
         var1.println(p.q[766 & 754] + this.aEP);
         var1.println(p.q[9971 & 4855] + this.aDL);
         var1.println(p.q[7166 & 25332] + this.aFt.Gc());
         var1.println(p.q[2045 & 757] + this.aFq);
         var1.println(p.q[-29962 & 758] + this.aFa);
         var1.println(p.q[9215 & -26889] + this.aDH);
         var1.println(p.q[14328 & -15624] + this.aFz);
         var1.println(p.q[3837 & 8953] + this.aCt);
         var1.println(p.q[766 & 1787] + this.aCA);
         var1.println(p.q[-14597 & 15099] + this.aCI);
         var1.println(p.q[1020 & -19714] + this.aCT);
         var1.println(p.q[11261 & -26883] + this.aCO);
         var1.println(p.q[-25858 & 1790] + this.aDn);
         var1.println(p.q[8959 & 17151] + this.aEb);
         var1.println(p.q[842 & 21376] + this.aDx);
         var1.println(p.q[19297 & 779] + this.aEK);
         var1.println(p.q[2818 & -30722] + this.aCz);
         var1.println(p.q[1859 & 17159] + this.aDy);
         var1.println(p.q[-23804 & 781] + this.aCy);
         var1.println(p.q[9029 & 18333] + this.aEG);
         var1.println(p.q[846 & 5894] + this.aDk);
         var1.println(p.q[18319 & -25753] + this.aDe);
         var1.println(p.q[11144 & 17177] + this.avj);
         var1.println(p.q[17161 & -29811] + this.aFh);
         var1.println(p.q[-31826 & 21274] + this.aEH);
         var1.println(p.q[-18577 & 907] + this.aDu);
         var1.println(p.q[988 & 780] + this.aDz);
         var1.println(p.q[17165 & -28913] + this.aDE);
         var1.println(p.q[-31954 & 5070] + this.aEr);
         var1.println(p.q[799 & 11023] + this.aDI);
         var1.println(p.q[979 & -16624] + this.aED);
         var1.println(p.q[785 & 1885] + this.aEd);
         var1.println(p.q[2898 & -30950] + this.aFx);
         var1.println(p.q[17171 & 9051] + this.aCX);
         var1.println(p.q[19348 & 790] + this.aCZ);
         var1.println(p.q[19229 & 1975] + this.aEi);
         var1.println(p.q[17214 & -18666] + this.aCD);
         var1.println(p.q[-17537 & 18327] + this.aEU);
         var1.println(p.q[4056 & 4888] + this.aFy);

         for(vP var5 : this.aCQ) {
            var1.println(p.q[17113 & -19493] + var5.uU() + w.q[-32526 & 882] + var5.bB());
         }

         for(iv var13 : iv.values()) {
            var1.println(p.q[8954 & 4826] + var13.gD() + w.q[242 & -26250] + this.r(var13));
         }

         for(DI var14 : DI.values()) {
            var1.println(p.q[6875 & 1759] + var14.Gx() + w.q[17019 & 5618] + this.aEn.contains(var14));
         }

         var1.close();
      } catch (Exception var6) {
         aCN.error(p.q[793 & 27485], var6);
      }

      this.uI();
      this.uB();
   }

   public void Z(boolean var1) {
      int var2 = var1 ? 0 : 2;
      this.aES = var2;
      this.aDt = var2;
      this.aFi = var1;
      this.aEE = var1;
      this.aDs = var1;
      this.aFd = var1;
      this.aEQ = var1;
      this.aCM = var1;
      this.aDf = var1;
      this.aDo = var1;
      this.aDA = var1;
      this.aEB = var1;
      this.aCl = var1;
      this.aFv = var1;
      this.aFk = var1 ? 0 : 2;
      this.aEx = var1;
      this.aEX = var1;
      this.aEL = var1;
   }

   private void w(vO var1, float var2) {
      if (var1 == vO.aGs) {
         this.aEJ = var2;
         this.G.Cv.oV();
      }

      if (var1 == vO.aGz) {
         this.aCJ = var2;
         this.G.Cv.oH();
      }

      if (var1 == vO.aHl) {
         int var3 = (int)var2;
         if (var3 > 0 && MV.Tf()) {
            MV.g(XH.eD(p.q[25434 & -27714]), XH.eD(p.q[2847 & 14139]));
            return;
         }

         int[] var4 = new int[]{0, 2, 4, 6, 8, 12, 16};
         this.aEp = 0;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if (var3 >= var4[var5]) {
               this.aEp = var4[var5];
            }
         }

         this.aEp = MV.B(this.aEp, 0, 16);
      }

      if (var1 == vO.aHm) {
         int var6 = (int)var2;
         if (var6 > 1 && MV.Tf()) {
            MV.g(XH.eD(p.q[13148 & 17310]), XH.eD(p.q[-15521 & 8989]));
            return;
         }

         for(this.aEc = 1; this.aEc * 2 <= var6; this.aEc *= 2) {
            ;
         }

         this.aEc = MV.B(this.aEc, 1, 16);
         this.G.gl();
      }

      if (var1 == vO.aGp) {
         int var7 = (int)var2;
         this.aDP = MV.B(var7, 0, 3);
         this.G.gl();
      }

      if (var1 == vO.aHb) {
         int var8 = (int)var2 - 1;
         String[] var9 = MV.QX();
         if (var8 < 0 || var8 >= var9.length) {
            this.aEC = q.q[-19548 & 1000];
            return;
         }

         this.aEC = var9[var8];
      }

   }

   private static String q(String[] var0, int var1) {
      if (var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      return uI.q(var0[var1]);
   }

   public int uH() {
      return this.ajy >= 4 ? this.aDl : 0;
   }

   public void w(DI var1) {
      if (!this.uF().contains(var1)) {
         this.aEn.add(var1);
      } else {
         this.aEn.remove(var1);
      }

      this.uB();
   }

   private float aF(String var1) {
      return var1.equals(q.q[18033 & 113]) ? 1.0F : (var1.equals(q.q[8306 & -32653]) ? 0.0F : Float.parseFloat(var1));
   }

   public vL(hS var1, File var2) {
      this.aED = q.q[649 & 6194];
      this.aEd = 0;
      this.aFx = 0;
      this.aCX = 0;
      this.aEU = true;
      this.aFy = true;
      this.aET = new vP(p.q[18414 & 10854], 48, o.q[-15625 & 4735]);
      this.aDB = new vP(p.q[2935 & 4711], 54, o.q[6775 & -32137]);
      this.aEa = new vP(p.q[5096 & 3688], 184, o.q[-7433 & 6783]);
      this.aCn = new vP(p.q[8829 & 17129], 56, o.q[4727 & 20215]);
      this.aEq = new vP(p.q[2683 & 4970], 50, o.q[-32009 & 17271]);
      this.aEz = new vP(p.q[1903 & 17019], 49, o.q[2935 & 8831]);
      this.aEy = new vP(p.q[8959 & 17004], 0, o.q[17023 & -28041]);
      this.aDU = new vP(p.q[21357 & 8815], 17, p.q[8830 & 3695]);
      this.aCp = new vP(p.q[2927 & 12911], 30, p.q[8046 & 767]);
      this.aDr = new vP(p.q[-11664 & 10878], 31, p.q[622 & -21762]);
      this.aEO = new vP(p.q[2681 & 25203], 32, p.q[-7570 & 5102]);
      this.aDg = new vP(p.q[25203 & -28686], 57, p.q[4846 & -32130]);
      this.aEw = new vP(p.q[-23689 & 20219], 42, p.q[12911 & -12674]);
      this.aCu = new vP(p.q[1653 & 11124], 29, p.q[2030 & -13714]);
      this.aDW = new vP(p.q[637 & 759], 18, p.q[6902 & 17015]);
      this.aFj = new vP(p.q[18167 & -21897], -99, p.q[889 & 4728]);
      this.aDp = new vP(p.q[17273 & 5757], 16, p.q[632 & 636]);
      this.aCL = new vP(p.q[8954 & -27777], -100, p.q[-15748 & 761]);
      this.aDS = new vP(p.q[635 & 6143], -98, p.q[1656 & 764]);
      this.aDM = new vP(p.q[8828 & 5887], 20, p.q[9085 & 3709]);
      this.aEV = new vP(p.q[4735 & 11006], 15, p.q[639 & 1661]);
      this.aFo = new vP(p.q[1663 & -31873], 53, p.q[8829 & 4733]);
      this.aFe = new vP(p.q[26242 & 640], 60, p.q[17057 & 9173]);
      this.aEu = new vP(p.q[2754 & -23930], 63, p.q[687 & -23935]);
      this.aCP = new vP(p.q[25523 & -31089], 0, p.q[4737 & 645]);
      this.aCq = new vP(p.q[-25964 & 26564], 87, p.q[4807 & 2985]);
      this.aCW = new vP(p.q[-7211 & 677], 0, p.q[-32083 & 13185]);
      this.aDY = new vP(p.q[9894 & 902], 64, p.q[663 & 10959]);
      this.aDT = new vP(p.q[-32120 & 29368], 65, p.q[19095 & 903]);
      this.aEg = new vP(p.q[17115 & 5769], 0, p.q[-10617 & 695]);
      this.aCU = new vP(p.q[-32101 & 1674], 0, p.q[-28009 & 18151]);
      this.aDO = new vP[]{new vP(p.q[-20789 & 667], 2, p.q[-29825 & 26230]), new vP(p.q[12958 & -32116], 3, p.q[7038 & -15626]), new vP(p.q[909 & -14691], 4, p.q[11902 & 4726]), new vP(p.q[-22802 & 2959], 5, p.q[3070 & -6538]), new vP(p.q[2703 & 18367], 6, p.q[23286 & 630]), new vP(p.q[661 & -3430], 7, p.q[4862 & -23689]), new vP(p.q[1681 & 665], 8, p.q[638 & 14966]), new vP(p.q[3770 & 914], 9, p.q[-11530 & 2686]), new vP(p.q[1683 & 13011], 10, p.q[2814 & 17270])};
      this.aEf = 1;
      this.aDb = 0.8F;
      this.aDP = 0;
      this.aCg = false;
      this.aEl = false;
      this.aCV = MV.Rd();
      this.aDF = MV.Rd();
      this.aDX = false;
      this.aDD = false;
      this.aCJ = 1.0F;
      this.aEp = 0;
      this.aEc = 1;
      this.aFr = 0;
      this.aEJ = 0.0F;
      this.aFf = 0;
      this.aDJ = 0;
      this.aCK = 0;
      this.aDK = 3;
      this.aFn = 4000;
      this.aEe = false;
      this.aEY = false;
      this.aDC = false;
      this.aER = true;
      this.aDi = true;
      this.aEv = true;
      this.aFp = true;
      this.aCm = 0;
      this.aCo = 1;
      this.aCY = false;
      this.aFs = 0;
      this.aCi = false;
      this.aCk = false;
      this.aEC = q.q[21412 & 2042];
      this.aEj = true;
      this.aFB = true;
      this.aEm = true;
      this.aCv = true;
      this.aDm = true;
      this.aDh = true;
      this.aEW = true;
      this.aEs = 2;
      this.aDZ = true;
      this.aCC = false;
      this.aEI = true;
      this.aFD = false;
      this.aEh = false;
      this.aCS = 0;
      this.aCG = true;
      this.aCx = true;
      this.aEo = 3;
      this.aCs = true;
      this.aEA = true;
      this.aCB = true;
      this.aFg = 1;
      this.aES = 0;
      this.aDt = 0;
      this.aFi = true;
      this.aEE = true;
      this.aDs = true;
      this.aFd = true;
      this.aEQ = true;
      this.aCM = true;
      this.aDf = true;
      this.aDo = true;
      this.aDA = true;
      this.aEB = true;
      this.aCl = true;
      this.aFv = true;
      this.aEx = true;
      this.aEX = true;
      this.aEL = true;
      this.aCQ = (vP[])ArrayUtils.addAll(new vP[]{this.aCL, this.aFj, this.aDU, this.aCp, this.aDr, this.aEO, this.aDg, this.aEw, this.aCu, this.aDp, this.aDW, this.aDM, this.aEV, this.aDS, this.aFo, this.aFe, this.aEu, this.aCP, this.aDY, this.aDT, this.aEg, this.aCU, this.aCq, this.aCW, this.aET, this.aDB, this.aEa, this.aCn, this.aEq, this.aEz, this.aEy}, this.aDO);
      this.aCE = Qr.bWg;
      this.aEP = q.q[-12255 & 1488];
      this.aEN = 70.0F;
      this.aDL = r.q[-31536 & 2496];
      this.aCZ = false;
      this.G = var1;
      this.aFm = new File(var2, p.q[-18764 & 17044]);
      if (var1.fz() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
         vO.aFK.al(32.0F);
         long var3 = 1000000L;
         if (Runtime.getRuntime().maxMemory() >= 1500L * var3) {
            vO.aFK.al(48.0F);
         }

         if (Runtime.getRuntime().maxMemory() >= 2500L * var3) {
            vO.aFK.al(64.0F);
         }
      } else {
         vO.aFK.al(16.0F);
      }

      this.ajy = var1.fz() ? 12 : 8;
      this.aEk = new File(var2, p.q[2007 & 8885]);
      this.aFu = (int)vO.aFN.uO();
      this.aDN = new vP(p.q[4758 & -14658], 46, p.q[-30847 & 6851]);
      this.aCQ = (vP[])ArrayUtils.add(this.aCQ, this.aDN);
      net.optifine.util.l.q(this.aCQ, new vP[]{this.aDN});
      this.ajy = 8;
      this.uy();
      MV.q(this);
   }

   public boolean t(vO var1) {
      // $FF: Couldn't be decompiled
   }

   public void uI() {
      try {
         PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.aEk), StandardCharsets.UTF_8));
         var1.println(p.q[-15489 & 3071] + this.aEf);
         var1.println(p.q[-31825 & 10176] + this.aDb);
         var1.println(p.q[10177 & 23457] + this.aDP);
         var1.println(p.q[9090 & -30738] + this.aCg);
         var1.println(p.q[9155 & -30797] + this.aEl);
         var1.println(p.q[-7291 & 4004] + this.aCV);
         var1.println(p.q[-15483 & 901] + this.aCJ);
         var1.println(p.q[902 & 9111] + this.aFr);
         var1.println(p.q[25479 & 3991] + this.aEJ);
         var1.println(p.q[9097 & -28722] + this.aFf);
         var1.println(p.q[941 & 2953] + this.aCK);
         var1.println(p.q[11162 & 1935] + this.aDJ);
         var1.println(p.q[923 & 17295] + this.aES);
         var1.println(p.q[-18516 & 17295] + this.aDt);
         var1.println(p.q[13199 & -30739] + this.aFi);
         var1.println(p.q[1934 & 910] + this.aEE);
         var1.println(p.q[-13425 & 911] + this.aDs);
         var1.println(p.q[-30757 & 7088] + this.aFd);
         var1.println(p.q[2007 & 17297] + this.aEQ);
         var1.println(p.q[17298 & -23657] + this.aCM);
         var1.println(p.q[21435 & -31849] + this.aDf);
         var1.println(p.q[4022 & 980] + this.aDo);
         var1.println(p.q[949 & -27755] + this.aEB);
         var1.println(p.q[-17513 & 17302] + this.aCl);
         var1.println(p.q[1951 & 7063] + this.aFv);
         var1.println(p.q[-20514 & 17336] + this.aEx);
         var1.println(p.q[-9255 & 1977] + this.aEX);
         var1.println(p.q[-30757 & 5018] + this.aEL);
         var1.println(p.q[927 & 6139] + this.aDA);
         var1.println(p.q[15261 & 1950] + this.aEe);
         var1.println(p.q[5085 & 9119] + this.aDC);
         var1.println(p.q[990 & -31842] + this.aFn);
         var1.println(p.q[5023 & 9119] + this.aDK);
         var1.println(p.q[15338 & 929] + this.aEs);
         var1.println(p.q[4003 & 949] + this.aER);
         var1.println(p.q[-31829 & 29670] + this.aDi);
         var1.println(p.q[-29765 & 17315] + this.aEv);
         var1.println(p.q[5045 & -31834] + this.aFp);
         var1.println(p.q[2983 & -26691] + this.aCm);
         var1.println(p.q[29606 & 3062] + this.aCo);
         var1.println(p.q[14319 & -15449] + this.aCY);
         var1.println(p.q[2986 & 941] + this.aFs);
         var1.println(p.q[-31831 & 10153] + this.aCi);
         var1.println(p.q[17387 & 5038] + this.aEp);
         var1.println(p.q[943 & -22613] + this.aEc);
         var1.println(p.q[943 & 13292] + this.aEY);
         var1.println(p.q[17325 & 10175] + this.aCk);
         var1.println(p.q[9135 & 7086] + this.aEj);
         var1.println(p.q[17327 & -24593] + this.aFB);
         var1.println(p.q[17328 & 14261] + this.aEm);
         var1.println(p.q[-13327 & 14269] + this.aCv);
         var1.println(p.q[21438 & -23565] + this.aDm);
         var1.println(p.q[3003 & 17395] + this.aDZ);
         var1.println(p.q[10165 & 17332] + this.aDh);
         var1.println(p.q[-15363 & 951] + this.aEW);
         var1.println(p.q[2998 & 2039] + this.aCC);
         var1.println(p.q[14263 & 17335] + this.aEI);
         var1.println(p.q[13306 & 3004] + this.aDF);
         var1.println(p.q[6077 & 953] + this.aDX);
         var1.println(p.q[4030 & 954] + this.aDD);
         var1.println(p.q[6139 & 955] + this.aCG);
         var1.println(p.q[6077 & 3070] + this.aCx);
         var1.println(p.q[-19523 & 3005] + this.aEo);
         var1.println(p.q[5118 & 1982] + this.aFg);
         var1.println(p.q[3007 & 22527] + this.aCs);
         var1.println(p.q[3011 & -26640] + this.aEA);
         var1.println(p.q[-29727 & 21445] + this.aCB);
         var1.println(p.q[9154 & -29758] + this.aEC);
         var1.println(p.q[2003 & 963] + this.aFD);
         var1.println(p.q[-6169 & 5060] + this.aEh);
         var1.println(p.q[965 & 5063] + this.aCS);
         var1.println(p.q[-27943 & 17151] + this.aDN.uU() + w.q[11506 & 4214] + this.aDN.bB());
         var1.close();
      } catch (Exception var2) {
         MV.cJ(p.q[29529 & 3995]);
         var2.printStackTrace();
      }

   }

   private static int e(int var0, int[] var1) {
      int var2 = w(var0, var1);
      return var2 < 0 ? var1[0] : var0;
   }

   public static String dh(int var0) {
      return var0 < 0 ? uI.q(p.q[-7209 & 663], var0 + 101) : (var0 < 256 ? Keyboard.getKeyName(var0) : String.format(p.q[5016 & -32040], (char)(var0 - 256)).toUpperCase());
   }

   public void q(iv var1, float var2) {
      this.G.fs().q(var1, var2);
      this.aCR.put(var1, Float.valueOf(var2));
   }

   public boolean uJ() {
      return this.aEU;
   }
}
