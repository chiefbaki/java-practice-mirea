package number4;

import java.io.IOException;

public class WorkWIthCatalogTest {
    public static void main(String[] args) throws IOException {

        String pathDir = "D://damadan21JavaDirec";
        String pathFile = "D://damadan21JavaDirec//1234.txt";
        WorkWithCatalog ff = new WorkWithCatalog(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }
}
