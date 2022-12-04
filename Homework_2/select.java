public class select {
    public static void main(String[] args) {
        System.out.printf("select * from students where " + Where());
    }

    public static String Where() {
        String searchBuilder = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        searchBuilder = searchBuilder.replaceAll("[{}]", "");
        searchBuilder = searchBuilder.replaceAll(", ", "and");
        searchBuilder = searchBuilder.replaceAll(":", "=");

        Integer index = searchBuilder.lastIndexOf("and\"age\"=\"null\"");
        StringBuilder result = new StringBuilder(searchBuilder);
        if (searchBuilder.indexOf("null") == -1) {
            searchBuilder = result.substring(0, index);
        }

        return searchBuilder;
    }

}
