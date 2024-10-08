import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        main m = new main();

        //1.2
        out.print("1.2"+"\n"+"Введите число: ");
        int x = in.nextInt();
        out.println("Сумма последней и предпоследней цифр = "+m.sumLastNums(x));

        //1.4
        out.println(m.isPositive(x));

        //1.6
        out.print("1.6"+"\n"+"Введите символ: ");
        String n = in.next();
        char n2 = n.charAt(0);
        out.println(m.isUpperCase(n2));

        //1.8
        out.print("1.8"+"\n"+"Введите первое число: ");
        int a = in.nextInt();
        out.print("Введите второе число: ");
        int b = in.nextInt();
        out.println(m.isDivisor(a,b));

        //1.10
        out.print("1.10"+"\n"+"Введите первое число: ");
        a = in.nextInt();
        out.print("Введите второе число: ");
        b = in.nextInt();
        int c = m.LastNumSum(a,b);
        out.println(a+"+"+b+"="+c);
        out.print("Введите третье число: ");
        b = in.nextInt();
        int e = m.LastNumSum(c,b);
        out.println(c+"+"+b+"="+e);
        out.print("Введите четвертое число: ");
        a = in.nextInt();
        int d = m.LastNumSum(e,a);
        out.println(e+"+"+a+"="+d);
        out.print("Введите пятое число: ");
        a = in.nextInt();
        out.println(a+"+"+d+"="+m.LastNumSum(a,d));

        //2.2
        out.print("2.2"+"\n"+"Введите первое число: ");
        x = in.nextInt();
        out.print("Введите второе число: ");
        int y = in.nextInt();
        out.println("Результат деления: " + m.safeDiv(x,y));

        //2.4
        out.print("2.4"+"\n"+"Введите первое число: ");
        x = in.nextInt();
        out.print("Введите второе число: ");
        y = in.nextInt();
        String result = m.makeDecision(x,y);
        out.println(x + result + y);

        //2.6
        out.print("2.6"+"\n"+"Введите первое число: ");
        x = in.nextInt();
        out.print("Введите второе число: ");
        y = in.nextInt();
        out.print("Введите третье число: ");
        int z = in.nextInt();
        out.println("Результат:" + m.sum3(x,y,z));

        //2.8
        out.print("2.8"+"\n"+"Введите число: ");
        int x4 = in.nextInt();
        String result9 = m.age(x4);
        out.println(result9);

        //2.10
        out.println("2.10"+"\n"+"Введите день недели: ");
        String str = in.nextLine();
        while (str.isEmpty()) {
            str = in.nextLine();
        }
        m.printDays(str);

        //3.2
        out.print("3.2"+"\n"+"Введите число: ");
        x = in.nextInt();
        out.println("Результат: "+m.reverseListNums(x));

        //3.4
        out.print("3.4"+"\n"+"Введите первое число: ");
        a = in.nextInt();
        out.print("Введите второе число: ");
        b = in.nextInt();
        out.println("Результат возведения в степень = " + m.pow(a,b));

        //3.6
        out.print("3.6"+"\n"+"Введите число: ");
        x = in.nextInt();
        out.println("Все знаки числа одинаковые = " + m.equalNum(x));

        //3.8
        out.print("3.8"+"\n"+"Введите число: ");
        x = in.nextInt();
        while(x<1) {
            out.print("Введите число больше 0: ");
            x = in.nextInt();
        }
        m.leftTriangle(x);

        //3.10
        m.guessGame();

        //4.2
        out.println("4.2"+"\n"+"Введите количество элементов в массиве: ");
        int kol = in.nextInt();
        while(kol<=0) {
            out.print("Введите корректное количество элементов не меньше 0:");
            kol= in.nextInt();
        }
        int[] arr = new int[kol];
        Random rand = new Random();
        int ran = rand.nextInt(10);
        for (int i = 0; i < kol; i++) {
            arr[i] = ran;
            ran = rand.nextInt(10);
        }
        out.println("Введите число: ");
        x = in.nextInt();
        out.println(m.findLast(arr,x));

        //4.4
        out.println("4.4"+"\n"+"Введите число: ");
        x = in.nextInt();
        out.println("Введите позицию: ");
        int pos = in.nextInt();
        while(pos<0 || pos>arr.length) {
            out.print("Введите корректную позицию: ");
            pos = in.nextInt();
        }
        int[] newarr = m.add(arr,x,pos);
        for (int i : newarr) {
            out.print(i + " ");
        }
        out.println();

        //4.6
        m.reverse(arr);
        out.print("4.6"+"\n"+"Перевернутый массив: ");
        for (int i : arr)
            out.print(i + " ");
        out.println();

        //4.8
        out.println("4.8"+"\n"+"Введите количество элементов в первом массиве: ");
        kol = in.nextInt();
        while(kol<=0) {
            out.print("Введите корректное количество элементов больше 0: ");
            kol = in.nextInt();
        }
        int[] arr1 = new int[kol];
        ran = rand.nextInt(10);
        for (int i = 0; i < kol; i++) {
            arr1[i] = ran;
            ran = rand.nextInt(10);
        }
        out.println("Первый массив:");
        for (int i : arr1) {
            out.print(i + " ");
        }
        out.println();
        out.println("Введите количество элементов во втором массиве: ");
        kol = in.nextInt();
        while(kol<=0) {
            out.print("Введите корректное количество элементов больше 0: ");
            kol = in.nextInt();
        }
        int[] arr2 = new int[kol];
        ran = rand.nextInt(10);
        for (int i = 0; i < kol; i++) {
            arr2[i] = ran;
            ran = rand.nextInt(10);
        }
        out.println("Второй массив:");
        for (int i : arr2) {
            out.print(i + " ");
        }
        out.println();
        int[] newarr2 = m.concat(arr1,arr2);
        out.println("Соединенный массив:");
        for (int i : newarr2) {
            out.print(i + " ");
        }
        out.println();

        //4.10
        out.println("4.10"+"\n"+"Введите количество элементов в массиве: ");
        kol = in.nextInt();
        while(kol<=0) {
            out.print("Введите корректное количество элементов больше 0: ");
            kol = in.nextInt();
        }
        arr = new int[kol];
        ran = rand.nextInt(10);
        for (int i = 0; i < kol; i++) {
            arr[i] = ran;
            ran = rand.nextInt(21)-10;
        }
        out.print("Исходный массив: ");
        for (int i : arr) {
            out.print(i + " ");
        }
        out.println();
        out.print("Массив без отрицательных чисел: ");
        int[] newarr52 = m.deleteNegative(arr);
        for (int i : newarr52) {
            out.print(i + " ");
        }
        out.println();

        in.close();
    }
    public int sumLastNums(int x){//1.2
        Scanner in = new Scanner(System.in);
        if (x/10==0) {
            out.println("Некорректное число, введите заново:");
            return sumLastNums(in.nextInt());
        }
        return abs(x%10+x/10%10);
    }
    public boolean isPositive(int x){ //1.4
        out.print("1.4"+"\n"+"Число "+x+" положительное = ");
        if (x>=0) return true;
        return false;
    }
    public boolean isUpperCase(char x){ //1.6
        out.print("Число в диапозоне 'A'-'Z' = ");
        if (x>='A' && x<='Z') return true;
        return false;
    }
    public boolean isDivisor(int a, int b){ //1.8
        out.print("Числа " + a + " и " + b +" делятся нацело = ");
        if (a%b==0 || b%a==0) return true;
        return false;
    }
    public int LastNumSum(int a, int b){ //1.10
        return abs(a%10) + abs(b%10);
    }
    public  double safeDiv(int x, int y){ //2.2
        if (y == 0) return 0;
        return x/y;
    }
    public String makeDecision(int x, int y){ //2.4
        if (x>y) return ">";
        else if (x<y) return "<";
        else return "==";
    }
    public boolean sum3(int x, int y, int z){ //2.6
        if (x+y==z || x+z==y || z+y==x) return true;
        return false;
    }
    public String age(int x){ //2.8
        Scanner in = new Scanner(System.in);
        if (x<0) {
            out.println("Некорректное число, введите заново число не меньше 0:");
            return age(in.nextInt());
        }
        if (x%10==1 && x!=11) return x+" год";
        else if ((x%10==2 || x%10==3 || x%10==4)  && (x/10!=1)) return x+" года";
        else return x+" лет";
    }
    public void printDays(String x){//2.10
        switch (x){
            case "понедельник": out.println("понедельник");
            case "вторник": out.println("вторник");
            case "среда": out.println("среда");
            case "четверг": out.println("четверг");
            case "пятница": out.println("пятница");
            case "суббота": out.println("суббота");
            case "воскресенье": out.println("воскресенье");break;
            default: out.println("это не день недели");
        }
    }
    public String reverseListNums(int x){ //3.2
        Scanner in = new Scanner(System.in);
        if (x<0) {
            out.println("Некорректное число, введите положительное число:");
            return reverseListNums(in.nextInt());
        }
        String zhenya = "";
        while (x>=0){
            zhenya+=x+" ";
            x--;
        }
        return zhenya;
    }
    public int pow(int x, int y){//3.4
        Scanner in = new Scanner(System.in);
        if (y<0) {
            out.println("Введите степень y больше 0:");
            return pow(x,in.nextInt());
        }
        int P = 1;
        for(int i=0;i<y;i++)
            P=P*x;
        return P;
    }
    public boolean equalNum (int x){ //3.6
        while(x>9){
            if (x%10 != (x/10)%10) return false;
            x/=10;
        }
        return true;
    }
    public void leftTriangle (int x){//3.8
        out.println("Результат:");
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                out.print("*");
            }
            out.println();
        }
    }
    public void guessGame(){ //3.10
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        out.println("3.10"+"\n"+"Введите число от 0 до 10: ");
        int chislo = in.nextInt();
        while(chislo<0 || chislo>10) {
            out.print("Введите корректное число от 0 до 10!");
            chislo = in.nextInt();
        }
        int ran = rand.nextInt(10);
        int attemps = 1;
        while (ran!=chislo){
            out.println("Вы не угадали, введите число от 0 до 9:");
            chislo = in.nextInt();
            while(chislo<0 || chislo>10) {
                out.print("Введите корректное число от 0 до 10!");
                chislo = in.nextInt();
            }
            ran = rand.nextInt(10);
            attemps++;
        }
        out.println("Вы угадали!"+"\n"+"Вы отгадали число за "+attemps+" попытки");
    }
    public int findLast (int[] arr, int x){ //4.2
        out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]+" ");
        }
        out.println();
        out.println("x: "+x);
        out.print("Результат: ");
        for (int i = arr.length-1; i>=0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
    public int[] add(int[] arr, int x, int pos){ //4.4
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++)
            newArr[i] = arr[i];
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++)
            newArr[i + 1] = arr[i];
        return newArr;
    }
    public void reverse(int[] arr){ //4.6
        for (int i = 0; i < arr.length/2; i++) {
            int g = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = g;
        }
    }
    public int[] concat(int[] arr1,int[] arr2) { //4.8
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
            newArr[i] = arr1[i];
        for (int i = 0; i < arr2.length; i++)
            newArr[i + arr1.length] = arr2[i];
        return newArr;
    }
    public int[] deleteNegative(int[] arr){ //4.10
        int pol = 0;
        for (int i : arr){
            if (i >= 0)
                pol++;
        }
        int[] newArr = new int[pol];
        int j = 0;
        for (int i : arr) {
            if (i >= 0) {
                newArr[j] = i;
                j++;
            }
        }
        return newArr;
    }
}
