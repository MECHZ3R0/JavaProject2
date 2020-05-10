package enums;

public class EnumWithSwitchStatement {
    enum SkillSet{
        JAVA,SELENIUM,SQL
    }
    public static void main(String[] args) {
        SkillSet skill=SkillSet.JAVA;
        switch(skill){
            case JAVA: System.out.println("Start designing mobile applications"); break;
            case SELENIUM: System.out.println("Start testing applications"); break;
            case SQL: System.out.println("Start working on Database applications");break;
        }
    }
}
