public class ModuloThree {

    public static void validate(int[] values) {

        for (int i = 0; i < values.length; i++) {
            try {
                if (values[i] % 3 == 0) {
                    System.out.println(values[i] + " is divided by 3");
                } else throw new IllegalArgumentException();
            } catch (Exception e){
                System.out.println(values[i] + " is not divided by 3");
            }
        }
    }

}
