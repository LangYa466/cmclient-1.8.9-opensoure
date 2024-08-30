import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.lwjgl.opengl.ARBCopyBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GLContext;
import oshi.SystemInfo;
import oshi.hardware.Processor;

public class qa {
   public static int aid;
   public static int aie;
   public static int aif;
   public static boolean aig;
   private static boolean aih;
   public static int aii;
   public static boolean aij;
   public static boolean aik;
   public static int ail;
   public static int aim;
   public static int ain;
   public static int aio;
   public static int aip;
   public static int aiq;
   public static float air = 0.0F;
   public static int ais;
   public static boolean ait;
   private static boolean aiu;
   public static boolean aiv;
   public static int aiw;
   public static int aix;
   public static int aiy;
   public static int aiz;
   public static int aiA;
   private static String aiB = q.q[1548 & 8336];
   public static int aiC;
   public static final int aiD = 4;
   public static int aiE;
   public static int aiF;
   public static int aiG;
   public static boolean aiH;
   private static String aiI;
   private static int aiJ;
   private static boolean aiK;
   public static float aiL = 0.0F;
   private static boolean aiM;
   public static boolean aiN;
   public static boolean aiO;
   public static boolean aiP;
   public static int aiQ;
   public static int aiR;
   public static boolean aiS;
   public static int aiT;
   public static int aiU;
   public static int aiV;
   public static int aiW;
   public static int aiX;
   public static int aiY;
   public static int aiZ;
   public static int aja;
   public static int ajb;
   public static int ajc;
   public static int ajd;
   public static int aje;
   private static boolean ajf;
   public static int ajg;
   public static final int ajh = 7;
   public static int aji;
   public static int ajj;
   private static boolean ajk;
   public static int ajl;
   public static int ajm;

   public static void z(int var0, int var1, int var2, int var3) {
      if (aih) {
         if (aiS) {
            EXTBlendFuncSeparate.glBlendFuncSeparateEXT(var0, var1, var2, var3);
         } else {
            GL14.glBlendFuncSeparate(var0, var1, var2, var3);
         }
      } else {
         GL11.glBlendFunc(var0, var1);
      }

   }

