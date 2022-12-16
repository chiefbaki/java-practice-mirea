package number4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkWithCatalog {

    ArrayList <File> list;
    public WorkWithCatalog (String Path) throws IOException
    {

        System.out.println("----------------------------------");
        System.out.println("A list of files a direcktory..." + Path);
        System.out.println("----------------------------------");

        list = new ArrayList<File>();
        File f = new File (Path);
        File[] listFiles = f.listFiles();
        int i=0;
        for(File f1 :listFiles){
            list.add(f1);
            System.out.println(list.get(i++));
        }
    }

    public ArrayList<File> getList(){
        return list;
    }

    public File getIndex(int i){
        return list.get(i);
    }

    public void WriteToFileList(String path) throws IOException
    {
        System.out.println("------------------------------------");
        System.out.println("Write to the file list..." + path);
        System.out.println("------------------------------------");

        byte [] bt;
        try (FileOutputStream inFile = new FileOutputStream(path)){

            for(File f: list){
                bt = (f.getCanonicalPath() + System.getProperty("line.separator")).getBytes();
                inFile.write(bt);
            }
        }
    }

    public void ReadFile (String path, int cont) throws IOException{

        System.out.println("----------------------------------------");
        System.out.println("Shows the first five files..." + path);
        System.out.println("----------------------------------------");

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(i ==(cont-1)){
                    System.out.println("----------------------------------------");
                    return;
                }

                i++;

            }
        }

    }
}
