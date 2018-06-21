package src.de.imgag.splicing.utils;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Variant {


    /** Chromosome. */
    private StringProperty chrom;

    /** Position. */
    private String pos;

    /** id */
    private String id;

    /** Reference allele. */
    private String ref;

    /** Alternate alleles. */
    private String alt;

    /** QUAL score. */
    private String qual;

    /** Filter. */
    private String filter;

    /** INFO. */
    private String info;

    /** Format. */
    private String format;

    private String others;

    public Variant(String chrom, String pos, String id, String ref,
                   String alt, String qual, String filter, String info,
                   String format, String others) {
        this.chrom =  new SimpleStringProperty(chrom);
        this.pos = pos;
        this.id = id;
        this.ref = ref;
        this.alt = alt;
        this.qual = qual;
        this.filter = filter;
        this.info = info;
        this.format = format;
        this.others = others;
    }



    public String getChrom() {
        return chrom.get();
    }

    public StringProperty chromProperty(){
        return chrom;
    }

    public String getPos() {
        return pos;
    }

    public String getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public String getAlt() {
        return alt;
    }

    public String getQual() {
        return qual;
    }

    public String getFilter() {
        return filter;
    }

    public String getInfo() {
        return info;
    }

    public String getFormat() {
        return format;
    }

    public void setChrom(String chrom) {
        this.chrom = new SimpleStringProperty(chrom);
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public void setFilter(String filter) {
        this.filter = filter;

    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}