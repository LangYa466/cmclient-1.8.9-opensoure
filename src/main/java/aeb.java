import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public final class aeB {
   public static final RequestConfig dna = RequestConfig.custom().setConnectionRequestTimeout(30134 & 32569).setConnectTimeout(32560 & 30012).setSocketTimeout(-720 & 30641).build();
   public static final String dnb = "42a60a84-599d-44b2-a7c6-b00cdef1d6a2";
   public static final int dnc = 25575;

   public static CompletableFuture q(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(() -> {
          return null;
      }, var1);
   }

   public static CompletableFuture q(Consumer var0, Executor var1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            String var1 = RandomStringUtils.randomAlphanumeric(140 & -32440);
            HttpServer var2 = HttpServer.create(new InetSocketAddress(25583 & -7177), 2088 & -31726);
            CountDownLatch var3 = new CountDownLatch(1537 & 16471);
            AtomicReference var4 = new AtomicReference((Object)null);
            AtomicReference var5 = new AtomicReference((Object)null);
            var2.createContext(o.q[-3077 & 23475 & 25465 & 4953], (var4x) -> {
               Map var5x = (Map)URLEncodedUtils.parse(var4x.getRequestURI().toString().replaceAll(o.q[-5285 & 30554 & 7134 & 7102], q.q[10422 & 27653 & -14829 & 19732]), StandardCharsets.UTF_8).stream().collect(Collectors.toMap(NameValuePair::getName, NameValuePair::getValue));
               if (!var1.equals(var5x.get(r.q[-21587 & -15575 & 26351 & 11947]))) {
                  String var10001 = o.q[3067 & -13445 & 32575 & 6047];
                  Object[] var10002 = new Object[17026 & -32494];
                  var10002[4360 & 17428] = var1;
                  var10002[16673 & 8213] = var5x.get(r.q[-26625 & 9835 & -13399 & -15701]);
                  var5.set(String.format(var10001, var10002));
               } else if (var5x.containsKey(o.q[-11429 & -13350 & 6000 & 16176])) {
                  var4.set(var5x.get(o.q[-27816 & 29496 & 11025 & 17328]));
               } else if (var5x.containsKey(o.q[-25881 & -25625 & -27653 & 26619])) {
                  String var8 = o.q[17380 & 3053 & -24859 & 22255];
                  Object[] var9 = new Object[2055 & 16394];
                  var9[9 & 1042] = var5x.get(o.q[-17693 & -9497 & 19179 & 26603]);
                  var9[19073 & 5185] = var5x.get(o.q[-29793 & 21503 & 16237 & 25468]);
                  var5.set(String.format(var8, var9));
               }

               InputStream var6 = aeB.class.getResourceAsStream(o.q[5022 & 9054 & -5187 & -25667]);
               byte[] var7 = var6 != null ? IOUtils.toByteArray(var6) : new byte[259 & 3584];
               var4x.getResponseHeaders().add(u.q[-22530 & 5118 & 17147 & 18430], o.q[-4289 & 27423 & -27811 & 19229]);
               var4x.sendResponseHeaders(4826 & 25036, (long)var7.length);
               var4x.getResponseBody().write(var7);
               var4x.getResponseBody().close();
               var3.countDown();
            });
            URIBuilder var10000 = (new URIBuilder(o.q[17311 & -14529 & -10382 & -25677])).addParameter(i.q[9211 & -27655 & 5117 & -19463], o.q[28655 & 959 & 27559 & 25358]).addParameter(o.q[4051 & 23315 & -3109 & -4133], o.q[26394 & -10380 & -17576 & 29656]);
            String var10001 = o.q[23432 & 28508 & -22757 & 26553];
            String var10002 = o.q[23501 & -1187 & 10041 & 30651];
            Object[] var10003 = new Object[-30655 & 29317];
            var10003[-9984 & 753] = var2.getAddress().getPort();
            URIBuilder var6 = var10000.addParameter(var10001, String.format(var10002, var10003)).addParameter(o.q[-10316 & -28875 & 14175 & -3108], o.q[-23721 & 1813 & 15285 & 19445]).addParameter(r.q[-32019 & -25041 & 28271 & -4549], var1).addParameter(r.q[29965 & -11444 & 11663 & 5039], o.q[3966 & 23543 & 3862 & 854]);
            URI var7 = var6.build();
            var0.accept(var7);
            boolean var13 = false;

            String var8;
            try {
               var13 = true;
               var2.start();
               var3.await();
               var8 = (String)Optional.ofNullable(var4.get()).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? 18819 & 8273 : 104 & -28540);
               }).orElseThrow(() -> {
                  return new Exception((String)Optional.ofNullable(var5.get()).orElse(o.q[-3267 & 31549 & -27685 & 3003]));
               });
               var13 = false;
            } finally {
               if (var13) {
                  var2.stop(579 & 20494);
               }
            }

            var2.stop(770 & -32758);
            return var8;
         } catch (InterruptedException var15) {
            throw new CancellationException(o.q[-25769 & 13207 & 24479 & -28897]);
         } catch (Exception var16) {
            throw new CompletionException(o.q[-1094 & -17604 & 2015 & 10238], var16);
         }
      }, var1);
   }

   public static CompletableFuture w(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            CloseableHttpClient var1 = HttpClients.createMinimal();
            Throwable var2 = null;

            HashMap var9;
            try {
               HttpPost var3 = new HttpPost(URI.create(o.q[1909 & 3061 & -12539 & -4249]));
               var3.setConfig(dna);
               var3.setHeader(u.q[-16389 & 14074 & -23814 & 2811], u.q[2043 & 1791 & -12289 & -11269]);
               BasicNameValuePair[] var10003 = new BasicNameValuePair[-14314 & 10124];
               var10003[4160 & -32224] = new BasicNameValuePair(i.q[-31745 & 7161 & 30713 & 14329], o.q[-8305 & 23430 & 4030 & -26833]);
               var10003[-26479 & 3] = new BasicNameValuePair(o.q[18207 & 7959 & -27865 & -25753], o.q[-23729 & -8353 & -16465 & 7087]);
               var10003[-25598 & 9027] = new BasicNameValuePair(o.q[17306 & 20411 & -20587 & -239], var0);
               int var10005 = 28867 & 11;
               String var10008 = o.q[21467 & -10357 & -22740 & 5933];
               String var10009 = o.q[-9239 & -14421 & 22381 & 7133];
               Object[] var10010 = new Object[7193 & 16387];
               var10010[82 & -28032] = 25575 & -7185;
               var10003[var10005] = new BasicNameValuePair(var10008, String.format(var10009, var10010));
               var3.setEntity(new UrlEncodedFormEntity(Arrays.asList(var10003), u.q[13759 & 9727 & -2241 & -31937]));
               CloseableHttpResponse var4 = var1.execute(var3);
               JsonObject var5 = (new JsonParser()).parse(EntityUtils.toString(var4.getEntity())).getAsJsonObject();
               String var6 = (String)Optional.ofNullable(var5.get(q.q[-11283 & -26449 & 9724 & 32253])).map(JsonElement::getAsString).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? 9353 & -30399 : 81 & 512);
               }).orElseThrow(() -> {
                  Exception var10000 = new Exception;
                  String var1;
                  if (var5.has(o.q[1023 & -31773 & 12271 & 13055])) {
                     var1 = o.q[-15617 & -12553 & -8476 & 7925];
                     Object[] var10003 = new Object[-15550 & 10258];
                     var10003[4225 & 66] = var5.get(o.q[7907 & 4071 & -15641 & 27367]).getAsString();
                     var10003[21249 & 193] = var5.get(o.q[-3299 & 6991 & 21262 & 25390]).getAsString();
                     var1 = String.format(var1, var10003);
                  } else {
                     var1 = o.q[-1058 & 27647 & -11362 & -24754];
                  }

                  var10000.<init>(var1);
                  return var10000;
               });
               String var7 = (String)Optional.ofNullable(var5.get(q.q[5295 & 11519 & -23573 & -21013])).map(JsonElement::getAsString).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? 20489 & 11729 : 284 & -31646);
               }).orElseThrow(() -> {
                  Exception var10000 = new Exception;
                  String var1;
                  if (var5.has(o.q[4843 & 6131 & 6127 & 4071])) {
                     var1 = o.q[-29978 & -5403 & 30454 & 28391];
                     Object[] var10003 = new Object[103 & 24602];
                     var10003[16433 & 72] = var5.get(o.q[999 & 23551 & -257 & 6891]).getAsString();
                     var10003[4673 & -24527] = var5.get(o.q[29628 & -23777 & -10321 & 24559]).getAsString();
                     var1 = String.format(var1, var10003);
                  } else {
                     var1 = o.q[17373 & -19619 & 1965 & 1967];
                  }

                  var10000.<init>(var1);
                  return var10000;
               });
               HashMap var8 = new HashMap();
               var8.put(q.q[3052 & -15636 & -12884 & -13140], var6);
               var8.put(q.q[-14613 & -27413 & 6575 & 15807], var7);
               var9 = var8;
            } catch (Throwable var20) {
               var2 = var20;
               throw var20;
            } finally {
               if (var1 != null) {
                  if (var2 != null) {
                     try {
                        var1.close();
                     } catch (Throwable var19) {
                        var2.addSuppressed(var19);
                     }
                  } else {
                     var1.close();
                  }
               }

            }

            return var9;
         } catch (InterruptedException var22) {
            throw new CancellationException(o.q[18223 & 24463 & -5157 & -17622]);
         } catch (Exception var23) {
            throw new CompletionException(o.q[-29797 & 17323 & -85 & -1221], var23);
         }
      }, var1);
   }

   public static CompletableFuture e(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            CloseableHttpClient var1 = HttpClients.createMinimal();
            Throwable var2 = null;

            String var8;
            try {
               HttpPost var3 = new HttpPost(URI.create(o.q[18427 & 2811 & 31483 & 29439]));
               JsonObject var4 = new JsonObject();
               JsonObject var5 = new JsonObject();
               var5.addProperty(o.q[15100 & 15358 & -23812 & 6910], o.q[8959 & 767 & 26623 & 13053]);
               var5.addProperty(o.q[-26626 & 3070 & -13570 & 5887], o.q[-12545 & 28415 & -29953 & -32001]);
               String var10001 = o.q[-28832 & -10392 & 1979 & 907];
               String var10002 = o.q[21249 & 29617 & -9297 & -21525];
               Object[] var10003 = new Object[10307 & 18189];
               var10003[-32766 & 17428] = var0;
               var5.addProperty(var10001, String.format(var10002, var10003));
               var4.add(w.q[-24581 & -1070 & 27635 & 9186], var5);
               var4.addProperty(o.q[16373 & 20223 & -11523 & -3079], o.q[-8337 & -11418 & 14242 & 12162]);
               var4.addProperty(o.q[21495 & 31479 & -2061 & -22537], o.q[14070 & -18698 & -13316 & -20483]);
               var3.setConfig(dna);
               var3.setHeader(u.q[23550 & 23551 & 11002 & 9210], o.q[-32024 & 21224 & -4359 & -17413]);
               var3.setEntity(new StringEntity(var4.toString()));
               CloseableHttpResponse var6 = var1.execute(var3);
               JsonObject var7 = var6.getStatusLine().getStatusCode() == (7421 & 24776) ? (new JsonParser()).parse(EntityUtils.toString(var6.getEntity())).getAsJsonObject() : new JsonObject();
               var8 = (String)Optional.ofNullable(var7.get(q.q[2815 & 12271 & 9663 & 16375])).map(JsonElement::getAsString).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? 259 & 1089 : 2048 & -32660);
               }).orElseThrow(() -> {
                  Exception var10000 = new Exception;
                  String var1;
                  if (var7.has(o.q[28663 & 17151 & 9207 & 10231])) {
                     var1 = o.q[4095 & 12277 & 21500 & -32028];
                     Object[] var10003 = new Object[9539 & 4134];
                     var10003[18970 & 4384] = var7.get(o.q[31735 & 31487 & -14593 & 1791]).getAsString();
                     var10003[-23887 & 73] = var7.get(o.q[28670 & 32766 & -30981 & 31740]).getAsString();
                     var1 = String.format(var1, var10003);
                  } else {
                     var1 = o.q[750 & 7150 & 1772 & 6124];
                  }

                  var10000.<init>(var1);
                  return var10000;
               });
            } catch (Throwable var19) {
               var2 = var19;
               throw var19;
            } finally {
               if (var1 != null) {
                  if (var2 != null) {
                     try {
                        var1.close();
                     } catch (Throwable var18) {
                        var2.addSuppressed(var18);
                     }
                  } else {
                     var1.close();
                  }
               }

            }

            return var8;
         } catch (InterruptedException var21) {
            throw new CancellationException(o.q[-7301 & -17537 & -21629 & 939]);
         } catch (Exception var22) {
            var22.printStackTrace();
            throw new CompletionException(o.q[4870 & 25364 & 3879 & 3895], var22);
         }
      }, var1);
   }

   public static CompletableFuture r(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            CloseableHttpClient var21 = HttpClients.createMinimal();
            Throwable var2 = null;

            Map var9;
            try {
               HttpPost var3 = new HttpPost(o.q[23277 & 6909 & -22529 & -17665]);
               JsonObject var4 = new JsonObject();
               JsonObject var5 = new JsonObject();
               JsonArray var6 = new JsonArray();
               var6.add(new JsonPrimitive(var0));
               var5.addProperty(o.q[-25858 & -11538 & 8943 & -21778], o.q[25327 & -26881 & -23569 & 3055]);
               var5.add(o.q[25338 & 17140 & 7162 & 27377], var6);
               var4.add(w.q[6118 & -30742 & -6198 & -31805], var5);
               var4.addProperty(o.q[-9487 & 23539 & -23815 & -21765], o.q[-8206 & 3826 & 21234 & -8462]);
               var4.addProperty(o.q[2039 & 8951 & -14341 & -14341], o.q[15094 & 32511 & -23563 & 19444]);
               var3.setConfig(dna);
               var3.setHeader(u.q[17150 & 766 & -10246 & -12293], o.q[9966 & 9962 & 19449 & 23546]);
               var3.setEntity(new StringEntity(var4.toString()));
               CloseableHttpResponse var7 = var21.execute(var3);
               JsonObject var8 = var7.getStatusLine().getStatusCode() == (5880 & 200) ? (new JsonParser()).parse(EntityUtils.toString(var7.getEntity())).getAsJsonObject() : new JsonObject();
               var9 = (Map)Optional.ofNullable(var8.get(q.q[-28441 & 8447 & -22089 & 11759])).map(JsonElement::getAsString).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? 1025 & 4709 : 326 & 24577);
               }).map((var1x) -> {
                  String var2 = var8.get(o.q[-2307 & -18695 & 4857 & -5379]).getAsJsonObject().get(o.q[9979 & 2043 & 20223 & -5378]).getAsJsonArray().get(9374 & 256).getAsJsonObject().get(q.q[4029 & -24643 & 27304 & -20055]).getAsString();
                  HashMap var3 = new HashMap();
                  var3.put(q.q[-17225 & 6583 & 16639 & 1767], var1x);
                  var3.put(q.q[23288 & 22521 & 2473 & -5975], var2);
                  return var3;
               }).orElseThrow(() -> {
                  Exception var10000 = new Exception;
                  String var1;
                  if (var8.has(o.q[-22537 & -30729 & 31735 & 29439])) {
                     var1 = o.q[10996 & -3081 & -32017 & -14353];
                     Object[] var10003 = new Object[-18165 & 1666];
                     var10003[112 & -23040] = var8.get(o.q[17143 & -2305 & 4095 & 7935]).getAsString();
                     var10003[8195 & 4121] = var8.get(o.q[-15368 & -27655 & -30979 & 4861]).getAsString();
                     var1 = String.format(var1, var10003);
                  } else {
                     var1 = o.q[13036 & 25324 & -30721 & 3823];
                  }

                  return var10000;
               });
            } catch (Throwable var20) {
               var2 = var20;
               throw var20;
            } finally {
               if (var1 != null) {
                  if (var2 != null) {
                     try {
                        var1.close();
                     } catch (Throwable var19) {
                        var2.addSuppressed(var19);
                     }
                  } else {
                     var1.close();
                  }
               }

            }

            return var9;
         } catch (InterruptedException var22) {
            throw new CancellationException(o.q[8183 & 15093 & 25589 & 29693]);
         } catch (Exception var23) {
            throw new CompletionException(o.q[-22793 & 1783 & 13302 & 7934], var23);
         }
      }, var1);
   }

   public static CompletableFuture q(Executor var0) {
      return q(aew.atw()::r, var0);
   }

   public static CompletableFuture t(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            CloseableHttpClient var1 = HttpClients.createMinimal();
            Throwable var2 = null;

            HashMap var9;
            try {
               HttpPost var3 = new HttpPost(URI.create(o.q[3045 & -4203 & -22673 & 1837]));
               var3.setConfig(dna);
               var3.setHeader(u.q[-6146 & 3070 & -11269 & 19199], u.q[-23557 & -7425 & 17147 & -9473]);
               BasicNameValuePair[] var10003 = new BasicNameValuePair[294 & 8213];
               var10003[7209 & 66] = new BasicNameValuePair(i.q[22521 & 17403 & 14333 & 28669], o.q[15110 & -20674 & -10354 & -1106]);
               var10003[1121 & 16909] = new BasicNameValuePair(o.q[-29801 & 15239 & 4975 & -9425], q.q[-21781 & -19989 & -8469 & 20927]);
               var10003[2826 & 16515] = new BasicNameValuePair(q.q[30399 & 19711 & -21265 & -23893], var0);
               int var10005 = 3971 & -28609;
               String var10008 = o.q[-8342 & -28821 & 15228 & -11382];
               String var10009 = o.q[-27877 & 1883 & 1999 & -28723];
               Object[] var10010 = new Object[301 & 8403];
               var10010[392 & 6672] = 25583 & 31719;
               var10003[var10005] = new BasicNameValuePair(var10008, String.format(var10009, var10010));
               var3.setEntity(new UrlEncodedFormEntity(Arrays.asList(var10003), u.q[-4225 & -3201 & 22975 & 15807]));
               CloseableHttpResponse var4 = var1.execute(var3);
               JsonObject var5 = (new JsonParser()).parse(EntityUtils.toString(var4.getEntity())).getAsJsonObject();
               String var6 = (String)Optional.ofNullable(var5.get(q.q[5310 & -27460 & -32531 & 9981])).map(JsonElement::getAsString).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? 9833 & 18449 : 18769 & 130);
               }).orElseThrow(() -> {
                  Exception var10000 = new Exception;
                  String var1;
                  if (var5.has(o.q[11247 & 19455 & 5875 & 5883])) {
                     var1 = o.q[9212 & 13038 & -24841 & -12553];
                     Object[] var10003 = new Object[5138 & -31798];
                     var10003[-23856 & 17416] = var5.get(o.q[9215 & 13311 & -13589 & -16413]).getAsString();
                     var10003[711 & 4401] = var5.get(o.q[973 & 18398 & 29470 & 29518]).getAsString();
                     var1 = String.format(var1, var10003);
                  } else {
                     var1 = o.q[-23602 & -21618 & 3919 & -31889];
                  }

                  return var10000;
               });
               String var7 = (String)Optional.ofNullable(var5.get(q.q[5291 & 7915 & -16977 & -15889])).map(JsonElement::getAsString).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? -16207 & 4097 : 2088 & 21316);
               }).orElseThrow(() -> {
                  Exception var10000 = new Exception;
                  String var1;
                  if (var5.has(o.q[-1305 & 22519 & -31773 & -18457])) {
                     var1 = o.q[-25866 & -15617 & 22254 & 20452];
                     Object[] var10003 = new Object[17794 & 2058];
                     var10003[216 & 258] = var5.get(o.q[-9493 & 7159 & 18427 & -14349]).getAsString();
                     var10003[25809 & -32473] = var5.get(o.q[-17604 & -21636 & 910 & 876]).getAsString();
                     var1 = String.format(var1, var10003);
                  } else {
                     var1 = o.q[-1233 & 13231 & -9441 & -13539];
                  }

                  return var10000;
               });
               HashMap var8 = new HashMap();
               var8.put(q.q[-1812 & -18258 & 18367 & -5201], var6);
               var8.put(q.q[15035 & 955 & 23743 & 17583], var7);
               var9 = var8;
            } catch (Throwable var20) {
               var2 = var20;
               throw var20;
            } finally {
               if (var1 != null) {
                  if (var2 != null) {
                     try {
                        var1.close();
                     } catch (Throwable var19) {
                        var2.addSuppressed(var19);
                     }
                  } else {
                     var1.close();
                  }
               }

            }

            return var9;
         } catch (InterruptedException var22) {
            throw new CancellationException(o.q[13162 & 7018 & -22722 & -16546]);
         } catch (Exception var23) {
            throw new CompletionException(o.q[10059 & 25483 & 27531 & 19275], var23);
         }
      }, var1);
   }

   public static CompletableFuture q(String var0, String var1, Executor var2) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            CloseableHttpClient var2 = HttpClients.createMinimal();
            Throwable var3 = null;

            String var7;
            try {
               HttpPost var4 = new HttpPost(URI.create(o.q[2023 & 5103 & -11545 & -7193]));
               var4.setConfig(dna);
               var4.setHeader(u.q[2043 & -14341 & -15618 & 1019], o.q[-2328 & 9960 & 20460 & 764]);
               String var10003 = o.q[19195 & 1019 & 8175 & 8189];
               Object[] var10004 = new Object[3354 & 16518];
               var10004[-32764 & 15681] = var1;
               var10004[8705 & -9207] = var0;
               var4.setEntity(new StringEntity(String.format(var10003, var10004)));
               CloseableHttpResponse var5 = var2.execute(var4);
               JsonObject var6 = (new JsonParser()).parse(EntityUtils.toString(var5.getEntity())).getAsJsonObject();
               var7 = (String)Optional.ofNullable(var6.get(q.q[13229 & 13997 & -5972 & -14162])).map(JsonElement::getAsString).filter((var0x) -> {
                  return (boolean)(!StringUtils.isBlank(var0x) ? 513 & 11273 : 20272 & 8197);
               }).orElseThrow(() -> {
                  Exception var10000 = new Exception;
                  String var1;
                  if (var6.has(o.q[24307 & 30439 & -28697 & -21525])) {
                     var1 = o.q[748 & 1773 & -13321 & 26356];
                     Object[] var10003 = new Object[-32061 & 31022];
                     var10003[813 & 8384] = var6.get(o.q[-3357 & 2795 & -20509 & -12289]).getAsString();
                     var10003[20515 & 521] = var6.get(o.q[997 & 2021 & -23817 & -13593]).getAsString();
                     var1 = String.format(var1, var10003);
                  } else {
                     var1 = o.q[26622 & 3054 & 31470 & 28412];
                  }

                  var10000.<init>(var1);
                  return var10000;
               });
            } catch (Throwable var18) {
               var3 = var18;
               throw var18;
            } finally {
               if (var2 != null) {
                  if (var3 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var17) {
                        var3.addSuppressed(var17);
                     }
                  } else {
                     var2.close();
                  }
               }

            }

            return var7;
         } catch (InterruptedException var20) {
            throw new CancellationException(o.q[-27906 & -18706 & -17429 & 12271]);
         } catch (Exception var21) {
            throw new CompletionException(o.q[19455 & 20219 & 29423 & 6891], var21);
         }
      }, var2);
   }
}
