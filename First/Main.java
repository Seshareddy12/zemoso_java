package First;

import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.File;
import java.io.FileFilter;




public class Main {

    public static void main(String[] args) {
	  File f = new File("./");
	  FileFilter ff = new WildcardFileFilter("de");
        File[] files = f.listFiles(ff);
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
