package src.de.imgag.splicing.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class VCFwriter {
    private List<Variant> v;

    public void write(File w) throws IOException {
        BufferedWriter bw = null;
        if(!w.exists()){
            w.createNewFile();
        }
        try {
            bw = new BufferedWriter(new FileWriter(w));//also here we use BufferedWriter
            for (int i = 0; i < v.size(); i++) {
                Variant l = v.get(i);// for writing the new file line by line
                bw.write(l.getChrom()+"\t"+l.getPos()+"\t"+l.getId()+
                        "\t"+l.getRef()+"\t"+l.getAlt()+"\t"+l.getQual()+"\t"+l.getFilter()+
                        "\t"+l.getInfo()+"\t"+l.getFormat()+"\t"+l.getOthers());
                bw.newLine(); //write a new line
            }
        }  catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
