package com.telran.addresbook.madel;

public class GruopData {
    private  String name;
    private  String header;
    private  String footer;



    public GruopData withName(String name) {
        this.name = name;
        return  this;
    }

    public GruopData withHeader(String header) {
        this.header = header;
        return this;
    }

    public GruopData withFooter(String footer) {
        this.footer = footer;
        return  this;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
