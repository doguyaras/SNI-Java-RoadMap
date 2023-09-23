import java.io.Serializable;

public class Film implements Serializable {

    private String ad;
    private String yonetmen;
    private FilmTipi tip;
    private int yayinlanmaYili;

    public Film() {
    }

    public Film(String ad, String yonetmen, FilmTipi tip, int yayinlanmaYili) {
        this.ad = ad;
        this.yonetmen = yonetmen;
        this.tip = tip;
        this.yayinlanmaYili = yayinlanmaYili;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public FilmTipi getTip() {
        return tip;
    }

    public void setTip(FilmTipi tip) {
        this.tip = tip;
    }

    public int getYayinlanmaYili() {
        return yayinlanmaYili;
    }

    public void setYayinlanmaYili(int yayinlanmaYili) {
        this.yayinlanmaYili = yayinlanmaYili;
    }

    @Override
    public int hashCode() {
        return this.yayinlanmaYili + this.ad.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Film film = (Film) o;
        return film.ad.equals(this.ad) && film.yayinlanmaYili == this.yayinlanmaYili;
    }

    @Override
    public String toString() {
        return "Film adı: " + ad + "   Yonetmen: " + yonetmen + "   Film Tipi: " + tip + "   Yayinlanma Yili: " + yayinlanmaYili;
    }
}
