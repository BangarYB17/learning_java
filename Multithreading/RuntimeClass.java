public class RuntimeClass {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad");
        System.out.println(rt.availableProcessors());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
    }
}
