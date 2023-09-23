import java.util.ArrayList;

public class FilmMain {

    public static void main(String[] args) {

        ArrayList<Film> films = new ArrayList<Film>();
        films.add(new Film("X Film","Ali CAN",FilmTipi.BELGESEL,2020));
        films.add(new Film("Y Film","Tuğrul Çalışkan",FilmTipi.BILIM_KURGU,2019));
        films.add(new Film("Z Film","Ertuğ Yılmaz",FilmTipi.KOMEDI,1998));

        for (Film filimler:films){
            System.out.println(filimler);
        }

        System.out.println("----------------");
        System.out.println(films.get(1));
    }
}
