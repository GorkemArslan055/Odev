import odev.odev;

public class Main {
    public static void main(String[] args) {
        int[] time ={240,253,370,350,441,239,244,328,229,333,300,225};
        String[] name ={"Görkem","Ahmet","Taner","Mahmud","Hasan","Ronaldo","Hüseyin","Abdullah","Messi","Talisca","Cenk","Aboubakar"};

        odev myodev = new odev(time,name);
        myodev.Derece();
        myodev.Puanlama();


    }}