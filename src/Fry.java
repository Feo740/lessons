/**
 * Created by home on 18.02.2018.
 */
public class Fry {
    private String movieName;

    public void SetName(String name){
    movieName=name;
    }

    public String getName() {
        return movieName;
    }

    public void output(){
        System.out.printf("Назавание фильма - %s", getName());
    }
}
