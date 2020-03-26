package inheritance;

public class ArrayMappingAttendance2 {
    public static void main(String[] args) {
        String[] people = {"Alpha", "Beta", "Gamma", "Delta", "Omega"};
        String[] days = {"Mon","Tue","Wed","Thu","Fri"};
        int[][] att= new int[5][5];
        for (int i=0;i<people.length;i++){
            System.out.print("\t\t"+people[i]);
        }
        System.out.println();
        for (int i=0;i<days.length;i++){
            System.out.print(days[i]+"\t\t");
            for(int j=0;j<people.length;j++){
                System.out.print(att[i][j]+"\t\t\t");
            }
            System.out.println();
        }
    }
}
