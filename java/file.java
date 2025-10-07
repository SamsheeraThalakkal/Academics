import java.io.*;
 class file {
    
    public static void main(String[] arg){
        String filename="file1.txt";
        String line;
        String readed=null;

        try(BufferedReader reader=new BufferedReader(new FileReader(filename))){
            
            while((line=reader.readLine())!=null){
                readed=line;
                System.out.println(line);
                //writer.write(line);
                
                System.out.println("File Readed");
            //reader.close();
            //writer.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try(BufferedWriter writer =new BufferedWriter(new FileWriter("file2.txt"))){
            writer.write(readed);
            System.out.println("Content writed");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}