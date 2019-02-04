package com.example.education.regexp;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServerLog {

    public class ServerWiadomosc{

        Wiadomosc wiadomosc =new Wiadomosc(10,11,2013,"12:30","User","10.2.1.132","Hello");

    }

    public class Wiadomosc {
        int dzien;
        int miesiac;
        int rok;
        String godzina;
        String user;
        String ip;
        String tekst;
        Wiadomosc(int dzien,int miesiac,int rok,String godzina,String user,String ip,String tekst){
            this.dzien=dzien;
            this.miesiac=miesiac;
            this.rok=rok;
            this.godzina=godzina;
            this.user=user;
            this.ip=ip;
            this.tekst=tekst;
        }

        public String toString(){
            return  dzien+" "+miesiac+" "+rok+" "+godzina+" "+user+" "+ip+" "+tekst;

        }

    }




}
