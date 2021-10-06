package 流程控制.条件语句;
import java.util.Scanner;
public class Switch多重选择 {
    public static void main(String[] args) {
    option();
    Default();
    ChangeSwitchtoIf();
    LoseBreak();
    sb();
    MatchString();
    }

    /**
     * 除了if语句外，还有一种条件判断，是根据某个表达式的结果，分别去执行不同的分支。
     *
     * 例如，在游戏中，让用户选择选项：
     * 1.单人模式
     * 2.多人模式
     * 3.退出游戏
     * 这时，switch语句就派上用场了。
     *
     * switch语句根据switch (表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break结束执行。
     */
    public static void option (){
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("Enter your option: 1 or 2 or 3");
        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
        }
    }

    /**
     * Default an option
     * 修改option的值分别为1、2、3，观察执行结果。
     * 如果option的值没有匹配到任何case，
     * 例如option = 99，那么，switch语句不会执行任何语句。
     * 这时，可以给switch语句加一个default，当没有匹配到任何case时，执行default：
     */
    public static void Default (){
        int option = 99;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }

    /**
     * 如果把switch语句翻译成if语句，那么上述的代码相当于：
     */
    public static void ChangeSwitchtoIf (){
        int option;
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        if (option == 1) {
            System.out.println("Selected 1");
        } else if (option == 2) {
            System.out.println("Selected 2");
        } else if (option == 3) {
            System.out.println("Selected 3");
        } else {
            System.out.println("Not selected");
        }
    }

    /**
     * 对于多个==判断的情况，使用switch结构更加清晰。
     * 同时注意，上述“翻译”只有在switch语句中对每个case正确编写了break语句才能对应得上。
     * 使用switch时，注意case语句并没有花括号{}，而且，case语句具有“穿透性”，漏写break将导致意想不到的结果
     */
    public static void LoseBreak(){
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
            case 2:
                System.out.println("Selected 2");
            case 3:
                System.out.println("Selected 3");
            default:
                System.out.println("Not selected");
                //当option = 2时，将依次输出"Selected 2"、"Selected 3"、"Not selected"，
                // 原因是从匹配到case 2开始，后续语句将全部执行，直到遇到break语句。因此，任何时候都不要忘记写break。
        }
    }

    /**
     * 如果有几个case语句执行的是同一组语句块，可以这么写
     */
    public static void sb(){
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
            case 3:
                System.out.println("Selected 2, 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
        }

    /**
     * switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”。
     */
    public static void MatchString (){
        String fruit;
        System.out.println("Choose one fruit from apple pear or mango");
        Scanner scan  = new Scanner(System.in);
        fruit = scan.toString();

        switch (fruit) {
            case "apple":
                System.out.println("Selected apple");
                break;
            case "pear":
                System.out.println("Selected pear");
                break;
            case "mango":
                System.out.println("Selected mango");
                break;
            default:
                System.out.println("No fruit selected");
                break;
        }
    }

    /**
     * 使用IDE时，可以自动检查是否漏写了break语句和default语句，方法是打开IDE的编译检查。
     * 在Idea中，选择Preferences - Editor - Inspections - Java - Control flow issues，将以下检查标记为Warning：
     *
     * Fallthrough in 'switch' statement
     * 'switch' statement without 'default' branch
     * 当switch语句存在问题时，即可在IDE中获得警告提示。
     */

}
