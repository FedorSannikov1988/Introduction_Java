class program4 {
    public static void main(String[] args) {
        char ch = '1';
        //char ch = 1;
        System.out.println(ch);
        System.out.println(Character.isDigit(ch)); // true
        ch = 'q';
        System.out.println(ch);
        System.out.println(Character.isDigit(ch)); // false
    }
}
