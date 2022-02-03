package lol.champion;


public class Champion {

    // 이름
    public String name;

    // 공격력
    public int power;

    // 방어력
    public int armor;

    // 마법 저항력
    public int magicResistance;

    // 체력
    public int hp;

    // 마나
    public int mp;

    // 치명타 데미지
    public int criticalDamage;


    public Champion(String name, int power, int armor, int magicResistance, int hp, int mp, int criticalDamage) {
        this.name = name;
        this.power = power;
        this.armor = armor;
        this.magicResistance = magicResistance;
        this.hp = hp;
        this.mp = mp;
        this.criticalDamage = criticalDamage;
    }

    // Enum 적용
    // 스킬 메소드 이름 수정
    // this, super, 생성자 내용 정리
    // 상속 받는 불필요한 변수 수정

    // 공격 사용 메소드
    public void attack(Champion player, Champion computer, int attackCount) {
        System.out.println("공격");
    }

    // 회피 사용 메소드
    public void miss() {
        System.out.println("회피");
    }

    public void skill1(Champion player, Champion computer, String name) {
        System.out.println("스킬 1 사용");
    }

    public void skill2(Champion player, Champion computer, String name) {
        System.out.println("스킬 2 사용");
    }

    public void skill3(Champion player, Champion computer, String name) {
        System.out.println("스킬 3 사용");
    }

    public void skill4(Champion player, Champion computer, String name) {
        System.out.println("스킬 4 사용");
    }
}
