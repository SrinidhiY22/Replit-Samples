import java.util.Scanner;

public class Lab08
{

  private int num;

public void input() {
Scanner reader = new Scanner(System.in);
System.out.print("Enter an integer: ");
num = reader.nextInt();
}

public void output() {

int multi = 1;
System.out.println("Multiplication table for " + num + "'s:");

while (multi <= 10){
  System.out.println(multi + "*" + num + "=" + multi*num);
multi++;
}

}


}
