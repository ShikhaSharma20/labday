class conditionaloperator
{
    public static void main(String args[])
{
     int a=25,b=33,c=28,d=77,bigger,biggest;
bigger=(a>b && a>c) ? b:((b>c)?b:c);//comparing 3 variables a,b,c
biggest=((a>b && a>c && a>d) ? a:(b>c && c>d)? c:(c>d)?c:d);//camparing 4 variables a,b,c,d
System.out.println("largest number between three variable\na:"+a+"b:"+b+"c:"+c+"\nis:"+bigger);
System.out.println("largest number between four variable\na:"+a+"b:"+b+"c:"+c+"d:"+d+"\nis:"+biggest);
}
}


