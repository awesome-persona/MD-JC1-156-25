package lesson10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Classes {

    int a1;
    int b1;

    public void todo() {
        System.out.println("todo");
    }

    private class InnerClass {
        int a2;
        int b2;

        private void todo() {
            int r = a1 + b1 + a2 + b2;

            class Sum {
                int a;
                int b;
            }

            Sum sum = new Sum();
            sum.a = 1;
            sum.b = 2;
        }
    }

    private static class StaticInnerClass {
        int a3;
        int b3;

        private void todo() {
            int r = a3 + b3; //a1 + b1 +
        }
    }

    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new lesson10.Classes.StaticInnerClass();

        Classes classes = new Classes();
        InnerClass innerClass = classes.new InnerClass();

        JoyStick joyStick = new JoyStick() {
            @Override
            public void up() {
                System.out.println("up");
            }
            @Override
            public void down() {
                System.out.println("down");
            }
            @Override
            public void left() {
                System.out.println("left");
            }
            @Override
            public void right() {
                System.out.println("right");
            }
        };

        joyStick.downLeft();

        Classes classes1 = new Classes() {
            @Override
            public void todo() {
                System.out.println("super todo");
            }
        };
        Classes classes2 = new Classes();

        classes1.todo(); // anon
        classes2.todo();

        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello world");
            }
        });
    }
}
