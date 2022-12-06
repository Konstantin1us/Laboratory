public class LogicsOfMultiplicationTable{
    public void logics(){
        InputNumber sss = new InputNumber();
        if (sss.getInp() > 0 & sss.getInp() <= 32) {
            int counter = 1;
            for (int i = 1; i <= sss.getInp(); i++) {
                if (i <= 9) {
                    System.out.print(i + "    ");
                } else if (i > 9) {
                    System.out.print(i + "   ");
                }
            }
            System.out.println();
            while (counter != sss.getInp()) {
                counter++;
                for (int i = 1; i <= sss.getInp(); i++) {
                    String str = Integer.toString(counter * i);
                    if (str.length() == 1) {
                        System.out.print(str + "    ");
                    } else if (str.length() == 2) {
                        System.out.print(str + "   ");
                    } else if (str.length() == 3) {
                        System.out.print(str + "  ");
                    } else System.out.print(str + "  ");
                }
                System.out.println();
            }
        } else System.out.println("Сорри, программа работает только для числа не более 32");
    }
}
