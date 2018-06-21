package src.de.imgag.splicing.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VCFReader {


    private  List<Variant> v = new ArrayList<>();
    private  List<String> vs = new ArrayList<>();



    public void read(File vcf){

        try{
            String encoding = "utf-8";
            if(vcf.isFile()&&vcf.exists()){
                InputStreamReader read = new InputStreamReader(new FileInputStream(vcf), encoding);
                BufferedReader br = new BufferedReader(read); //read the file with bufferedreader
                String line = br.readLine();
                while(line != null){
                    Variant va= new Variant("","","","","",""
                            ,"","","","");
                    while(line.charAt(0)== '#') {
                        line = br.readLine();
                    }
                    vs.add(line);
                    int i = 0;
                    int j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setChrom(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setPos(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setId(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setRef(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setAlt(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setQual(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setFilter(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setInfo(line.substring(j,i));
                    i++;
                    j=i;
                    while(line.charAt(i)!='\t'){
                        i++;
                    }
                    va.setFormat(line.substring(j,i));
                    i++;
                    j=i;
                    while(i!=line.length()){
                        i++;
                    }
                    va.setOthers(line.substring(j,i));

                    v.add(va);
                    line=br.readLine();

                }
                for(int i=0;i<v.size();i++){
                    System.out.println(v.get(i).getChrom());
                }


                br.close();
                read.close();

                }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String [] args)
    {
        VCFReader vc= new VCFReader();
        File vcf = new File("/Users/Sherryliu/Documents/variants.vcf.txt");
        vc.read(vcf);

    }



}
