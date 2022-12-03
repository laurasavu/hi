package LECTIA7.JavaSpecials.LECTIA7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class gestionareaFisierelor {


    public static void main(String[] args) throws IOException {
        //byte streams
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;

        try {
            fileInputStream=new FileInputStream("data.txt");
            fileOutputStream=new FileOutputStream("output.txt");
            int read=fileInputStream.read();
            while(read!=-1){
                fileOutputStream.write(read);
                read=fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //NIO
        byte[] contentArray= Files.readAllBytes(Paths.get("data.txt"));
        String content=new String(contentArray);
        System.out.println(content );

        Path path=Paths.get("data1.txt");
        Files.write(path,"stringul1".getBytes());
    }}
