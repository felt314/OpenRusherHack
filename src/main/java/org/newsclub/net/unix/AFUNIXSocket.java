package org.newsclub.net.unix;
import java.io.IOException;
import java.net.Socket;
public class AFUNIXSocket extends Socket {
   public static AFUNIXSocket newInstance() throws IOException { return new AFUNIXSocket(); }
   public static AFUNIXSocket newInstance(boolean b) throws IOException { return new AFUNIXSocket(); }
}
