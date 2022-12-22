package number4;

import java.io.IOException;

public class WorkWIthCatalogTest {
    public static void main(String[] args) throws IOException {

        String pathDir = "D://mirea//JAVA//new_method//prak_21//txt";
        String pathFile = "D://mirea//JAVA//new_method//prak_21//txt//1.txt";
        WorkWithCatalog ff = new WorkWithCatalog(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }
}
