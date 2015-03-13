package java7.cl;

import java.net.URL;
import java.net.URLClassLoader;

public class UrlClassLoaderTest {
    
    public static void main(String[] args) throws Exception {
        URL gson = new URL("file:/Users/zxh/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.3.1/ecb6e1f8e4b0e84c4b886c2f14a1500caf309757/gson-2.3.1.jar");
        URLClassLoader loader1 = new URLClassLoader(new URL[]{gson});
        URLClassLoader loader2 = new URLClassLoader(new URL[]{gson});
        
        Class<?> c1 = loader1.loadClass("com.google.gson.Gson");
        Class<?> c2 = loader2.loadClass("com.google.gson.Gson");
        System.out.println(c1 == c2);
    }
    
}
