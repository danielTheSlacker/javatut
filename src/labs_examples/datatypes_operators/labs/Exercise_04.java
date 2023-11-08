package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int i = 1;
        int j = i;
        boolean match = true;
        System.out.println(!match);
        System.out.println(a > b ? "a is greater b" : "b is greater a");
        boolean equal = i == j;
        boolean iSmallerOrEqualJ = i<=j;
        boolean iGreaterOrEqualJ = i>=j;
        boolean iLessJ = i<j;
        boolean jLessI = i>j;
        ++j;
        boolean iMatchJ = i != j;
        System.out.println("i equal j: " + equal);
        System.out.println("i <= j: " + iSmallerOrEqualJ);
        System.out.println("i >= j: " + iGreaterOrEqualJ);
        System.out.println("i < j: " + iLessJ);
        System.out.println("j < i: " + jLessI);
        System.out.println("i != j : " + iMatchJ);
    }

}

