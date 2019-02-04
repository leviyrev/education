package com.example.education.regexp;

import java.util.Objects;

public class ServerLog {

    public class ServerWiadomosc {

        Wiadomosc wiadomosc = new Wiadomosc()
                .setDzien(12)
                .setGodzina(null)
                .setIp("asdf");//null, 11, null, "12:30", "User", "10.2.1.132", "Hello");

        {
            wiadomosc.setDzien(10)
                    .setGodzina("12:30")
                    .setIp("12312");
        }

    }

    public class Wiadomosc {
        int dzien;
        int miesiac;
        int rok;
        String godzina;
        String user;
        String ip;
        String tekst;
        String hello;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Wiadomosc wiadomosc = (Wiadomosc) o;
            return dzien == wiadomosc.dzien &&
                    miesiac == wiadomosc.miesiac &&
                    rok == wiadomosc.rok &&
                    Objects.equals(godzina, wiadomosc.godzina) &&
                    Objects.equals(user, wiadomosc.user) &&
                    Objects.equals(ip, wiadomosc.ip) &&
                    Objects.equals(tekst, wiadomosc.tekst) &&
                    Objects.equals(hello, wiadomosc.hello);
        }

        @Override
        public int hashCode() {
            return Objects.hash(dzien, miesiac, rok, godzina, user, ip, tekst, hello);
        }

        public int getDzien() {
            return dzien;
        }

        public Wiadomosc setDzien(int dzien) {
            this.dzien = dzien;
            return this;
        }

        public int getMiesiac() {
            return miesiac;
        }

        public Wiadomosc setMiesiac(int miesiac) {
            this.miesiac = miesiac;
            return this;
        }

        public int getRok() {
            return rok;
        }

        public Wiadomosc setRok(int rok) {
            this.rok = rok;
            return this;
        }

        public String getGodzina() {
            return godzina;
        }

        public Wiadomosc setGodzina(String godzina) {
            this.godzina = godzina;
            return this;
        }

        public String getUser() {
            return user;
        }

        public Wiadomosc setUser(String user) {
            this.user = user;
            return this;
        }

        public String getIp() {
            return ip;
        }

        public Wiadomosc setIp(String ip) {
            this.ip = ip;
            return this;
        }

        public String getTekst() {
            return tekst;
        }

        public Wiadomosc setTekst(String tekst) {
            this.tekst = tekst;
            return this;
        }

        public String getHello() {
            return hello;
        }

        public Wiadomosc setHello(String hello) {
            this.hello = hello;
            return this;
        }

        @Override
        public String toString() {
            return "Wiadomosc{" +
                    "dzien=" + dzien +
                    ", miesiac=" + miesiac +
                    ", rok=" + rok +
                    ", godzina='" + godzina + '\'' +
                    ", user='" + user + '\'' +
                    ", ip='" + ip + '\'' +
                    ", tekst='" + tekst + '\'' +
                    ", hello='" + hello + '\'' +
                    '}';
        }

    }

}