   public static void q(int var0, IntBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform1ARB(var0, var1);
      } else {
         GL20.glUniform1(var0, var1);
      }

   }

   public static void ce(int var0) {
      if (aiu) {
         ARBShaderObjects.glLinkProgramARB(var0);
      } else {
         GL20.glLinkProgram(var0);
      }

   }

   public static void w(int var0, int var1, int var2, int var3, int var4) {
      if (aiv) {
         switch(aiJ) {
         case 0:
            GL30.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 1:
            ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 2:
            EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
         }
      }

   }

   public static void cf(int var0) {
      if (aiu) {
         ARBShaderObjects.glUseProgramObjectARB(var0);
      } else {
         GL20.glUseProgram(var0);
      }

   }

   public static boolean ot() {
      return MV.Rz() ? false : (MV.QW() ? false : aiv && hS.eV().Br.aEZ);
   }

   public static void cg(int var0) {
      if (aiv) {
         switch(aiJ) {
         case 0:
            GL30.glDeleteRenderbuffers(var0);
            break;
         case 1:
            ARBFramebufferObject.glDeleteRenderbuffers(var0);
            break;
         case 2:
            EXTFramebufferObject.glDeleteRenderbuffersEXT(var0);
         }
      }

   }

   public static void bQ(int var0) {
      if (aiK) {
         ARBMultitexture.glActiveTextureARB(var0);
      } else {
         GL13.glActiveTexture(var0);
      }

   }

   public static void S(int var0, int var1) {
      if (aiv) {
         switch(aiJ) {
         case 0:
            GL30.glBindFramebuffer(var0, var1);
            break;
         case 1:
            ARBFramebufferObject.glBindFramebuffer(var0, var1);
            break;
         case 2:
            EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
         }
      }

   }

   public static void q(int var0, boolean var1, FloatBuffer var2) {
      if (aiu) {
         ARBShaderObjects.glUniformMatrix2ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix2(var0, var1, var2);
      }

   }

   public static void w(int var0, boolean var1, FloatBuffer var2) {
      if (aiu) {
         ARBShaderObjects.glUniformMatrix3ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix3(var0, var1, var2);
      }

   }

   public static void q(int var0, int var1, long var2, long var4, long var6) {
      if (aiN) {
         GL31.glCopyBufferSubData(var0, var1, var2, var4, var6);
      } else {
         ARBCopyBuffer.glCopyBufferSubData(var0, var1, var2, var4, var6);
      }

   }

   public static void ch(int var0) {
      if (aiK) {
         ARBMultitexture.glClientActiveTextureARB(var0);
      } else {
         GL13.glClientActiveTexture(var0);
      }

   }

   public static boolean ou() {
      return MV.pH() ? false : (MV.Te() && !aik ? false : aiP && hS.eV().Br.aCI);
   }

   public static String ov() {
      return aiB;
   }

   public static String ow() {
      return aiI == null ? u.q[17357 & -30777] : aiI;
   }

   public static void T(int var0, int var1) {
      if (ajf) {
         ARBVertexBufferObject.glBindBufferARB(var0, var1);
      } else {
         GL15.glBindBuffer(var0, var1);
      }

   }

   public static void q(int var0, ByteBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glShaderSourceARB(var0, var1);
      } else {
         GL20.glShaderSource(var0, var1);
      }

   }

   public static void q(int var0, ByteBuffer var1, int var2) {
      if (ajf) {
         ARBVertexBufferObject.glBufferDataARB(var0, var1, var2);
      } else {
         GL15.glBufferData(var0, var1, var2);
      }

   }

   public static void ci(int var0) {
      if (aiu) {
         ARBShaderObjects.glDeleteObjectARB(var0);
      } else {
         GL20.glDeleteProgram(var0);
      }

   }

   public static void w(int var0, IntBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform3ARB(var0, var1);
      } else {
         GL20.glUniform3(var0, var1);
      }

   }

   public static void cj(int var0) {
      if (aiu) {
         ARBShaderObjects.glDeleteObjectARB(var0);
      } else {
         GL20.glDeleteShader(var0);
      }

   }

   public static void U(int var0, int var1) {
      if (aiu) {
         ARBShaderObjects.glAttachObjectARB(var0, var1);
      } else {
         GL20.glAttachShader(var0, var1);
      }

   }

   public static void q(int var0, long var1, ByteBuffer var3) {
      if (ajf) {
         ARBVertexBufferObject.glBufferSubDataARB(var0, var1, var3);
      } else {
         GL15.glBufferSubData(var0, var1, var3);
      }

   }

   public static void e(int var0, boolean var1, FloatBuffer var2) {
      if (aiu) {
         ARBShaderObjects.glUniformMatrix4ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix4(var0, var1, var2);
      }

   }

   public static void e(int var0, FloatBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform2ARB(var0, var1);
      } else {
         GL20.glUniform2(var0, var1);
      }

   }

   public static String V(int var0, int var1) {
      return aiu ? ARBShaderObjects.glGetInfoLogARB(var0, var1) : GL20.glGetShaderInfoLog(var0, var1);
   }

   public static void q(int var0, float var1, float var2) {
      if (aiK) {
         ARBMultitexture.glMultiTexCoord2fARB(var0, var1, var2);
      } else {
         GL13.glMultiTexCoord2f(var0, var1, var2);
      }

      if (var0 == aiX) {
         air = var1;
         aiL = var2;
      }

   }

   public static boolean ox() {
      return aig;
   }

   public static String W(int var0, int var1) {
      return aiu ? ARBShaderObjects.glGetInfoLogARB(var0, var1) : GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void q(int var0, long var1, int var3) {
      if (ajf) {
         ARBVertexBufferObject.glBufferDataARB(var0, var1, var3);
      } else {
         GL15.glBufferData(var0, var1, var3);
      }

   }

   public static void x(int var0, int var1, int var2, int var3) {
      if (aiv) {
         switch(aiJ) {
         case 0:
            GL30.glRenderbufferStorage(var0, var1, var2, var3);
            break;
         case 1:
            ARBFramebufferObject.glRenderbufferStorage(var0, var1, var2, var3);
            break;
         case 2:
            EXTFramebufferObject.glRenderbufferStorageEXT(var0, var1, var2, var3);
         }
      }

   }

   public static int oy() {
      if (!aiv) {
         return -1;
      } else {
         switch(aiJ) {
         case 0:
            return GL30.glGenFramebuffers();
         case 1:
            return ARBFramebufferObject.glGenFramebuffers();
         case 2:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            return -1;
         }
      }
   }

   public static void e(int var0, IntBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform4ARB(var0, var1);
      } else {
         GL20.glUniform4(var0, var1);
      }

   }

   public static void ck(int var0) {
      if (ajf) {
         ARBVertexBufferObject.glDeleteBuffersARB(var0);
      } else {
         GL15.glDeleteBuffers(var0);
      }

   }

   public static int oz() {
      return ajf ? ARBVertexBufferObject.glGenBuffersARB() : GL15.glGenBuffers();
   }

   public static void oA() {
      MV.Rm();
      ContextCapabilities var0 = GLContext.getCapabilities();
      aiK = var0.GL_ARB_multitexture && !var0.OpenGL13;
      aiM = var0.GL_ARB_texture_env_combine && !var0.OpenGL13;
      aiN = var0.OpenGL31;
      if (aiN) {
         aiA = 36662;
         aiG = 36663;
      } else {
         aiA = 36662;
         aiG = 36663;
      }

      boolean var1 = aiN || var0.GL_ARB_copy_buffer;
      boolean var2 = var0.OpenGL14;
      aik = var1 && var2;
      if (!aik) {
         ArrayList var3 = new ArrayList();
         if (!var1) {
            var3.add(u.q[7075 & 955]);
         }

         if (!var2) {
            var3.add(u.q[-26708 & 932]);
         }

         String var4 = u.q[1959 & 2981] + MV.z(var3);
         MV.cM(var4);
         aiB = aiB + var4 + q.q[498 & 16434];
      }

      if (aiK) {
         aiB = aiB + u.q[6070 & 9135];
         aji = 33984;
         aiX = 33985;
         ain = 33986;
      } else {
         aiB = aiB + u.q[12207 & 935];
         aji = 33984;
         aiX = 33985;
         ain = 33986;
      }

      if (aiM) {
         aiB = aiB + u.q[2026 & 9129];
         aiq = 34160;
         aiw = 34165;
         aiY = 34167;
         aie = 34166;
         ajb = 34168;
         aiR = 34161;
         aim = 34176;
         ajl = 34177;
         aiE = 34178;
         aje = 34192;
         aiT = 34193;
         ajj = 34194;
         aiW = 34162;
         aif = 34184;
         aiV = 34185;
         aiy = 34186;
         aiF = 34200;
         aio = 34201;
         ajd = 34202;
      } else {
         aiB = aiB + u.q[20409 & -31831];
         aiq = 34160;
         aiw = 34165;
         aiY = 34167;
         aie = 34166;
         ajb = 34168;
         aiR = 34161;
         aim = 34176;
         ajl = 34177;
         aiE = 34178;
         aje = 34192;
         aiT = 34193;
         ajj = 34194;
         aiW = 34162;
         aif = 34184;
         aiV = 34185;
         aiy = 34186;
         aiF = 34200;
         aio = 34201;
         ajd = 34202;
      }

      aiS = var0.GL_EXT_blend_func_separate && !var0.OpenGL14;
      aih = var0.OpenGL14 || var0.GL_EXT_blend_func_separate;
      aiv = aih && (var0.GL_ARB_framebuffer_object || var0.GL_EXT_framebuffer_object || var0.OpenGL30);
      if (aiv) {
         aiB = aiB + u.q[5050 & 3050];
         if (var0.OpenGL30) {
            aiB = aiB + u.q[939 & 18347];
            aiJ = 0;
            aja = 36160;
            ajm = 36161;
            aip = 36064;
            aid = 36096;
            aiU = 36053;
            aiQ = 36054;
            ajg = 36055;
            ail = 36059;
            aiz = 36060;
         } else if (var0.GL_ARB_framebuffer_object) {
            aiB = aiB + u.q[943 & -30740];
            aiJ = 1;
            aja = 36160;
            ajm = 36161;
            aip = 36064;
            aid = 36096;
            aiU = 36053;
            ajg = 36055;
            aiQ = 36054;
            ail = 36059;
            aiz = 36060;
         } else if (var0.GL_EXT_framebuffer_object) {
            aiB = aiB + u.q[27629 & -31827];
            aiJ = 2;
            aja = 36160;
            ajm = 36161;
            aip = 36064;
            aid = 36096;
            aiU = 36053;
            ajg = 36055;
            aiQ = 36054;
            ail = 36059;
            aiz = 36060;
         }
      } else {
         aiB = aiB + u.q[-15426 & 942];
         aiB = aiB + u.q[943 & -30737] + (var0.OpenGL14 ? q.q[2291 & 22016] : u.q[952 & 17328]) + u.q[951 & 4081];
         aiB = aiB + u.q[2995 & 950] + (var0.GL_EXT_blend_func_separate ? q.q[9732 & -30718] : u.q[-15440 & 2041]) + u.q[9137 & -28751];
         aiB = aiB + u.q[7091 & -7245] + (var0.OpenGL30 ? q.q[-8152 & 5] : u.q[-31824 & 5046]) + u.q[10163 & -31755];
         aiB = aiB + u.q[3004 & 17334] + (var0.GL_ARB_framebuffer_object ? q.q[-13056 & 583] : u.q[10230 & -29768]) + u.q[949 & 1023];
         aiB = aiB + u.q[951 & 7102] + (var0.GL_EXT_framebuffer_object ? q.q[4456 & 1538] : u.q[1019 & 6064]) + u.q[-28745 & 1015];
      }

      aij = var0.OpenGL21;
      ajk = aij || var0.GL_ARB_vertex_shader && var0.GL_ARB_fragment_shader && var0.GL_ARB_shader_objects;
      aiB = aiB + u.q[9213 & -30792] + (ajk ? q.q[194 & -24044] : u.q[13236 & -31815]) + u.q[3005 & 9145];
      if (ajk) {
         if (var0.OpenGL21) {
            aiB = aiB + u.q[-27718 & 2046];
            aiu = false;
            aix = 35714;
            ajc = 35713;
            ais = 35633;
            aiC = 35632;
         } else {
            aiB = aiB + u.q[4031 & 1019];
            aiu = true;
            aix = 35714;
            ajc = 35713;
            ais = 35633;
            aiC = 35632;
         }
      } else {
         aiB = aiB + u.q[3005 & 17406] + (var0.OpenGL21 ? q.q[16 & 16904] : u.q[-15438 & 956]) + u.q[-15439 & 11189];
         aiB = aiB + u.q[3005 & 957] + (var0.GL_ARB_shader_objects ? q.q[-16255 & 9268] : u.q[1968 & 5054]) + u.q[953 & 4017];
         aiB = aiB + u.q[959 & -27714] + (var0.GL_ARB_vertex_shader ? q.q[16384 & 4642] : u.q[3060 & 944]) + u.q[20479 & -23627];
         aiB = aiB + u.q[7103 & 959] + (var0.GL_ARB_fragment_shader ? q.q[-23482 & 22536] : u.q[1972 & 944]) + u.q[3063 & 21431];
      }

      aig = aiv && ajk;
      String var6 = GL11.glGetString(7936).toLowerCase();
      aiO = var6.contains(q.q[201 & -30487]);
      ajf = !var0.OpenGL15 && var0.GL_ARB_vertex_buffer_object;
      aiP = var0.OpenGL15 || ajf;
      aiB = aiB + u.q[962 & 18420] + (aiP ? q.q[12422 & -32247] : u.q[-19528 & 17332]) + u.q[19389 & 9145];
      if (aiP) {
         if (ajf) {
            aiB = aiB + u.q[-29755 & 1985];
            aiZ = 35044;
            aii = 34962;
         } else {
            aiB = aiB + u.q[5067 & -21550];
            aiZ = 35044;
            aii = 34962;
         }
      }

      ait = var6.contains(r.q[4983 & -15437]);
      if (ait) {
         if (aiP) {
            aiH = true;
         } else {
            vO.aFK.al(16.0F);
         }
      }

      try {
         Processor[] var7 = (new SystemInfo()).getHardware().getProcessors();
         aiI = String.format(u.q[-8241 & 9155], var7.length, var7[0]).replaceAll(u.q[17350 & 13252], q.q[-24230 & 4971]);
      } catch (Throwable var5) {
         ;
      }

   }

   public static void X(int var0, int var1) {
      if (aiv) {
         switch(aiJ) {
         case 0:
            GL30.glBindRenderbuffer(var0, var1);
            break;
         case 1:
            ARBFramebufferObject.glBindRenderbuffer(var0, var1);
            break;
         case 2:
            EXTFramebufferObject.glBindRenderbufferEXT(var0, var1);
         }
      }

   }

   public static void r(int var0, FloatBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform1ARB(var0, var1);
      } else {
         GL20.glUniform1(var0, var1);
      }

   }

   public static void r(int var0, IntBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform2ARB(var0, var1);
      } else {
         GL20.glUniform2(var0, var1);
      }

   }

   public static int oB() {
      if (!aiv) {
         return -1;
      } else {
         switch(aiJ) {
         case 0:
            return GL30.glGenRenderbuffers();
         case 1:
            return ARBFramebufferObject.glGenRenderbuffers();
         case 2:
            return EXTFramebufferObject.glGenRenderbuffersEXT();
         default:
            return -1;
         }
      }
   }

   public static void c(int var0, int var1, int var2, int var3) {
      if (aiv) {
         switch(aiJ) {
         case 0:
            GL30.glFramebufferRenderbuffer(var0, var1, var2, var3);
            break;
         case 1:
            ARBFramebufferObject.glFramebufferRenderbuffer(var0, var1, var2, var3);
            break;
         case 2:
            EXTFramebufferObject.glFramebufferRenderbufferEXT(var0, var1, var2, var3);
         }
      }

   }

   public static int oC() {
      return aiu ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
   }

   public static void Y(int var0, int var1) {
      if (aiu) {
         ARBShaderObjects.glUniform1iARB(var0, var1);
      } else {
         GL20.glUniform1i(var0, var1);
      }

   }

   public static void cl(int var0) {
      if (aiu) {
         ARBShaderObjects.glCompileShaderARB(var0);
      } else {
         GL20.glCompileShader(var0);
      }

   }

   public static int cm(int var0) {
      return aiu ? ARBShaderObjects.glCreateShaderObjectARB(var0) : GL20.glCreateShader(var0);
   }

   public static int Z(int var0, int var1) {
      return aiu ? ARBShaderObjects.glGetObjectParameteriARB(var0, var1) : GL20.glGetShaderi(var0, var1);
   }

   public static void t(int var0, FloatBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform4ARB(var0, var1);
      } else {
         GL20.glUniform4(var0, var1);
      }

   }

   public static void cn(int var0) {
      if (aiv) {
         switch(aiJ) {
         case 0:
            GL30.glDeleteFramebuffers(var0);
            break;
         case 1:
            ARBFramebufferObject.glDeleteFramebuffers(var0);
            break;
         case 2:
            EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
         }
      }

   }

   public static int co(int var0) {
      if (!aiv) {
         return -1;
      } else {
         switch(aiJ) {
         case 0:
            return GL30.glCheckFramebufferStatus(var0);
         case 1:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case 2:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            return -1;
         }
      }
   }

   public static int q(int var0, CharSequence var1) {
      return aiu ? ARBVertexShader.glGetAttribLocationARB(var0, var1) : GL20.glGetAttribLocation(var0, var1);
   }

   public static void y(int var0, FloatBuffer var1) {
      if (aiu) {
         ARBShaderObjects.glUniform3ARB(var0, var1);
      } else {
         GL20.glUniform3(var0, var1);
      }

   }

   public static int aa(int var0, int var1) {
      return aiu ? ARBShaderObjects.glGetObjectParameteriARB(var0, var1) : GL20.glGetProgrami(var0, var1);
   }

   public static int w(int var0, CharSequence var1) {
      return aiu ? ARBShaderObjects.glGetUniformLocationARB(var0, var1) : GL20.glGetUniformLocation(var0, var1);
   }
}
