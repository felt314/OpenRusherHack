package org.rusherhack;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class Class257 extends URLStreamHandler {
   public Class257(Class218 var1) {
    }

   @Override
   public URLConnection openConnection(URL var1) {
      return new Class280(this, var1);
   }
}
