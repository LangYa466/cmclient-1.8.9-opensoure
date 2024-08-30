package net.minecraft.client.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {
   public static void main(String[] var0) {
      System.setProperty(.p.q[-24477 & 19067], .q.q[113 & -2563]);
      OptionParser var1 = new OptionParser();
      var1.allowsUnrecognizedOptions();
      var1.accepts(.p.q[484 & 20583]);
      var1.accepts(.p.q[-32409 & 22117]);
      var1.accepts(.p.q[4198 & 103]);
      ArgumentAcceptingOptionSpec var2 = var1.accepts(.w.q[4403 & 19055]).withRequiredArg();
      ArgumentAcceptingOptionSpec var3 = var1.accepts(.p.q[359 & 8423]).withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(25565), new Integer[0]);
      ArgumentAcceptingOptionSpec var4 = var1.accepts(.p.q[16506 & 3180]).withRequiredArg().ofType(File.class).defaultsTo(new File(.q.q[375 & 579]), new File[0]);
      ArgumentAcceptingOptionSpec var5 = var1.accepts(.p.q[2157 & 105]).withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var6 = var1.accepts(.p.q[16491 & 106]).withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var7 = var1.accepts(.p.q[18539 & -32641]).withRequiredArg();
      ArgumentAcceptingOptionSpec var8 = var1.accepts(.p.q[749 & 16492]).withRequiredArg().defaultsTo(.p.q[2157 & 5357], new String[0]).ofType(Integer.class);
      ArgumentAcceptingOptionSpec var9 = var1.accepts(.p.q[2927 & 20718]).withRequiredArg();
      ArgumentAcceptingOptionSpec var10 = var1.accepts(.p.q[-32401 & 9327]).withRequiredArg();
      ArgumentAcceptingOptionSpec var11 = var1.accepts(.e.q[20886 & 9390]).withRequiredArg().defaultsTo(.r.q[5294 & -14169] + .hS.fe() % 1000L, new String[0]);
      ArgumentAcceptingOptionSpec var12 = var1.accepts(.q.q[8807 & -29985]).withRequiredArg();
      ArgumentAcceptingOptionSpec var13 = var1.accepts(.p.q[372 & 20081]).withRequiredArg().required();
      ArgumentAcceptingOptionSpec var14 = var1.accepts(.q.q[-32273 & 1277]).withRequiredArg().required();
      ArgumentAcceptingOptionSpec var15 = var1.accepts(.p.q[-28291 & 241]).withRequiredArg().defaultsTo(.q.q[-24097 & 213], new String[0]);
      ArgumentAcceptingOptionSpec var16 = var1.accepts(.q.q[4412 & -13506]).withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(854), new Integer[0]);
      ArgumentAcceptingOptionSpec var17 = var1.accepts(.q.q[317 & 7997]).withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(480), new Integer[0]);
      ArgumentAcceptingOptionSpec var18 = var1.accepts(.p.q[-11910 & 115]).withRequiredArg().defaultsTo(.w.q[347 & -20134], new String[0]);
      ArgumentAcceptingOptionSpec var19 = var1.accepts(.p.q[1651 & 28799]).withRequiredArg().defaultsTo(.w.q[16767 & -24230], new String[0]);
      ArgumentAcceptingOptionSpec var20 = var1.accepts(.p.q[10101 & -16260]).withRequiredArg();
      ArgumentAcceptingOptionSpec var21 = var1.accepts(.p.q[12541 & -32395]).withRequiredArg().defaultsTo(.i.q[8565 & 7989], new String[0]);
      NonOptionArgumentSpec var22 = var1.nonOptions();
      OptionSet var23 = var1.parse(var0);
      List var24 = var23.valuesOf(var22);
      if (!var24.isEmpty()) {
         System.out.println(.p.q[14582 & -32138] + var24);
      }

      String var25 = (String)var23.valueOf(var7);
      Proxy var26 = Proxy.NO_PROXY;
      if (var25 != null) {
         try {
            var26 = new Proxy(Type.SOCKS, new InetSocketAddress(var25, ((Integer)var23.valueOf(var8)).intValue()));
         } catch (Exception var47) {
            ;
         }
      }

      String var27 = (String)var23.valueOf(var9);
      String var28 = (String)var23.valueOf(var10);
      if (!var26.equals(Proxy.NO_PROXY) && Z(var27) && Z(var28)) {
         Authenticator.setDefault(new net.minecraft.client.main.u(var27, var28));
      }

      int var29 = ((Integer)var23.valueOf(var16)).intValue();
      int var30 = ((Integer)var23.valueOf(var17)).intValue();
      boolean var31 = var23.has(.p.q[6503 & 26221]);
      boolean var32 = var23.has(.p.q[-27034 & 8550]);
      String var33 = (String)var23.valueOf(var14);
      String var34 = (String)var23.valueOf(var15);
      Gson var35 = (new GsonBuilder()).registerTypeAdapter(PropertyMap.class, new Serializer()).create();
      PropertyMap var36 = (PropertyMap)var35.fromJson((String)var23.valueOf(var18), PropertyMap.class);
      PropertyMap var37 = (PropertyMap)var35.fromJson((String)var23.valueOf(var19), PropertyMap.class);
      File var38 = (File)var23.valueOf(var4);
      File var39 = var23.has(var5) ? (File)var23.valueOf(var5) : new File(var38, .e.q[-32283 & 26542]);
      File var40 = var23.has(var6) ? (File)var23.valueOf(var6) : new File(var38, .p.q[2167 & 4599]);
      String var41 = var23.has(var12) ? (String)var12.value(var23) : (String)var11.value(var23);
      String var42 = var23.has(var20) ? (String)var20.value(var23) : null;
      String var43 = (String)var23.valueOf(var2);
      Integer var44 = (Integer)var23.valueOf(var3);
      .PM var45 = new .PM((String)var11.value(var23), var41, (String)var13.value(var23), (String)var21.value(var23));
      net.minecraft.client.main.q var46 = new net.minecraft.client.main.q(new net.minecraft.client.main.y(var45, var36, var37, var26), new net.minecraft.client.main.w(var29, var30, var31, var32), new net.minecraft.client.main.e(var38, var40, var39, var42), new net.minecraft.client.main.r(var33, var34), new net.minecraft.client.main.t(var43, var44.intValue()));
      Runtime.getRuntime().addShutdownHook(new net.minecraft.client.main.i(.p.q[1400 & 20601]));
      Thread.currentThread().setName(.p.q[381 & -18309]);
      (new .hS(var46)).run();
   }

   private static boolean Z(String var0) {
      return var0 != null && !var0.isEmpty();
   }
}
