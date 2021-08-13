package me.java.golf.study.step8;

interface Movement {

    void bark(String dog);
    void eat(String dog, int feed);
}

interface Exercise {
    
    void run();
}

public class Dog implements Movement, Exercise {
    int hungry = 3;
    int health = 5;
    
    @Override
    public void bark(String dog) {
        System.out.println(dog + "가 멍 멍!");
    }
  
    @Override
    public void eat(String dog, int feed) {

        hungry += feed;

        if(hungry >= 5) {
            System.out.println(dog + "가 행복해 합니다.");
        } else {
            System.out.println(dog + "가 만족하지 못했습니다.");
        }
        
    }

    @Override
    public void run() {
        if(hungry > 0) {
            hungry --;
            health ++;
        } else {
            System.out.println("밥부터 먹이십쇼");
        }
    }

    public void hello(String dog) {
        System.out.println(dog + "가 인사합니다.");
    }
}

class Start {
    
    public static void main(String[] args) {
        Movement movement = (Movement) new Dog();

        movement.bark("진돗개");
        movement.eat("치와와", 4);
        
        // error : cannot find symbol movement.hello("비숑");
        // movement.hello("비숑");

        ((Dog) movement).hello("비숑");
    }
}

