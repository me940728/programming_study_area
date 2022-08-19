package designPatterns.facade;

public class K2Rifle {
    private String gear = "0";
    private int bullets = 0;
    /* 단발할 경우 동작되는 메서드를 모아 놓은 메소드 */
    public void burst(int bullets){
        setMagazine(bullets);
        setGearBurst("1");
        setBullets();
        setLoad();
        setLocked();
        doFire();
    }
    /* 점사할 경우 동작되는 메서드를 모아 놓은 메서드 */
    public void burstThree(int bullets){
        setMagazine(bullets / 3);
        setGearBurstThree("3");
        setBullets();
        setLoad();
        setLocked();
        doFire();
    }
    /* 연발할 경우 동작되는 메서드를 모아 놓은 메서드 */
    public void repeater(int bullets){
        setMagazine(1);
        setGearBurstThree("0");
        setBullets();
        setLoad();
        setLocked();
        doFire();
    }
    /* K2 소총의 하위 세부 기능들  */
    /* 탄알집에 소총탄을 넣는 메서드 */
    public void setMagazine(int bullets) { this.bullets = bullets; }
    /* 조정간 단발 메서드 */
    public void setGearBurst(String gear) { this.gear = gear; }
    /* 조정간 점사 메서드 */
    public void setGearBurstThree(String gear) { this.gear = gear; }
    /* 조정간 연발 메서드*/
    public void setGearRepeater(String gear) { this.gear = gear; }
    public void setBullets() { /* 송탄 */}
    public void setLoad() {/* 장전 */}
    public void setLocked() {/* 격발 */}
    public void doFire(){
        String fire = gear.equals("1") ? "Bang" : gear.equals("3") ? "Bang Bang Bang" : "bbbbbbbbb";
        for(int i = 1; i <= bullets; i++) { System.out.println("[" + i + "trigger] " + fire); }
    }
}
