import java.util.*;

public class StringValue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named RockPaperScissor. */
        //Scanner scan = new Scanner(System.in);
     //   String s1 = scan.nextLine();

        String[] inputArray = new String[]{"badal","shivani","bajaj"};

        sortArrayOnValue(inputArray);

    }

    public static void fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemPerPage, int pageNumber) {

        List<Domain> domainList = new ArrayList<>();


        items.forEach(item->{
            Domain domain = new Domain();
            domain.setName(item.get(0));
            domain.setRelevance(item.get(1));
            domain.setPrice(item.get(2));
            domainList.add(domain);
        });
        // Write your code here

    }

    public static class Domain {

        String name;
        String relevance;
        String price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRelevance() {
            return relevance;
        }

        public void setRelevance(String relevance) {
            this.relevance = relevance;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Domain{" +
                    "name='" + name + '\'' +
                    ", relevance='" + relevance + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }
    }
    private static void sortArrayOnValue(String[] inputArray) {

        List<OutputDomain> output = new ArrayList<>();

        for (int iter=0;iter<inputArray.length;iter++){

            Integer value = calculateValue(inputArray[iter]);
            OutputDomain outputDomain = new OutputDomain();
            outputDomain.setInputString(inputArray[iter]);
            outputDomain.setValue(value);
            output.add(outputDomain);
        }

        output.sort(Comparator.comparing(OutputDomain::getValue));

        output.sort(Comparator.comparing(OutputDomain::getValue).reversed());

        System.out.println(output);
    }

    private static Integer calculateValue(String s) {
        char[] c = s.toLowerCase().toCharArray();
        Integer value = 0;
        for (int k=0;k<c.length;k++){
            value+=(c[k]-'a'+1);
        }
        return value;
    }

    private static class OutputDomain {

        private String inputString;
        private Integer value;

        public String getInputString() {
            return inputString;
        }

        public void setInputString(String inputString) {
            this.inputString = inputString;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "OutputDomain{" +
                    "inputString='" + inputString + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
}
