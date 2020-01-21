class UserInput{
    public static void main (String[] args) {
int num=Integer.parseInt(args[0]);
double square;
double sqroot;
square=Math.pow(num,2);
sqroot=Math.sqrt(num);

System.out.println("Square is "+square);
System.out.println("Square root "+sqroot);
}
}