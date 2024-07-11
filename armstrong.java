class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int rem, res = 0;
        int on = number;
        while (on != 0) {
            rem = on % 10;
            res += Math.pow(rem, 3); 
            on=on/10;
        }
        if (res == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
