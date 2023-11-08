package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        String name = null;
        if (name != null && name.length() > 10) {
            System.out.println("Its a rather long name.");
        }
        name = "Joe";
        if (name != null & name.length() > 10) {
            System.out.println("Its a rather long name.");
        }

        if (name == null || name.length() <= 0) {
            System.out.println("name is null or empty.");
        }
        if (name == null | name.length() <= 0) {
            System.out.println("One can not have no name.");
        }

        if (name != null) {
            System.out.println("Thank U " + name);
        }

        boolean treu = true;
        boolean fales = false;

        boolean result = treu ^ fales;
        System.out.println(treu + " ^ " + fales + " : " + result);
    }

}

