package org.newsclub.net.unix;
import java.io.File;
import java.net.SocketAddress;
public class AFUNIXSocketAddress extends SocketAddress {
   public static AFUNIXSocketAddress of(File f) { return new AFUNIXSocketAddress(); }
   public static AFUNIXSocketAddress of(String s) { return new AFUNIXSocketAddress(); }

   public static AFUNIXSocketAddress m101(File f) { return of(f); }
}
