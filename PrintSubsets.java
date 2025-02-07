//subsets of a string

private static void subsetFind(String input, String output) {
    if (input.length() == 0) {
        System.out.println(output);
        return;
    }
    String out1 = output;
    String out2 = output + input.charAt(0);
    input = input.substring(1);

    subsetFind(input, out1); 
    subsetFind(input, out2); 
} 
