package stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        build.append("Jva");
        build.append("spProgramming");
        build.append("Language");
        System.out.println(build);
        build.insert(1,"a");
        build.insert(17," ");
        System.out.println(build);
        build.replace(4,6," is ");
        System.out.println(build);
        build.delete(0,4);
        System.out.println(build);
        build.insert(0,"Java");
        System.out.println("---");
        System.out.println(build);
        build.reverse();
        System.out.println(build);
        build.delete(0,33);
        System.out.println(build.capacity());
        build.append("01234567891012345678901234567890123");
        System.out.println(build);
        System.out.println(build.capacity());
        build.delete(0,80);
        build.append("Dog");
        System.out.println(build);
        build.setCharAt(0,'L');
        System.out.println(build);
        build.append(" is good");
        System.out.println(build);
        System.out.println(build.codePointCount(0,11));
        System.out.println(build.codePointAt(0));
    }
}
