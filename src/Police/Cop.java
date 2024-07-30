package Police;

public class Cop {
     int gun;
    private String idCard;

    protected Cop(int gun){
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }
}
