package ejercicios.dominivideos;

public class DominiVideoMainClass {
    public static void main (String[] args) {
        User user1 = new User("Tao", "Huang", "passHHH");
        user1.createNewVideo("TaoVideo1", "Chinese,Murcia");
        user1.createNewVideo("Video2DaXigua", "Xigua,Huai,Da");
        user1.printVideoList();
    }
}
