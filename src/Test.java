
public class Test {
    public static void main(String[] args) {
        Stock st = new Stock("ORCL","Oracle Corporation", 34.5,34.25);
        System.out.println(st.getChangePercent());
    }
}
